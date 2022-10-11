import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Bridge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bridge extends Actor
{
    /**
     * Act - do whatever the Bridge wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public static boolean mov = false;
    GreenfootImage bridge = new GreenfootImage("bridge.png");
    public static boolean built = false;
    public static boolean showB = false;
    public Bridge(){
        getImage().scale(100,100);
        setImage(getImage());
        bridge.scale(100,100);
       
        
    }
    World3 world = (World3) getWorld();
    public void act()
    {
        plCheck();
        showButton();
    
    }
    
    public void plCheck(){
        World3 world = (World3) getWorld();
        if(!World3.bridgePass){
            getImage().setTransparency(100);
            setImage(getImage());
        }
        else 
           setImage(bridge);
    }
    boolean show = false;
    BuildButton build = new BuildButton();
    public void showButton(){
        List<Player> l = getObjectsInRange(100, Player.class);
        if(!l.isEmpty() && !show && !showB){
            show = true;
            getWorld().addObject(build,850,400);
        }
        else if(l.isEmpty() && show){
            show = false;
            getWorld().removeObject(build);
        }
    }
    
    
    
    
    
    
    
    
    //f(x) : R -> R, f(x) = x * 5 - 2
    
       
    
    public float f(float x)
    {
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
