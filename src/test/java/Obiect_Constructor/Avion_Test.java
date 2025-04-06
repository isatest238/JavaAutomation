package Obiect_Constructor;

import org.testng.annotations.Test;

public class Avion_Test {
    @Test
    public void metodaTest(){
        Avion avion1 = new Avion("Pasageri", "Boeing",
                "B-127", 260, "Kerosen");
        avion1.prezentareAvion();


        Avion avion2 = new Avion("Pasageri", "Boeing",
                "B-180", 300, "Green");
        avion2.prezentareAvion();


        Avion avion3 = new Avion("Pasageri", "Boeing",
                "B-127", 260, "Kerosen", 200);
        avion3.prezentareAvion();

    }
}
