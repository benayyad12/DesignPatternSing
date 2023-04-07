public class EagerInitSingleton {
    private static final EagerInitSingleton instance = new EagerInitSingleton();

    private EagerInitSingleton() {

    }

    public static EagerInitSingleton getInstance() {
        System.out.println("Eager");
        return instance;
    }
}