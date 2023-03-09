package oo.demo;

public class Cat extends Animal{
    private double speed;
    public void catchMouse(){
        System.out.println("抓老鼠");
    }

    public Cat(String color, double height, int age, double speed) {
        super(color, height, age);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void run() {
        System.out.println("猫跑");
    }

    @Override
    public void jump() {
        System.out.println("猫跳");
    }

    @Override
    public void eat() {
        System.out.println("猫吃");
    }

    @Override
    public void shout() {
        System.out.println("猫叫");
    }
}
