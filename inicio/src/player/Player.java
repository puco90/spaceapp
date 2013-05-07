/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

/**
 *
 * @author Puco
 */
public class Player {
    private String name; //name of the player;
    private int  energy; // energy left;
    private int coins; // money to use;
    public Player(String name)
    {
        this.name = name;
    }
    public void setName(String name)
    {
        this.name= name;
    }
    public String getName()
    {
        return name;
    }
   public void setCoins(int coins)
   {
       this.coins=coins;
   }
   public int getCoins()
   {
       return coins;
   }
   public int getEnergy()
   {
     return this.energy;
   }
   
   public void setEenergy(int energy)
   {
       this.energy = energy;
   }
  
  public void addCoins(int coins)
  {
      this.coins+=coins;
  }
  
  public void takeCoins(int coins)
  {
      this.coins-=coins;
  }
  
  public void addEnergy(int energy)
  {
      this.energy+=energy;
      
  }
  public void takeEnergy(int energy)
  {
      this.energy-=energy;
  }
         
  
  
  
}
