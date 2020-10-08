
/**
 * calculates your monthly income and your total expenses and finds your 
 * saving from it
 * 
 * @author Srikar Ravi
 * @version October 7, 2020
 */
public class PrimitiveTypesProject
{
    public static void main(String[] args){
        
        int hourlyIncome = 48;
        int apartmentRent = 1200;
        double phonePlan = 29.99;
        int electricityBill = 90;
        int gymMembership = 40;
        
        int monthlyIncome = (int) hourlyIncome * 40 * 4;
        /* 40 hours a week, for four weeks of a month*/
        
        double totalExpenses = (double) apartmentRent + phonePlan + electricityBill + gymMembership; 
        
        double totalSaving = (double) monthlyIncome - totalExpenses;
        
        
        System.out.println("The monthly income is $" + monthlyIncome);
        System.out.println("The total expenses are $" + totalExpenses);
        System.out.println("The total savings are $" + totalSaving);
        
    }
}
