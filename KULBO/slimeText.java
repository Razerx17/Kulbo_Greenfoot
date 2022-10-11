import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class slimeText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class slimeText extends WoodText
{
    /**
     * Act - do whatever the slimeText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public slimeText(){
        setImage(new GreenfootImage("SlimeBalls: " + (int)Player.slimeBalls, 24, Color.WHITE, Color.BLACK));
    }
    public void act()
    {
       getImage().clear(); 
       setImage(new GreenfootImage("SlimeBalls: " + (int)Player.slimeBalls, 24, Color.WHITE, Color.BLACK));
    }}
