import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends Actor
{
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Projectile()
    {
        GreenfootImage myImage = new GreenfootImage("vandall.png");
        int myNewHeight = (int)myImage.getHeight()/4;
        int myNewWidth = (int)myImage.getWidth()/6;
        myImage.scale(myNewWidth, myNewHeight);
        setImage(myImage);
    }
    public void act()
    {
        projectileMove();
        removeFromWorld();
    }
    public void projectileMove()
    {
        setLocation(getX(), getY() - 5);
    }
    public void removeFromWorld()
    {
        if (getY() == 0)
        {
            getWorld().removeObject(this);
        }
    }
}
