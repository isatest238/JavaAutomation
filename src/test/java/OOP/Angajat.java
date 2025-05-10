package OOP;

public class Angajat extends Persoana {

    public String firma;
    public Integer experienta;
    public Integer zileConcediu;

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
}
