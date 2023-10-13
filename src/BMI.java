import java.util.Scanner;

public class BMI {
    double WeightKg;
    double HeightM;
    double HeightFeet;
    double HeightInches;
    double HeightTotal;
    double WeightLb;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nPress Y to Start\nPress E to Exit\n");
            String ch = sc.nextLine();
            if (ch.equalsIgnoreCase("Y")) {
                System.out.println("Please Choose \n(1) Imperial Units \n(2) Metric Units");
                int choice = sc.nextInt();

                if (choice == 1) {
                    BMIimperial imperial = new BMIimperial();
                    imperial.BmiMetric();
                } else if (choice == 2) {
                    BMImetric metric = new BMImetric();
                    metric.BmiMetric();
                } else {
                    System.out.println("Invalid Input");
                }
            }
            else if (ch.equalsIgnoreCase("E")) {
                break;
            }
            else {
                System.out.println("Invalid Input");
            }
        }
        System.out.println("\tThank You For Using Our Service\t");
    }
}
