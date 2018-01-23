package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Tower of Hanoi Game");
        System.out.println("Enter the number of disks you would like to solve.");
        System.out.println("And this will solve it for you:");
        Scanner kb = new Scanner(System.in);
        int disks = kb.nextInt();

        Towers tower1 = new Towers();
        tower1.solve(disks, "Pipe1", "Pipe2", "Pipe3");
    }
}
