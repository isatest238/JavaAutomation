package OOP;

public class Persoana {
    // OOP : programare orientata obiect
    // 4 principii: mostenire, incapsulare, polimorfism si abstractizare

    // MOSTENIRE = este conceptul prin care o clasa (copil) mosteneste o alata clasa (parinte)
    // In Java putem mosteni o singura clasa
    // In momentul cand o clasa mosteneste o alta clasa, clasa copil trebuie sa apeleze constructorul din parinte
    // In momentul in care se aplica mostenirea copilul are vizibilitate asupra variabilelor / metodelor din parinte
    // Constructorul din parinte in copil se apeleaza cu 'super'


    // INCAPSULARE = procesul prin care tinem departe anumite informatii ca ele sa nu poata sa fie modificate
    // Facem variabilele/ metode din public in private
    // Private = access control care restrictioneaza accesul doar in clasa respectiva (copilul care mosteneste nu are access la ea/ doar parintele le poate detine)
    // Ca sa extragem/ modificam o valoare a unei variabile private ne folosim de metode GET si SET (getter si setter)


    // POLIMORFISM - procesul prin care definim mai multe implementari pentru o metoda
    // POate sa fie de doua felulri: DINAMIC (override) sis STATIC (overload)
    // POLIMORFIM DINAMIC = intr o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    // POLIMORFISM STATIC = posibilitatea prin care o metoda are mai multe implementari prin diferentierea numarului sau tipui de parametrii


    // ABSTRACTIZAREA = reducerea unui element complex la un element mai simplu
    // (reducerea completa a implementarii metodelor lasand doar numele functiilor, parametrii si tipul returnat)
    // Abstractizarea se poate obtine folosind CLASE ABSTRACTE SI/SAU INTERFETE


    private String nume;
    private String prenume;
    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana()
    {
        System.out.println("Numele este: " + nume);
        System.out.println("Prenumele este: " + prenume);
        System.out.println("Varsta esteL " + varsta);
    }

    // definim prima implementare pentru o metoda (POLIMORFISM DINAMIC)
    public void mananca(){
        System.out.println("Persoana mananca cand ii este foame");
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }
}
