import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameLevelTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameLevelTwo extends World
{

    /**
     * Constructor for objects of class GameLevelTwo.
     * 
     */
    public GameLevelTwo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        setBackground("background 1.png");
        Back back = new Back();
        addObject(back,739,543);
    }
}
