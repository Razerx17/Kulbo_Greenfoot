import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Treasure here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Treasure extends Actor
{
    /**
     * Act - do whatever the Treasure wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Treasure(){
        getImage().scale(70, 70);
        setImage(getImage());
    }
    public void act(){
        collision();
    }
    public void collision(){
        Actor player;
        player = getOneIntersectingObject(Player.class);
        if(player != null){
            Player.coins += 50;
            World1.trCollected = true;
            Greenfoot.playSound("pickup.wav");
            getWorld().removeObject(this);
        }
    }
    
}
