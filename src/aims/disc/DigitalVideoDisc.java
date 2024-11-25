package aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    private static int nbDigitalVideoDiscs = 0;
    private int id;

    // Constructor with title only, initializes category, director, length to default values
    public DigitalVideoDisc(String title) {
        this.title = title;
        this.category = "Unknown";
        this.director = "Unknown";
        this.length = 0;
        this.cost = 0.0f;
        this.id = ++nbDigitalVideoDiscs; // Increment and assign the id
    }

    // Constructor with category, title, and cost, initializes director, length to default values
    public DigitalVideoDisc(String category, String title, float cost) {
        this.title = title;
        this.category = category;
        this.director = "Unknown";
        this.length = 0;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs; // Increment and assign the id
    }

    // Constructor with director, category, title, and cost, initializes length to default value
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = 0;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs; // Increment and assign the id
    }

    // Full constructor with all attributes
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs; // Increment and assign the id
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("DVD: %s - Category: %s - Director: %s - DVD length: %d min - Cost: $%.2f",
                this.title, this.category, this.director, this.length, this.cost);
    }

    // Search if the given title matches part of the DVD's title (case-insensitive)
    public boolean isMatch(String title) {
        return this.title.toLowerCase().contains(title.toLowerCase());
    }
}
