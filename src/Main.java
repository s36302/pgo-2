public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("asd", "qwe", 320, true);
        Book book2 = new Book("123", "dfg", 670, true);
        Book book3 = new Book("book3", "author3", 200, false);


        System.out.println("--- Initial Library State ---");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();


        System.out.println("\n--- Testing Borrowing ---");
        book1.borrow();
        book1.borrow();


        System.out.println("\n--- Testing Returning ---");
        book3.returnBook();
        book3.printInfo();
    }
}
