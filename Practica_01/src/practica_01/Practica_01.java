package practica_01;

import java.util.Scanner;

public class Practica_01 {

    public static void main(String[] args) {
        int n1, n2, i,ttl = 0,av = 0, max =0;
        int[] number_list = new int[10];
        Scanner var01 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        n1 = var01.nextInt();
        System.out.println("Enter the second number: ");
        n2 = var01.nextInt();
        if (n1 < n2) {
            System.out.println("The number " + n1 + " is smaller than the number " + n2);
        } else if (n2 < n1) {
            System.out.println("The number " + n2 + " is smaller than the number " + n1);
        } else {
            System.out.println("Both numbers are the same " + n1 + " = " + n2);
        }
        for (i = 0; i < 10; i++) {
            System.out.println("\nInsert the number in position " + (1 + i) + ":");
            number_list[i] = var01.nextInt();
            ttl+=number_list[i];
            if (number_list[i] > max){
            max = number_list[i];
            }
        }
        av = ttl/10;
        System.out.println("\nTotal Sum: "+ttl+"\nAverage: "+ av+"\nMax: "+max);
    }

}
