package array.arrayList.demo01;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayTest {

    public static void main(String[] args) {
        int rows = 4;
        int columns = 5;
        int[] arr = getArr(rows, columns);
        System.out.println(Arrays.toString(arr));
        System.out.println();

        int[][] arr2 = change(arr, rows, columns);
        for (int[] ints : arr2) {
            for (int anInt : ints) {
                System.out.print(anInt+",");
            }
            System.out.println();
        }
        System.out.println();

        int[][] arr3 = change2(arr2);
        for (int[] ints : arr3) {
            for (int anInt : ints) {
                System.out.print(anInt+",");
            }
            System.out.println();
        }

    }


    public static int[] getArr(int rows,int column){
        int[] arr1 = new int[rows*column];
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < arr1.length; i++) {
            int num  = r.nextInt(arr1.length)+1;
            while(true){
                if(!list.contains(num)){
                    list.add(num);
                    arr1[i] = num;
                    break;
                }
                num  = r.nextInt(arr1.length)+1;
            }


        }
        return arr1;
    }

    public static int[][] change(int[] arr1,int rows,int colums){
        int[][] arr2 = new int[rows][colums];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                arr2[i][j] = arr1[k];
                k++;
            }
        }
        return arr2;

    }

    public static int[][] change2(int[][] arr2){
        int rows = arr2.length;
        int columns = arr2[0].length;
        int[][] arr3 = new int[columns][rows];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr3[j][i] = arr2[i][j];
            }
        }
        return arr3;


    }
}
