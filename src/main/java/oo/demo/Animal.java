package oo.demo;

/*
动物类
 */
public class Animal {
    private String color;
    private double height;
    private int age;

    public void run(){
        System.out.println("跑");
    }

    public void jump(){
        System.out.println("跳");
    }

    public void eat(){
        System.out.println("吃");
    }

    public void shout(){
        System.out.println("叫");
    }

    public Animal() {
    }

    public Animal(String color, double height, int age) {
        this.color = color;
        this.height = height;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
