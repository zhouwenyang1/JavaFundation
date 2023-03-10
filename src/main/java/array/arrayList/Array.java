package array.arrayList;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        int rows = 3;
        int column = 4;

        int[] arr = getArr(rows, column);
        System.out.println(Arrays.toString(arr));

        System.out.println("----------------------------------");

        int[][] arr2 = parse(arr, rows, column);
        for (int[] ints : arr2) {
            for (int anInt : ints) {
                System.out.print(anInt+",");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");

        int[][] arr3 = parse1(arr2);
        for (int[] ints : arr3) {
            for (int anInt : ints) {
                System.out.print(anInt+",");
            }
            System.out.println();
        }


    }

    public static int[] getArr(int rows,int column){
        int[] nums1 = new int[rows*column];
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < nums1.length; i++) {
            int k  = r.nextInt(nums1.length)+1;
            while(true){
                if(!list.contains(k)){
                    list.add(k);
                    nums1[i] = k;
                    break;
                }
                k  = r.nextInt(nums1.length)+1;
            }


        }
        return nums1;
    }

    public static int[][] parse(int[] nums1,int rows,int colums){
        int[][] nums2 = new int[rows][colums];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                nums2[i][j] = nums1[k];
                k++;
            }
        }
        return nums2;

    }

    public static int[][] parse1(int[][] nums2){
        int rows = nums2.length;
        int columns = nums2[0].length;
        int[][] nums3 = new int[columns][rows];
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                nums3[j][i] = nums2[i][j];
            }
        }
        return nums3;


    }
}
