package solid_principles;

class Book {
    private String name;
    private String author;
    private String text;

    public Book(String name, String author, String text) {
        this.name = name;
        this.author = author;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

class BookPrinter {
    private Book book;

    public BookPrinter(Book book) {
        this.book = book;
    }

    public void printBook() {
        System.out.println(book.getText());
    }

    public boolean isWordInText(String word) {
        return book.getText().contains(word);
    }
}

public class SingleResponsibility {

    public static void main(String[] args) {
        Book famousFive = new Book(
                "Famous Five",
                "Enid Blyton",
                "This book is about a group of five children who love " +
                        "to solve mysteries with their dog Timmy"
        );
        BookPrinter printer = new BookPrinter(famousFive);
        printer.printBook();
    }
}
