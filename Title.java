import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends menuButton
{
    /**
     * Act - do whatever the Title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void Title(){
    GreenfootImage myImage = new GreenfootImage("TitleBlue0.png");
    setImage(myImage);
    }
    public void act() 
    {
        animation();
    }    
    public void animation(){
        if(mouseHoveringOver(this)){
            setImage("TitleBlue0.png");
        }
        if(!mouseHoveringOver(this)){
            setImage("TitleGreen0.png");
        }
    }
}
