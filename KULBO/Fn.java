/**
 * Write a description of class Fn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fn  
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Fn
     */
    public Fn()
    {
    }
    public static float distance(int x1, int y1, int x2,int y2){
        return (float)Math.sqrt((Math.pow(x1 - x2, 2) + Math.pow(y1-y2,2)));
    }
    public static float map(float num,float inMin,float inMax ,float outMin, float outMax){
     return (num - inMin) * (outMax - outMin) / (inMax - inMin) + outMin;
    }
    public static Vector moveInDirection(float x1, float y1, float x2, float y2){
        
        Vector plPoz = new Vector(x1,y1);
        Vector position = new Vector(x2,y2);
        Vector aSub = new Vector(1,1);
        aSub.sub(plPoz, position);
        
        return aSub;
    }
     
}
