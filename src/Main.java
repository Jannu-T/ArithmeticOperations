import java.math.RoundingMode;
import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
    public BigDecimal add(BigDecimal b1,BigDecimal b2)
    {
        return b1.add(b2);
    }
    public BigDecimal sub(BigDecimal b1,BigDecimal b2)
    {
        return b1.subtract(b2);
    }
    //Multiplication
    public BigDecimal mul(BigDecimal a,BigDecimal b){
        BigDecimal product=a.multiply(b);
        return product;
    }
    //Division
    public BigDecimal div(BigDecimal a,BigDecimal b) {
        BigDecimal division = a.divide(b, 2, RoundingMode.HALF_UP);
        return division;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter value for a : ");
        BigDecimal a = new BigDecimal(scanner.nextLine());

        System.out.print("Enter value for b : ");
        BigDecimal b = new BigDecimal(scanner.nextLine());

        Main obj = new Main();
        System.out.println("Addition of a and b = "+obj.add(a,b));
        System.out.println("Subtraction of b from a = "+obj.sub(a,b));
        System.out.println("Multiplication of a and b = "+obj.mul(a,b));
        System.out.println("Division of b from a = "+obj.div(a,b));
    }
}
