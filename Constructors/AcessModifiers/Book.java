package AcessModifiers;

public class Book {
    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    public void showBook() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
}
