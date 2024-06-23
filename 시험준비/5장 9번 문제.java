package sec0612;

import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 행의 수 입력 받기
        System.out.print("행의 수를 입력하세요: ");
        int rows = scanner.nextInt();

        // 사용자로부터 열의 수 입력 받기
        System.out.print("열의 수를 입력하세요: ");
        int cols = scanner.nextInt();

        // 사용자로부터 지뢰 확률 입력 받기
        System.out.print("지뢰 확률을 입력하세요 (0 ~ 1): ");
        double mineProbability = scanner.nextDouble();

        // 지뢰 필드 생성
        String[][] mineField = generateMineField(rows, cols, mineProbability);

        // 생성된 지뢰 필드 출력
        System.out.println("\n지뢰 숨기기 전:");
        printMineField(mineField);

        // 주변 지뢰 개수 계산
        String[][] mineFieldWithCounts = calculateSurroundingMineCount(mineField);

        // 계산된 주변 지뢰 개수가 포함된 지뢰 필드 출력
        System.out.println("\n지뢰 숨긴 후:");
        printMineField(mineFieldWithCounts);

        scanner.close();
    }

    // 주어진 크기와 확률에 따라 지뢰를 랜덤하게 배치하여 배열 생성
    public static String[][] generateMineField(int rows, int cols, double mineProbability) {
        String[][] field = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (Math.random() < mineProbability) {
                    field[i][j] = "*";
                } else {
                    field[i][j] = "-";
                }
            }
        }
        return field;
    }

    public static String[][] calculateSurroundingMineCount(String[][] mineField) {
        int rows = mineField.length;
        int cols = mineField[0].length;
        String[][] result = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mineField[i][j].equals("*")) {
                    result[i][j] = "*";
                } else {
                    int count = countSurroundingMines(mineField, i, j);
                    result[i][j] = String.valueOf(count);
                }
            }
        }

        return result;
    }

    public static int countSurroundingMines(String[][] mineField, int row, int col) {
        int count = 0;
        int rows = mineField.length;
        int cols = mineField[0].length;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < rows && j >= 0 && j < cols && mineField[i][j].equals("*")) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void printMineField(String[][] mineField) {
        for (String[] row : mineField) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
