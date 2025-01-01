package Multimi;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {
    //Multimi: array, list, map
    @Test
    public void metodaTest(){
       // colegiCursMethod();
       // listaCursMethod();
       // categorieObiecte();
        tariOraseMethod();

    }
    //exemplu array
    public void colegiCursMethod(){
        String[] colegi = new String[5];
        colegi[0]="Isabela";
        colegi[1]="Maria";
        colegi[2]="Carmen";
        colegi[3]="Florentina";
        colegi[4]="Mihai";

        for (int index =0; index<colegi.length; index ++)
            System.out.println("Numele colegului este: " + colegi[index]);

    }
    //exemplu liste
    public  void listaCursMethod(){
        List<String> colegi = new ArrayList<>();
        colegi.add("Isabela");
        colegi.add("Maria");
        colegi.add("Carmen");
        colegi.add("Florentina");
        colegi.add("Mihai");

        int index = 0;
        while (index<colegi.size()){
            System.out.println(colegi.get(index));
            index++;
        }

    }

    // exemplu map -> cheie = valoare
    public void categorieObiecte(){
        HashMap<String,String> obiecte = new HashMap<>();
        obiecte.put("obiect", "laptop");
        obiecte.put("fruct","mar");
        obiecte.put("floare","trandafie");
        for (String Key: obiecte.keySet()){
            System.out.println("Cheia este: " + Key);
            System.out.println("Vloarea este: " + obiecte.get(Key));
        }
    }

    // exemplu map - o cheie cu mai multe obiecte
    public void tariOraseMethod(){
        HashMap<String,List<String>> clasificare = new HashMap<>();

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Cluj-Napoca");
        oraseRomania.add("Baia-Mare");
        oraseRomania.add("Zalau");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Milano");
        oraseItalia.add("Ventia");
        oraseItalia.add("Barcelona");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Madrid");
        oraseSpania.add("Malaga");

        clasificare.put("Romania", oraseRomania);
        clasificare.put("Italia", oraseItalia);
        clasificare.put("Spania", oraseSpania);

        for (String Key: clasificare.keySet()){
            System.out.println("Tara este: " + Key);
            System.out.println("Orasele sunt: " + clasificare.get(Key));
        }
    }
}
