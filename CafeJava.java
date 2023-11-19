
public class CafeJava {
    public static void main(String[] args) {

                String generalGreeting = "Welcome to Cafe Java, ";
                String pendingMessage = "Your order will be ready shortly";
                String readyMessage = "Your order is ready";
                String displayTotalMessage = "Your total is $";

                double mochaPrice = 3.5;
                int dripCoffee = 2;
                double latte = 4.5;
                int cappucino = 5;

                String costumer1 = " Cindhuri";
                String costumer2 = " Sam";
                String costumer3 = " Jimmy";
                String costumer4 = " Noah";

                // Order completions (add yours below)
                boolean isReadyOrder1 = false;
                boolean isReadyOrder4 = true;
                boolean isReadyOrder2 = true;

                System.out.println(pendingMessage + costumer1);

            if (isReadyOrder4 = true) {
                System.out.println(readyMessage + costumer4);
                System.out.println(displayTotalMessage + cappucino);
                }
                else {
                    System.out.println(pendingMessage + costumer4);
                }


        if (isReadyOrder2=true){
            System.out.println(readyMessage + costumer2);
            System.out.println(displayTotalMessage + latte*2 + costumer2);
        }

        System.out.println(displayTotalMessage + (latte-dripCoffee) + costumer3);
    }
        }
