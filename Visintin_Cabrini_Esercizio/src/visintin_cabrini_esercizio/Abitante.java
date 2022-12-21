package visintin_cabrini_esercizio;

public class Abitante {
    
    private String nome;
    private String cognome;
    private String data_di_nascita;
    private String codice_fiscale;
    
    public Abitante(){}
    
    public Abitante(String nome, String cognome, String codice_fiscale, String data_di_nascita){
    
        this.nome = nome;
        
        this.cognome = cognome;
        
        this.data_di_nascita = data_di_nascita;
        
        this.codice_fiscale = codice_fiscale;       
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getData_di_nascita() {
        return data_di_nascita;
    }

    public void setData_di_nascita(String data_di_nascita) {
        this.data_di_nascita = data_di_nascita;
    }

    public String getCodice_fiscale() {
        return codice_fiscale;
    }

    public void setCodice_fiscale(String codice_fiscale) {
        this.codice_fiscale = codice_fiscale;
    }
    
    
    
}
