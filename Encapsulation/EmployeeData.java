package Encapsulation;

public class EmployeeData {
   
    private String firstName;
    private String lastName;
    private int employeeId;
    private String email;
    private String phoneNumber;
    private String department;
    private String position;
    private double salary;
    private String hireDate;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String dateOfBirth;
    private String maritalStatus;
    private String gender;
    private String emergencyContactName;
    private String emergencyContactPhone;
    private String officeLocation;

    
    public EmployeeData(String firstName, String lastName, int employeeId, String email, String phoneNumber,
                    String department, String position, double salary, String hireDate, String address,
                    String city, String state, String zipCode, String country, String dateOfBirth, 
                    String maritalStatus, String gender, String emergencyContactName, 
                    String emergencyContactPhone, String officeLocation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.position = position;
        this.salary = salary;
        this.hireDate = hireDate;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
        this.maritalStatus = maritalStatus;
        this.gender = gender;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
        this.officeLocation = officeLocation;
    }

    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(country.equals("india")){
            this.country = country;
        }
        else{
            System.out.println("the country has to be set to india only!!");
        }
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }



   
    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
    }

    
    public double calculateAnnualSalary() {
        return salary * 12; 
    }

    
    public void updateEmergencyContact(String contactName, String contactPhone) {
        this.emergencyContactName = contactName;
        this.emergencyContactPhone = contactPhone;
    }

    public static void main(String[] args) {
       
        EmployeeData employee1 = new EmployeeData("John", "Doe", 101, "john.doe@example.com", "123-456-7890", 
                                          "Engineering", "Software Engineer", 5000, "2024-01-15", 
                                          "123 Main St", "New York", "NY", "10001", "USA", 
                                          "1990-05-15", "Single", "Male", "Jane Doe", "987-654-3210", "A-101");

        EmployeeData employee2 = new EmployeeData("Jane", "Smith", 102, "jane.smith@example.com", "234-567-8901", 
                                          "HR", "HR Manager", 6000, "2023-11-10", "456 Elm St", 
                                          "San Francisco", "CA", "94105", "USA", "1988-02-20", 
                                          "Married", "Female", "John Smith", "876-543-2109", "B-202");

        
        employee1.displayEmployeeDetails();
        System.out.println("Annual Salary: " + employee1.calculateAnnualSalary());
        employee1.updateEmergencyContact("Mark Doe", "111-222-3333");
    }
}

