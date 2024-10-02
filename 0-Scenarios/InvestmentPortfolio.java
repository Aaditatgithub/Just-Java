import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Define the Investment interface with a method to get value
interface Investment {
    void displayDetails();
    BigDecimal getValue(); // Added method to get the value of the investment
}

// Implement Stock class
class Stock implements Investment {
    private String stockTicker;
    private Integer numberOfShares;
    private BigDecimal pricePerShare;

    public Stock(String stockTicker, Integer numberOfShares, BigDecimal pricePerShare) {
        this.stockTicker = stockTicker;
        this.numberOfShares = numberOfShares;
        this.pricePerShare = pricePerShare;
    }

    @Override
    public void displayDetails() {
        System.out.println("Stock Ticker: " + this.stockTicker);
        System.out.println("Number of Shares: " + this.numberOfShares);
        System.out.println("Price Per Share: " + this.pricePerShare);
        System.out.println("Total Price: " + this.pricePerShare.multiply(new BigDecimal(this.numberOfShares)));
    }

    @Override
    public BigDecimal getValue() {
        return this.pricePerShare.multiply(new BigDecimal(this.numberOfShares));
    }
}

// Implement Bond class
class Bond implements Investment {
    private String issuer;
    private BigDecimal couponRate;
    private Integer numberOfCoupons;
    private BigDecimal faceValue; // Changed to faceValue instead of maturityDate

    public Bond(String issuer, BigDecimal faceValue, BigDecimal couponRate, Integer numberOfCoupons) {
        this.issuer = issuer;
        this.faceValue = faceValue;
        this.couponRate = couponRate;
        this.numberOfCoupons = numberOfCoupons;
    }

    @Override
    public void displayDetails() {
        System.out.println("Issuer: " + this.issuer);
        System.out.println("Face Value: " + this.faceValue);
        System.out.println("Coupon Rate: " + this.couponRate);
        System.out.println("Number of Coupons: " + this.numberOfCoupons);
        // For simplicity, we'll assume value is faceValue plus interest
        System.out.println("Total Value: " + getValue());
    }

    @Override
    public BigDecimal getValue() {
        BigDecimal totalCouponValue = this.faceValue.multiply(this.couponRate).multiply(new BigDecimal(this.numberOfCoupons));
        return this.faceValue.add(totalCouponValue);
    }
}

// Investment Portfolio class
class Portfolio {
    private List<Investment> investments = new ArrayList<>();

    public void addInvestment(Investment investment) {
        investments.add(investment);
    }

    public void displayAllInvestments() {
        for (Investment investment : investments) {
            investment.displayDetails();
            System.out.println(); // Separate details of different investments
        }
    }

    public BigDecimal getTotalValue() {
        BigDecimal totalValue = BigDecimal.ZERO;
        for (Investment investment : investments) {
            totalValue = totalValue.add(investment.getValue());
        }
        return totalValue;
    }
}

public class InvestmentPortfolio {
    public static void main(String[] args) {
        // Create some investments
        Investment stock1 = new Stock("AAPL", 50, new BigDecimal("150.00"));
        Investment bond1 = new Bond("US Government", new BigDecimal("1000.00"), new BigDecimal("0.05"), 10);

        // Create an investment portfolio and add investments
        Portfolio portfolio = new Portfolio();
        portfolio.addInvestment(stock1);
        portfolio.addInvestment(bond1);

        // Display all investments and total portfolio value
        System.out.println("Investment Portfolio:");
        portfolio.displayAllInvestments();
        System.out.println("Total Portfolio Value: " + portfolio.getTotalValue());
    }
}
