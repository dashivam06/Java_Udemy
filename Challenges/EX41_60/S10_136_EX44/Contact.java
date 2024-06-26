package Challenges.EX41_60.S10_136_EX44;

public class Contact {
    // write code here
    private String name ;
    private String phoneNumber ;
    
    public Contact(String name,String phoneNumber)
    {
        this.name = name ;
        this.phoneNumber = phoneNumber;
    }
    
    public String getName(){
        return this.name;
    }
    
     public String getPhoneNumber(){
        return this.phoneNumber;
    }
    
    public static Contact createContact(String name , String phoneNumber){
        return new Contact(name,phoneNumber);
    }
}