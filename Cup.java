package kitchen;
public class Cup {

    private String liquidName;
    private short liquidVolume;

    public Cup(){

    }

    public Cup( String liquidName, short liquidVolume ){
    

        this.liquidName = liquidName;
        this.liquidVolume = liquidVolume;
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


    //    Volumul lichidului nu poate depasi 600ml si nu poate fi negativ!

    public void setLiquidVolume(short liquidVolume) {

        if (liquidVolume <= 600 && liquidVolume >= 0  ) {
           
           this.liquidVolume = liquidVolume;
         
        }else{
            System.err.println("Cup can contain 600 ml max");
        }
    }

    

}
