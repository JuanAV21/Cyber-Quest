import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends menuButton
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animation();
        ChangeWorld(new GameLevelOne());
    }    
    public void animation(){
        if(mouseHoveringOver(this)){
            setImage("STARTHex1.png");
        }
        if(!mouseHoveringOver(this)){
            setImage("STARTHex2.png");
        }
    }
}
