import java.util.*;
import static java.lang.System.out;
//Assignment 1: Progressive Electricity Bill Calculator
public class Assignment1Program {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        out.println("Enter units: ");
        int units=sc.nextInt();
        double energyCharge=0.0;
        if(units<0){
            out.println("Enter postive unit values");
        }
        else if(units<=100){
            energyCharge=units*1.50;
        }
        else if(units<=200){
            energyCharge=100*1.50+(units-100)*2.50;
        }
        else if(units<=500){
            energyCharge=(100*1.50)+(100*2.50)+(units-200)*4.00;
        }
        else if(units>500){
            energyCharge=(100*1.50)+(100*2.50)+(300*4.00)+(units-500)*6.00;
        }
        double fixedCharge=75.00;
        out.printf("Energy charge: Rs.%.2f%n",energyCharge);
        double subTotal=energyCharge+fixedCharge;
        out.printf("Fixed Charge: Rs.%.2f%n",fixedCharge);
        double surCharge=0.00;
        if(subTotal>1500.00){
            surCharge=(0.05)*subTotal;
        }
        out.printf("Sur Charge: Rs.%.2f%n",surCharge);
        double finalBill=energyCharge+fixedCharge+surCharge;
        out.printf("Final Bill: Rs.%.2f%n",finalBill);

    }
}
