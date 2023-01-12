//[pl] Łańcuch znaków zawiera oddzielone odstępami imię i nazwisko pracownika, liczbę przepracowanych
//godzin i stawkę godzinową. Napisz program obliczający na tej podstawie wynagrodzenie należne pracownikowi.
//[eng] The string separated by spaces contains the name of the employee, the number of hours worked, and the rate
// hourly. Write a program that calculates the salary due to the employee on this basis. <br>

import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {
        String s = "Jan Nowak 150 25";
        Scanner input = new Scanner(s);

        String s1 = input.next();
        String s2 = input.next();
        int a = input.nextInt();
        double b = input.nextDouble();
        System.out.printf("%s %s %.2f\n", s2, s1, a * b);
        input.close();
    }
}
