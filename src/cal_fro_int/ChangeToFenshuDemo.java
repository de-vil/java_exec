package cal_fro_int;

/**
 * 小数转分数
 * @author Happy_Girl2012
 */
public class ChangeToFenshuDemo {
    /**
     * 取得公约数
     * @param a
     * @param b
     * @return int
     */
    public static int getGongYueShu(int a, int b) {//求两个数的最大公约数
        int t = 0;
        if(a < b){
            t = a;
            a = b;
            b = t;
        }
        int c = a % b;
        if(c == 0){
            return b;
        }else{
            return getGongYueShu(b, c);
        }
    }
    /**
     * 转化成分数
     * @param xiaoshu
     * @return String
     */
    public static String toFenshu(String xiaoshu) {

        String[] array = new String[2];
        array = xiaoshu.split("\\.");
        int a = Integer.parseInt(array[0]);//获取整数部分
        int b = Integer.parseInt(array[1]);//获取小数部分
        int length = array[1].length();
        int FenZi = (int) (a * Math.pow(10, length) + b);
        int FenMu = (int) Math.pow(10, length);
        int MaxYueShu = getGongYueShu(FenZi, FenMu);
        return new String(FenZi / MaxYueShu + "/" + FenMu / MaxYueShu);
    }

}
