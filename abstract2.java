import java.util.Scanner;

public class abstract2 {

    public static void main(String[] args) {

        Money money = new Money();
        money.getRateOfintrest();
        money.setter();

    }

}

abstract class bank {
    float amount;
    float p;
    float month;
    float final_intrest;
    float y;
    final float intrest = 5.45f;
    float year;
    Scanner scanner = new Scanner(System.in);

    abstract public void getRateOfintrest();

    abstract public void setter();
}

class Money extends bank {
    public void getRateOfintrest() {
        System.out.print("enter of monthly emi = ");
        amount = scanner.nextFloat();
        System.out.print("yearly intrest enter now  = ");
        y = scanner.nextFloat();
        p = amount * intrest / 100;
        month = amount + p;
        y = y * year;
        year = month * 12;
        final_intrest = p * 12;

    }

    public void setter() {

        System.out.println("all month intresrt amount = " + month);
        System.out.println("all year intresrt amount = " + year);
        System.out.println("all final intrest intresrt amount = " + final_intrest);
        System.out.println("<--> <--> <--> <--> <--> <--> <--> <--> <--> <-->");
        System.out.println("all loan amount = " + y);

    }

}
