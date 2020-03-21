
import java.util.Scanner;

public class Exercise04_23 {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);

        // Obtain input
        System.out.print("Enter employee's name: ");
        String name=input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double hours=input.nextDouble(); // Accept hours

        System.out.print("Enter hourly pay rate: ");
        double payRate=input.nextDouble(); // Accept payRate

        System.out.print("Enter federal tax withholding rate: ");
        double fedTaxWithholdingRate=input.nextDouble(); // Accept fedTaxWithholdingRate

        System.out.print("Enter state tax withholding rate: ");
        double stateTaxWithholdingRate=input.nextDouble(); // Accept stateTaxWithholdingRate

        double grossPay=(hours*payRate); //Calculate
        double fedTaxWithholding=(fedTaxWithholdingRate*100); // Calculate
        double stateTaxWithholding =(stateTaxWithholdingRate*100); // Calculate
        double totalDeduction=((grossPay*fedTaxWithholdingRate)+(grossPay*stateTaxWithholdingRate)); // Calculate
        double netPay=grossPay-totalDeduction; // Calculate

        // Obtain output
        String out=buildOutput(name,hours,payRate,fedTaxWithholdingRate, stateTaxWithholdingRate,
                grossPay,fedTaxWithholding,stateTaxWithholding,totalDeduction,netPay); //build output using buildOutput()

        System.out.print(out);
    }

    public static String buildOutput(String name, double hours, double payRate, double fedTaxWithholdingRate, double stateTaxWithholdingRate,
                                     double grossPay, double fedTaxWithholding, double stateTaxWithholding, double totalDeduction, double netPay)
    {
        String out = "\nEmployee Name: " + name + "\n";
        out += "Hours Worked:" + "  " + hours + '\n';
        out += "Pay Rate:" + "  $" + payRate + '\n';
        out += "Gross Pay:" + "  $" + grossPay + '\n';
        out += "Deductions:\n";
        out += "  Federal Withholding (" + fedTaxWithholdingRate * 100 + "%):" + "  $"
                + (int) (fedTaxWithholding * 100) / 100.0 + '\n';
        out += "  State Withholding (" + stateTaxWithholdingRate * 100 + "%):" + "  $"
                + (int) (stateTaxWithholding * 100) / 100.0 + '\n';
        out += "  Total Deduction:" + "  $" + (int) (totalDeduction * 100) / 100.0 + '\n';
        out += "Net Pay:" + "   $" + (int) (netPay * 100) / 100.0;
        return out;
    }

}

