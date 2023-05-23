package main;
import kitchen.Cup;
import kitchen.smallCup;
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

        smallCup smallCup = new smallCup("Tea",(short)200);


        System.out.println(cupA.getLiquidVolume());
        System.out.println(cupB.getLiquidVolume());

        //varsati 50 ml de lapte din cana "cupA"

        cupA.setLiquidVolume((short)250);
        
        //adaugati inca 50ml de apa in cana "cupB"

        cupB.setLiquidVolume((short)550);
        

        //afisati in consola informatia despre "cupA" si "cupB"

        System.out.println(cupA.getLiquidVolume());
        System.out.println(cupB.getLiquidVolume());

       // ETAPA 2 
       // .....afișați informații despre aceasta!

        System.out.println(smallCup.getLiquidVolume());
        smallCup.setLiquidVolume((short)200);
        System.out.println(smallCup.getLiquidVolume());
    }   


}