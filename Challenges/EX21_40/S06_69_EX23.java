package Challenges.EX21_40;
public class S06_69_EX23 {
    // write code here
    
        // write code here
        public static boolean isPerfectNumber(int number){
            int sum = 0;
            
            if(number<1){
                return false;
            }
            
            for(int i=1;i<number;i++){
                if(number%i==0){
                    sum+=i;
                }
            }
            return (sum==number);
        }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(-1));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(6));
        
    }
}
    
