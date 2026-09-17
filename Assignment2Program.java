import java.util.Scanner;
import static java.lang.System.out;
public class Assignment2Program {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        out.print("Age:");
        var age=sc.nextInt();
        out.print("Monthly Income: ");
        var monthlyIncome=sc.nextInt();
        out.print("Credit Score: ");
        var creditScore=sc.nextInt();
        out.print("ExistingEMI: ");
        var existingEmi=sc.nextInt();
        out.print("Proposed EMI:");
        var proposedEmi=sc.nextInt();
        double interestRate= 0.00;
        var combinedEmi=existingEmi+proposedEmi;

        double incomePercentage=((double)combinedEmi / monthlyIncome)*100;
        out.printf("Combined EMI Percentage : %.2f%n", incomePercentage);
        if(monthlyIncome<0 || existingEmi<0 || proposedEmi<0){
            out.println("the income and EMI values should be not be negative.");
        }

            if(age>=21 && age<=60){
                if(monthlyIncome>=25000){
                    if(creditScore>=650){
                        if(incomePercentage<=40) {
                            out.println("Loan status: Eligible");

                            if (creditScore >= 650 && creditScore <= 699) {
                                interestRate = 12.0;
                            } else if (creditScore >= 700 && creditScore <= 749) {
                                interestRate = 10.0;
                            } else if (creditScore >= 750) {
                                interestRate = 8.5;
                            }
                            out.println("Applicable annual Interest rate: " + interestRate);
                        }else{
                            out.println("Not Eligible.\n Reason:  Existing EMI plus proposed EMI does not exceed 40% of the monthly income.");
                        }
                    }else{
                        out.println("Not Eligible.\n Reason: Credit score is at least 650.");
                    }
                }else{
                    out.println("Not Eligible.\n Reason: Monthly income has to be at least 25,000.");
                }

            }else{
                out.println("Not Eligible.\n Reason: Age should be between 21 and 60.");
            }
    }
}
