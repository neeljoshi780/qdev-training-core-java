import java.util.Scanner;

/**
 * Program to calculate EMI (Equated Monthly Installment) for a loan.
 * The EMI is calculated based on the principal amount, interest rate, and loan tenure.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-02
 */
public class EMICalculator {

    // Instance variables to store principal, rate of interest, and loan tenure
    private double principal;

    private double annualRate;

    private int loanTenure;

    // Constructor to initialize the EMI calculator
    public EMICalculator(double principal, double annualRate, int loanTenure) {
        this.principal = principal;
        this.annualRate = annualRate;
        this.loanTenure = loanTenure;
    }

    // Method to calculate the EMI
    public double calculateEMI() {
        // Convert annual interest rate to monthly interest rate (in decimal form)
        double monthlyRate = annualRate / 12 / 100;

        // Convert loan tenure from years to months
        int months = loanTenure * 12;

        // EMI formula
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);

        return emi;
    }

    // Method to display loan details and calculated EMI
    public void displayEMIDetails() {
        System.out.println("Loan Details:");
        System.out.println("Principal: " + principal);
        System.out.println("Annual Interest Rate: " + annualRate + "%");
        System.out.println("Loan Tenure: " + loanTenure + " years");
        System.out.println("Monthly EMI: " + String.format("%.2f", calculateEMI()));
    }

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the loan details
        System.out.print("Enter the principal loan amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter the loan tenure (in years): ");
        int loanTenure = scanner.nextInt();

        // Create an EMI calculator object with the user input
        EMICalculator emiCalculator = new EMICalculator(principal, annualRate, loanTenure);

        // Display the EMI details
        emiCalculator.displayEMIDetails();

        // Close the scanner object
        scanner.close();
    }

}