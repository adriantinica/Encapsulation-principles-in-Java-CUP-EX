package kitchen;

public class SmallCup extends Cup {

    public SmallCup(String liquidName, short liquidVolume){
        super(liquidName, liquidVolume);
    }


    //  redefiniti comportamentul setter-ului pentru volumul de lichid din interior 
    //  astfel încât să vă permită doar setarea intervalului 0..250 ml

    @Override
    public void setLiquidVolume(short liquidVolume) {
        if (liquidVolume <= 250 && liquidVolume >= 0) {
            super.setLiquidVolume(liquidVolume);
        } else {
           System.err.println("Small cup can contain 250 ml only !!!"); 
        }
      
    }


    


    
}
