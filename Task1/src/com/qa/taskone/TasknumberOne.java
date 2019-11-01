package com.qa.taskone;

public class TasknumberOne {

    public static void main(String[] args) {
        int varInt;
        double varDouble;
        String varStr;

        varInt = 12;
        System.out.println("Integer = " + varInt);
        varStr = String.valueOf(varInt);
        System.out.println("String = " + varStr);
        varDouble = Double.parseDouble(varStr);
        System.out.println("double = " + varDouble);
        varInt = (int) varDouble;
        System.out.printf("Double : %f, int : %d %n", varDouble, varInt);
    }

}
