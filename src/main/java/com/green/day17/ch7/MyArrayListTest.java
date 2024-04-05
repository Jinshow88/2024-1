package com.green.day17.ch7;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        list.add(10);

        list.add(21);

        list.add(12);

        list.add(13);
        System.out.println(list);

        int size = list.size();
        System.out.println("size : " + size);
        System.out.println(list.get(3));
        System.out.println(list.get(0));

    }
}


class MyArrayList {
    private int[] arr;


    int get(int num){
        return arr[num];
    }

    public MyArrayList() {
        arr = new int[0];
    }

    void add(int val) {
        int[] tmp = new int[arr.length + 1];
        tmp[tmp.length - 1] = val;// ===tmp[arr.length]=val;

        for(int i=0; i<arr.length; i++){
            tmp[i]=arr[i];
        }

        arr = tmp;
    }

    int size (){
        return arr.length;
    }

    @Override
    public String toString() {
        if (arr.length == 0) {
            return "[]";
        }
        StringBuilder sd = new StringBuilder(String.format("[%d", arr[0]));
        for (int i = 1; i < arr.length; i++) {
            sd.append(String.format(",%d", arr[i]));
        }

        sd.append("]");
        return sd.toString();
    }

    void showLength() {
        System.out.println("len : " + arr.length);
    }

}