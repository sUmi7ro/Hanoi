import java.lang.*;

public class Main {
    public static String start = "A", help = "B", end = "C";
    public static void main(String[] args) {
        int number = 3;
        System.out.println(start+" "+help+" "+end);
        moveMany(number, start, help, end);
    }

    public static void moveMany(int n, String start, String help, String end) {
        //Base statement
        if(n == 1){
            moveOne(start, end);
        }
        else{
            moveMany(n-1, start, end, help); // Move many from start to help.
            System.out.println("hei");
            moveOne(start, end); //Move one from bottom to the end.
            moveMany(n-1, help, start, end); // Move many from help to end.
        }
    }

    public static void moveOne(String st, String en){
        System.out.println("Flytt: "+st+" Til: "+en);
    }
}