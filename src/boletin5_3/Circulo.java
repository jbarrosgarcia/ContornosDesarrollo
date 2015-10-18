package boletin5_3;
public class Circulo {
     private double radio;
   private final double pi=3.14d;
   
   //Constructores
   public Circulo(){  
   }
   
   public Circulo(double radio,double pi){
       this.radio=radio;
   }
   
   //Métodos
   public double getArea(){
       double area; 
       return area=(pi*(Math.pow(radio, 2))); 
   }
   
   public double getLonxitude(){
       double lonxitude;
       return lonxitude=(2*pi*radio);
   }
   
    public void setAreaCirculo(double radio,double pi ){
       this.radio=radio;   
   }
    
   public double areaCirculo(){
       return (pi*(Math.pow(radio, 2)));
   }
   
   public double lonxitude(){
       return (2*pi*radio);
   }
}
