package resources;

import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {

    private final Scanner scanner;

    public Menu(Scanner scanner){
        this.scanner = scanner;
    }

    public BigDecimal getNumber(){
        BigDecimal number = new BigDecimal(String.valueOf(scanner.nextBigDecimal()));
        return number;
    }
}
