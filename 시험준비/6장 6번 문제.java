package sec0612;

public class Vehicle{
    String color;
    int speed;

    void show(){
        System.out.printf("자동차 색깔 : %s\n자동차속도 : %d\n",color , speed);
    }

    public Vehicle(String color, int speed){
        this.color = color;
        this.speed = speed;
    }
}

public class Car extends Vehicle{
    int displacement;
    int gears;

    void show(){
        System.out.printf("자동차 색깔 : %s\n자동차 속도 : %d\n자동차 배기랑 : %d\n자동차 기어단수 : %d",color,speed,displacement,gears);
    }

    public Car(String color,int speed,int displacement, int gears){
        super(color,speed);
        this.displacement = displacement;
        this.gears = gears;
    }
}
public class OverrideTest {
    public static void main(String[]args){
        Car c = new Car("파랑", 200 , 1000, 5);
        c.show();

        System.out.println();
        Vehicle v = c;
        v.show();
    }
}
package sec0612;

public class Vehicle{
    String color;
    int speed;

    void show(){
        System.out.printf("자동차 색깔 : %s\n자동차속도 : %d\n",color , speed);
    }

    public Vehicle(String color, int speed){
        this.color = color;
        this.speed = speed;
    }
}

public class Car extends Vehicle{
    int displacement;
    int gears;

    void show(){
        System.out.printf("자동차 색깔 : %s\n자동차 속도 : %d\n자동차 배기랑 : %d\n자동차 기어단수 : %d",color,speed,displacement,gears);
    }

    public Car(String color,int speed,int displacement, int gears){
        super(color,speed);
        this.displacement = displacement;
        this.gears = gears;
    }
}
public class OverrideTest {
    public static void main(String[]args){
        Car c = new Car("파랑", 200 , 1000, 5);
        c.show();

        System.out.println();
        Vehicle v = c;
        v.show();
    }
}
