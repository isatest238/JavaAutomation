package OOP;

public class Angajat_Student extends Persoana implements Angajat_Interfata, Student_Interfata {

    private String firma;
    private Integer experienta;
    private Integer zileConcediu;
    private String facultate;
    private String an;
    private boolean bursa;


    public Angajat_Student(String nume, String prenume, Integer varsta,
                           String firma, Integer experienta, Integer zileConcediu,
                           String facultate, String an, Boolean bursa) {
        this.firma = firma;
        this.experienta = experienta;
        this.zileConcediu = zileConcediu;
        this.facultate = facultate;
        this.an = an;
        this.bursa = bursa;
        super(nume, prenume, varsta);
    }

    @Override
    public void mergeLaMaunca() {
        System.out.println("Angajat si Student merge la munca");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Primeste salariu");
    }

    @Override
    public void areMargeInPauza() {
        System.out.println("Angajat si Student merge in pauza");
    }

    @Override
    public void prezintaDemise() {
        System.out.println("Angajat si Student poate sa isi dea demisia");
    }

    @Override
    public void mergeLaCurs() {

    }

    @Override
    public void sustineExamene() {

    }

    @Override
    public void mergeLaCafea() {

    }
}
