import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Warper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public  class Warper extends Actor
{
    /**
     * Act - do whatever the Warper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean passed = false;
    public int map ;
    public static int Timer = 4;
    public Warper(int theWorld){
        GreenfootImage image = new GreenfootImage(5,25);
        setImage(image);
        map = theWorld;   
    }

    
    public void act()
    {   
        reset();
        tp();

    }

    public void tp(){
        List<Player> pl = getObjectsInRange(20, Player.class);
        pl = getObjectsInRange(30, Player.class);
        if(!pl.isEmpty() && passed){
            getWorld().removeObject(MyWorld.player2) ;  
            if(map == 1){
                MyWorld.map1.addObject(MyWorld.player2 ,0, Player.y);
                Greenfoot.setWorld(MyWorld.map1);
            }
            else
            if(map == 2){
                if(getWorld() instanceof World1)
                    MyWorld.map2.addObject(MyWorld.player2 ,1000, Player.y);
                else
                if(getWorld() instanceof World3){
                    MyWorld.map2.addObject(MyWorld.player2 ,Player.x+20,0    );

                }
                else
                    MyWorld.map2.addObject(MyWorld.player2 ,0, Player.y + 200);

                Greenfoot.setWorld(MyWorld.map2);

            }
            else
            if(map == 3){
                MyWorld.map3.addObject(MyWorld.player2 , Player.x - 20 ,580 );  
                Greenfoot.setWorld(MyWorld.map3);
            }
            else
            if(map == 4){
                if(getWorld() instanceof World5){
                    MyWorld.map4.addObject(MyWorld.player2 ,Player.x, getWorld().getHeight());
                }
                else
                    MyWorld.map4.addObject(MyWorld.player2 ,getWorld().getWidth(), Player.y - 200);
                Greenfoot.setWorld(MyWorld.map4);
            }
            else
            if(map == 5){
                MyWorld.map5.addObject(MyWorld.player2 ,Player.x, 0);
                Greenfoot.setWorld(MyWorld.map5);
            }
            Timer = 5;
        }
    }

    public void recalculate(){
        List<Player> l = getObjectsInRange(30, Player.class);
        if(l.isEmpty())
            passed = true;
    }

    public void reset(){
        if(Timer > 0){
            Timer--;
            passed = false;
        }
        else
        if(!passed){
            recalculate();
        }
    }

    
    public float distance(int x1, int y1, int x2,int y2){
        return (float)Math.sqrt((Math.pow(x1 - x2, 2) + Math.pow(y1-y2,2)));
    }

}
