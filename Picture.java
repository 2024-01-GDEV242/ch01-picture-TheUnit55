/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square sky;
    private Square sky2;
    private Square sky3;
    private Square grass1;
    private Square trail;
    private Square grass2;
    private Triangle Mount1;
    private Triangle Mount2;
    private Triangle Mount3;
    private Triangle Mount4;
    private Triangle Mount5;
    private Triangle Mount6;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sky = new Square();
        sky2 = new Square();
        sky3 = new Square();
        grass1 = new Square();
        trail = new Square();
        grass2 = new Square();
        Mount1 = new Triangle(); 
        Mount2 = new Triangle();
        Mount3 = new Triangle();
        Mount4 = new Triangle();
        Mount5 = new Triangle();
        Mount6 = new Triangle();
        sun = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.changeColor("light blue");
            sky.moveHorizontal(-310);
            sky.moveVertical(-300);
            sky.changeSize(500);
            sky.makeVisible();
            
            sky2.changeColor("tomato");
            sky2.moveHorizontal(-310);
            sky2.moveVertical(-480);
            sky2.changeSize(500);
            sky2.makeVisible();
            
            sky3.changeColor("coral");
            sky3.moveHorizontal(-310);
            sky3.moveVertical(-550);
            sky3.changeSize(500);
            sky3.makeVisible();
            
            grass1.changeColor("green");
            grass1.moveHorizontal(-310);
            grass1.moveVertical(55);
            grass1.changeSize(500);
            grass1.makeVisible();
            
            trail.changeColor("trail");
            trail.moveHorizontal(-310);
            trail.moveVertical(125);
            trail.changeSize(500);
            trail.makeVisible();
            
            grass2.changeColor("green");
            grass2.moveHorizontal(-310);
            grass2.moveVertical(150);
            grass2.changeSize(500);
            grass2.makeVisible();
            
            Mount1.changeColor("brown");
            Mount1.changeSize(100, 150);
            Mount1.moveHorizontal(10);
            Mount1.moveVertical(-100);
            Mount1.makeVisible();
            
            Mount2.changeColor("brown");
            Mount2.changeSize(100, 150);
            Mount2.moveHorizontal(40);
            Mount2.moveVertical(-100);
            Mount2.makeVisible();
            
            Mount3.changeColor("brown");
            Mount3.changeSize(100, 150);
            Mount3.moveHorizontal(120);
            Mount3.moveVertical(-100);
            Mount3.makeVisible();
            
            Mount4.changeColor("brown");
            Mount4.changeSize(100, 150);
            Mount4.moveHorizontal(150);
            Mount4.moveVertical(-100);
            Mount4.makeVisible();
            
            Mount5.changeColor("brown");
            Mount5.changeSize(120, 200);
            Mount5.moveHorizontal(80);
            Mount5.moveVertical(-120);
            Mount5.makeVisible();
            
            Mount6.changeColor("brown");
            Mount6.changeSize(120, 200);
            Mount6.moveHorizontal(-40);
            Mount6.moveVertical(-120);
            Mount6.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(-190);
            sun.moveVertical(-65);
            sun.changeSize(50);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("black");
        grass1.changeColor("white");
        Mount1.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("red");
        grass1.changeColor("black");
        Mount1.changeColor("green");
        sun.changeColor("yellow");
    }
}
