import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private Double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0.0;
    }

    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {
        return "Code:                " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n";
    }

    private String getFormattedPrice(double unformat) {
        String formattedData = String.format("%.02f", unformat);
        return(formattedData);
    }


    // Create public access for the count variable
    public static int getCount() {
        return count;
    }
}