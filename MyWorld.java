import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1,false); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Credits credits = new Credits();
        addObject(credits,652,489);
        HowToPlay howToPlay = new HowToPlay();
        addObject(howToPlay,555,357);
        Start start = new Start();
        addObject(start,647,224);
        Title title = new Title();
        addObject(title,394,72);
    }
}
