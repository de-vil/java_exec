package java2019_6.day2;

public class Cat {

    public Cat(){
        age = 5;
        gender = "雄";
        color = "白";
    }

    public Cat(int age, String gender, String color){
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    public Cat(String gender, String color) {
        super();
        this.gender = gender;
        this.color = color;
    }

    public Cat(int age, String color) {
        super();
        this.age = age;
        this.color = color;
    }

    int age;
    String gender;
    String color;

    public void eat(){
        System.out.println("吃");
    }

    public void eat(String food){
        System.out.println("吃"+food);
    }
    public void eat(int number){
        System.out.println("吃"+number);
    }
}
