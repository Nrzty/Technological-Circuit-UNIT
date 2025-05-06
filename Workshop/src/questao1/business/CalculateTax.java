package business;

import resources.Menu;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculateTax {
    private final Menu menu;

    public CalculateTax(Menu menu){
        this.menu = menu;
    }

    public BigDecimal getTaxValue(BigDecimal value){
        BigDecimal tax = BigDecimal.ZERO;
        BigDecimal finalValue = value;

        if (value.compareTo(new BigDecimal("200.00")) <= 0) {
            System.out.println("Isento");
        } else if (value.compareTo(new BigDecimal("2000.00")) > 0 && value.compareTo(new BigDecimal("3000.00")) <= 0) {
            tax = value.multiply(new BigDecimal("0.08"));
        } else if (value.compareTo(new BigDecimal("3000.00")) > 0 && value.compareTo(new BigDecimal("4500.00")) <= 0) {
            tax = value.multiply(new BigDecimal("0.18"));
        } else {
            tax = value.multiply(new BigDecimal("0.28"));
        }

        finalValue = finalValue.add(tax);
        return finalValue.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal calculateFinalTax(int loop){
        BigDecimal finalValue = BigDecimal.ZERO;
        for (int i = 0; i < loop ; i++) {
            System.out.print("Put " + (i + 1) + "º" + " Value: ");
            finalValue = finalValue.add(menu.getNumber());
        }
        return finalValue;
    }
}
