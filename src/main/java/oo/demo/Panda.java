package oo.demo;

public class Panda extends Bear{
    private String id;


    public Panda(String color, double height, int age, double weight, String id) {
        super(color, height, age, weight);
        this.id = id;
    }

    public void eatBamboo(){
        System.out.println("吃竹子");
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void fight() {
        System.out.println("熊猫打架");
    }

    @Override
    public void run() {
        System.out.println("熊猫【跑");
    }

    @Override
    public void jump() {
        System.out.println("熊猫跳");
    }

    @Override
    public void eat() {
        System.out.println("熊猫吃");
    }

    @Override
    public void shout() {
        System.out.println("熊猫叫");
    }
}
