package xunhuan;

import java.util.Scanner;

/*
平方根
 */
public class ForDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            if (i*i==num){
                System.out.println(i+"是"+num+"的平方根");
                break;
            } else if (i*i>num) {
                System.out.println((i-1)+"是"+num+"的平方根");
                break;
            }
        }
    }
}
