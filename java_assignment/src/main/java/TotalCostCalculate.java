// 12. A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk.
// If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?
// [Extract the digits from the paragraph and calculate the price]
public class TotalCostCalculate {
    public static void main (String[] arg) {
        calculateTotalCostWithDiscount();
    }

    public static void calculateTotalCostWithDiscount(){
        int laptopPrice = 85000;
        int mousePrice = 2500;

        double totalCost = laptopPrice + mousePrice;
        double discount = totalCost * 0.15;

        double finalPrice = totalCost - discount;

        System.out.println("Total cost after 15% discount: " + finalPrice + " tk");

    }

}
