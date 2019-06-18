package java2019_6.day2.test3;

public class Monkey extends Animal {

    @Override
    public void move() {
        System.out.println("monky轻松上树");
    }

    @Override
    public void eat() {
        System.out.println(name+"吃香蕉");
    }
}
