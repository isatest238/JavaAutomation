package OOP;

import org.testng.annotations.Test;

public class OOP_Test {
    @Test
    public void metodaTest() {
        Student Cristian = new Student("Vlades", "Cristian", 28, "UBB", "2", true);
        Cristian.infoStudent();
        Cristian.mananca();
        Cristian.infoPersoana();


        Angajat Constantin = new Angajat("Georg", "Constantin", 33, "Endava", 5, 25);
        Constantin.infoAngajat();

        Constantin.promovare();

        Constantin.mananca();
        Constantin.marire();
        Constantin.marire(10);
        Constantin.marire("ML");

        Constantin.firma = "endava";




        Somer Ionel = new Somer("Ionel", "Popescu", 39, 20, "Profesor");
        Ionel.infoSomer();
        Ionel.mananca();
        Ionel.ultimaOcupatie("Tester");

        Angajat_Student Marcel = new Angajat_Student();
        Marcel.mergeLaCafea();




    }
}
