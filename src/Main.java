public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("asd", "qwe", 320, true);
        Book book2 = new Book("123", "dfg", 670, true);
        Book book3 = new Book("book3", "author3", 200, false);

        Reader reader1 = new Reader("Anna", "312", 1001);
        Reader reader2 = new Reader("Sonya", "123", 1002);

        System.out.println("--- Initial State ---");
        reader1.printData();

        System.out.println("\n--- Anna borrows 2 books ---");
        reader1.increaseBorrowedCount();
        reader1.increaseBorrowedCount();
        reader1.printData();

        System.out.println("\n--- Anna returns 1 book ---");
        reader1.decreaseBorrowedCount();
        reader1.printData();
        System.out.println("--- Initial Library State ---");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

        System.out.println("\n--- Initial State for Marek ---");
        reader2.printData();

        System.out.println("\n--- Sonya borrows 1 book ---");
        reader2.increaseBorrowedCount();
        reader2.printData();



        System.out.println("\n--- Testing Borrowing ---");
        book1.borrow();
        book1.borrow();


        System.out.println("\n--- Testing Returning ---");
        book3.returnBook();
        book3.printInfo();
    }
}
