public class calculate {
    public static void calculateTotalMealPrice(double listedMealPrice,
                                               double taxRate,
                                               double tipRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
    }
}
