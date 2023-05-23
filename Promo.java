import java.util.*;

public class Promo {
    private String promoCode;
    private String startDate;
    private String endDate;
    private double discountRate;
    private double minimumAmount;
    private double maximumAmount;
    private static Set<String> promoCodes = new HashSet<>();

    public Promo(String promoCode, String startDate, String endDate, double discountRate, double minimumAmount, double maximumAmount) {
        if (promoCodes.contains(promoCode)) {
            System.out.println("CREATE PROMO FAILED: " + promoCode + " IS EXISTS");
            return;
        }

        this.promoCode = promoCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discountRate = discountRate;
        this.minimumAmount = minimumAmount;
        this.maximumAmount = maximumAmount;
        promoCodes.add(promoCode);
        System.out.println("CREATE PROMO SUCCESS: " + promoCode);
    }

    public String getPromoCode() {
        return promoCode;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public double getMinimumAmount() {
        return minimumAmount;
    }

    public double getMaximumAmount() {
        return maximumAmount;
    }
}