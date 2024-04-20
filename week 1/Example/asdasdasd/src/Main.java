public class Main {

    public static void main(String[] args) {

        int var1 = 45;

        double var2 = 5.5;

        String var3 = "Hello World";


        // If...Else

        if (var1 > 50) {

            System.out.println("Too much!");

        } else if (var1 < 40) {

            System.out.println("Too little!");
        } else if (var1 >= 41 && var1 <= 44 || var1 >=46 && var1 <=49) {
            System.out.println("Close!");
        } else {
            System.out.println("just right");
        }
    }
}