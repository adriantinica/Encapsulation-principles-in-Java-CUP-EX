package kitchen;
public class Cup {

    private String liquidName;
    protected short liquidVolume;

    //    Volumul lichidului nu poate depasi 600ml si nu poate fi negativ!
    private final int MAX_VOLUME = 600;

    public Cup(){

    }

    public Cup( String liquidName, short liquidVolume ){
        
        this.liquidName = liquidName;
        setLiquidVolume(liquidVolume);
    }

    //INTERBARE - Se aplica oare capsula asupra acestei clase?

    //Raspuns:acesta clasa trebuie sa fie publica pentru a putea fi identificata de  cealalta clasa /main/ Application 

    public String getLiquidName() {
        return liquidName;
    }

    //   In canile acestei clase poate fi turnat doar "Water", "Milk","Tea"

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


    // changed according to 2-nd part of the exercise......

    public void setLiquidVolume(short liquidVolume) {

        if (liquidVolume > MAX_VOLUME  ) {
           
           this.liquidVolume = MAX_VOLUME;
         
        }else{
            this.liquidVolume = liquidVolume;
        }
    }

    

}
