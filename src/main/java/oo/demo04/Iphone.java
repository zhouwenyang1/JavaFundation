package oo.demo04;

public class Iphone extends Phone{
    @Override
    public void charge() {
        System.out.println("苹果手机充电慢");
    }

    public void price(){
        System.out.println("苹果手机太贵了");
    }
}
