import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Minion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class minion extends Actor
{
    int animationCounter = 0;
    private int speed = 1;
    /**
     * Act - do whatever the Minion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public minion(){
      GreenfootImage myImage = new GreenfootImage("idle1.png");
      int myNewHeight =(int)myImage.getHeight()*2;
      int myNewWidth =(int)myImage.getWidth()*2;
      myImage.scale(myNewWidth, myNewHeight);
      setImage(myImage); 
    }
    public void act() 
    {
        move(speed);
        Enemymove();
        die();
        if(animationCounter % 89 == 0){
            EnemyAnimation();
        }
    }
    
    public void Enemymove()
    {
       if (getWorld().getObjects(Character.class).isEmpty()) return; // Skips if there is no hero in the world
       Character test = (Character)getWorld().getObjects(Character.class).get(0); // gets reference to Hero class
       turnTowards(test.getX(), test.getY()); // Move towards the hero
    }
    
    public void EnemyAttack()
    {
        
    }
    
    public void die()
    {
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if(bullet!=null)
        {
           getWorld().removeObject(bullet);
           getWorld().removeObject(this);
        } 
    }
    
    int frame = 1;
    public void EnemyAnimation()
    {
        if(frame == 1)
        {
            setImage("walk"+1+".png");
        }
        else if(frame == 2)
        {
            setImage("walk"+2+".png");
        }
        else if(frame == 3)
        {
            setImage("walk"+3+".png");
        }
        else if(frame == 4)
        {
            setImage("walk"+4+".png");
        }
        else if(frame == 5)
        {
            setImage("walk"+5+".png");
        }
        else if(frame == 6)
        {
            setImage("walk"+6+".png");
        }
        else if(frame == 7)
        {
            setImage("walk"+7+".png");
        }
        else if(frame == 8)
        {
            setImage("walk"+8+".png");
            frame = 1;
        }
        frame ++;
    }
}
