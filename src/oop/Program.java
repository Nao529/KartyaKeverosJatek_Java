package oop;

import java.util.Scanner;

public class Program {
    
    Scanner beolvas = new Scanner(System.in);
    Pakli p = new Pakli();
    
    public void main(String[] args) {
        p.trukk();
    }
    
    private int melyik() {
        System.out.print("Melyik oszlop? (1-3): \n");
        int oszlop = beolvas.nextInt();
        while(oszlop < 1 || oszlop > 3){
            System.out.print("Hibás, újra: \n");
            oszlop = beolvas.nextInt();
        }
        return oszlop;
    }
    
    private void kirak() {
        System.out.printf("%-10s%-10s%-10s\n", "1. o", "2. o", "3. o");
        for (int i = 1; i < p.length; i++) {
            System.out.printf("%-10s", p[i]);
            if(i % 3 == 0){
                System.out.println("");
            }
        }
    }
    
    public void trukk() {
        kirak();
        melyik();
    }
}
