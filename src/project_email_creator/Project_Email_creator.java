
package project_email_creator;

import java.util.Scanner;


public class Project_Email_creator {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("First Name: ");
      String first_name = sc.next();
      
       System.out.print("Last Name: ");
       String last_name = sc.next();
       
        Email em1 = new Email(first_name,last_name);
       System.out.println(em1.showInfo());
        
      
        
    }
    
}
