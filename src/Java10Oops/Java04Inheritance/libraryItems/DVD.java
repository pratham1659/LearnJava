package Java10Oops.Java04Inheritance.libraryItems;

class DVD extends LibraryItem {
    private int duration; // Duration of the DVD in minutes

    public DVD(int itemID, String title, String author, int duration) {
        super(itemID, title, author);
        this.duration = duration;
    }

    // Additional methods specific to DVDs can be added here

    // Getters and setters
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}


