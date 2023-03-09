package array.arrayList.demo01;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person("土狗",22);
        Person p2 = new Person("张无忌",11);
        Person p3 = new Person("白无常",33);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        for (int i = 0; i < list.size(); i++) {
            Person p = list.get(i);
            System.out.println("姓名："+p.getName()+"，年龄："+p.getAge());
        }
    }
}
