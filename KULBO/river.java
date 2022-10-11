import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class river here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class river extends Actor
{
    /**
     * Act - do whatever the river wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public river(){
        
    }
    public void act()
    {
       collision();
    }
    
    public void collision(){
        Actor actor = getOneIntersectingObject(Player.class);
        if(actor != null && !World3.passBridge){
            if(actor.getY() < getY() - 100)
              actor.setLocation(actor.getX(), actor.getY()-5);
            else
            if(actor.getY() < getY()+100){
                actor.setLocation(actor.getX(), actor.getY()+5);
            }
            
               
        }
      
        }
    
    }

