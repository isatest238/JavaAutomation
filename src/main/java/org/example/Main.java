package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       /* System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }*/

        //printareValoriFolosindWhileMethod();
        //printareValoariFolosindDoWhileMethod();
        printareValoriFolosindForMethod();
    }

    public static void citireNoteMethod() {
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota " + nota + " trebuie sa fie intre 1 si 10. Introdu o valoare valida");
            nota = scanner.nextInt();
        }
        System.out.println("Nota " + nota + " este intre 1 si 10");
    }

    public static void printareValoriFolosindWhileMethod() {
        int numar = 1;
        while (numar <= 5) {
            System.out.println("Valoarea este: " + numar);
            numar++;
        }
    }

    public static void printareValoariFolosindDoWhileMethod() {
        int numar = 1;
        do {
              System.out.println("Numarul este " + numar);
              numar++;
            }
        while (numar <= 5);

    }

    public static void printareValoriFolosindForMethod (){
        //int numar = 1;
        for (int numar = 1;numar<=5;numar++)
            System.out.println("Valoarea este " + numar);
    }
}