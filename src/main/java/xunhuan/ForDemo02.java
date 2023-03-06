package xunhuan;

import java.util.Scanner;

public class ForDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始数");
        int start = sc.nextInt();
        System.out.println("请输入结束数");
        int end = sc.nextInt();

        int count = 0;

        //找出能被3，5整除的数找出能被3，5整除的数
        System.out.println("能被3，5整除的数");
        for (int i = start; i <= end; i++) {
            if (i % 3==0 && i%5==0){
                System.out.println(i);
                count++;
            }
        }

        System.out.println("这样的数一共有"+count+"个");

    }
}
