import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Bundan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Bomb
{
    private int timer = 5;
    public Explosion(){
        addedToWorld();
    }
    public void addedToWorld(){
        GreenfootImage image = new GreenfootImage(150,150);
        image.setColor(new Color(255,255,0,150));
        image.fillOval(0,0,image.getWidth()-1, image.getHeight() -1);
        image.fillOval(20,20,image.getWidth()-41, image.getHeight() -41);
        setImage(image);
        timer = 5;
        Greenfoot.playSound("explosion.wav");
        
    }
    
    public void act()
    {
        if ( timer > 0 ) timer--;
        else {
            List<Player> p = getObjectsInRange(150, Player.class);
            List<Slime> s = getObjectsInRange(200, Slime.class);
        if(!p.isEmpty()){
           for(Player a : p){
               Vector aSub = Fn.moveInDirection(a.x, a.y, getX(), getY());
               float dis = Fn.distance(Player.x, Player.y, getX(), getY());
               float value = Fn.map(dis, 150,0, 0, 1);
               aSub.mult(value);
               aSub.mult((float)0.5);
               a.setPosition(aSub);
               a.takeDamage(10);
           }
        }
        if(!s.isEmpty()){
            for(Slime a : s){
                a.death();
            }
        }
        getWorld().removeObject(this);
        }
    }
    
}
