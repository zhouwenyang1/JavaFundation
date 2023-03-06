package xunhuan;

import java.util.Scanner;

public class SwitchDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期几");
        int week = sc.nextInt();
        switch (week) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("您输入的星期有错");
                break;

        }
    }
}
