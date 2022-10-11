import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopyOfMyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CopyOfMyWorld extends World
{
   
    /**
     * Constructor for objects of class CopyOfMyWorld.
     * 
     */
    public static int PlayerHealth = 100;
    public CopyOfMyWorld()
    {    
        
        super(1000, 700, 1); 
        
        
        
        prepare();
        CoinsText coins = new CoinsText();
        addObject(coins , 50,70);
        WoodText text = new WoodText();
        addObject(text, 50,50);
        slimeText slime = new slimeText();
        addObject(slime,65,90);
        

        
        
        
    }
    public static boolean trCollected = false;
    public static int worlds = 0;
    public void loadText(){
        CoinsText coins = new CoinsText();
        addObject(coins , 50,100);
        WoodText text = new WoodText();
        addObject(text, 50,120);
    }
    public void checkPlDeath(){
        if(PlayerHealth < 0){
            
        }
    }
    public void act(){
      
        
        
    }
   
    Treasure treasure;
    Player player2;
    
    public boolean passed = false;
    
    

    private void prepare()
    {
        horizontal_path horizontal_path = new horizontal_path();
        addObject(horizontal_path,40,347);
        horizontal_path horizontal_path1 = new horizontal_path();
        addObject(horizontal_path1,130,350);
        horizontal_path horizontal_path2 = new horizontal_path();
        addObject(horizontal_path2,220,347);
        horizontal_path horizontal_path3 = new horizontal_path();
        addObject(horizontal_path3,310,350);
        horizontal_path horizontal_path4 = new horizontal_path();
        addObject(horizontal_path4,440,347);
        horizontal_path horizontal_path5 = new horizontal_path();
        addObject(horizontal_path5,540,350);

        leftCorner_path leftCorner = new leftCorner_path();
        addObject(leftCorner, 495, 310);
        Corner_path rightCorner = new Corner_path();
        addObject(rightCorner, 580, 310);
        rightCorner_path rightCornerD = new rightCorner_path();
        addObject(rightCornerD , 580, 400);
        leftDown leftDown = new leftDown();
        addObject(leftDown, 500, 400);
        horizontal_path middle = new horizontal_path();
        addObject(middle, 400,350);
        horizontal_path middle2 = new horizontal_path();
        addObject(middle2, 417,350);

        Tree1 tree1 = new Tree1();
        addObject(tree1,700,401);
        Tree1 tree12 = new Tree1();
        addObject(tree12,696,235);
        Tree1 tree13 = new Tree1();
        addObject(tree13,777,288);
        Tree1 tree14 = new Tree1();
        addObject(tree14,906,248);
        Tree1 tree15 = new Tree1();
        addObject(tree15,836,362);
        Tree1 tree16 = new Tree1();
        addObject(tree16,956,294);
        Tree1 tree17 = new Tree1();
        addObject(tree17,935,591);
        Tree1 tree18 = new Tree1();
        addObject(tree18,740,584);
        Tree1 tree19 = new Tree1();
        addObject(tree19,778,474);
        Tree1 tree110 = new Tree1();
        addObject(tree110,859,554);
        Tree1 tree111 = new Tree1();
        addObject(tree111,857,622);
        Tree1 tree112 = new Tree1();
        addObject(tree112,607,598);
        Tree1 tree113 = new Tree1();
        addObject(tree113,645,482);
        Tree1 tree114 = new Tree1();
        addObject(tree114,500,529);
        Tree1 tree115 = new Tree1();
        addObject(tree115,288,485);
        Tree1 tree116 = new Tree1();
        addObject(tree116,382,433);
        Tree1 tree117 = new Tree1();
        addObject(tree117,394,533);
        Tree1 tree118 = new Tree1();
        addObject(tree118,127,490);
        Tree1 tree119 = new Tree1();
        addObject(tree119,59,437);
        Tree1 tree120 = new Tree1();
        addObject(tree120,94,599);
        Tree1 tree121 = new Tree1();
        addObject(tree121,223,464);
        Tree1 tree122 = new Tree1();
        addObject(tree122,283,616);
        Tree1 tree123 = new Tree1();
        addObject(tree123,446,638);
        Tree1 tree124 = new Tree1();
        addObject(tree124,223,218);
        Tree1 tree125 = new Tree1();
        addObject(tree125,381,221);
        Tree1 tree126 = new Tree1();
        addObject(tree126,329,214);
        Tree1 tree127 = new Tree1();
        addObject(tree127,241,114);
        Tree1 tree128 = new Tree1();
        addObject(tree128,67,194);
        Tree1 tree129 = new Tree1();
        addObject(tree129,83,31);
        Tree1 tree130 = new Tree1();
        addObject(tree130,150,149);
        Tree1 tree131 = new Tree1();
        addObject(tree131,205,26);
        Tree1 tree132 = new Tree1();
        addObject(tree132,346,18);
        Tree1 tree133 = new Tree1();
        addObject(tree133,348,97);
        Tree1 tree134 = new Tree1();
        addObject(tree134,494,42);
        Tree1 tree135 = new Tree1();
        addObject(tree135,468,120);
        Tree1 tree136 = new Tree1();
        addObject(tree136,601,32);
        Tree1 tree137 = new Tree1();
        addObject(tree137,535,178);
        Tree1 tree138 = new Tree1();
        addObject(tree138,660,124);
        Tree1 tree139 = new Tree1();
        addObject(tree139,817,116);
        Tree1 tree140 = new Tree1();
        addObject(tree140,718,29);
        Tree1 tree141 = new Tree1();
        addObject(tree141,943,41);
        Tree1 tree142 = new Tree1();
        addObject(tree142,931,132);
        Tree1 tree143 = new Tree1();
        addObject(tree143,847,23);
        Tree1 tree144 = new Tree1();
        addObject(tree144,924,405);
        tree19.setLocation(770,494);
        tree1.setLocation(704,417);
        tree144.setLocation(931,371);
        tree111.setLocation(853,656);
        tree18.setLocation(706,607);
        tree113.setLocation(624,513);
        if(!trCollected){
        Treasure treasure = new Treasure();
        addObject(treasure,936,468);
    }
        tree125.setLocation(409,211);
        player2 = new Player();
    
        
        
        
    }
}
