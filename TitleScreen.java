import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Abithan Pask 
 * @version April 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 380, 1);

        addObject(titleLabel, getWidth()/2, 100);
        prepare();
    }

    /**
     * main world act loop
     */
    public void act()
    {
        //start the game if space pressed
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,353,118);
        elephant.setLocation(467,83);
        elephant.setLocation(485,101);
        Label label = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label,257,191);
        label.setLocation(288,184);
        label.setLocation(269,181);
        Label label2 = new Label("Press <space> to Start", 50);
        addObject(label2,254,237);
        label2.setLocation(273,237);
        label2.setLocation(385,321);
        label.setLocation(316,222);
        label.setLocation(208,223);
        label.setLocation(268,217);
        label2.setLocation(198,297);
        label2.setLocation(302,304);
        label.setLocation(372,228);
        label.setLocation(281,209);
        label.setLocation(266,238);
        label.setLocation(293,247);
        elephant.setLocation(300,204);
        label2.setLocation(311,317);
        label.setLocation(307,274);
        elephant.setLocation(297,211);
        elephant.setLocation(316,193);
    }
}
