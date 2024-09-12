public class Main {
    public static void main(String[] args) {
        int number = 9;
        moveMany(number);
        java.lang.String start = "A";
        String help = "B";
        String end = "C";
    }

    public static void moveMany(int n) {
        //Base statement
        if(n == 1){
            moveOne();
        }


        moveMany(n-1); // Move many from start to help.
        moveOne(); //Move one from bottom to the end.
        moveMany(n-1); // Move many from help to end.
    }

    public static void moveOne(){

    }
}