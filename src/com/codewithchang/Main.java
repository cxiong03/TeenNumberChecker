package com.codewithchang;

public class Main {

    public static void main(String[] args) {

        TeenTracker teen = new TeenTracker();
        boolean check = false;

        check = teen.hasTeen(9, 99, 19);
        System.out.println(check);
        check = teen.hasTeen(23, 15, 42);
        System.out.println(check);
        check = teen.hasTeen(22, 23, 24);
        System.out.println(check);
    }
}
