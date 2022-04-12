
package com.mycompany.batalha.pokemon;

/**
 *
 * @author Fernanda.Zelizi
 */

public class Pokemons
{
    private String nome;
    private String tipo;
    private int level;
    private int vida = 180;
    private int ataque;
    private int defesa;    

    public Pokemons(String nome, String tipo, int level)
    {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
                
        calculaAtributos();
        calcular2();
        
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

   
    private void calculaAtributos()
    {
        switch(tipo){
            case "Agua":
                vida = vida - 7;
                ataque = 50;
                defesa = 21;
            break;
            
            case "Fogo":
                vida = vida - 15;
                ataque = 70;
                defesa = 40;
            break;
            
            case "Eletrico":
                vida = vida + 10;
                ataque = 18;
                defesa = 35;
            break;
            
            case "Pedra":
                vida = vida + 23;
                ataque = 35;
                defesa = 55;
            break;
        }
    }
    
    private void calcular2(){
        
        vida = vida + (level / 2);
        ataque = ataque + (level / 3);
        defesa = defesa + (level / 3);
        
    }   
       
    public void dadosPokemon()
    {
        
        System.out.println( "Nome: " + nome + "\n" + 
                            "Tipo: " + tipo + "\n" + 
                            "Level: " + level + "\n" + 
                            "Vida: " + vida + "\n" +
                            "Ataque: " + ataque + "\n" +
                            "Defesa: " + defesa + "\n");
       
    }   

   
}
    

