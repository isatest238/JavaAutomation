package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {
    // structuri alternative = if - then - else; switch - case
    @Test
    public void metodaTest() {
//        metodaVerificareNumar(2);
//        metodaVerificareNumar(7);
//        metodaVerificareNumar(5);
        numarParPozitivNegativ(0);
        numarParPozitivNegativ(100);
        numarParPozitivNegativ(51);
        numarParPozitivNegativ(-1);
        numarParPozitivNegativ(-2);
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
                System.out.println("numarul " +numar+ " este par pozitiv");
            } else {
                System.out.println("numarul " + numar+ " este impar pozitiv");
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



}

