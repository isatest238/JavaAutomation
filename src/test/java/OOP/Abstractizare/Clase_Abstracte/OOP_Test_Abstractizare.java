package OOP.Abstractizare.Clase_Abstracte;

import org.testng.annotations.Test;

public class OOP_Test_Abstractizare {
    @Test
    public void metodaTest() {
        Cerc formaCerc = new Cerc();
        formaCerc.setRaza(10);
        formaCerc.calculareArie();


        Patrat formaPatrat = new Patrat();
        formaPatrat.setLatura(5);
        formaPatrat.calculareArie();

    }
}
