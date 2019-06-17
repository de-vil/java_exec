package java2019_6.day1;

public class Demo2 {
    //数组：一组相同数据类型的值的一个集合；
    //数组中存放的数据称为元素
    // 声明数组：int[] arr1 = new int[5];
    //          int arr2[] = new int[5];
    //          int arr3[] = new int[]{1,2,3,4,5};
    //          int arr4[] = {1,2,3,4,5};
    //查看数组长度 arr1.length
    //查看数组中的元素 arr[index] index是从那个0开始，连续的，最大数值为数组长度-1
    public static void main(String[] args) {
//    声明数组
        int[] arr1 = new int[5];
        int arr2[] = new int[5];
        int arr3[] = new int[]{1,2,3,4,5};
        int arr4[] = {1,2,3,4,5};
        System.out.println("数组arr3长度："+arr3.length);

//        遍历数组元素
        System.out.println("其中的数据为：");
        for(int i = 0;i < arr3.length;i++  ){
            System.out.print(arr3[i]);
            System.out.print(" ");
        }
     }
}
