//[pl]Napisz aplikację, która obliczy sumę serii liczb naturalnych podanych jako parametry wywołania
//aplikacji.Wynik wyświetl na ekranie<br>
//[eng] Write a program, that will calculate the sum of a series of natural numbers given as call parameters application.
//Display the result on the screen. <br>

public class TaskFour {
    public static void main(String[] args) {
        //args = {127, -242,391}
int suma = 0;
for (String argument: args){
    suma+=Integer.parseInt(argument);
}
    System.out.println("suma = " + suma);

    }
}
