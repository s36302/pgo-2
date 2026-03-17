public class Book {
    private String title;
    private String author;
    private int pageCount;
    private boolean available;
    public Book(String title, String author, int pageCount, boolean available){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.available = available;
    }
    public void printInfo() {
        String status = available ? "Available" : "Borrowed";
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
        System.out.println("Available Books: " + status);
    }
    public void borrow() {
        if (available) {
            available = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is already borrowed.");
        }
    }
    public void returnBook() {
        available = true;
        System.out.println("You have returned: " + title);
    }


}

