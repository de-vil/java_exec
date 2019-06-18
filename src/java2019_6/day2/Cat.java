package java2019_6.day2;

public class Cat {

    public Cat(){
        System.out.println("cat对象创建");
        age = 5;
        gender = "雄";
        color = "白";
    }

    public Cat(int age,String gender,String color){
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    int age;
    String gender;
    String color;

    public void eat(){
        System.out.println("吃");
    }
}
