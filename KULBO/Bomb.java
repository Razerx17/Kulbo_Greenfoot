import greenfoot.*;
import java.util.List;
  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage lit;
    GreenfootImage notlit;
    public Bomb(){
        lit = new GreenfootImage("bomb.png");
        notlit = new GreenfootImage("litBomb.png");
        lit.scale(28,28);
        notlit.scale(28,28);
        setImage(lit);
    }
    MouseInfo mouse = Greenfoot.getMouseInfo();
    public void act()
    {
        explode();
        
    }
    int time = 150;
    public boolean timer(){
      time--;
      setImage(lit);
      if(time < 180 && time > 160){
          setImage(notlit);
      }
      else
      if(time < 140 && time > 120){
          setImage(notlit);
      }
      else
      if(time < 100 && time > 80){
          setImage(notlit);
      }
      else
      if(time < 60 && time > 40){
          setImage(notlit);
      }
      if(time == 0 ){ 
      return true;
         
       }
      else return false;
    }
    public void explode(){
        List<Trees> l = getObjectsInRange(100, Trees.class);
        if(!l.isEmpty() && timer()){
            for(Trees a : l){
                a.destroy();
            }
            Explosion explosion = new Explosion();
                getWorld().addObject(explosion, getX(), getY());
            getWorld().removeObject(this);
        
        }
        if(l.isEmpty() && timer()){
            
            Explosion explosion = new Explosion();
            getWorld().addObject(explosion, getX(), getY());
            getWorld().removeObject(this);
        }
        
    }
}
