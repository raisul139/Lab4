import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        double taxes;
        System.out.println("enter the encome");

        Scanner input = new Scanner(System.in);
        double income = input.nextDouble();

        int status;
        System.out.println("press 1 if single or married press 2");
        status = input.nextInt();
        if (status == 1) {
            if (income < 8000) {
                System.out.println("not taxable income ");
            } else if (income == 8000) {
                taxes = 800;
            } else if (income > 8000 && income < 32000) {
                taxes = 800 + ((32000 - income) * 15 / 100);
                System.out.println(taxes);
            } else if (income > 32000) {
                taxes = 4400 + ((income - 32000) * 25 / 100);
            } else {
                System.out.println("nothing");
            }
        }
         else if(status == 2) {
            if (income < 16000) {
                System.out.println("not taxable income ");
            } else if (income == 16000) {
                taxes = 1600;
            } else if (income > 16000 && income < 64000) {
                taxes = 1600 + ((32000 - income) * 15 / 100);
                System.out.println(taxes);
            } else if (income > 64000) {
                taxes = 8800 + ((income - 64000) * 25 / 100);
            } else {
                System.out.println("nothing");
            }
        }
    }
}
