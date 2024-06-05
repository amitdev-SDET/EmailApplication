import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int defaultPassword=10;
    private int mailBoxCapacity=500;
    private String alternateEmail;
    private String companySuffix="earnestyoung.com";

    // Constructor to recieve first name and last name
     public  Email(String firstName,String lastName){
         this.firstName=firstName;
         this.lastName=lastName;
         //call method asking for  department return department
         this.department=setDepartment();
         //Call a method that returns random password
         this.password=randomPassword(defaultPassword);
         //combine element to generate email
         if(this.department==""){
             email=firstName.toLowerCase()+"."+ lastName.toLowerCase()+"@"+companySuffix;
         }
         else{
             email=firstName.toLowerCase()+"."+ lastName.toLowerCase()+"@"+department+"."+companySuffix;
         }
     }
    //Ask for the department
    public String setDepartment(){
         System.out.print("Department Codes:\nFor Development: 1\nFor Testing: 2\nFor sales: 3\nFor Accounting: 4\nFor None: 0\nEnter the Department Codes");
         Scanner in=new Scanner(System.in);
         System.out.println("Enter Department choice: ");
         int depChoice = in.nextInt();
         if(depChoice==1){return "dev";}
         else if(depChoice==2){return "QA";}
         else if(depChoice==3){return "sales";}
         else if(depChoice==4){return "acc";}
         else  {return "";}
    }

    //Generate Random password
    private String randomPassword(int length){
         String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789@#%&*";
         char[]password=new char[length];
         for(int i=0;i<length;i++){
             int rand = (int) (Math.random() * passwordSet.length());
             password[i]=passwordSet.charAt(rand);
         }
         return new String(password);
    }





    //set the mailbox capacity

    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }


    //set alternate email

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }
    //Change the password
    public  void  changePassword(String password){
         this.password=password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }


    public String showInfo() {
        return "Name: "+this.firstName+" "+this.lastName+"\n"+"Email: "+this.email+"\n"+"Password: "+this.password+"\n"+"Mail Box Capacity: "+this.mailBoxCapacity;
    }
}
