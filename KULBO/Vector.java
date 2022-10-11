

public class Vector  
{
    public float x;
    public float y;
    public Vector(float x_, float y_)
    {
        x = x_;
        y = y_;
    }
    public Vector(Vector a, Vector b){
        x = a.x - b.x;
        y = a.y - b.y;
    }
    public float mag(){
        return (float)Math.sqrt(( (x * x) + (y * y) ));
    }
    public void normalize(){
        float tempMag = mag();
        x /= tempMag;
        y /= tempMag;
    }
    public void mult(float value){
        x *= value;
        y *= value;
    }
    public void sub(Vector value){
        x -= value.x;
        y -= value.y;
    }
    public void sub(Vector value1, Vector value2){
        x = value1.x - value2.x;
        y = value1.y - value2.y;
    }
    public void add(Vector vec){
        x += vec.x;
        y += vec.y;
    }
    public void set(Vector value){
        x = value.x;
        y = value.y;
    }
    public void set(float x_, float y_){
        x = x_;
        y = y_;
    }
    
}
