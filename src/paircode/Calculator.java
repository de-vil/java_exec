package paircode;

/**
 *本四则运算出题器所出题目均为两数进行四则运算，
 * 且两数均小于等于20，因数字过大也不易于口算，
 * 结果保留两位小数。
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {

    //设置全局变量
    public static String str = "";//保存题目的字符串
    public static int num = 2;//每题中数的个数
    public static int num_i = 0;//题目中已有数的个数
    public static int numberRange = 20;//运算中数的最大取值
    public static double sum = 0;//记录结果
    public static String[] ss = {"","","","","",""}; // 用于存放随机出的题目
    JTextField jtf=new JTextField(5);
    JLabel jlb1 = new JLabel("");
    JLabel[] jlb2 =new JLabel[6];  //用于显示正确答案
    JLabel jlb3 = new JLabel("");

    /**
     * 出题框
     */
    JTextField[] jtf_arr=new JTextField[6];

    /**
     * 答题框
     */
    JTextField[] jtfa_arr = new JTextField[6];

    public Calculator(){

        for(int j = 1; j <= 6;j ++){
            jtf_arr[j-1] = new JTextField(5);
            jtfa_arr[j-1] = new JTextField(5);
            jlb2[j-1] = new JLabel("");
        }
        JLabel jl1 = new JLabel("欢迎使用本软件！");
        JLabel jl2 = new JLabel("请输入题数（最多不超过6题）：");

        JButton jb1=new JButton("开始答题");
        Issue iss=new Issue();
        jb1.addActionListener(iss);
        JButton jb2=new JButton("提交");
        Submit sub=new Submit();
        jb2.addActionListener(sub);

        /**
         * 题目序号
         */
        JLabel jl3=new JLabel("第一题：");
        JLabel jl4=new JLabel("第二题：");
        JLabel jl5=new JLabel("第三题：");
        JLabel jl6=new JLabel("第四题：");
        JLabel jl7=new JLabel("第五题：");
        JLabel jl8=new JLabel("第六题：");
        JLabel jeq1=new JLabel("=");
        JLabel jeq2=new JLabel("=");
        JLabel jeq3=new JLabel("=");
        JLabel jeq4=new JLabel("=");
        JLabel jeq5=new JLabel("=");
        JLabel jeq6=new JLabel("=");


        /**
         * 布局管理，使界面更美观
         */
        JPanel p=new JPanel(new GridLayout(9,5));
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JPanel p4=new JPanel();
        JPanel p5=new JPanel();
        JPanel p6=new JPanel();
        JPanel p7=new JPanel();
        JPanel p8=new JPanel();
        JPanel p9=new JPanel();
       // JPanel p10=new JPanel();
        p1.add(jl1);
        p2.add(jl2);
        p2.add(jtf);
        p2.add(jb1);
        p3.add(jl3);
        p3.add(jtf_arr[0]);
        p3.add(jeq1);
        p3.add(jtfa_arr[0]);
        p3.add(jl4);
        p3.add(jtf_arr[1]);
        p3.add(jeq2);
        p3.add(jtfa_arr[1]);
        p4.add(jl5);
        p4.add(jtf_arr[2]);
        p4.add(jeq3);
        p4.add(jtfa_arr[2]);
        p4.add(jl6);
        p4.add(jtf_arr[3]);
        p4.add(jeq4);
        p4.add(jtfa_arr[3]);
        p5.add(jl7);
        p5.add(jtf_arr[4]);
        p5.add(jeq5);
        p5.add(jtfa_arr[4]);
        p5.add(jl8);
        p5.add(jtf_arr[5]);
        p5.add(jeq6);
        p5.add(jtfa_arr[5]);
        p6.add(jlb1);
        p7.add(jlb3);
        p7.add(jlb2[0]);
        p7.add(jlb2[1]);
        p7.add(jlb2[2]);
        p7.add(jlb2[3]);
        p7.add(jlb2[4]);
        p7.add(jlb2[5]);

        p8.add(jb2);
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p5);
        p.add(p6);
        p.add(p7);
        p.add(p8);
        p.add(p9);
       // p.add(p10);
        getContentPane().add(p);
        /**
         * 使界面显示出来，设置界面大小，以及点击退出按钮能正常退出程序
         */
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * 出题按钮监听，响应对应事件
     */
    class Issue implements ActionListener {
        public void actionPerformed(ActionEvent ee) {

                // JOptionPane.showMessageDialog(null, "text:出题");
                String num = jtf.getText();
                if(jtf.getText().length() == 0){
                    JOptionPane.showMessageDialog(null,"请输入正确的题数！");
                    jtf.setText("5");  //在题数错误输入的情况下默认将题数设置为5，可自由更改
                }
                int num_i = Integer.parseInt(num);  //数据类型转换
                if(num_i != 1&num_i != 2&num_i != 3&num_i != 4&num_i != 5&num_i != 6){
                    JOptionPane.showMessageDialog(null,"请输入正确的题数！");
                    jtf.setText("5");  //在题数错误输入的情况下默认将题数设置为5，可自由更改
                }
                else {
                for (int i = 0; i < num_i; i++) {
                    str = "";
                    GetQuestion_int(); //调用出题函数。
                    ss[i]=str;
                    jtf_arr[i].setText(str);
                }

        }
        }
    }
        /**
         * 提交按钮监听，响应对应事件
         */
        class Submit implements ActionListener {
            public void actionPerformed(ActionEvent ee) {
              //  JOptionPane.showMessageDialog(null, "text:提交");
                String num = jtf.getText();
                int num_i = Integer.parseInt(num);
                double[] answer = {0, 0, 0, 0, 0, 0};//存储回答的答案
                double[] result = {0, 0, 0, 0, 0, 0};//存储正确答案

                int[] count ={0,0,0,0,0,0};
                int count_tol=0;  //计数：统计回答正确的个数
                for (int i = 0; i < num_i; i++) {
                    answer[i] = 0;
                    result[i] = 0;
                    String answer_s = jtfa_arr[i].getText();
                    if(jtfa_arr[i].getText().length() == 0){
                        JOptionPane.showMessageDialog(null,"存在未完成题目，请继续作答");
                    }
                    answer[i] = Double.parseDouble(answer_s) ;  //数据类型转换
                    result[i] = Arithmetic.arithmetic(ss[i]);
                    if(answer[i]==result[i]){
                        count[i]=1;
                    }
                    count_tol=count_tol+count[i];
                }
                int dcount = num_i-count_tol;
                jlb1.setText("你答对了"+count_tol+"道题;答错了"+dcount+"道题！");
                jlb3.setText("参考答案：");
                for(int i = 0;i< num_i;i++){
                    jlb2[i].setText("  "+result[i]);

                }


            }
        }

        public static void main(String[] args) {
            //JOptionPane.showConfirmDialog(null,"确认开始答题？");
            new Calculator();
        }

    /**
     * 以下算法参考自github上一个类似的程序
     */

        private static void GetQuestion_int() {
            str = "";
            sum = 0;
            num_i = num;//用前都清零
            quesGrow_int();
        }

        private static void quesGrow_int() {

            if (num_i > 1) {
                int j = num_i;
                num_i--;
                quesGrow_int(); //递归调用自己

                int w = 1 + (int) (Math.random() * numberRange);//随机生成一个数
                int t = 1 + (int) (Math.random() * 100);//向左生成，还是向右生成，类似于树。
                int f = 1 + (int) (Math.random() * 100);//运算符控制

                if (t > 50)
                {
                    if (f > 50) {
                        if (f > 75) {
                            sum = sum + w;
                            str = str + "+" + String.valueOf(w);
                        } else {
                            sum *= w;
                            str = str + "*" + String.valueOf(w);
                        }
                    } else {
                        if (f < 25) {
                            sum = sum - w;
                            str = str + "-" + String.valueOf(w);
                        } else {
                            sum = sum / w;
                            str = str + "/" + String.valueOf(w);
                        }
                    }
                } else//否则 新数往左加
                {
                    if (f > 50) {
                        if (f > 50) {
                            sum = w + sum;
                            str = String.valueOf(w) + "+" + str;
                        } else {
                            sum = w * sum;
                            str = String.valueOf(w) + "*" + str;
                        }
                    } else {
                        if (j < 3) {
                            if (f < 25) {
                                sum = w - sum;
                                str = String.valueOf(w) + "-" + str;
                            } else {
                                sum = w / sum;
                                str = String.valueOf(w) + "/" + str;
                            }
                        } else {
                            if (f < 25) {
                                sum = w - sum;
                                str = String.valueOf(w) + "-" + "(" + str + ")";
                                //向左添减法的时候加括号，打破顺序计算模式。
                            } else {
                                sum = w / sum;
                                str = String.valueOf(w) + "/" + "(" + str + ")";
                            }
                        }
                    }
                }
            } else if (num_i == 1) {
                int w = 1 + (int) (Math.random() * numberRange);
                sum = sum + w;
                str = str + String.valueOf(w);
            }
        }
    }
