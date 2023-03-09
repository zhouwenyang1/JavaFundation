package oo.demo02;

public class DogImpl implements Dog{
    @Override
    public void shout() {
        System.out.println("汪汪");
    }

    @Override
    public void sit() {
        System.out.println("坐下");
    }
}
