package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<String> students = new ArrayList<>();

    public static void main(String[] args) {
        char again = 'Y';
        while (again == 'Y'){
            System.out.println("Enter a Student");
            Scanner input = new Scanner(System.in);
            students.add(input.nextLine());
            System.out.println("Do you want to add another? Y or N");
            again = input.next().charAt(0);
        }
        for (int i = 1; i <=students.size() - 1; i++) {
            System.out.println(students.get(i));
        }

    }
}