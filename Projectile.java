import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (Collin and Marcus) 
 * @version (June 2025)
 */

public class Projectile extends Actor
{
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Projectile()
    {
        //sets image for the projectiles used from the player
        GreenfootImage myImage = new GreenfootImage("vandall.png");
        int myNewHeight = (int)myImage.getHeight()/4;
        int myNewWidth = (int)myImage.getWidth()/8;
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
    public void removeFromWorld() //removes projectiles when it reaches top of the canvas
    {
        if (getY() == 0)
        {
            getWorld().removeObject(this);
        }
    }
}
