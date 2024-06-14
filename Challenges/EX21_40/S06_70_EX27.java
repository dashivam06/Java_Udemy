package Challenges.EX21_40;
public class S06_70_EX27 {

    // write code here
    public static void printSquareStar(int number){
        
                if(number<5){
                    System.out.println("Invalid Value");
                    return;
                }
                
                for(int i=1;i<=number;i++){
                    for(int j=1;j<=number;j++){
                        if(i==1||j==1||i==number||j==number||i==j||j==number-(i-1)){
                            System.out.print("*"+" ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                
            }
        
    public static void main(String[] args) {
        int number = 10 ;
        printSquareStar(number);
    }
}