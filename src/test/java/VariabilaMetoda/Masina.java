package VariabilaMetoda;

import org.testng.annotations.Test;

public class Masina {
    public String marca;
    public String model;
    public Integer anFabricatie;

    @Test
    public void metodaTest(){
        dateMasina("Audi","Q3", 2007);
        dateMasina("BMW","X5", 2000);
        calculMedie (4.0,6.0);
        System.out.println(getSalariu());

    }

    public void dateMasina (String param1, String param2, Integer param3){
        marca = param1;
        model = param2;
        anFabricatie = param3;

        System.out.println("Marca masinii este:" + marca);
        System.out.println("Modelul masinii este:" + model);
        System.out.println("An fabricatie masina este:" + anFabricatie);
    }

    // Calculam media a doua numere
    public void calculMedie(Double param1, Double param2){
        Double media = (param1 + param2)/2;
        System.out.println("Media celor doua numere este:" + media);

    }
    // metoda cu return
    public Integer getSalariu (){
        Integer salariu = 2500;
        return salariu;
    }
}

