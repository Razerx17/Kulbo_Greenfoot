import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Iesi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Iesi extends Buttons
{
    /**
     * Act - do whatever the Iesi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img = new GreenfootImage("darkerGrass.png") ;
    public Iesi(){
      img.scale(getImage().getWidth()+40, getImage().getHeight()+10);
      getImage().scale(getImage().getWidth()+40, getImage().getHeight()+10);
      setImage(getImage());
    
    }
    public void act()
    {
        checkMouse();
        if(Greenfoot.mouseClicked(this)){
            setImage(img);
            Greenfoot.stop();
        }
       
        
    }
}
