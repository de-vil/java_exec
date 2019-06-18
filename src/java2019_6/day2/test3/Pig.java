package java2019_6.day2.test3;

/**
 * 方法的重写
 */

public class Pig extends Animal{


    @Override
    public void move() {
        System.out.println("pig撞树上了");
    }

    @Override
    public void eat() {
        System.out.println(name+"喝潲水");
    }
}
