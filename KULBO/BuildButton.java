import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BuildButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuildButton extends Buttons
{
    /**
     * Act - do whatever the BuildButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BuildButton(){
        if(Player.keys > 0){
            setImage("buildButtonKey.png");
        }
        
        if(Player.wood > 149){
            setImage("buildButtonWood.png");
        }
        if(Player.wood > 149 && Player.keys > 0){
            setImage("buildButtonBoth.png");
        }
        getImage().scale(70,50);
        setImage(getImage());
        
    }
    public int lel = 0;
    public void act()
    {
        plCheck();
        checkMouse();
        if(Greenfoot.mousePressed(this)){
           lel = 4;
        }
        if(lel > 0){
         getImage().setTransparency(255);
            setImage(getImage());
            lel--;
        }
        if(World3.passBridge){
            getWorld().removeObject(this);
        }
        
    }
    public void plCheck(){
    if(!World3.bridgePass && Greenfoot.mousePressed(this) && Player.wood > 149 && Player.keys > 0){
        World3.bridgePass = true;
        Bridge.showB = true;
        Player.wood -= 150;
        Player.keys -= 1;
    }
}
}
