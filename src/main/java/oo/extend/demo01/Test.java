package oo.extend.demo01;

public class Test {
    public static void main(String[] args) {
        Husky husky = new Husky();
        husky.look();
        husky.drink();
        husky.eat();
        husky.breakHome();

        System.out.println("==========================");

        LiHua liHua = new LiHua();
        liHua.eat();
        liHua.drink();
        liHua.catchMouse();
    }
}
