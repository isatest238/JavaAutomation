package Obiect_Constructor;

public class Avion {
    // costructor = are ca rol sa initializeze variabilele unei clase
    // recunoastem un constructor dupa numele clasei
    // intr o clasa putem avea n constructori care se diferentiaza dupa numarul / tipul de paramentru
    // exista doua tipuri de constructori: cu parametrii sau fara parametrii
    // intr o clasa avem tot timpul un constructor default (fara parametruii)
    // constructorul trebuie sa fie Public

    // Obiect = instanta unei clase
    // dintr o clasa putem sa facem mai multe obiecte
    // ca sa intializam un obiect ne folosim de cuvantul "New"
    // cand se initalizaeaza un obiect se apeleaza contructorul clasei

    public String tip;
    public String marca;
    public String model;
    public Integer capacitatePasageri;
    public String tipCombustibil ;
    public Integer nrBagaje ;

//    facem un constructor care sa aiba 5 parametrii : click dreapta => generate =>constructor

    public Avion(String tip, String marca, String model, Integer capacitatePasageri, String tipCombustibil) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;
    }

    public Avion(String tip, String marca, String model, Integer capacitatePasageri,
                 String tipCombustibil, Integer nrBagaje) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;
        this.nrBagaje = nrBagaje;
    }

    // facem o metoda
    public void prezentareAvion (){
        System.out.println("Tipul avionului este: " + tip);
        System.out.println("Marca avionului este: " + marca);
        System.out.println("Modelul avionului este: " + model);
        System.out.println("Capacitate pasageri avion este: " + capacitatePasageri);
        System.out.println("Tip combustibil avvion este: " + tipCombustibil);
        if (nrBagaje !=null) {
            System.out.println("Numar bagaje este: " + nrBagaje);
        } else
            System.out.println("Avionul nu are bagaje");
        System.out.println("---------------------------------------------------------------------------------");
    }



}
