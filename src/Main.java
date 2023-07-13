import java.math.BigDecimal;
import java.util.Scanner;
import java.lang.*;

public class Main {
    public int add(int a, int b)
    {
        return (a+b);
    }
    public int sub(int a, int b)
    {
        return (a-b);
    }
    public static void main(String[] args)
    {
        Main obj = new Main();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter value for a : ");
        int a= Integer.parseInt(scanner.next());
        System.out.print("Enter value for b : ");
        int b= Integer.parseInt(scanner.next());
        System.out.println("Addition of a and b = "+obj.add(a,b));
        System.out.println("Subtraction of b from a = "+obj.sub(a,b));
    }
}