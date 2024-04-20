public class Main {

    public static void main(String[] args) {



        String[] names = {"Cristina", "Paul", "Maria", "John"};
        
        System.out.println("==== Do while ====");

        int i = 0;

        do {

            System.out.println(names[i++]);

        } while(i < names.length);

    }

}


