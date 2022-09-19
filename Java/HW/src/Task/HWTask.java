package Task;

import java.util.Scanner;
//    Напишите метод, который принимает три числа и выводит на экран
//"All numbers are equal" если все они равны
//"All numbers are different" если все они разные
//"Some numbers are equal" если какие то из них равны

public class HWTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        int a = scan.nextInt();
        System.out.println("enter second number");
        int b = scan.nextInt();
        System.out.println("enter third number");
        int c = scan.nextInt();
// 1 способ
       /* if (a == b & b == c) {
            System.out.println("All numbers are equal");
        } else {
            if (a == b | a == c | b == c) {
                System.out.println("Some numbers are equal");
            } else {
                System.out.println("All numbers are different");
            }
        }*/
        //2 способ, менее удачный
        if (a == b & b == c){
            System.out.println("All numbers are equal");
        }
        if (a == b | a == c | b == c) {
            System.out.println("Some numbers are equal");
        }
        if (a!=b&b!=c&a!=c){
            System.out.println("All numbers are different");
        }





    }



}
