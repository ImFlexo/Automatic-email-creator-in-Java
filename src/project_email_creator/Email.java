
package project_email_creator;

import java.util.Random;
import java.util.Scanner;


public class Email {
    
    private String  firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultpasswordlength = 8;
    private String company_name = "companyname.co";

    
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Creating Email For:  " + this.firstName + " " + this.lastName);
        this.department = setDepartment();
        email = firstName.toLowerCase() + "." + lastName.toLowerCase()+ "." +department + "@"  + company_name;
        this.password = randomPassword(defaultpasswordlength);

    }

    private String setDepartment() {
        
      Scanner sc = new Scanner(System.in);
      
char options;

do{
    System.out.print("Department Codes\nA- Dev\nB- Acc\nC- Net\nEnter Your Department Code: ");
    
    options=sc.next().charAt(0);    
    switch(options){
        case 'A':
           return "Dev";
           
        case 'B':
          return "Acc";
            
        case 'C':
           return "Net";
            
        default:
            System.out.println("Invalid character, please try again!");
        
    }
    
}while(options != 'A' && options!='B' && options!='C');
        
     
     return "";
    }

    private String randomPassword(int length) {
        Random r = new Random();

        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "@#$&";
        String values = Capital_chars + Small_chars + numbers + symbols;

        String password = "";
        for (int i = 0; i < length; i++) {
            password = password + values.charAt(r.nextInt(values.length()));
        }
        return  password;
    }

    
    public String getPassword() {
        return  password;
    }

    
    public String showInfo() {
        System.out.println("");
        return "Display Name: " + firstName +" "+ lastName +
                "\nDepartment: " + this.department +
                "\nUniversity Email: " + email +
                "\nUniversity Password: " + this.password;
    }
    
}
