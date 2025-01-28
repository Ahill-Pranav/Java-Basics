import java.util.Scanner;
public class conditional_statements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter first number ");
            double first_num = input.nextDouble();

            System.out.print("Enter second number ");
            double second_num = input.nextDouble();

            input.nextLine();
            System.out.print("Enter operation to be performed ");
            char operation = input.next().charAt(0);

            if (operation=='+')
            {
                System.out.print(first_num+second_num);
            }
            else if (operation=='-')
            {
                if(first_num>second_num) {
                    System.out.println(first_num - second_num);
                }
                else
                {
                    System.out.println(second_num-first_num);
                }
            }
            else if (operation=='*')
            {
             System.out.println(first_num*second_num);
            }
            else if (operation=='/')
            {
                if(first_num>second_num) {
                    System.out.println(first_num/second_num);
                }
                else
                {
                    System.out.println(second_num/first_num);
                }
            } else
            {
                break;
            }

        }
    }
}