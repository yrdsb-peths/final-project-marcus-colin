import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Player()
    {
        setRotation(270);
    }
    public void act()
    {
        moveAround();
    }
    
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
    }
}
