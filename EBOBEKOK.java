import java.util.Scanner;

public class EBOBEKOK {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = inp.nextInt();
        
        System.out.print("n2 sayısını giriniz : ");
        int n2 = inp.nextInt();
        int ebob = 1;
         
        
            //bastan sona dogru doner 
            for (int i = 1; i <= n1; i++){
                if ((n1 % i == 0) && (n2 % i == 0)){
                    ebob = i;
                }
            }
            
            /* // sondan basa dogru doner
             * for (int k = n1; k <= 1; k--){
                    ebob = k;
                 
            }
             */
             
         
            
        /* ekokun baska yazımı
        for (int i = 1; i <= (n1*n2); i++){
            if (i % n1 == 0 && i % n2 == 0){
                System.out.println(i);
                break;
            }
        }*/
        System.out.println("ebob : "+ ebob + "\nekok : "+ (n1 * n2) / ebob);

        inp.close();
    }
}
