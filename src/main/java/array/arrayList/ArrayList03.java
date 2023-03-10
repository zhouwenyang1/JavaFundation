package array.arrayList;

import java.util.ArrayList;

public class ArrayList03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("语文");
        list.add("数学");
        list.add("英语");

        print(list);

    }

    public static void print(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
