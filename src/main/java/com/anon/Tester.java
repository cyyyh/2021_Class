package com.anon;


public class Tester {
    public static void main(String[] args) {
        Reporter reporter = new Reporter() {
            @Override
            public void print() {
                System.out.println("Ding Dong");
            }
        };
        Reporter reporter1 = new Reporter() {
            @Override
            public void print() {
                System.out.println("Hehehe");
            }
        };
        reporter.print();
        reporter1.print();
    }
}
