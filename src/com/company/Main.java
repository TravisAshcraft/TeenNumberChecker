package com.company;

public class Main {

    public static void main(String[] args) {
	 TeenNumberChecker teenNumberChecker = new TeenNumberChecker();

        System.out.println(teenNumberChecker.hasTeen(22,23,34));

        System.out.println(teenNumberChecker.isTeen(15));
    }
}
