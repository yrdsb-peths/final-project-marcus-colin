import greenfoot.*;

public class MyWorld extends World 
{
    Counter counter = new Counter();
    public MyWorld()
    {
        super(600, 600, 1);
        
        addObject(counter, 100, 50);
        Player player = new Player();
        addObject(player, 252, 510);
        player.setLocation(270, 491);
        player.setLocation(272, 530);
        
        GreenfootImage backgroundImage = new GreenfootImage("spacebg.png");
        setBackground(backgroundImage);

        
    }  
    public Counter getCounter()
    {
        return counter;
    }
    public void act()
    {
          addEnemy1();  
          addEnemy2();
    }
    
    
    public void addEnemy1()
    {
        if(Greenfoot.getRandomNumber(100)<1)
        {
            addObject(new Enemy1(), Greenfoot.getRandomNumber(600), 0);
        }
    }
    public void addEnemy2()
    {
        if(Greenfoot.getRandomNumber(120)<1)
        {
            addObject(new Enemy2(), Greenfoot.getRandomNumber(600), 0);
        }
    }
}
