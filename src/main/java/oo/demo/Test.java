package oo.demo;

/*
测试
 */
public class Test {
    public static void main(String[] args) {
        //父类animal
        Animal animal = new Animal();
        //省略了设置属性
        animal.run();
        animal.jump();
        animal.eat();
        animal.shout();
        System.out.println("==================");

        //熊
        Bear bear = new Bear("红色",48.8,20,88.8);
        System.out.println(bear.getColor()+","+bear.getHeight()+","+bear.getAge()+","+bear.getHeight());
        bear.run();
        bear.jump();
        bear.eat();
        bear.shout();
        bear.fight();
        System.out.println("==================");

        //熊猫
        Panda panda = new Panda("红色",20.0,11,55,"1");
        System.out.println(panda.getColor()+","+panda.getHeight()+","+panda.getAge()+","+panda.getWeight()+panda.getId());
        panda.run();
        panda.jump();
        panda.eat();
        panda.shout();
        panda.fight();
        System.out.println("==================");

        //猫
        Cat cat = new Cat("黄色",20.1,6,10.1);
        System.out.println(cat.getColor()+","+cat.getHeight()+","+cat.getAge()+","+cat.getSpeed());
        cat.run();
        cat.jump();
        cat.eat();
        cat.shout();
        cat.catchMouse();
        System.out.println("==================");

        //狗
        Dog dog = new Dog("黑色",8.1,4,"脚");
        //此处省略输出属性，麻烦
        dog.run();
        dog.jump();
        dog.eat();
        dog.shout();
        dog.lookHome();


    }
}
