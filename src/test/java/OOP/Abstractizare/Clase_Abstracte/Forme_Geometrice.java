package OOP.Abstractizare.Clase_Abstracte;

public abstract class Forme_Geometrice {

    public String culoare;

    public abstract void calculareArie();

    public void deseneaza(){
        System.out.println("Deseneaza forma");
    }
}
