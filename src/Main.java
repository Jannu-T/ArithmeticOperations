import java.math.RoundingMode;
import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
    //Multiplication
    public BigDecimal mul(BigDecimal a,BigDecimal b){
        BigDecimal product=a.multiply(b);
        return product;
    }
    //Division
    public BigDecimal div(BigDecimal a,BigDecimal b){
        BigDecimal division=a.divide(b,2,RoundingMode.HALF_UP);
        return division;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter value for a : ");
        BigDecimal a = new BigDecimal(scanner.nextLine());

        System.out.print("Enter value for b : ");
        BigDecimal b = new BigDecimal(scanner.nextLine());

        Main obj = new Main();
        System.out.println("Multiplication of a and b = "+obj.mul(a,b));
        System.out.println("Division of b from a = "+obj.div(a,b));
    }
}
