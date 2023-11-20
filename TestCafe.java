import java.util.ArrayList;
import java.util.Arrays;
public class TestCafe {
    public static void main(String[] args) {

    CafeUtil appTest = new CafeUtil();

        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());

        System.out.println("----- Order Total Test-----");
        double[] myPrices = new double[4];
        myPrices[0] = 2.5;
        myPrices[1] = 3.0;
        myPrices[2] = 4.0;
        myPrices[3] = 5.5;
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(myPrices));

        System.out.println("----- Display Menu Test-----");

         ArrayList<String> menu = new ArrayList<String>();
         menu.add("drip coffee");
         menu.add("cappuccino");
         menu.add("latte");
         menu.add("mocha");
         appTest.displayMenu(menu);

         System.out.println("\n----- Add Customer Test-----");
         ArrayList<String> customers = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
             appTest.addCostumer(customers);
             System.out.println("\n");
         }
    }
}
