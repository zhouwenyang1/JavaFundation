package method;

public class Method03 {
    public static void main(String[] args) {
        int Sum = getSum(100);
        System.out.println(Sum);
    }
    public static int getSum(int s){
        int sum=0;
        for (int i = 0; i <= s; i++) {
            sum+=i;
        }
        return sum;
    }
}
