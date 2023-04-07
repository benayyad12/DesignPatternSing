public class LazyInitSingleton {

    private static LazyInitSingleton instance;

    private LazyInitSingleton() {

    }

    public static LazyInitSingleton getInstance() {
        if (instance == null) {
            System.out.println("Lazy");
            instance = new LazyInitSingleton();
        }
        return instance;
    }

}
