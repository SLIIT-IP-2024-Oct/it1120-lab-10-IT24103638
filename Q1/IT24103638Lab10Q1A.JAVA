import java.util.scanner;

public class it24103638lab10Q1
{
    public ststic void main(string[] args)
        {
           Scanner Scanner = new Scanner(system.in);
           Syestem.out.print("Enter the mark:");
           int mark = scanner.nextInt();
           
           assert(mark >=0 && mark <= 100) :"Invalid Mark";

           system.out.println("Mark is Validated");
         }
}            