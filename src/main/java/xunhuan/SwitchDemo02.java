package xunhuan;

import java.util.Scanner;

public class SwitchDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期几，来查看今天的安排");
        int week = sc.nextInt();
        switch (week){
            case 1:
                System.out.println("打篮球");
                break;
            case 2:
                System.out.println("踢足球");
                break;
            case 3:
                System.out.println("游泳");
                break;
            case 4:
                System.out.println("疯狂星期四");
                break;
            case 5:
                System.out.println("看电影");
                break;
            case 6:
                System.out.println("拳击");
                break;
            case 7:
                System.out.println("购物");
                break;
            default:
                System.out.println("你输入的星期有错");
                break;
        }
    }
}
