import java.math.BigDecimal;
import java.util.Scanner;
import java.lang.*;

public class Main {
    public BigDecimal add(BigDecimal b1,BigDecimal b2)
    {
        return b1.add(b2);
    }
    public BigDecimal sub(BigDecimal b1,BigDecimal b2)
    {
        return b1.subtract(b2);
    }
    public static void main(String[] args)
    {
        Main obj = new Main();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter value for a : ");
        String a= scanner.next();
        System.out.print("Enter value for b : ");
        String b= scanner.next();
        BigDecimal big1=new BigDecimal(a);
        BigDecimal big2=new BigDecimal(b);
        System.out.println("Addition of a and b = "+obj.add(big1,big2));
        System.out.println("Subtraction of b from a = "+obj.sub(big1,big2));
    }
}