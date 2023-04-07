public class StaticBlockInitSingleton {
    private static StaticBlockInitSingleton instance;
    static {
        try {
            instance = new StaticBlockInitSingleton();
        } catch (Exception e) {
            System.out.println("Problem occured while instanciating object");
        }
    }

    public static StaticBlockInitSingleton getInstance() {
        System.out.println("static block");
        return instance;
    }

}