/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visintin_cabrini_esercizio;

/**
 *
 * @author 4ib
 */
public class Citta {
    private String nome;
    private float estensione;
    Abitante[] abitanti=new Abitante[3];
    

    
    public Citta(){}
    public Citta(String nome, float estensione) {
        this.nome = nome;
        this.estensione = estensione;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getEstensione() {
        return estensione;
    }

    public void setEstensione(float estensione) {
        this.estensione = estensione;
    }

    public Abitante[] getAbitanti() {
        return abitanti;
    }

    public void setAbitanti(Abitante[] abitanti) {
        this.abitanti = abitanti;
    }

   
    
    
    
    
}
