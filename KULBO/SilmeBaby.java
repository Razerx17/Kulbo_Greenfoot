import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SilmeBaby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SilmeBaby extends Actor
{
    /**
     * Act - do whatever the SilmeBaby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage fuck; 
    public SilmeBaby(){
     fuck = new GreenfootImage("slimeNormal.png");   
     fuck.scale(50,50);
     setImage(fuck);
    
    }
    public int timer = 0;
    public boolean tpd = false;
    public void act()
    {
        setImage(fuck);
        if(!tpd){
            setLocation(Greenfoot.getRandomNumber(700) + 285, Greenfoot.getRandomNumber(380) + 200);
            tpd = true;
        }
        if(timer < 255){
        timer++;
        getImage().setTransparency(timer);
        setImage(getImage());
    }
    else
        death();
    }
    public void death(){
        getWorld().addObject(new Slime(), getX(),  getY());
        getWorld().removeObject(this);
    }
}
