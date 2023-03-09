package oo.demo02;

public interface Dog {
    void shout();

    void sit();

    default void wash(){
        System.out.println("这是新添加的默认方法");
    }
}
