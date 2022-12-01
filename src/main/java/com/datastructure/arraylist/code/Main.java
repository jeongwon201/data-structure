package com.datastructure.arraylist.code;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"데이터1", "데이터2", "데이터3", "데이터4", "데이터5"};

        ArrayList arrayList = new ArrayList(strings);
        arrayList.print();

        arrayList.add("데이터6");
        arrayList.print();

        arrayList.add("데이터7");
        arrayList.print();

        arrayList.add(3, "데이터3-1");
        arrayList.print();

        arrayList.remove();
        arrayList.print();

        arrayList.remove();
        arrayList.print();

        arrayList.remove(3);
        arrayList.print();

    }
}
