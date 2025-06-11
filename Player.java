import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plane here.
 * 
 * @author (Collin and Marcus) 
 * @version (June 2025
 */
public class Player extends Actor
{
    boolean canFire = true;
    private boolean spaceWasDown = false;
    /**
     * Act - do whatever the Plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Player() //sets player object image
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
        fireProjectile();
    }
    public void moveAround() //movement for the player
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
    
    public void fireProjectile() //function to fire projectiles
    {
        if (Greenfoot.isKeyDown("space") && canFire == true)
        {
            getWorld().addObject(new Projectile(), getX(), getY()-30);
            canFire = false;
        }
        else if (!Greenfoot.isKeyDown("space"))
        {
            canFire = true;
        }
        boolean spaceIsDown = Greenfoot.isKeyDown("space");
        if(spaceIsDown && !spaceWasDown)
        {
            GreenfootSound shootSound = new GreenfootSound("shootsound.wav");
            shootSound.play();
        }
       
    }
    
}
