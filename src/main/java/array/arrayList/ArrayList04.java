package array.arrayList;

import java.util.ArrayList;
import java.util.Random;

public class ArrayList04 {
//    public static void main(String[] args) {
//        Random r = new Random();
//        ArrayList<Integer> bigList = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            int num = r.nextInt(100);
//            bigList.add(num);
//        }
//        for (int i = 0; i < bigList.size(); i++) {
//            System.out.println(bigList.get(i));
//        }
//        System.out.println("=============");
//        ArrayList<Integer> smallList = getSmallList(bigList);
//        for (int i = 0; i < smallList.size(); i++) {
//            System.out.println(smallList.get(i));
//        }
//    }
//
//    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {
//        ArrayList<Integer> smallList = new ArrayList<>();
//        for (int i = 0; i < bigList.size(); i++) {
//            if (bigList.get(i) % 2 == 0) {
//                smallList.add(bigList.get(i));
//            }
//        }
//        return smallList;
//    }

    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            bigList.add(r.nextInt(100));
        }
        for (int i = 0; i < bigList.size(); i++) {
            System.out.println(bigList.get(i));
        }
        System.out.println("===================");
        ArrayList<Integer> smallList = getSmallList(bigList);
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2==0){
                smallList.add(list.get(i));
            }
        }
        return smallList;
    }
}
