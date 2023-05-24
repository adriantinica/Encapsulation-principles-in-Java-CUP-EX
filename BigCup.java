package kitchen;

public class BigCup extends Cup {

    public BigCup(String liquidName, short liquidVolume){
        super(liquidName, liquidVolume);
    }


    @Override
    public void setLiquidVolume(short liquidVolume) {
        if (liquidVolume  > 0 && liquidVolume <=1000 ) {
            super.setLiquidVolume(liquidVolume);
        } else {
           System.err.println("Invalid liquid volume! Volume should be between 0 and 1000 ml."); 
        }
      
    }

    
}
