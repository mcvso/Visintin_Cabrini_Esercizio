package visintin_cabrini_esercizio;

import java.util.Scanner;

public class Visintin_Cabrini_Esercizio {

    public static void main(String[] args) {
        
        
            
    Scanner input = new Scanner(System.in);
    
    String nome;
    String cognome;   
    String codice_fiscale;
    String data_di_nascita;
    
    Abitante[] abitante = new Abitante[3];
    
    for(int i = 0; i < 3; i++){
    
        System.out.println("Inserire il nome del " + (i + 1) + "° abitante: ");
        nome = input.nextLine();
        
        System.out.println("Inserire il cognome del " + (i + 1) + "° abitante: ");
        cognome = input.nextLine();
        
        System.out.println("Inserire il codice fiscale del " + (i + 1) + "° abitante: ");
        codice_fiscale = input.nextLine();
        
        System.out.println("Inserire la data di nascita del " + (i + 1) + "° abitante: ");
        data_di_nascita = input.nextLine();
        
        abitante[i].setNome(nome);
        abitante[i].setCognome(cognome);
        abitante[i].setData_di_nascita(data_di_nascita);
        abitante[i].setCodice_fiscale(codice_fiscale);
        
    }
        
        System.out.println(abitante[0].toString());
        System.out.println(abitante[1].toString());
        System.out.println(abitante[2].toString());
        
    
    }
    
}
