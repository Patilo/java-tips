
/**
 *
 * @author Patilo
 */
public class ifelseelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Integer diasHastaFinSemana = 0;
        int dia = 0;
        if (dia > 1 && dia < 7) {
         if (dia < 6) {
        diasHastaFinSemana++;
        if (dia < 5) {
            diasHastaFinSemana++;
            if (dia < 4) {
                diasHastaFinSemana++;
                if (dia < 3) {
                    diasHastaFinSemana++;
                }
            }
        }
    }           
    System.out.println("Dia laboral: Dias restantes hasta el fin de semana: " + diasHastaFinSemana);
} else if (dia == 1 || dia == 7) {
    System.out.println("Fin de semana");
} else {
    System.out.println("La semana solo tiene 7 dias");
}
    }
    
}

