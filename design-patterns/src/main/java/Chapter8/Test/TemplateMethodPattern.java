package Chapter8.Test;

import Chapter8.Caffeine.Tea;
import Chapter8.Caffeine.Coffee;

public class TemplateMethodPattern {
    public static void main(String[] args) {
        Tea myTea = new Tea();
        Coffee myCoffee = new Coffee();

        myTea.prepareRecipe();
        myCoffee.prepareRecipe();
    }
}