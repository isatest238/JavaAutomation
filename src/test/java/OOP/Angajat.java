package OOP;

public class Angajat extends Persoana implements Angajat_Interfata{

    // MODIFICATORI DE ACCESS
    // PUBLIC > codul se poate accesa de oricunde si din orice clasa
    // PRIVATE > codul se poate accesa doar din clase unde s a scris
    // PROTECTED > codul se poate accesa doar din pachetul in care s a scris codul dar si de catre subclase (MOSTENIRE)
    // DEFAULT > codul se poate accesa doar din pachetul din care s a scris codul
    // Intra pe DEFAULT daca nu se specifica un alt modificator de acces



    protected String firma;
    private Integer experienta;
    private Integer zileConcediu;


    public Angajat(String nume, String prenume, Integer varsta, String firma, Integer experienta, Integer zileConcediu) {
        super(nume, prenume, varsta);
        this.firma = firma;
        this.experienta = experienta;
        this.zileConcediu = zileConcediu;
    }

    public void infoAngajat() {
        infoPersoana();
        System.out.println("Firma este: " + firma);
        System.out.println("Experinta este: " + experienta);
        System.out.println("Zile concediu: " + zileConcediu);
    }

    // suprascriem metoda din parinte (POLIMORFISMUL DINAMIC)
    public void mananca() {
        System.out.println("Angajatul mananca cand are pauza de masa");
    }


    // POLIMORFISMUL STATIC
    public void marire() {
        System.out.println("Nu avem buget de mariri");
    }

    public void marire(Integer procent) {
        System.out.println("Marirea este de " + procent + "%");
    }

    public void marire(String grad){
        System.out.println("Angajatul a primit gradul " + grad);
    }

    public void promovare() {
        System.out.println("Angajatul cu numele " + getNume() + "a fost promovat");
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public Integer getExperienta() {
        return experienta;
    }

    public void setExperienta(Integer experienta) {
        this.experienta = experienta;
    }

    public Integer getZileConcediu() {
        return zileConcediu;
    }

    public void setZileConcediu(Integer zileConcediu) {
        this.zileConcediu = zileConcediu;
    }

    @Override
    public void mergeLaMaunca() {
        System.out.println("Angajatul merge la munca");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul primeste salariu");
    }

    @Override
    public void areMargeInPauza() {
        System.out.println("Angajatul merge in pauza");
    }

    @Override
    public void prezintaDemise() {
        System.out.println("Angajatul nu poate sa plece din firma");
    }
}
