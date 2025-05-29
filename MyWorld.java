import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 600, 1);
        
        Player player = new Player();
        addObject(player, 300, 500);
        
        GreenfootImage backgroundImage = new GreenfootImage("spacebg.png");
        setBackground(backgroundImage);

        
    }  
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(60)<1)
        {
          addEnemy1();  
          addEnemy2();
        }
    }
    
    public void addEnemy1()
    {
        addObject(new Enemy1(), Greenfoot.getRandomNumber(600), 0);
    }
    
    public void addEnemy2()
    {
        addObject(new Enemy2(), Greenfoot.getRandomNumber(600), 0);
    }
}
