package OOP;

public class Somer extends Persoana {
    Integer zileSomaj;
    String ultimaOcupatie;

    public Somer(String nume, String prenume, Integer varsta, Integer zileSomaj, String ultimaOcupatie) {
        super(nume, prenume, varsta);     //mostenirea
        this.zileSomaj = zileSomaj;
        this.ultimaOcupatie = ultimaOcupatie;
    }

    public void infoSomer() {
        infoPersoana();
        System.out.println("Are un numar de " + zileSomaj + " zile in somaj");
        System.out.println("Ultima ocupatie " + ultimaOcupatie);
    }

    // suprascriem metoda din parinte (POLIMORFISMUL DINAMIC)

    @Override
    public void mananca() {
        System.out.println("Somerul mananca cand vrea el ");
        super.mananca();
    }

    public void ultimaOcupatie (String ultimaOcupatie){
        System.out.println("Somerul a avult ultima ocupatie: " + ultimaOcupatie);
    }

    public Integer getZileSomaj() {
        return zileSomaj;
    }

    public String getUltimaOcupatie() {
        return ultimaOcupatie;
    }

    public void setZileSomaj(Integer zileSomaj) {
        this.zileSomaj = zileSomaj;
    }

    public void setUltimaOcupatie(String ultimaOcupatie) {
        this.ultimaOcupatie = ultimaOcupatie;
    }
}
