import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class SlimeBall extends Actor
{
    
    /**
     * Act - do whatever the coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage bronze;
    public SlimeBall(){
        bronze = new GreenfootImage("Slimeball.png");
        bronze.scale(20,20);
        setImage(bronze);
        
        addedToWorld();
    }
    int vx,vy,rot;
    public void addedToWorld(){
        vx=-10 + Greenfoot.getRandomNumber(20);
        vy=-10 + Greenfoot.getRandomNumber(20);
        rot=-10 + Greenfoot.getRandomNumber(20);
        if(vx == 0) vx=1;
        if(vy == 0) vy=1;
    }
    
    public void act()
    {
        setLocation(getX()+vx, getY() + vy);
        
        if(vx > 0){
            vx--;
        }
        if(vx < 0){
            vx++;
        }
        if(vy > 0){
            vy--;
        }
        if(vy < 0){
            vy++;
        }
        if(vx < 2 && vx > -2){
            vx = 0;
        }
        if(vy < 2 && vy > -2){
            vy = 0;
        }
    
     plCheck();
    }
    
    public void plCheck(){
        List<Player> l = getObjectsInRange(30, Player.class);
        if(!l.isEmpty()){
            for(Player a: l){
                Player.slimeBalls += 1;
            
                getWorld().removeObject(this);
                
            }
        }
       
    }
}
