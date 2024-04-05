package Java10Oops.Java04Inheritance.libraryItems;

// Subclass: Book
class Book extends LibraryItem {
    private String ISBN;

    public Book(int itemID, String title, String author, String ISBN) {
        super(itemID, title, author);
        this.ISBN = ISBN;
    }

    // Additional methods specific to books can be added here

    // Getters and setters
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
