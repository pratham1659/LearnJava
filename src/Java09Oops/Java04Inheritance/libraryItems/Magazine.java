package Java09Oops.Java04Inheritance.libraryItems;

class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(int itemID, String title, String author, int issueNumber) {
        super(itemID, title, author);
        this.issueNumber = issueNumber;
    }

    // Additional methods specific to magazines can be added here

    // Getters and setters
    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
}
