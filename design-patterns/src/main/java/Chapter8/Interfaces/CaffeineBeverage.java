package Chapter8.Interfaces;

public abstract class CaffeineBeverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    // Primitive Operations
    public abstract void addCondiments();

    // Primitive Operations
    public abstract void brew();

    // Concrete Operation
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Concrete Operation
    public void boilWater() {
        System.out.println("Boiling water");
    }

    // Hook method
    boolean customerWantsCondiments() {
        return true;
    }
}
