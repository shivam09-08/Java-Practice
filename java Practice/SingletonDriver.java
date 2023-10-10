
class Singleton {
    private volatile static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstanc() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}

public class SingletonDriver {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstanc();
        Singleton instance2 = Singleton.getInstanc();
        if (instance1 == instance2) {
            System.out.println("object are same");
        } else {
            System.out.println("objects are not same");
        }
    }
}
