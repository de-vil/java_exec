package java2019_6.day2.test3;

/**
 * 多态
 */

public class Test3 {
    public static void main(String[] args) {

        Stockman man = new Stockman();
        Animal cat = new Cat();
        Animal pig = new Pig();
        Animal monkey = new Monkey();
        cat.name = "tom";
        pig.name = "pinkpig";
        monkey.name = "wukong";
        man.feed(cat);
        man.feed(pig);
        man.feed(monkey);
    }
}
