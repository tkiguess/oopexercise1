import java.util.Scanner;

public class beefyboi {
    public static void main (String[] Args){

        Scanner keyboard = new Scanner(System.in);

        Product p = new Product();
        Book b = new Book();
        Software s = new Software();






        System.out.println("write something");
        String Arthur = keyboard.next();
        b.setAuthor(Arthur);

        System.out.println(b.getAuthor());

        System.out.println("=======================");

        System.out.print(p.toString());


    }

}
