package xunhuan;

import java.util.Scanner;

public class SwitchDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择你想去的城市：1.成都 2.上海 3.北京 4.深圳");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("去成都");
                break;
            case 2:
                System.out.println("去上海");
                break;
            case 3:
                System.out.println("去北京");
                break;
            case 4:
                System.out.println("去深圳");
                break;
            default:
                System.out.println("去其他城市");
                break;
        }
    }
}
