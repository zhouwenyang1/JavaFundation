package oo;

import java.util.Arrays;

public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array = { 110, 119, 114, 120, 911};
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1){
                System.out.println(array[i] + "]");
            }else {
                System.out.print(array[i] + "， ");
            }
        }
        System.out.println("=========================");
        System.out.println(Arrays.toString(array));

    }
}
