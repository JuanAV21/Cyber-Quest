import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends menuButton
{
    public static int cnt;
    
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void Back(){
    setImage("button-blue.png");
    }
    public void act() 
    {
        if (greenfoot.Greenfoot.isKeyDown("space")){
            cnt++;
        }
        ChangeWorld(new MyWorld());
    }    
}
