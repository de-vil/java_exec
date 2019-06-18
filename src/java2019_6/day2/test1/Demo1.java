package java2019_6.day2.test1;

public class Demo1 {
    public static void main(String[] args){
        //创建cat对象
        Cat tom = new Cat();
        //调用对象的属性和方法
        tom.age = 3;
        tom.gender = "雌";
        tom.color = "黑";
        System.out.print(tom.age+" ");
        System.out.print(tom.color+" ");
        System.out.print(tom.gender);
    }
}
