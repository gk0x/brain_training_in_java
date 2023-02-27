import java.util.Scanner;

//[pl]Użytkownik wprowadza z klawiatury trzy liczby a,b i c. Napisz program, ktory wyświetli najmniejszą(lub największą)
//z tych liczb. Nie wprowadzaj dodatkowych zmiennych.
//[eng] The user enters three numbers a, b and c from the keyboard. Write a program that displays the smallest (or largest)
//of these numbers. Do not initialize other variables.
public class TaskTwelve {
    public static void main(String[] args) {
        System.out.println("Choose the smallest of the three numbers.");
        System.out.println("Enter the numbers: ");
        Scanner input = new Scanner(System.in);
        System.out.println("a = " );
        double a = input.nextDouble();
        System.out.println("b = ");
        double b = input.nextDouble();
        System.out.println("c = ");
        double c = input.nextDouble();
        input.close();
        System.out.println("The smallest number is: ");

        if (a<b){
            if (a<c){
                System.out.println(a);
            }
        }
        if (b<a){
            if (b<c){
                System.out.println(b);
            }
        } if (c<a){
            if (c<b){
                System.out.println(c);
            }
        } if (a==b){
            if (a==c){
                System.out.println(a);
            }
        }
    }
}
