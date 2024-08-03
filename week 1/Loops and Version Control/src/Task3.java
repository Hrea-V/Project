public class Task3 {
    public static void main(String[] args) {
        int x = 50;
        int y = 100;

        System.out.println("We are going to calculate the following mathematical expression: ");
        System.out.println("(x^2) + ([4{y}/5] - x)");

        int y1 = (4 * y); //400
        //System.out.println(y1);   checking values
        int y2 = (y1 / 5); // 80
        //System.out.println(y2);   checking values
        int x1 = (int) Math.pow(x , 2); //2500
       //System.out.println(x1);   checking values
        int x2 = (y2 - x); //30
        //System.out.println(x2);   checking values
        int sol = (x1 + x2);
        System.out.println("the answer is: " + sol);
    }
}
/*
400



 */