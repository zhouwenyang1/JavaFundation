package method;

/*方法打印数组

 */
public class Method06 {
    public static void main(String[] args) {
        int[] arr = {1,3,6,7,8};
        printArr(arr);
    }
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
