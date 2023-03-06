package array;

/*
数组装返回值
 */
public class ArrayReturn {
    public static void main(String[] args) {
        int[] arrayA = Result(2,6,7);
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
    }
    public static int[] Result(int a,int b,int c){
        int sum = a + b + c;
        int avg = sum/3;
        int[] array = {sum, avg};
        return array;
    }
}
