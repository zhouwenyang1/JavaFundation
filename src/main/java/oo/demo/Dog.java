package oo.demo;

public class Dog extends Animal{
    private String feet;
    public void lookHome(){
        System.out.println("看家");
    }


    public Dog(String color, double height, int age, String feet) {
        super(color, height, age);
        this.feet = feet;
    }

    public String getFeet() {
        return feet;
    }

    public void setFeet(String feet) {
        this.feet = feet;
    }

    @Override
    public void run() {
        System.out.println("狗跑");
    }

    @Override
    public void jump() {
        System.out.println("狗跳");
    }

    @Override
    public void eat() {
        System.out.println("狗吃");
    }

    @Override
    public void shout() {
        System.out.println("狗叫");
    }
}
