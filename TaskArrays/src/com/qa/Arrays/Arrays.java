package com.qa.Arrays;

public class Arrays {


    public static void main(String[] args) {
      //Variant 1

        int[] intArrayNotEmpty = {
                1, 2, 3, 4
        };

        if (intArrayNotEmpty[0] == 1) {
            System.out.println (false);
      }
        if (intArrayNotEmpty[1] == 2){
            System.out.println (true);
        }
        if (intArrayNotEmpty[2] == 3){
            System.out.println (false);
        }
        if (intArrayNotEmpty[3] == 4){
            System.out.println (true);
        }

        else {
          System.err.println("Something went wrong");
      }


       //Variant 2

        for (int i = 0; i < intArrayNotEmpty.length; i++) {
            System.out.println(intArrayNotEmpty[i] % 2 != 1 ? "True" : "False");
        }


        //Variant 3
            for (int i = 0; i < intArrayNotEmpty.length; i++){

                switch (intArrayNotEmpty[i]) {

                case 1:
                    System.out.println("False");
                    break;

                case 2:
                    System.out.println("True");
                    break;
                case 3:
                    System.out.println("False");
                    break;

                case 4:
                    System.out.println("True");
                    break;

                default:
                    System.err.println("False");
                    break;

            }
        }
//Variant 3

        ChetNechet (intArrayNotEmpty[0]);
        ChetNechet (intArrayNotEmpty[1]);
        ChetNechet (intArrayNotEmpty[2]);
        ChetNechet (intArrayNotEmpty[3]);

    }

    private static void ChetNechet(int number) {

        if(number % 2 == 0) {
            System.out.println("Number " + number + " Even");
        } else {
            System.out.println("Number " + number + " Odd");
        }


    }


}



