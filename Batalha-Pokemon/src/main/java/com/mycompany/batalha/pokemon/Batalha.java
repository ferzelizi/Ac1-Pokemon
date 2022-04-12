
package com.mycompany.batalha.pokemon;
/**
 *
 * @author Fernanda.Zelizi
 */
public class Batalha 
{
    
    private int meuPokeVida;
    private int advePokeVida;
    private String meuPokeNome;
    private String advePokeNome;
    
    public void meuPoke(String nome, int vida){        
        this.meuPokeVida = vida;
        this.meuPokeNome = nome;        
    }
    
    public void advePoke(String nome, int vida){        
        this.advePokeVida = vida;
        this.advePokeNome = nome;        
    }
    
    public void startBattle()
    {
        
        
        System.out.println("\n");
        System.out.println("Prepare -se, a batalha ira comecar!");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        
        if(meuPokeVida > advePokeVida)
        {
            
            System.out.println("O "+ advePokeNome + " desmaiou, voce venceu a batalha! Parabens! " + meuPokeNome);
            
        }
        else
        {
            
            System.out.println("Seu pokemon desmaiou!Voce perdeu essa batalha, leve o seu "+ meuPokeNome + " ao o centro pokemon mais proximo!"
                    + " O " + advePokeNome + " venceu da batalha!");
           
        }
        
    }
}

    

