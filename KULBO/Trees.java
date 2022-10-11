import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trees here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trees extends Actor
{
    /**
     * Act - do whatever the Trees wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int num;
    public void countAdd(){
        num++;
    }
      
    
    public void act()
    {
        if(toRemove){
            getWorld().removeObject(this);
        }
    }
    public boolean toRemove = false;
    public void destroy(){
        for(int i = 0 ; i < 20; i++){
            int px =-20 + Greenfoot.getRandomNumber(40);
            int py =-20 + Greenfoot.getRandomNumber(40);
            GreenfootImage lmg = getImage();
            setImage("Log.png");
            getWorld().addObject(new Pieces(getImage()), getX() + px, getY() + py);
            setImage(lmg);
        }
        
        getWorld().removeObject(this);
    }   

}
    
 
 
  


