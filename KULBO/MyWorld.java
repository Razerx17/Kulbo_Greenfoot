import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public static Player player2;
    public static World map1;
    public static World map2;
    public static World map3;
    public static World map4;
    public static World map5;
    public static World TitleScreen;    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1);
        Player.coins = 0;
        Player.wood = 0;
        Player.bombs = 100;
        Player.keys = 1;
        Player.slimeBalls = 0 ;
        World1.passedTrough = true;
        Bridge.built = false;
        prepare();
        World1.trCollected = false;
        World2.trCollected = false;
        Player.stone = 0;
        Player.monsterkey = false;
        Player.HP = 40;
        World3.bridgePass = false;
        Player.isDead = false;
        player2 = new Player();
        map2 = new World2();
        map3 = new World3();
        map4 = new World4();
        map1 = new World1();
        map5 =  new World5();
        
        
        Npc.canHit = true; 
        Bridge.showB = false;
        
    }
    Kulbo kulbo = new Kulbo();
    boolean add = false; 
    private void prepare()
    {
        Play play = new Play();
        

        addObject(kulbo,510,135);
        addObject(play,490,400);
        addObject(new instructiuni(), 510, 500);
        addObject(new Iesi(), 490, 600);
        
    }
    public void act(){
        if(!add){
            TitleScreen = this;
            add = true;
        }
    }
}
