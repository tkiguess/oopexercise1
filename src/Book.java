public class Book extends Product {

    private String author;
    private int pages;

    public String getAuthor() {
        System.out.println("bippidy bopiddy boop");
        System.out.println(40 * 2 / 4);
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}