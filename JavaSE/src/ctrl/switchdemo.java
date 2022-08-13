package ctrl;

import java.util.Scanner;

public class switchdemo {
    public static void main(String[] args) {
        String s;
        Scanner scaner = new  Scanner(System.in);
        s =  scaner.next();
        switch (s){
            case "QW":
                System.out.println("inputA");
                break;
            case "ER":
                System.out.println("inputB");
                break;
            case "AS":
                System.out.println("inputC");
                break;
        }

        scaner.close();
    }
}
