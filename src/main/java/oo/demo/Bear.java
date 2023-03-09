package oo.demo;

public class Bear extends Animal{
    private double weight;

    public void fight(){
        System.out.println("战斗");
    }

    public Bear(double weight) {
        this.weight = weight;
    }

    public Bear(String color, double height, int age, double weight) {
        super(color, height, age);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void run() {
        System.out.println("熊跑");
    }

    @Override
    public void jump() {
        System.out.println("熊跳");
    }

    @Override
    public void eat() {
        System.out.println("熊吃");
    }

    @Override
    public void shout() {
        System.out.println("熊叫");
    }
}
