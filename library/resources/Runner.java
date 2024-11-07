package library.resources;

import library.users.LibraryUser;

public class Runner extends LibraryUser {
    public static void main(String[] args) {
       
        LibraryResource resource = new LibraryResource();
        System.out.println("Title: " + resource.title); 
        resource.borrowResource(); 

       
        System.out.println("Author: " + resource.author); 
        resource.updateResource(); 
        resource.categorizeResource(); 

      
        LibraryUser user = new LibraryUser();
        System.out.println("Name: " + user.name); 
        user.borrowBook(); 

        Runner runner = new Runner();
        System.out.println("Member ID: " + runner.memberId);
        runner.upgradeMembership(); 
        
    }
}
