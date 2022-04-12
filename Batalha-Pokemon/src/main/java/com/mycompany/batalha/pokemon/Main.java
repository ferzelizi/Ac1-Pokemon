package com.mycompany.batalha.pokemon;
/**
 *
 * @author Fernanda.Zelizi
*/
import java.util.Random;

public class Main 
{
    
      public static void main(String[] args) 
      {
        System.out.println("Um pokemon selvagem apareceu..\n");
        System.out.println("e voce nao pode fugir..\n");
       
        Random randomLvl = new Random();
        int mLvl = randomLvl.nextInt(100);
        int adLvl = randomLvl.nextInt(100);
    
        
        Pokemons meuPoke = new Pokemons("Pikachu", "Eletrico", mLvl);
        Pokemons advePoke = new Pokemons("Geodude", "Pedra", adLvl);
        
        Batalha batalha = new Batalha();
               
        System.out.println("Esses sao os atributos do seu pokemon: ");
        meuPoke.dadosPokemon();
        System.out.println("Esses sao os atributos pokemon adiversario:  ");
        advePoke.dadosPokemon();
        
        batalha.meuPoke(meuPoke.getNome(),meuPoke.getVida());
        batalha.advePoke(advePoke.getNome(),advePoke.getVida());
        
        batalha.startBattle();               
      }
}

