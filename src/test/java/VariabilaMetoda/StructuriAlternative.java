package VariabilaMetoda;

import org.testng.annotations.Test;

import java.util.Scanner;

public class StructuriAlternative {
    // structuri alternative = if - then - else; switch - case
    @Test
    public void metodaTest() {
//        metodaVerificareNumar(2);
//        metodaVerificareNumar(7);
//        metodaVerificareNumar(5);
//        numarParPozitivNegativ(0);
//        numarParPozitivNegativ(100);
//        numarParPozitivNegativ(51);
//        numarParPozitivNegativ(-1);
//        numarParPozitivNegativ(-2);
        //       zileSaptamane(3);

    }


    // verifica daca un numar este mai mare decat 5
    public void metodaVerificareNumar(int numar) {
        if (numar > 5) {
            System.out.println("numarul " + numar + " este mai mare decat 5");
        } else if (numar < 5) {
            System.out.println("numarul " + numar + " este mai mic decat 5");
        } else {
            System.out.println("numarul " + numar + " este egal cu 5");
        }
    }

    /// verifica daca un numar este par pozitiv sau par negativ
    public void numarParPozitivNegativ(int numar) {
        if (numar > 0) {
            if (numar % 2 == 0) {
                System.out.println("numarul " + numar + " este par pozitiv");
            } else {
                System.out.println("numarul " + numar + " este impar pozitiv");
            }
        } else if (numar < 0) {
            if (numar % 2 == 0) {
                System.out.println("numarul " + numar + " este par negativ");
            } else {
                System.out.println("numarul " + numar + " este impar negativ");
            }
        } else if (numar == 0) {
            System.out.println("numarul " + numar + " este zero");
        }
    }

    // exemplu switch case
    public void zileSaptamane(Integer zi) {
        switch (zi) {
            case 1:
                System.out.println("Astazi este luni");
                break;
            case 2:
                System.out.println(("Astazi este marti"));
                break;
            case 3:
                System.out.println("Astazi este miercuri");
                break;
            case 4:
                System.out.println("Astazi este joi");
                break;
            default:
                System.out.println("Nu mai sunt cazuri");
        }
    }

}

