package array;

/*
求数组的最值
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] array = {2,1000,100,55,66};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("该数组的最大值为："+max);
    }
}
