import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameLevelOne extends World
{
    /**
     * Constructor for objects of class Game.
     * 
     */
    public int minion = 5;
    public GameLevelOne()
    {    
        
        super(800, 600, 1);
        setBackground("background 2.png");
        Back back = new Back();
        addObject(back,739,543);
        
        Character test = new Character();
        addObject(test,566,268);
        
        minion minion = new minion();
        addObject(minion,566,368);
        
        Scientist scientist = new Scientist();
        addObject(scientist,566,468);

        Label label = new Label();
        addObject(label,466,268);
        
        Health health = new Health();
        addObject(health,466,318);
    }
}
