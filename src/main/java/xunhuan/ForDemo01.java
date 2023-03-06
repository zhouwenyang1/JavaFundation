package xunhuan;

import java.util.Scanner;

/*
for循环断线重连
 */
public class ForDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入get开始进行重新连接");
        String s = sc.nextLine();
        if (s.equals("get")){
            for (int i = 1; i <= 5; i++) {
                System.out.println("正在进行第"+i+"次重新连接");
            }
        }
    }
}
