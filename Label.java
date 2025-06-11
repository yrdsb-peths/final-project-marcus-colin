import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Label extends Actor
{
    private String value;
    private int fontSize;
    private Color lineColor = Color.BLACK;
    private Color fillColor = Color.WHITE;

    public Label(String value, int fontSize)
    {
        this.value = value;
        this.fontSize = fontSize;
        updateImage();
    }

    public void setValue(String value)
    {
        this.value = value;
        updateImage();
    }

    public void setValue(int value)
    {
        this.value = Integer.toString(value);
        updateImage();
    }

    public void setLineColor(Color lineColor)
    {
        this.lineColor = lineColor;
        updateImage();
    }

    public void setFillColor(Color fillColor)
    {
        this.fillColor = fillColor;
        updateImage();
    }

    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(value, fontSize, fillColor, new Color(0, 0, 0, 0), lineColor);
        setImage(image);
    }
}



