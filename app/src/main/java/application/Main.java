package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] valores = new int [5];
        
        for(int cont =0;cont < valores.length;cont++){
            try {
                System.out.println("Digite um valor:");
                Scanner sc = new Scanner (System.in);
                valores[cont] = sc.nextInt();                
            } catch (InputMismatchException exhn)  {
                System.out.println("Digite um numero inteiro");
                cont--;
            }
        }
        System.out.println("Valores: ");
        for (int val : valores) {
            System.out.println(val + " ");
        }
    }
}
//
