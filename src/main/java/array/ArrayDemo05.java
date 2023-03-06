package array;

public class ArrayDemo05 {
    public static void main(String[] args) {
        int[] array = {100,300,200,600};
        printArray(array);

    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
