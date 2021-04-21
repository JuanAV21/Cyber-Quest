import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menuButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menuButton extends Actor
{
    int imageNumber = 0;
    /**
     * Act - do whatever the menuButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */ 
    private Actor actorHoveredOver = null;
    public void act() 
    {
        
    }    
    private void hoverOwner() {
        if ((actorHoveredOver == null || actorHoveredOver.getWorld() == null) && Greenfoot.mouseMoved(this)) {
            actorHoveredOver = this;
        } else if (actorHoveredOver == this && Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)) {
            actorHoveredOver = null;
        }
    }
    public boolean mouseHoveringOver(Actor actor) {
        hoverOwner();
        return actorHoveredOver == actor;
    }
    public void ChangeWorld(World world){
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(world);
        }
    }
}
