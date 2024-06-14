package Challenges.EX21_40.S07_99_EX37;
public class Cuboid extends Rectangle {
    private double height;
    public Cuboid(double width,double length,double height){
        super(width,length);
        this.height=(height)<0?0:height;
        
    }
     public double getHeight(){
    return this.height;
}
 public double getVolume(){
    return super.getLength()*super.getWidth()*this.getHeight();
}
}