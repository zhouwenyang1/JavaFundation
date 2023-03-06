package method;

import java.util.Arrays;

/*
方法求数组最大值
 */
public class Method07 {
    public static void main(String[] args) {
        int[] arr = {10,30,12,22};
        maxArr(arr);
    }

    public static void maxArr(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}
