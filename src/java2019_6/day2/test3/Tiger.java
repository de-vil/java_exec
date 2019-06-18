package java2019_6.day2.test3;

public class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("tiger跑得快");
    }

    @Override
    public void eat() {
        System.out.println(name+"吃肉");
    }
}
