import java.util.ArrayList;
public class CafeUtil {

    public int getStreakGoal() {
        int sum = 0;

        for (int i = 1; i <=10; i++) {
            sum +=i;
        }
        return(sum) ;

    }

    public int getStreakGoal(int numWeeks) {
        return(0);
    }


        double getOrderTotal(double[]prices) {
        double sum = 0.0;
        for (int i=0;i< prices.length;i++) {
            sum +=prices[i];
        }
        return sum;
    }

    void displayMenu(ArrayList<String>menuItems) {
        for (int i=0; i< menuItems.size();i++) {
            String item = menuItems.get(i);
            System.out.println(i+ " " +item);
        }
        return;

    }

    void addCostumer(ArrayList<String>costumers) {
        System.out.println("Please enter your name");
        String username = System.console().readLine();
        System.out.println("Hello, " +username+ "!");
        int list = costumers.size();
        System.out.println("There are " + list + " people in front of you");
        costumers.add(username);
        System.out.println("Updated list of customers: "+costumers);
    }
}

