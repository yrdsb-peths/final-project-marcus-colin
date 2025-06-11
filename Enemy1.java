import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author (Marcus and Collin) 
 * @version (June 2025)
 */
public class Enemy1 extends Enemy
{
    
    int speed = 500; // speed for enemy 1
    
    public Enemy1()
    {
        GreenfootImage myImage = new GreenfootImage("5454-valorant-jett-icon.png"); // set image 
        int myNewHeight = (int)myImage.getHeight()/4;
        int myNewWidth = (int)myImage.getWidth()/3;
        myImage.scale(myNewWidth, myNewHeight);
        setImage(myImage);
    }
    public void act()
    {
        moveEnemy();
        hitByProjectile();
    }
    
    public void hitByProjectile() // projectile hit registration
    {
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if (projectile != null)
        {
            getWorld().removeObject(projectile);
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
        }
        else if (getY() == 599) // lose health if enemy reaches end of canvas
        {
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            HealthBar healthbar = myWorld.getHealthBar();
            healthbar.loseHealth();
            healthbar.loseHealth();
            healthbar.loseHealth();
            healthbar.loseHealth();
            healthbar.loseHealth();
            getWorld().removeObject(this);
        }
    }
     
}
