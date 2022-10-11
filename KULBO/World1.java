import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World1 extends World
{
   
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public static int PlayerHealth = 100;
    public static boolean passedTrough = false;
    public HUD_Background hud = new HUD_Background();
    public World1()
    {    
        
        super(1000, 700, 1);  
        prepare();
        
        addObject(hud, getWidth()/2, getHeight()-38);
        hud.added();
    }
    public static boolean trCollected = false;
    Treasure treasure;
    private void prepare()
    {

        for(int i = 0 ; i*95 < getWidth() / 2; i++){
            addObject(new horizontal_path(),i*90,350 + 20);
        }
        addObject(new BigPath(), getWidth()/2, 370);


        Tree1 tree1 = new Tree1();
        addObject(tree1,57,29);
        Tree1 tree12 = new Tree1();
        addObject(tree12,66,190);
        Tree1 tree13 = new Tree1();
        addObject(tree13,216,40);
        Tree1 tree14 = new Tree1();
        addObject(tree14,142,102);
        Tree1 tree15 = new Tree1();
        addObject(tree15,69,98);
        Tree1 tree16 = new Tree1();
        addObject(tree16,54,546);
        Tree1 tree17 = new Tree1();
        addObject(tree17,298,428);
        Tree1 tree18 = new Tree1();
        addObject(tree18,128,427);
        Tree1 tree19 = new Tree1();
        addObject(tree19,218,537);
        Tree1 tree110 = new Tree1();
        addObject(tree110,489,548);
        Tree1 tree111 = new Tree1();
        addObject(tree111,256,631);
        Tree1 tree112 = new Tree1();
        addObject(tree112,390,515);
        Tree1 tree113 = new Tree1();
        addObject(tree113,745,433);
        Tree1 tree114 = new Tree1();
        addObject(tree114,607,448);
        Tree1 tree115 = new Tree1();
        addObject(tree115,661,531);
        Tree1 tree116 = new Tree1();
        addObject(tree116,906,422);
        Tree1 tree117 = new Tree1();
        addObject(tree117,976,563);
        Tree1 tree118 = new Tree1();
        addObject(tree118,796,502);
        Tree1 tree119 = new Tree1();
        addObject(tree119,908,517);
        Tree1 tree120 = new Tree1();
        addObject(tree120,502,619);
        Tree1 tree121 = new Tree1();
        addObject(tree121,704,268);
        Tree1 tree122 = new Tree1();
        addObject(tree122,377,159);
        Tree1 tree123 = new Tree1();
        addObject(tree123,296,269);
        Tree1 tree124 = new Tree1();
        addObject(tree124,113,260);
        Tree1 tree125 = new Tree1();
        addObject(tree125,225,133);
        Tree1 tree126 = new Tree1();
        addObject(tree126,272,170);
        Tree1 tree127 = new Tree1();
        addObject(tree127,344,19);
        Tree1 tree128 = new Tree1();
        addObject(tree128,439,12);
        Tree1 tree129 = new Tree1();
        addObject(tree129,481,151);
        Tree1 tree130 = new Tree1();
        addObject(tree130,659,17);
        Tree1 tree131 = new Tree1();
        addObject(tree131,612,151);
        Tree1 tree132 = new Tree1();
        addObject(tree132,839,62);
        Tree1 tree133 = new Tree1();
        addObject(tree133,535,46);
        Tree1 tree134 = new Tree1();
        addObject(tree134,767,127);
        Tree1 tree135 = new Tree1();
        addObject(tree135,874,180);
        Tree1 tree136 = new Tree1();
        addObject(tree136,951,30);
        Tree1 tree137 = new Tree1();
        addObject(tree137,978,233);
        Tree1 tree138 = new Tree1();
        addObject(tree138,860,283);
        Tree1 tree139 = new Tree1();
        addObject(tree139,693,91);
        Treasure treasure = new Treasure();
        addObject(treasure,595,78);
        treasure.setLocation(618,76);
        Treasure2 treasure2 = new Treasure2();
        addObject(treasure2,801,188);
        tree134.setLocation(789,190);
        removeObject(treasure2);
        treasure.setLocation(930,121);
        addObject(new Warper(2) , 0, 350 +20);
        
        tree111.setLocation(303,523);
        tree120.setLocation(597,551);
        
    }
}
