package java2019_6.day1_homework;
//模拟彩票系统，生成双色球，6个红球（1~33），一个蓝球（1~16）
import java.util.Random;

public class DichroicBall {
    public static void main(String[] args){
        int[] redBall = new int[33];
        for(int i = 0; i < 33;i++)
            redBall[i]=i+1;
        Random random1 = new Random();
        int [] reds = new int[33];
        for(int i =0; i < redBall.length;i++){
            int red = random1.nextInt(33);
            //判断下标是否重复，如果有需要重新生成
            if(i == 0){
                reds[i] = red; //第一个下标直接放入数组
            }
            for(int j = 0;j < i;j++){
                //判断当前生成的随机数是否和之前生成的记录相同
                if(reds[j] == red){
                    //如果重复，将i减1，让i保持不变
                    i--;
                    break;
                }
                if(j == i-1){
                    reds[i]=red;
                }
            }
        }

        System.out.print("红球：");
        for(int k = 0;k < 6;k++){
            int j = reds[k];
            System.out.print(redBall[j]);
            System.out.print(" ");
        }
        System.out.print("蓝球：");
        Random random2 = new Random();
        int blue = random2.nextInt(16);
        System.out.print(blue);
    }
}