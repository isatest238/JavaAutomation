package OOP.Abstractizare.Interfete;

public class Cerc implements Forme_Geometrice {

    private int raza;


    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    @Override
    public void deseneaza() {
        System.out.println("Deseneaza cerc");

    }

    @Override
    public void calculareArie() {
        System.out.println("Aria cercului este: " + Math.PI * Math.pow(raza, 2));
    }

}
