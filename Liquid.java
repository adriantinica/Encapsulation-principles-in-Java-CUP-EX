/*
 * https://github.com/dorinesinenco/EDUQATION/blob/master/programming/java/oop/encapsulation/kitchen-cup.PART3.DYN.ro.md
 */
package world;

public class Liquid {
    
    private String liquidName ;
    private short liquidVolume;
    private byte liquidTemp;


    //  4.Adaugati 2 variante pentru constructor (default si parametrizat) - 
    //    Cum se numeste acest lucru - atunci cand o metoda are mai multe variante? --- Polymorphism

    public Liquid(){

    }


    public Liquid(String liquidName, short liquidVolume, byte liquidTemp){
        this.setLiquidName(liquidName); 
        this.setLiquidVolume(liquidVolume); 
        this.setLiquidTemp(liquidTemp);
    }

    public String getLiquidName() {
        return liquidName;
    }


   public void setLiquidName(String liquidName) {
        if (liquidName.equals("Water") || liquidName.equals("Milk") || liquidName.equals("Tea") ) {
            this.liquidName = liquidName;
        } else {
            System.err.println("You try to pour the wrong liquid !!! ");
        }
        
    }



    public short getLiquidVolume() {
        return liquidVolume;
    }


    public void setLiquidVolume(short liquidVolume) {
        if (liquidVolume <= 0) {
            System.err.println("Error: The volume cant be null or negative !!!");
        } else {
            this.liquidVolume = liquidVolume;
        }
    }   


    public byte getLiquidTemp() {
        return liquidTemp;
    }


    public void setLiquidTemp(byte liquidTemp) {
        if (liquidTemp >=0 && liquidTemp <= 100) {
            this.liquidTemp = liquidTemp;
        } else {
            System.err.println("Error: State of aggregation must be liquid");
        }
    }
        
    public boolean isCold(){
        if (liquidTemp <=18 ) {
            System.out.println("The liquid is Cold");
            return true;
        } else {
            System.out.println("The liquid is Warm or Hot");
            return false; 
        }
        
    }

    public boolean isWarm(){
        if(liquidTemp> 18 && liquidTemp <=36) {
            System.out.println("The liquid is Warm");
            return true;
        } else {
            System.out.println("The liquid is Hot or Cold");
            return false; 
        }
        
    }

    public boolean isHot(){
        if (liquidTemp > 36) {
            System.out.println("WARNING: HOT LIQUID");
            return true;
        } else {
            System.out.println("This liquid is Cold or Warm");
            return false;
        }
    }
    


}
