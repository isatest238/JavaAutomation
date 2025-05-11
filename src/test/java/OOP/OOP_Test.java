package OOP;

import org.testng.annotations.Test;

public class OOP_Test {
    @Test
    public void metodaTest() {
//        Student Cristian = new Student("Vlades", "Cristian", 28, "UBB", "2", true);
//        Cristian.infoStudent();
//        Cristian.mananca();

        Angajat Constantin = new Angajat("Georg", "Constantin", 33, "Endava", 5, 25);
        Constantin.infoAngajat();

        Constantin.promovare();

        Constantin.mananca();
        Constantin.marire();
        Constantin.marire(10);
        Constantin.marire("ML");
    }
}
