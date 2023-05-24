package main;
import kitchen.BigCup;
import kitchen.Cup;
import kitchen.SmallCup;
public class Application{
    public static void main(String[] args) {
        
        //Cup mug = new Cup("Tea", (short)100);
        //System.out.println(mug.getLiquidName());
        //System.out.println(mug.getLiquidVolume());

        // In "Application / main()" creati doua obiecte de tip "cana":
        //     cupA = cu 300 ml lapte
        //     cupB = cu 500 ml apa

        Cup cupA = new Cup("Milk", (short)300);
        Cup cupB = new Cup("Water", (short) 500);

        //creați 1 cana mică de ceai (200 ml) .....afișați informații despre aceasta!

        SmallCup smallCup = new SmallCup("Tea",(short)200);

        // 2. creați o cană mare în main() unde există deja 200 ml de apă

        BigCup bigCup = new BigCup("Water",(short)200);
        

       // System.out.println(cupA.getLiquidVolume());
       // System.out.println("cupB statement: "+cupB.getLiquidVolume());

        //varsati 50 ml de lapte din cana "cupA"

        cupA.setLiquidVolume((short)250);
        
        //adaugati inca 50ml de apa in cana "cupB"

        cupB.setLiquidVolume((short)550);
        

        //afisati in consola informatia despre "cupA" si "cupB"

        System.out.println(cupA.getLiquidVolume());
        System.out.println("cupB statement: "+cupB.getLiquidVolume());

       // ETAPA 2 
       // .....afișați informații despre aceasta!

        System.out.println(smallCup.getLiquidVolume());  // smallCup este gol
        smallCup.setLiquidVolume((short)200);  // l-am umplut cu 200 ml lichid
        System.out.println("smallCup volume: "+ smallCup.getLiquidVolume()); //l-am afisat pe ecran


        
      
        System.out.println("bigCup volume: "+ bigCup.getLiquidVolume());

        //turnați toată apa rămasă din cupB (part1) 
        //în această cană mare, afișați informațiile pe ecran!
        

        
        bigCup.setLiquidVolume((short)(cupB.getLiquidVolume()+bigCup.getLiquidVolume())); // umplerea celui bigCup
        cupB.setLiquidVolume((short)0);  // golirea paharului cupB
        System.out.println("cupB after pouring out: "+ cupB.getLiquidVolume());
        System.out.println("bigCup after pouring in: "+ bigCup.getLiquidVolume());

    }   



}
