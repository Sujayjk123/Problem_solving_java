package library.users;

public class LibraryUser {
    
    public String name;
    protected int memberId;
    String membershipType; 
    private String password;

   
    public LibraryUser() {
        this.name = "Guest";
        this.membershipType = "Regular";
        System.out.println("LibraryUser created with default values.");
    }


    private LibraryUser(int id) {
        this.memberId = id;
        System.out.println("LibraryUser created with ID: " + id);
    }


    public void borrowBook() {
        System.out.println("Book borrowed by: " + name);
    }

 
    protected void upgradeMembership() {
        this.membershipType = "Premium";
        System.out.println("Membership upgraded to Premium.");
    }

  
    void checkMembership() {
        System.out.println("Membership type: " + membershipType);
    }


    private void setPassword(String password) {
        this.password = password;
        System.out.println("Password set for user.");
    }
}
