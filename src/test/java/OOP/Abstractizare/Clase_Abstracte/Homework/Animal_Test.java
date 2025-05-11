package OOP.Abstractizare.Clase_Abstracte.Homework;

import org.testng.annotations.Test;

public class Animal_Test {
    @Test
    public void metodaTest() {

        Caine caine = new Caine();
        caine.scoateSunet();
        caine.doarme();
        caine.mananca();


        Pisica pisica = new Pisica();
        pisica.scoateSunet();
        pisica.doarme();
        pisica.mananca();
    }
}
