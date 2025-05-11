package OOP.Abstractizare.Interfete;
import org.testng.annotations.Test;

public class OOP_Abstractizare_Test {
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