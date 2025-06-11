import greenfoot.*;

public class MyWorld extends World 
{
    HealthBar healthbar = new HealthBar();
    Counter counter = new Counter();
    boolean bossLevel = false;

    public MyWorld()
    {
        super(600, 600, 1);
        
        addObject(counter, 100, 50);
        addObject(healthbar, 250, 50);
        Player player = new Player();
        addObject(player, 272, 530);
        
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
        Boss();
    }

    public HealthBar getHealthBar()
    {
        return healthbar;
    }

    public void Boss()
    {
        if (counter.score == 49 || counter.score == 50)
        {
            if (!bossLevel)
            {
                addObject(new Boss(), 300, 0);
                bossLevel = true;
            }
        }
    }
    
    public void addEnemy1()
    {
        if (Greenfoot.getRandomNumber(50) < 1)
        {
            addObject(new Enemy1(), Greenfoot.getRandomNumber(600), 0);
        }
    }

    public void addEnemy2()
    {
        if (Greenfoot.getRandomNumber(60) < 1)
        {
            addObject(new Enemy2(), Greenfoot.getRandomNumber(600), 0);
        }
    }
}

