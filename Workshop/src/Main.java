import business.CalculateTax;
import resources.Menu;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        CalculateTax taxOperation = new CalculateTax(menu);

        System.out.println("CALCULATE TAX BY [NRZTY]");

        BigDecimal totalValue = taxOperation.calculateFinalTax(2);

        System.out.println("Total Value Without Tax: R$ " + totalValue);

        BigDecimal valorComImposto = taxOperation.getTaxValue(totalValue);
        System.out.println("Total Value With Tax: R$ " + valorComImposto);
    }
}