import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CoinsText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoinsText extends Text
{
    /**
     * Act - do whatever the CoinsText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public CoinsText(){
        setImage(new GreenfootImage("Coins: " + Player.coins,24, Color.WHITE, Color.BLACK));
    }
    public void act()
    {
      setImage(new GreenfootImage("Coins: " + Player.coins,24, Color.WHITE, Color.BLACK));
    }
}
