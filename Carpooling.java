import java.util.Scanner;

public class Carpooling {

    public static void main (String[] args){
            double kmD, costLiters;
            double kmLiters, parkingFee;
            double tollFee, total;

        Scanner input = new Scanner(System.in);

        kmD = requestInput("Please enter the total KM driven per day: ", input);

        costLiters  = requestInput("Please enter the cost of petrol per liter: ", input );

        kmLiters = requestInput ("Please enter the average km driven per liter: ", input);

        parkingFee = requestInput("Please enter the parking fees per day: ", input);

        tollFee = requestInput("Please enter the toll fees per day: ", input );

        total = ((kmD / costLiters) * kmLiters) + parkingFee + tollFee;
        System.out.printf("Total Driving Cost = %.2f\n", total);
    }

    public static double requestInput(String message, Scanner take) {
        System.out.print(message);
        return take.nextDouble();
    }
}
