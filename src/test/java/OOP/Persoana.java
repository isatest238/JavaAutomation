package OOP;

public class Persoana {
    //OOP : programare orientata obiect
    // 4 principii: mostenire, incapsulare, polimorfism si abstractizare
    // Mostenire este conceptul prin care o clasa (copil) mosteneste o alata clasa (parinte)
    // In Java putem mosteni o singura clasa
    // In momentul cand o clasa mosteneste o alta clasa, clasa copil trebuie sa apeleze constructorul din parinte
    // In momentul in care se aplica mostenirea copilul are vizibilitate asupra variabilelor / metodelor din parinte
    // Constructorul din parinte in copil se apeleaza cu 'super'

    public String nume;
    public String prenume;
    public Integer varsta;

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

}
