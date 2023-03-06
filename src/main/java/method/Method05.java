package method;

public class Method05 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        short c = 10;
        short d = 10;
        int e = 10;
        int f = 10;
        System.out.println(compare(a,b));
        System.out.println(compare(c,d));
        System.out.println(compare(e,f));
    }
    public static boolean compare(byte a,byte b){
        System.out.println("byte");
        return a==b;
    }
    public static boolean compare(short a,short b){
        System.out.println("short");
        return a==b;
    }

    public static boolean compare(int a,int b){
        System.out.println("int");
        return a==b;
    }
}
