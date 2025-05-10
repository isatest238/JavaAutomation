package Exceptii;

public class Exceptia1 {
    // reprezinta situatii care apar in timpul executiei unui program care determina oprirea acestuia
    // ofera un mecanism eficent de identificare si rezolvare a erorilor
    // sunt modelate sub forma de clase
    // clase predefinite - class error, exception, runtime exception, putem face si clase personalizate
    // exceptiile sunt gestionate folosind cuvinte predefinite in java: try-catch si finally
    // sunt doua tipuri mari de exceptii: checked si unchecked
    // checked - sunt exceptii de compilare (nu poti build-uesti sau rula proiectul daca nu ai tratat aceasta execptie)
    // Exemple checked: SQLException, IOException, ClassNotFoundException
    // unchecked - sunt exceptii de runtime , sunt ignorate in timpul compilarii insa sunt aruncate in timpul executiei programului
    // Exemple unchecked: NullPointerException, ArrayIndexOutOfBound, ArithmeticException
    // Throw - cuvant cheie care arunca exceptia in mod explicit de la o metoda sau un bloc de cod
    // Throws - cuvant cheie care se foloseste odata cu metoda care poate arunca un tip sau mai multe de exceptii


public static void main (String[] args) throws Exceptie_custom {
//     try {
//        System.out.println(12/0);
//    } catch (ArithmeticException e){
//         System.out.println("error Arithmetic exception throw: " + e.getMessage());
//     }
    try {
        int[] numbers = new int[10];
        numbers[11] = 5;
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    catch (ArrayIndexOutOfBoundsException e) {
        throw new Exceptie_custom("Eroare custom!");
        //System.out.println(e.getMessage());
    }
    finally {
        System.out.println("aceasta linie se executa indiferent daca exceptia este prinsa");
    }
}
}