import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlay extends menuButton
{
    /**
     * Act - do whatever the HowToPlay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void HowToPlay(){
    GreenfootImage myImage = new GreenfootImage("HowToPlayHex1.png");
    setImage(myImage);
    }
    public void act() 
    {
        animation();
        ChangeWorld(new Instructions());
    }    
    public void animation(){
        if(mouseHoveringOver(this)){
            setImage("HowToPlayHex2.png");
        }
        if(!mouseHoveringOver(this)){
            setImage("HowToPlayHex1.png");
        }
    }  
}
