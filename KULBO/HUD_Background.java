import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class HUD_Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HUD_Background extends HUD
{
    /**
     * Act - do whatever the HUD_Background wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HUD_Background(){
        GreenfootImage outline = new GreenfootImage(1020,5);
        outline.setColor(new Color(72,47,1));
        outline.fillRect(0, 0, 1020, 5);
        GreenfootImage image = new GreenfootImage(1020,95);
        image.setColor(new Color(181,165,138));
        image.fillRect(0, 5, 1020, 80);
        image.setTransparency(230);
        image.drawImage(outline, 0, 0);

        setImage(image);
        
        
    }
    
    public void added(){
        for(int i = 50; i < getWorld().getWidth() - 250 ;i+=90){
            getWorld().addObject(new InventorySlot(), i, getWorld().getHeight()-40);
        }
        getWorld().addObject(new CoinCount(), 50, getWorld().getHeight()-40);
        getWorld().addObject(new HealthBar(), 850, getWorld().getHeight()-40); 
        getWorld().addObject(new WoodCount(), 140, getWorld().getHeight()-37);
        getWorld().addObject(new BombCount(), 230, getWorld().getHeight()-40);
        getWorld().addObject(new SlimeBallCount(), 320, getWorld().getHeight()-40);
        getWorld().addObject(new KeyCount(), 410, getWorld().getHeight()-40);
        
    }
    
    public void act()
    {
        List<Player> l = getObjectsInRange(2000, Player.class);
        
        if(!l.isEmpty()){
           for(Player a : l){
               if(a.getY() > 580){
             MyWorld.player2.setLocation(Player.x, 580);
           }
        }
            
        }
        
    }
}
