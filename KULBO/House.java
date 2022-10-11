import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class House extends Actor
{
    /**
     * Act - do whatever the Stone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public House(){
        getImage().scale(230,200);
        setImage(getImage());
    }
    public void act()
    {
        collision();
    }
    public void collision(){
        Actor actor = getOneIntersectingObject(Player.class);
        if(actor != null){
            if(actor.getX() < getX() + 100 && actor.getY() < getY() + 75){
                actor.setLocation(actor.getX()+5, actor.getY());
            }
            if(actor.getY() < getY() + 80 && actor.getX() < getX() + 90){
                actor.setLocation(actor.getX(), actor.getY()+5);
            }
        }
    }
    
    
    
    public int upLeftCornerX(){
        return getX()  -  getImage().getWidth();
    }
    public int upLeftCornerY(){
        return getY() -  getImage().getHeight()  ;
    }
    public int rightDownCornerX(){
        return getImage().getWidth() + getX();
    }
    public int rightDownCornerY(){
        return getImage().getHeight() + getY();
    }
    
}
