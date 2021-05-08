import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Myworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class Myworld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        setBackground("Game.jpg");
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Character1 character1 = new Character1();
        addObject(character1,154,99);
        character1.setLocation(293,141);
        Fish[] fish = new Fish[8];
        for(int i = 0; i < fish.length; i++)
        {
           fish[i] = new Fish();
           int fishX = Greenfoot.getRandomNumber(getWidth());
           int fishY = Greenfoot.getRandomNumber(getHeight());
           addObject(fish[i],fishX , fishY);
        }
        
    }
}
