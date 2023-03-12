package OOP.singleton;

public class Singleton {

    private Singleton () {

    }
    private static Singleton instace;

    public static Singleton getInstance() {
        if (instace == null) {
            instace = new Singleton();
        }
        return instace;
    }
}
