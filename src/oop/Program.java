package oop;

import java.util.Scanner;

public class Program {

    Scanner beolvas = new Scanner(System.in);
    Pakli p = new Pakli();

    public static void main(String[] args) {
        Program program = new Program();
        program.trukk();
    }

    private int melyik() {
        System.out.print("\nMelyik oszlop? (1-3): ");
        int oszlop = beolvas.nextInt();
        while(oszlop < 1 || oszlop > 3){
            System.out.print("Hibás, újra: ");
            oszlop = beolvas.nextInt();
        }
        return oszlop;
    }
    
    private void kirak() {
        System.out.printf("%-10s%-10s%-10s\n", "1. o", "2. o", "3. o");
        for (int i = 0; i < p.getLapok().length; i++) {
            System.out.printf("%-10s", p.getLapok()[i].megjelenit());
            if(i++ % 3 == 0 && i != 0){
                System.out.println();
            }
        }
    }

    public void trukk() {
        for (int i = 0; i < 3; i++) {
            kirak();
            int oszlop = melyik();
            p.kever(oszlop);
        }
        p.ezVolt();
    }
}