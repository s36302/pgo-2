public class Library {
    private Book[] books;
    private int bookCount;


    public Library(int capacity) {
        this.books = new Book[capacity];
        this.bookCount = 0;
    }


    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full! Cannot add more books.");
        }
    }

    public void printAvailableBooks() {
        System.out.println("Available Books:");
        for (int i = 0; i < bookCount; i++) {

            if (books[i].isAvailable()) {
                books[i].printInfo();
            }
        }
    }

    public void findBookByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                books[i].printInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with title '" + title + "' not found.");
        }
    }

    public int countAvailableBooks() {
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                count++;
            }
        }
        return count;
    }
}
