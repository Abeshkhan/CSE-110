public class Square
{
    public double height;
    public double width;
    public double area;    
    
    
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double h)
    {
        height=h;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double w)
    {
        width=w;
    }
    public double getArea()
    {
        double area=height*width;
        return area;
    }
        
}