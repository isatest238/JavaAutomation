package OOP.Abstractizare.Interfete.Homework;

import OOP.Abstractizare.Clase_Abstracte.Homework.Caine;
import OOP.Abstractizare.Clase_Abstracte.Homework.Pisica;
import org.testng.annotations.Test;

public class Animal_Test {
    @Test
    public void metodaTest(){
        Caine caine = new Caine();
        caine.scoateSunet();
        caine.mananca();
        caine.doarme();
        caine.descriere();

        Pisica pisica = new Pisica();
        pisica.scoateSunet();
        pisica.mananca();
        pisica.doarme();
        pisica.descriere();
    }



}
