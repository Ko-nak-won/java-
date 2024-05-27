package sec07;
import sec07.Computer;
import sec07.Controllable;
import sec07.TV;

public class ControllableDemo2 {
    public static void main(String[]args){
        Controllable[] controllable = {new TV(), new Computer()};

        for (Controllable c : controllable){
            c.turnOn();
            c.turnOff();
            c.repair();
        }
        Controllable.reset();
    }
}
