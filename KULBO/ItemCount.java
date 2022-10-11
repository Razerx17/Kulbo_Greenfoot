import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ItemCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ItemCount extends HUD
{
    /**
     * Act - do whatever the ItemCount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public ItemCount(){
        GreenfootImage image = new GreenfootImage(100,40);
        setImage(image);
        
    }
    public void update(int value){
         
         
         GreenfootImage tempImg = new GreenfootImage(100,40) ;
         tempImg.drawImage(new GreenfootImage(""+value, 24, Color.WHITE, null), 20, 10);
         setImage(tempImg);
        
         
    }
    
}
