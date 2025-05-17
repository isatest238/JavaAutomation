package OOP.Abstractizare.Interfete.Homework;

public class Caine implements Animal{
    @Override
    public void scoateSunet() {
        System.out.println("Sunetele scoase de caine sunt: HAM");
    }

    @Override
    public void mananca() {
        System.out.println("Cainele mananca bobite");
    }

    @Override
    public void doarme() {
        System.out.println("Cainele doarme in cusca");
    }

    public void descriere() {
        System.out.println("Acesta este un animal");
    }

}

