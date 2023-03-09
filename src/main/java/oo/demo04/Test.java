package oo.demo04;

public class Test {
    public static void main(String[] args) {
        Phone xiaomi1 = new XiaoMi();
        xiaomi1.charge();
        XiaoMi xiaomi2 =(XiaoMi)xiaomi1;
        xiaomi2.price();
        System.out.println("====================");

        Phone iphone1 = new Iphone();
        iphone1.charge();
        Iphone iphone2 = (Iphone) iphone1;
        iphone2.price();
        System.out.println("====================");

        Computer lenovo = new Lenovo();
        lenovo.charge();
        System.out.println("====================");

        Computer macBook = new MacBook();
        macBook.charge();
        System.out.println("====================");
    }
}
