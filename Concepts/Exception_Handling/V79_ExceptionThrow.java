package Concepts.Exception_Handling;

public class V79_ExceptionThrow {

    public static void main(String[] args) {
            int j=30;
            int i=0;
           try{
            j=18/i;
            //handle the exception using throw
            if(j==0)
               throw new ArithmeticException("i donot want to print 0"); //try to create an exception 
           }
           catch(ArithmeticException e){//here catch is catching the exception
              System.out.println("ArithmeticException caught");
              System.out.println(e.getMessage()); //getMessage() method use to get the message
           }
             catch(Exception e){
                System.out.println("Exception caught");
             }
           
         }

    }

