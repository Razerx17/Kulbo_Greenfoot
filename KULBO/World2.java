import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends World
{

    /**
     * Constructor for objects of class World2.
     * 
     */
    public HUD_Background hud = new HUD_Background();
    public World2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        prepare();
        
        addObject(new Warper(1), getWidth(), getHeight()/2);
        addObject(new Warper(3), getWidth()/2, 5);   
        addObject(new Warper(4), 0, getHeight()/2);
        
        addObject(hud, getWidth()/2, getHeight()-38);
        hud.added();      
    }
    public static boolean trCollected = false;
    
    
    
    public void act(){
        
        
       
    }
    
    
    private void prepare(){

        
        for(int i = 0 ; i*90 < getWidth();i++){
            addObject(new horizontal_path(), i*90, getHeight()/2+20);
        }
        for(int j = 0 ; j * 90 < getHeight()/2; j++){
            addObject(new VertPath(), getWidth()/2, j * 90);
        }
        addObject(new VertPath(), getWidth()/2, getHeight()/2 - 60);
        Tree1 tree1 = new Tree1();
        addObject(tree1,824,478);
        Tree1 tree12 = new Tree1();
        addObject(tree12,906,438);
        Tree1 tree13 = new Tree1();
        addObject(tree13,919,564);
        Tree1 tree14 = new Tree1();
        addObject(tree14,795,629);
        Tree1 tree15 = new Tree1();
        addObject(tree15,689,456);
        Tree1 tree16 = new Tree1();
        addObject(tree16,521,491);
        Tree1 tree17 = new Tree1();
        addObject(tree17,558,623);
        Tree1 tree18 = new Tree1();
        addObject(tree18,742,564);
        Tree1 tree19 = new Tree1();
        addObject(tree19,593,533);
        Tree1 tree110 = new Tree1();
        addObject(tree110,400,430);
        Tree1 tree111 = new Tree1();
        addObject(tree111,250,495);
        Tree1 tree112 = new Tree1();
        addObject(tree112,39,442);
        Tree1 tree113 = new Tree1();
        addObject(tree113,47,605);
        Tree1 tree114 = new Tree1();
        addObject(tree114,168,449);
        Tree1 tree115 = new Tree1();
        addObject(tree115,151,540);
        Tree1 tree116 = new Tree1();
        addObject(tree116,220,632);
        Tree1 tree117 = new Tree1();
        addObject(tree117,359,485);
        Tree1 tree118 = new Tree1();
        addObject(tree118,342,605);
        Tree1 tree119 = new Tree1();
        addObject(tree119,678,647);
        Tree1 tree120 = new Tree1();
        addObject(tree120,582,428);
        Tree1 tree121 = new Tree1();
        addObject(tree121,428,555);
        Tree1 tree122 = new Tree1();
        addObject(tree122,77,42);
        Tree1 tree123 = new Tree1();
        addObject(tree123,61,184);
        Tree1 tree124 = new Tree1();
        addObject(tree124,175,56);
        Tree1 tree125 = new Tree1();
        addObject(tree125,173,173);
        Tree1 tree126 = new Tree1();
        addObject(tree126,295,42);
        Tree1 tree127 = new Tree1();
        addObject(tree127,318,213);
        Tree1 tree128 = new Tree1();
        addObject(tree128,218,119);
        Tree1 tree129 = new Tree1();
        addObject(tree129,404,107);
        Tree1 tree130 = new Tree1();
        addObject(tree130,394,249);
        Tree1 tree131 = new Tree1();
        addObject(tree131,663,8);
        Tree1 tree132 = new Tree1();
        addObject(tree132,678,211);
        Tree1 tree133 = new Tree1();
        addObject(tree133,804,30);
        Tree1 tree134 = new Tree1();
        addObject(tree134,806,202);
        Tree1 tree135 = new Tree1();
        addObject(tree135,899,44);
        if(!trCollected){
            Treasure2 treasure = new Treasure2();
            addObject(treasure,836,116);
        }
        tree135.setLocation(924,87);
        tree133.setLocation(787,42);
        Tree1 tree136 = new Tree1();
        addObject(tree136,805,85);
        Tree1 tree137 = new Tree1();
        addObject(tree137,881,115);
        Tree1 tree138 = new Tree1();
        addObject(tree138,836,116);
        tree136.setLocation(782,98);
        tree137.setLocation(899,130);
        tree133.setLocation(748,31);
        tree133.setLocation(762,37);
        tree136.setLocation(783,86);
        tree138.setLocation(834,131);
        tree134.setLocation(924,229);
        Tree1 tree139 = new Tree1();
        addObject(tree139,798,196);
        Tree1 tree140 = new Tree1();
        addObject(tree140,698,88);
        Tree1 tree141 = new Tree1();
        addObject(tree141,619,133);
        Tree1 tree142 = new Tree1();
        addObject(tree142,868,271);

        Tree1 tree143 = new Tree1();
        addObject(tree143,217,256);
        Tree1 tree144 = new Tree1();
        addObject(tree144,68,254);
        Tree1 tree145 = new Tree1();
        addObject(tree145,383,17);
        tree121.setLocation(405,514);
        tree142.setLocation(757,243);
        
        
        Sign sign = new Sign("SybilHouse.png");
        addObject(sign,568,203);
        Sign sign2 = new Sign("slimeWorld.png");
        addObject(sign2,314,415);
        addObject(MyWorld.player2, getWidth(), getHeight()/2);
        
    }
    
    
}
