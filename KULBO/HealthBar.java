import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends HUD
{
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage damage0;
    GreenfootImage damage1;
    GreenfootImage damage2;
    GreenfootImage damage3;
    GreenfootImage damage4;
    GreenfootImage damage5;
    public HealthBar(){
        damage0 = new GreenfootImage("fullHealthBar.png");
        damage1 = new GreenfootImage("almostFullHealthBar.png");
        damage2 = new GreenfootImage("halfFullHealthBar.png");
        damage3 = new GreenfootImage("closeEmptyHealthBar.png");
        damage4 = new GreenfootImage("almostEmptyHealthBar.png");
        damage5 = new GreenfootImage("emptyHealthBar.png");
        damage0.scale(250,50);
        damage1.scale(250,50);
        damage2.scale(250,50);
        damage3.scale(250,50);
        damage4.scale(250,50);
        damage5.scale(250,50);
        
        
    }
    public int timer = 0;
    public void act()
    {
       actorHealth();
    }
    public void actorHealth(){
        if(Player.HP == 40){
            setImage(damage0);
        }
        else
        if(Player.HP > 30){
            setImage(damage1);
        }
        else
        if(Player.HP > 20){
            setImage(damage2);
        }
        else
        if(Player.HP > 10){
            setImage(damage3);
        }
        else
        if(Player.HP > 0){
            setImage(damage4);
        }
        else{
        setImage(damage5);
        if(timer == 0){
            Player.isDead = true;
            Greenfoot.playSound("DeathSFX.wav");
        }
        if(timer < 180){
            timer++;
        }
        else
         Greenfoot.setWorld(new GamerOver());
        }
    }
}
