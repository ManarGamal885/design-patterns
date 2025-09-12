package Chapter5.Singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private volatile static ChocolateBoiler uniqueInstance;
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    public static ChocolateBoiler createInstance() {
        if (uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        return uniqueInstance;
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    private boolean isEmpty() {
        return empty;
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    private boolean isBoiled() {
        return boiled;
    }
}
