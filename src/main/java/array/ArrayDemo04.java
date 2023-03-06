package array;

import java.util.Arrays;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] array = {3,2,1,4};
//        int num1 = 0;
//        for (int i = 0; i < array.length/2; i++) {
//            num1 = array[i];
//            array[i] = array[array.length-i-1];
//            array[array.length-i-1] = num1;
//        }
//        for (int min = 0, max=array.length - 1;min < max;min++, max--){
//            int temp = array[min];
//            array[min] = array[max];
//            array[max] = temp;
//        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
