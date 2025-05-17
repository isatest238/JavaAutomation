package OOP.Abstractizare.Interfete;

public interface Forme_Geometrice {

    public static final String culoare = "Albastru"; //permite doar constante nu si fielduri sau propietati care nu s initializate

    // toate metodele declarate sunt by default abstracte
    void calculareArie();

    void deseneaza();
}
