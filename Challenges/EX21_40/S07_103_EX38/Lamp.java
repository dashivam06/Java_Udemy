package Challenges.EX21_40.S07_103_EX38;

public class Lamp {
    // write code here
    private String style;
    private boolean battery;
    private int globRating;
    
    public Lamp(String style,boolean battery,int globRating){
        this.style=style;
        this.battery=battery;
        this.globRating=globRating;
    }
    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }
    public String getStyle(){
        return this.style;
    }
    public boolean isBattery(){
        return this.battery;
    }
    public int getGlobRating(){
        return this.globRating;
    }
    
}




    

