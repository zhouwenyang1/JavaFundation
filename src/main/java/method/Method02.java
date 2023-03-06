package method;

public class Method02 {
    public static void main(String[] args) {
        boolean b = compare(2,3);
        System.out.println(b);
    }
    public static boolean compare(int a,int b){
        if (a==b){
            return true;
        }else {
            return false;
        }
    }
}
