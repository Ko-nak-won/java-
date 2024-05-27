package sec07;

class Rectangle extends Shape {
    int x, y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("사각형을 그리다.");
    }

    public double findArea() {
        return x * y;
    }
}