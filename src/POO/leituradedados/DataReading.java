package POO.leituradedados;

import java.util.Scanner;

public class DataReading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //objeto
        // tipos de leitura
        // next lê string, mas somente a primeira palavra
        // nextLine lê toda a string
        System.out.println("Enter your name below: ");
        String name = input.nextLine();
        System.out.println("Now enter your age: ");
        int age = input.nextInt();
        System.out.println("Type F for female or M for male: ");
        char sex = input.next().charAt(0);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Sex: "+sex);
    }
}
