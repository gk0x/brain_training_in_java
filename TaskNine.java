//[pl] Napisz aplikację, która wyświetli w konsoli pierwiastki arytmetyczne od stopnia 2 do 10 z liczby 5
// z dokładnością do 6 miejsc po przecinku <br>
//[eng] Write an application that displays the arithmetic roots from degree 2 to 10 of 5 to the console with precision
//to 6 decimal places <br>

public class TaskNine {
    public static void main(String[] args) {
        int[] data = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int n : data) {
            double x = Math.pow(5, 1.0 / n);
            System.out.printf("Pierwiastek %2d stopnia z 5: %f\n", n, x);
        }

    }
}