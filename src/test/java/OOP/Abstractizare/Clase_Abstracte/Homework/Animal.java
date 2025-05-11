package OOP.Abstractizare.Clase_Abstracte.Homework;

public abstract class Animal {
    private String nume;
    private Integer varsta;

    public abstract void scoateSunet();

    public abstract void mananca();

    public abstract void doarme();


    public void descriere() {
        System.out.println("Acesta este un animal");
    }

}