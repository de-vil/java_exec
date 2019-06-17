package java2019_6.day1;

import java.util.Random;

public class Demo3 {
    public static void main(String[] args){
        String[] names={"a","b","c","d","e","f"};
        Random random = new Random();
        int [] indexs = new int[6];
        for(int i =0; i < names.length;i++){
            int index = random.nextInt(6);
            //判断下标是否重复，如果有需要重新生成
            if(i == 0){
                indexs[i] = index; //第一个下标直接放入数组
            }
            for(int j = 0;j < i;j++){
                //判断当前生成的随机数是否和之前生成的记录相同
                if(indexs[j] == index){
                    //如果重复，将i减1，让i保持不变
                    i--;
                    break;
                }
                if(j == i-1){
                    indexs[i]=index;
                }
            }

        }
        for(int k = 0;k < indexs.length;k++){
            int j = indexs[k];
            System.out.println(names[j]);
        }
    }
}
