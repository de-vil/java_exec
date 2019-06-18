package java2019_6.day2.test2;
//封装
public class Test1 {
    public static void main(String[] args) {
        Computer computer1 = new Computer("i9 9900k","16G","1t","2080");

        //computer.cpu = "i3 8100"; 因为设置了封装保护，这里会出错，外部环境无法对其进行修改。
        System.out.println(computer1.getCpu());
        computer1.setCpu("i7 8700k");
        System.out.println(computer1.getCpu());

        System.out.println(computer1);
    }
}
