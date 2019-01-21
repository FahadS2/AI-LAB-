package division;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        System.out.println("Please Enter a Number: ");
        int num = Input.nextInt();
        System.out.println("Devisors for the number " + num + " Are");
        
        for (int i=1; i<=num; i++){
            if (num%i==0){
            System.out.print(i + "   ");
            }
        }
    }
}
