public class Quote {
    public static void RandomQuote(){
        int random = (int) (Math.random() *4) + 1;
         if(random == 4){
             System.out.println("duty is heavier than a mountain, death is lighter than a feather");
         } else if(random == 3){
             System.out.println("We do not negotiate with terrorists!");
         } else if (random == 2){
             System.out.println("The ROUS's they are rats of unusual size");
         } else{
             System.out.println("Fairs got nothing to do with it.");
         }
    }
}
