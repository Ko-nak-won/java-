import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class CarTest{
    public static void main(String[] args) {
        Car myCar = new Car("그랜저");
        Car yourCar = new Car("그랜저");
        if (!myCar.equals(yourCar))
            System.out.println("내 자동차는 [" + myCar.carName + "], 너 자동차는 [" + yourCar.carName + "]로 모델이 다르다.");
        else
            System.out.println("자동차 모델이 둘 다 [" + myCar.carName + "]로 동일하다.");

        Date d = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");
        String s = MessageFormat.format("날짜: {0}, 자동차 모델=[{1}], 운전자({2})", sdf1.format(d), myCar.carName, myCar.name);
        System.out.println(s);

        StringTokenizer st = new StringTokenizer(s, ", =[]()");
        while (st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}

class Car {
    String carName;
    String name = "홍길동";

    public Car(String name) {
        this.carName = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return carName.equals(car.carName);
    }

    @Override
    public String toString() {
        return "Car{name='" + carName + "', driver='" + name + "'}";
    }
}
