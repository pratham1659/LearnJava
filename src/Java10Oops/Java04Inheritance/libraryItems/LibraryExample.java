package Java10Oops.Java04Inheritance.libraryItems;
// Example usage
public class LibraryExample {
    public static void main(String[] args) {
        Book book = new Book(1, "Java Programming", "John Doe", "1234567890");
        Magazine magazine = new Magazine(2, "Time", "Time Inc.", 123);
        DVD dvd = new DVD(3, "Inception", "Christopher Nolan", 148);

        book.checkout();
        magazine.checkout();
        dvd.checkout();

        book.returnItem();
        magazine.returnItem();
        dvd.returnItem();
    }
}