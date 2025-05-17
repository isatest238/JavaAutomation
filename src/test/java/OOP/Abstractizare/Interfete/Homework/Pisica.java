package OOP.Abstractizare.Interfete.Homework;

public class Pisica implements Animal{
    @Override
    public void scoateSunet() {
        System.out.println("Sunetele scoase de pisica sunt: MIAU");
    }

    @Override
    public void mananca() {
        System.out.println("Pisica mananca plicuri");
    }

    @Override
    public void doarme() {
        System.out.println("Pisica doarme pe canapea");
    }

    public void descriere() {
        System.out.println("Acesta este un animal");
    }

}
