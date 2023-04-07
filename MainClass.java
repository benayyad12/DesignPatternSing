public class MainClass {
    public static void main(String[] args) {
        EagerInitSingleton.getInstance();
        LazyInitSingleton.getInstance();
        StaticBlockInitSingleton.getInstance();
    }
}