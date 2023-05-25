package kitchen;

public class BigCup extends Cup {

    private final int MAX_VOLUME = 1000;

    public BigCup(String liquidName, short liquidVolume){
        super(liquidName, liquidVolume);
    }


    @Override
    public void setLiquidVolume(short liquidVolume) {
        
        if (liquidVolume > MAX_VOLUME  ) {
           
            super.liquidVolume = MAX_VOLUME;
          
        }else{
             super.liquidVolume = liquidVolume;
        }
    }

    
}

