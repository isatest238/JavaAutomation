package OOP.Abstractizare.Clase_Abstracte;

public class Cerc extends Forme_Geometrice {
    private int raza;

    @Override
    public void calculareArie() {
        System.out.println("Aria cercului este: " + Math.PI * Math.pow(raza, 2));
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }
}
