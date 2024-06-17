package sec081;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저");
        Car yourCar = new Car("그랜저");
        if (!myCar.equals(yourCar))
            System.out.println("내 자동차는 [" + myCar + "], 너 자동차는 [" + yourCar + "]로 모델이 다르다.");
        else
            System.out.println("내 자동차는 [" + myCar + "], 너 자동차는 [" + yourCar + "]로 모델이 같다.");
    }
}

class Car {
    String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
