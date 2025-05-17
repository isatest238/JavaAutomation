package DesignPattern;

public class Singleton_Demo {

    public static void main(String[] arg) {
        SingleObject myObject = SingleObject.getInstance();
        //    SingleObject mySecondObject = new SingleObject(); nu ne lasa pentru ca constructorul este privat
        myObject.showMessage();
    }

}
