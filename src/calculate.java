public class calculate {
    public static double calculateTotalMealPrice(double listedMealPrice,
                                               double taxRate,
                                               double tipRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }
    public static void main (String [] args){
       double groupTotalMealPrice = calculateTotalMealPrice(15, .2, .08);
       System.out.println(groupTotalMealPrice);

    }
}
