package assignment21_01_2025.PracticeSet1;
public class DiscountedAmount {
    public static void main(String[] args) {
        int fee=125000;
        int discountPercent=10;
        int discountAmount=fee/discountPercent;
        int finalFee=fee-discountAmount;
        System.out.println("The discount amount is :"+discountAmount+" INR and final discounted fee is :"+finalFee+" INR");

    }  
}
