//package com.core.oop.abstraction.samplejava9;
//
//public interface Java9InterfaceFeatures {
//
//    public abstract void mul(int a, int b);
//
//    public default void add(int a, int b) {
//// private method inside default method
//        sub(a, b);
//
//        // static method inside other non-static method
//        div(a, b);
//        System.out.print("Answer by Default method = ");
//        System.out.println(a + b);
//    }
//
//    public static void mod(int a, int b) {
//        div(a, b); // static method inside other static method
//        System.out.print("Answer by Static method = ");
//        System.out.println(a % b);
//    }
//
//    private void sub(int a, int b) {
//        System.out.print("Answer by Private method = ");
//        System.out.println(a - b);
//    }
//
//    private static void div(int a, int b) {
//        System.out.print("Answer by Private static method = ");
//        System.out.println(a / b);
//    }
//}
