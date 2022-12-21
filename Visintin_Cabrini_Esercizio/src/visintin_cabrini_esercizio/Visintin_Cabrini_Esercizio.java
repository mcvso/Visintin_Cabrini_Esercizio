package visintin_cabrini_esercizio;

import java.util.Scanner;

public class Visintin_Cabrini_Esercizio {

    public static void main(String[] args) {
        
        String nome;
        float estensione;
        Scanner input=new Scanner(System.in);
        
        
        System.out.println("inserire il nome della città");
        nome=input.nextLine();
        System.out.println("inserire l'estensione della città");
        estensione=input.nextFloat();
        Citta citta=new Citta(nome,estensione);
        
        System.out.println(citta.toString());
        
        
    }
    
}
