package Java09Oops.Java04Inheritance.libraryItems;

public class LibraryItem {
    private int itemID;
    private String title;
    private String author;

    public LibraryItem(int itemID, String title, String author) {
        this.itemID = itemID;
        this.title = title;
        this.author = author;
    }

    public void checkout() {
        System.out.println("Checked out: " + title);
    }

    public void returnItem() {
        System.out.println("Returned: " + title);
    }

    // Getters and setters
    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
