package Chapter8.TemplateMethodPattern;

import Chapter8.Caffeine.Tea;
import Chapter8.Caffeine.Coffee;

public class Chapter8 {
    public static void main(String[] args) {
        Tea myTea = new Tea();
        Coffee myCoffee = new Coffee();

        myTea.prepareRecipe();
        myCoffee.prepareRecipe();
    }
}