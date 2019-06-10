/**
 * 输入一个整数，判断它是奇数还是偶数
 */
package p1_1;

import java.util.*;  /*用于使用类Scanner*/

public class OddEven {
    public static void main(String[] args){
        int num;   /*存储输入的整数*/
        int rem;   /*存放除以2后的余数*/
        System.out.print("请输入一个整数：");
        Scanner console = new Scanner(System.in);
        num = console.nextInt(); /*从用户处得到该整数*/
        /*计算除以2后的余数并输出结果*/
        rem = num % 2;
        if(rem == 0){
            System.out.println("该数是偶数");
        }
        else {
            System.out.println("该数是奇数");
        }
    }
}
