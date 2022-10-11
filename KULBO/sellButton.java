import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sellButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sellButton extends Text
{
    /**
     * Act - do whatever the sellButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage buy1 = new GreenfootImage("sellNormal.png");
    GreenfootImage buy2 = new GreenfootImage("sellHover.png");
    GreenfootImage buy3 = new GreenfootImage("sellBLock.png");
    GreenfootImage pressed = new GreenfootImage("sellPressed.png");
    public sellButton(){
        buy1.scale(60,50);
        buy2.scale(60, 50);
        buy3.scale(60,50);
        pressed.scale(60,50);
        
    }
    public void act()
    {
        mouseClick();
        hoverCheck();
        if(click && Player.slimeBalls > 0){
            Player.coins += Player.slimeBalls*3;
            Player.slimeBalls = 0;
            SelectSound();
        }
        else
         if(click){
            BlockSound();
         }
        if(blockTimer > 0){
            setImage(buy3);
            blockTimer--;
            
        }
    } 
    public int timer = 0 ;
    public boolean click = false;
    boolean redWait = false;
    public void mouseClick(){
        if(Greenfoot.mouseClicked(this)){
            timer = 2;
        }
        if(timer > 0){
            if(Player.coins > 0){
            redWait = false;    
            setImage(pressed);
        }
            else
            if(redWait)
            block();
            click = !click;
            timer--;
        }
        else{
            redWait = true;
            if(tran){
            setImage(buy2);
        }
        else setImage(buy1);
    }
    }
    private boolean tran = false;
    public void hoverCheck(){
        if(Greenfoot.mouseMoved(null)){
            tran = Greenfoot.mouseMoved(this);
        }
        if(Npc.canHit){
            getWorld().removeObject(this);
        }
        
    }
    public int blockTimer = 0;
    public void block(){
        blockTimer = 10;
    }
}
