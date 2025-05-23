import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Enemy
{
    
    int speed = 2;
    
    public Enemy1()
    {
        setRotation(90);
    }
    public void act()
    {
        moveEnemy();        
    }
     
}
