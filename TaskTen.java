
//[pl] Oblicz kąty ostre w trójkącie egipskim (trójkąt prostokątny o proporcji długości boków 3:4:5).
//Wyniki podaj:
//a) w radianach, z dokładnością do 4 miejsc po przecinku.
//b) w stopniach, minutach i sekundach kątowych,z dokładnością do 1'.
//[eng] Calculate the acute angles in the Egyptian triangle (a right triangle with a side length ratio of 3:4:5).
//Enter the results:
//a) in radians, accurate to 4 decimal places.
//b) in degrees, minutes and seconds of arc, accurate to 1'.

public class TaskTen {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0, c = 5.0;
        double alfa, beta;
        int deg, min, sec;

        alfa = Math.asin(a / c);
        beta = Math.acos(a / c);
        //a):
        System.out.printf("alfa = %.4f rad \nbeta = %.4f rad", alfa, beta);
        //b):
        System.out.println("");
        alfa = Math.toDegrees(alfa); //radians now
        beta = Math.toDegrees(beta);
        deg = (int) alfa;
        min = (int) (deg + 0.5) * 60;
        sec = (int) (min + 0.5) * 60;
        System.out.printf("alfa = %d\u00B0%02d\'%02d\"\n", deg, min, sec);
        //analogicznie b


    }
}
