package library.resources;

public class LibraryResource {
    public String title;
    protected String author;
    String category;
    private int resourceId;

    
   LibraryResource() {
        this.title = "Unknown";
        this.category = "General";
        System.out.println("LibraryResource created with default values.");
    }

    
    private LibraryResource(int id) {
        this.resourceId = id;
        System.out.println("LibraryResource created with ID: " + id);
    }

   
    public void borrowResource() {
        System.out.println("Resource borrowed: " + title);
    }

    
    protected void updateResource() {
        System.out.println("Resource updated.");
    }

   
    void categorizeResource() {
        System.out.println("Resource categorized under " + category);
    }

    
    private void generateResourceId() {
        this.resourceId = (int) (Math.random() * 1000);
        System.out.println("Resource ID generated: " + resourceId);
    }
}
