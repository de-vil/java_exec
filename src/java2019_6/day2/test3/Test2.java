package java2019_6.day2.test3;

public class Test2 {
    public static void main(String[] args) {
        //父类变量可以引用子类对象
        Animal animal1 = new Cat();
        Animal animal2 = new Pig();
        Animal animal3 = new Monkey();
        animal1.move();
        animal2.move();
        animal3.move();

    }

}
