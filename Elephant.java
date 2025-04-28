import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, our hero.
 * 
 * @author Abithan Paskaranathan
 * @version April 2025
 */
public class Elephant extends Actor
{
    public void act()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move(-4);
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            move(4);
        }
        
        eat();
    }
    
    /**
     * Eat the apple and spawn apple if an apple is eaten
     */
    public void eat()
    {
        if (isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
        }
    }
}
