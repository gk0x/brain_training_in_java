//[pl] Napisz program, który w formie tabeli przedstawi dowód praw De Morgana
//[eng]Write a program that presents a proof of De Morgan's laws in the form of a table

public class TaskThree {
    public static void main(String[] args) {
       //De Morgan's first law states that the complement of the union
        // of two sets A and B is equal to the intersection of the complement of
        // the sets A and B
        //!(a && b) == !a || !b
       boolean []bool = {false,true};
        // create a formatted table:

        System.out.println("p\tq\tp&&q\t!p\t!q\t!p||!q \t!(p&&q)\t!p||!q");
        //if first law is a true: !(p&&q) <=>!p||!q



        //Second law states that the complement of the
        // intersection of two sets is the same as the union of their complements.
        //!(!a || !b) == a && b

    }
}
