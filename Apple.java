import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Apple extends Actor
{
    int speed = 1;
    
    public void act()
    {
        
        
        int x = getX();
        int y = getY() + 2;
        setLocation(getX(), getY() + 1);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
        
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }


}
