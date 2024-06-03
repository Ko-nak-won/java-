package sec071;

public class Tree implements Countable {
    String name;
    public Tree(String name) {
        this.name = name;

    }
    void ripen() {

    }
    @Override
    public void count(){
        System.out.println(name + "가 5그루있다.");
    }
}
