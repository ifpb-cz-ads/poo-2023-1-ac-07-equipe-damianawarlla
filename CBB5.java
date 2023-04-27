public class CBB5 {
   
    public static void main(String[]x){
        String [] dias = {"segunda", "terça", "quarta", "quinta", "sexta", "sabado", "domingo"};
        byte contWhile = 0;
        
        System.out.println("imprimindo com o while: ");
        while(contWhile<dias.length){
            System.out.println(dias[contWhile]);
                contWhile++;
        }


            byte contDoWhile =0;
            
            System.out.println("imprimindo com o Do-while: ");
            do{
                System.out.println(dias[contDoWhile]);
                contDoWhile++;
            }while(contDoWhile<dias.length);

            byte contFor;
            
            System.out.println("imprimindo com o For: ");
            for(contFor=0;contFor<dias.length;contFor++){
                System.out.println(dias[contFor]);
            }
        }   
         
}
