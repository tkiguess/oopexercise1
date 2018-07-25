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

        System.out.println("Code: ");
        String load = keyboard.next();
        p.setCode(load);

        System.out.println("description: ");
        String prescription = keyboard.next();
        p.setDescription(prescription);

        System.out.println("Price");
        Double rice = keyboard.nextDouble();
        p.setPrice(rice);

        System.out.print(p.toString());

        System.out.println("I understard the rest and how it works.");
    }

}
