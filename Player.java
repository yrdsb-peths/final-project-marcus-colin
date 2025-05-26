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
        GreenfootImage myImage = new GreenfootImage("EnemySpaceship.png");
        int myNewHeight = (int)myImage.getHeight()/4;
        int myNewWidth = (int)myImage.getWidth()/4;
        myImage.scale(myNewWidth, myNewHeight);
        setImage(myImage);
    }
    public void act()
    {
        moveAround();
    }
    
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5, getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5, getY());
        }
    }
}
