package cal_fro_int;

import java.util.Scanner;
/**
 * 小学生出题系统(30道四则运算题)
 * @author www.cnsimo.cn
 * @since 2017-03-07 21:53:14
 */
public class CT {

    public static String str = "";//保存题目的字符串
    public static int num = 5;//每题中数的个数
    public static int num_i = 0;//题目中已有数的个数
    public static int numberRange = 100;//运算中数的最大取值
    public static double sum = 0;//记录结果

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("注意：结果保留1位小数！");
        System.out.println("共30道题目：");
        Scanner in = new Scanner(System.in);
        double answer = 0;
        double result = 0;
        String[] question = new String[30];
        int questionNumber = 0;
        int answerTrue = 0;
        boolean flag;
        for(;;) {
            answer = 0; result = 0; flag = true; str="";
            if((questionNumber + 1)%5 != 0) {
                GetQuestion_int();
            } else {
                GetQuestion_div();
            }
            for(int j = questionNumber-1; j >= 0; j --) {
                if(question[j].equals(str)) {
                    flag = false; break;
                }
            }
            if(!flag) continue;
            else {question[questionNumber] = new String(str); questionNumber++;}
            System.out.print("" + questionNumber + ". " + str+" = ");
            answer = in.nextDouble();
            if(!str.isEmpty()) {
                result = Arithmetic.arithmetic(str);
            }
            if(answer == result) {
                System.out.println("   ✔️");
                answerTrue++;
            } else {
                System.out.println("   ❌ " + "  正确答案：" + result);
            }

            if(questionNumber == 30) break;         // 满30个跳出
        }

        System.out.println("你的正确概率：" + answerTrue + "/30");
        in.close();
    }

    private static void GetQuestion_int() {
        //得到问题函数，在这里调用递归函数quesGrow()。
        str = "";
        sum = 0;
        num_i = num;//用前都清零
        quesGrow_int();
    }

    private static void GetQuestion_div() {
        str = "";
        sum = 0;
        num_i = num;//用前都清零
        quesGrow_div();
    }

    private static void quesGrow_int() {
        //
        if( num_i > 1 ) {
            int j = num_i;//记录这是第几层调用。
            num_i--;
            quesGrow_int();//递归

            int w=1+(int)(Math.random()*numberRange);//随机生成一个数
            int t=1+(int)(Math.random()*100);//向左生成，还是向右生成，类似于树。
            int f=1+(int)(Math.random()*100);//运算符控制

            if(t>50)//新数往右加
            {
                if(f>50) {
                    if(f>75) {
                        sum = sum + w;
                        str = str + "+" + String.valueOf( w );
                    } else {
                        sum *= w;
                        str = str + "*" + String.valueOf(w);
                    }
                }
                else {
                    if(f<25) {
                        sum = sum - w;
                        str = str + "-" + String.valueOf( w );
                    } else {
                        sum = sum / w;
                        str = str + "/" + String.valueOf(w);
                    }
                }
            }
            else//否则 新数往左加
            {
                if(f>50) {
                    if(f>50) {
                        sum = w + sum;
                        str = String.valueOf( w ) + "+" + str;
                    } else {
                        sum = w * sum;
                        str = String.valueOf(w) + "*" + str;
                    }
                } else {
                    if( j < 3 ) {//3——摸索出的数，不用给自己套上括号。实际上就是j=2
                        if(f<25) {
                            sum = w - sum;
                            str = String.valueOf( w ) + "-" + str;
                        } else {
                            sum = w / sum;
                            str = String.valueOf( w ) + "/" + str;
                        }
                    }
                    else {
                        if(f<25) {
                            sum = w - sum;
                            str = String.valueOf( w ) + "-" + "(" +str+ ")";
                            //向左添减法的时候加括号，打破顺序计算模式。
                        } else {
                            sum = w / sum;
                            str = String.valueOf(w) + "/" + "(" + str + ")";
                        }
                    }
                }
            }
        }
        else if( num_i == 1 ) {
            //最后一层，也是输出的第一层
            int w=1+(int)(Math.random()*numberRange);
            sum = sum + w;
            str = str + String.valueOf( w );
        }
    }

    private static void quesGrow_div() {
        if( num_i > 1 ) {
            int j = num_i;//记录这是第几层调用。
            num_i--;
            quesGrow_div();//递归

            double w=Math.random();//随机生成一个数
            int t=1+(int)(Math.random()*100);//向左生成，还是向右生成，类似于树。
            int f=1+(int)(Math.random()*100);//运算符控制

            if(t>50)//新数往右加
            {
                if(f>50) {
                    if(f>75) {
                        sum = sum + w;
                        str = str + "+" + ChangeToFenshuDemo.toFenshu((""+(w+0.01)).substring(0, 4));
                        // +0.01保证w长度不低于4，并且w需要截取到小数点后2位，防止小数点后字符长度过大不能转化成int型
                    } else {
                        sum *= w;
                        str = str + "*" + ChangeToFenshuDemo.toFenshu((""+(w+0.01)).substring(0, 4));
                    }
                }
                else {
                    if(f<25) {
                        sum = sum - w;
                        str = str + "-" + ChangeToFenshuDemo.toFenshu((""+(w+0.01)).substring(0, 4));
                    } else {
                        sum = sum / w;
                        str = str + "/" + ChangeToFenshuDemo.toFenshu((""+(w+0.01)).substring(0, 4));
                    }
                }
            }
            else//否则 新数往左加
            {
                if(f>50) {
                    if(f>75){
                        sum = w + sum;
                        str = ChangeToFenshuDemo.toFenshu((""+(w+0.01)).substring(0, 4)) + "+" + str;
                    } else{
                        sum = w * sum;
                        str = ChangeToFenshuDemo.toFenshu((""+(w+0.01)).substring(0, 4)) + "*" + str;
                    }
                }
                else {
                    if( j < 3 ) {//3——摸索出的数，不用给自己套上括号。实际上就是j=2
                        sum = w - sum;
                        str = ChangeToFenshuDemo.toFenshu((""+(w+0.01)).substring(0, 4)) + "-" + str;
                    }
                    else {
                        sum = w - sum;
                        str = ChangeToFenshuDemo.toFenshu((""+(w+0.01)).substring(0, 4)) + "-" + "(" +str+ ")";
                        //向左添减法的时候加括号，打破顺序计算模式。
                    }
                }
            }
        }
        else if( num_i == 1 ) {
            //最后一层，也是输出的第一层
            double w=Math.random();
            sum = sum + w;
            str = str + ChangeToFenshuDemo.toFenshu((""+(w+0.01)).substring(0, 4));
        }
    }
}
