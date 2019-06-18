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
        Animal tiger = new Tiger();
        cat.name = "tom";
        pig.name = "pinkpig";
        monkey.name = "wukong";
        tiger.name = "xinba";
        man.feed(cat);
        man.feed(pig);
        man.feed(monkey);
        man.feed(tiger);
    }
}
