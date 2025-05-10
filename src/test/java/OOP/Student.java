package OOP;

public class Student extends Persoana {

    public String facultate;
    public String an;
    public boolean bursa;

    public Student(String nume, String prenume, Integer varsta, String facultate, String an, Boolean bursa) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.an = an;
        this.bursa = bursa;
    }

    public void infoStudent(){
        infoPersoana();
        System.out.println("Facultatea este: " + facultate);
        System.out.println("Anul este: " + an);
        System.out.println("Studentul are bursa? " + bursa);
    }

}
