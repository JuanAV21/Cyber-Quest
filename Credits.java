import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits extends menuButton
{
    /**
     * Act - do whatever the Credits wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void Credits(){
    GreenfootImage myImage = new GreenfootImage("CreditsHex1.png");
    setImage(myImage);
    }
    public void act() 
    {
        animation();
        ChangeWorld(new CreditsWorld());
    }    
    public void animation(){
        if(mouseHoveringOver(this)){
            setImage("CreditsHex2.png");
        }
        if(!mouseHoveringOver(this)){
            setImage("CreditsHex1.png");
        }
    }
}
