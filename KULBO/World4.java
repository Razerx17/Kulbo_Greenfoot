import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World4 extends World
{

    /**
     * Constructor for objects of class World4.
     * 
     */
    public HUD_Background hud = new HUD_Background();
    public World4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        prepare();
        addObject(new Warper(2), getWidth(), 150);
        addObject(new Warper(5), 285, getHeight());
        addObject(hud, getWidth()/2, getHeight()-38);
        hud.added();
        
    }
    Player player2;
   
    public boolean passed = false;

   
    
    public void prepare(){

        for(int i = 4 ; i * 90 <  getWidth(); i++){
            addObject(new horizontal_path(),i * 90, 172 );
        }

        
        for(int i = 3; i* 70 < getHeight() - 50; i++){
            addObject(new VertPath(), 285, i*70+50  );
        }
        leftCorner_path leftCorner_path = new leftCorner_path();
        addObject(leftCorner_path,280,170);

        
        
        Tree1 tree1 = new Tree1();
        addObject(tree1,36,227);
        Tree1 tree12 = new Tree1();
        addObject(tree12,148,204);
        Tree1 tree13 = new Tree1();
        addObject(tree13,56,82);
        Tree1 tree14 = new Tree1();
        addObject(tree14,189,39);
        Tree1 tree15 = new Tree1();
        addObject(tree15,174,126);
        Tree1 tree16 = new Tree1();
        addObject(tree16,379,19);
        Tree1 tree17 = new Tree1();
        addObject(tree17,318,62);
        Tree1 tree18 = new Tree1();
        addObject(tree18,504,37);
        tree18.setLocation(473,83);
        Tree1 tree19 = new Tree1();
        addObject(tree19,473,83);
        Tree1 tree110 = new Tree1();
        addObject(tree110,651,27);
        Tree1 tree111 = new Tree1();
        addObject(tree111,695,82);
        Tree1 tree112 = new Tree1();
        addObject(tree112,814,33);
        Tree1 tree113 = new Tree1();
        addObject(tree113,830,290);
        Tree1 tree114 = new Tree1();
        addObject(tree114,976,268);
        Tree1 tree115 = new Tree1();
        addObject(tree115,495,274);
        Tree1 tree116 = new Tree1();
        addObject(tree116,92,320);
        Tree1 tree117 = new Tree1();
        addObject(tree117,167,286);
        Tree1 tree118 = new Tree1();
        addObject(tree118,143,474);
        Tree1 tree119 = new Tree1();
        addObject(tree119,53,441);
        Tree1 tree120 = new Tree1();
        addObject(tree120,138,374);
        Tree1 tree121 = new Tree1();
        addObject(tree121,64,601);
        Tree1 tree122 = new Tree1();
        addObject(tree122,171,562);
        Tree1 tree123 = new Tree1();
        addObject(tree123,151,636);
        Tree1 tree124 = new Tree1();
        addObject(tree124,393,656);
        Tree1 tree125 = new Tree1();
        addObject(tree125,517,644);
        Tree1 tree126 = new Tree1();
        addObject(tree126,754,652);
        Tree1 tree127 = new Tree1();
        addObject(tree127,895,652);
        Tree1 tree128 = new Tree1();
        addObject(tree128,979,508);
        Tree1 tree129 = new Tree1();
        addObject(tree129,976,371);
        for(int i = 0 ; i < 20; i++){
            Slime slime = new Slime();
            addObject(slime, 330 + Greenfoot.getRandomNumber(570),255 + Greenfoot.getRandomNumber(300)); 
        }
        Tree1 tree130 = new Tree1();
        addObject(tree130,926,229);
        tree113.setLocation(797,271);
        player2 = new Player();
        
        removeObject(tree115);
        removeObject(tree113);
        removeObject(tree130);
    }
}
