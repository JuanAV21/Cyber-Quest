import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class minion2 extends Actor
{
    int rightside;
    int bottom;
    public void addworld(World screen)
    {
      rightside = screen.getWidth() -1;
      bottom = screen.getHeight() - 1;
    }
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(10);
        if(Greenfoot.getRandomNumber(30)==1);
        {
        setRotation(Greenfoot.getRandomNumber(360));
        }
        int x = getX();
        int y = getY();
        if(x <= 0 || y >= 0 || x >= rightside || y >= bottom)
        {
          turn(180);
        }
        
        
    }    
}
