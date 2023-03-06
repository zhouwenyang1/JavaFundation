package array;

import java.util.Random;

/*
随机打乱数组
 */
public class ArrayDemo07 {
    public static void main(String[] args) {
        int[] arr = {12,23,53,54,76};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
