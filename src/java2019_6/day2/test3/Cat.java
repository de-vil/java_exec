package java2019_6.day2.test3;

public class Cat extends Animal {


    @Override
    public void move() {
        System.out.println("cat一下就上树了");
    }

    @Override
    public void eat() {
        System.out.println(name+"吃鱼");
    }
}
