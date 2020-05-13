import javax.swing.JOptionPane;
/** 
 * Shapes Class, allows the user to calculate area and volume
 * for an assortment of 2D and 3D shapes. 
 * @author Cameron Russell
 *
 */
public class Shapes 
{
	public static void main(String[] args)
	{
		try {
		int AorV, Areachosen, Volumechosen;
		String value;
		
	// Gives the user the option to calculate area or volume.
		value = JOptionPane.showInputDialog("1 - Area\n2 - Volume\nEnter your choice.");
		AorV = Integer.parseInt(value);
		if(AorV == 1) 
		{
		
	// Gives the user options for area shapes.
		
		value = JOptionPane.showInputDialog("1 - Triangle Area\n2 - Parallelogram Area\n"
				+ "3 - Rectangle Area\n4 - Trapezoid Area\n5 - Circle Area\n"
				+ "Enter Your Figure Number.");
		Areachosen = Integer.parseInt(value);
			
	//Switch statement to retrieve area data for a specified shape.
		switch (Areachosen)
		{
		case 1: 
			Triangle Tri = new Triangle();
			Tri.setBase(Double.parseDouble(JOptionPane.showInputDialog("Enter the base of the Triangle.")));
			Tri.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the Triangle.")));
			Tri.showTriangle();
			break;
		case 2: 
			Parallelogram Par = new Parallelogram();
			Par.setBase1(Double.parseDouble(JOptionPane.showInputDialog("Enter the base of the Parallelogram.")));
			Par.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the Parallelogram.")));
			Par.showParallelogram();
			break;
		case 3: 
			Parallelogram Rect = new Parallelogram();
			Rect.setLength(Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the Rectangle.")));
			Rect.setWidth(Double.parseDouble(JOptionPane.showInputDialog("Enter the width of the Rectangle.")));
			Rect.showRectangle();
			break;
		case 4: 
			Parallelogram Trap = new Parallelogram();
			Trap.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the Trapezoid.")));
			Trap.setBase1(Double.parseDouble(JOptionPane.showInputDialog("Enter the bottom base of the Trapezoid.")));
			Trap.setBase2(Double.parseDouble(JOptionPane.showInputDialog("Enter the top base of the Trapezoid.")));
			Trap.showTrapezoid();
			break;
		case 5: 
			Circle Circ = new Circle();
			Circ.setRadius(Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the Circle.")));
			Circ.showCircle();
			break;
		}
		
	/////////////////////
		// Gives the user options for volume.
		}
		else if(AorV == 2) {
			
		value = JOptionPane.showInputDialog("1 - Cone Volume\n2 - Cylinder Volume\n"
					+ "3 - Rectangular Prism Volume\n4 - Trapezoid Prism Volume\n5 - Sphere Volume\n"
					+ "Enter Your Figure Number.");
		Volumechosen = Integer.parseInt(value);
		
		//Switch statement to retrieve volume data for a specified shape.

		switch (Volumechosen)
		{
		case 1: 
			Triangle Cone = new Triangle();
			Cone.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the Cone.")));
			Cone.setRadius(Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the Cone.")));
			Cone.showCone();
			break;
		case 2:  
			Circle Cylinder = new Circle();
			Cylinder.setRadius(Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the Cylinder.")));
			Cylinder.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the Cylinder.")));
			Cylinder.showCylinder();
			break;
		case 3: 
			Parallelogram RectPrism = new Parallelogram();
			RectPrism.setLength(Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the Rectanglar Prism.")));
			RectPrism.setWidth(Double.parseDouble(JOptionPane.showInputDialog("Enter the width of the Rectanglar Prism.")));
			RectPrism.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the Rectanglar Prism.")));
			RectPrism.showRectPrism();
			break;
		case 4: 
			Parallelogram TrapPrism = new Parallelogram();
			TrapPrism.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the Trapezoid Prism.")));
			TrapPrism.setBase1(Double.parseDouble(JOptionPane.showInputDialog("Enter the bottom base of the Trapezoid Prism.")));
			TrapPrism.setBase2(Double.parseDouble(JOptionPane.showInputDialog("Enter the top base of the Trapezoid Prism.")));
			TrapPrism.setLength(Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the Trapezoid Prism.")));
			TrapPrism.showTrapPrism();
			break;
		case 5: 
			Circle Sphere = new Circle();
			Sphere.setRadius(Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the Sphere.")));
			Sphere.showSphere();
			break;
		}
		}
	}
		//Catches exceptions with a general error message.
		catch (Exception e){
			JOptionPane.showMessageDialog(null, "Something went wrong!"
					+ "\nPlease try again!");
		}
	}
}

/**
 * Triangle Class, provides methods for calculating area 
 * and volume for triangles and cones. 
 * @author Cameron Russell
 *
 */
class Triangle   
{
    private double  base  = 0.0;
    private double  height = 0.0;
    private double radius = 0.0;
    
    /**
     * The setBase method stores a value in the base field. 
     * @param b : The value to store in base.
     */
    public void setBase (double b) 
    {
    	while(b == 0)
    	{
    		String x = JOptionPane.showInputDialog("Since shapes can't have measurements of 0, reenter a value.");
    		b = Double.parseDouble(x);
    	}
    	if(b < 1)
    	{
    		JOptionPane.showMessageDialog(null, "Since shapes can't have negative measurements, this program assumes " + b +
    				" was meant to be postitive.");
    		b = Math.abs(b);
    	}
        base = b;
    }
    
    /**
     * The setHeight method stores a value in the height field. 
     * @param h : The value to store in height. 
     */
    public void setHeight (double h) 
    {
    	while(h == 0)
    	{
    		String x = JOptionPane.showInputDialog("Since shapes can't have measurements of 0, reenter a value.");
    		h = Double.parseDouble(x);
    	}
    	if(h < 1)
    	{
    		JOptionPane.showMessageDialog(null, "Since shapes can't have negative measurements, this program assumes " + h +
    				" was meant to be postitive.");
    		h = Math.abs(h);
    	}
        height = h;
    }
    
    /**
     * The setRadius method stores a value in the radius field. 
     * @param r : The value to store in radius. 
     */
    public void setRadius (double r)
    {
    	while(r == 0)
    	{
    		String x = JOptionPane.showInputDialog("Since shapes can't have measurements of 0, reenter a value.");
    		r = Double.parseDouble(x);
    	}
    	if(r < 1)
    	{
    		JOptionPane.showMessageDialog(null, "Since shapes can't have negative measurements, this program assumes " + r +
    				" was meant to be postitive.");
    		r = Math.abs(r);
    	}
    	radius = r;
    }
    
    /**
     * The getBase method returns a Triangle object's base. 
     * @return The Triangle object's base. 
     */
    public double getBase () 
    {
        return base;
    }
    
    /**
     * The getHeight method returns a Triangle object's height. 
     * @return The Triangle object's height. 
     */
    public double getHeight () 
    {
        return base;
    }
    
    /**
     * The getRadius method returns a Triangle object's radius. 
     * @return The Triangle object's radius. 
     */
    public double getRadius ()
    {
    	return radius;
    }
    
    /**
     * The getArea method calculates and returns a Triangle object's area. 
     * @return The Triangle object's area.
     */
    public double getArea () 
    {
        return base * height / 2.0;
    }
    
    /**
     * The getVolume method calculates and returns a Triangle object's volume.
     * @return The Triangle object's volume.
     */
    public double getVolume ()
    {
    	return (1.0 / 3.0) * Math.PI * (radius * radius) * height;
    }
    
    /**
     * The showTriangle method displays a summarization of a Triangle object's attributes and area calculation.
     * Used specifically for Triangle objects representing 2D triangles.
     */
    public void showTriangle()
    {
    	JOptionPane.showMessageDialog(null, "The area of the triangle with a base of " + getBase() + " and a height of "
    			+ getHeight() + " = " + getArea());
    }
    
    /**
     * The showCone method displays a summarization of a Triangle object's attributes and volume calculation.
     * Used specifically for Triangle objects representing 3D cones. 
     */
    public void showCone()
    {
    	JOptionPane.showMessageDialog(null, "The volume of the cone with a height of "
    			+ getHeight() + " and a radius of " + getRadius() +" = " + getVolume());
    }
}

/**
 * Circle class, provides methods for calculating area
 * and volume for circles, spheres, and cylinders. 
 * @author Cameron Russell
 *
 */
class Circle
{
	private double radius = 0.0;
	private double height = 0.0;
	
	/**
	 * The setRadius method stores a value in the radius field.
	 * @param r : The value to store in radius.
	 */
	public void setRadius (double r)
	{
		while(r == 0)
    	{
    		String x = JOptionPane.showInputDialog("Since shapes can't have measurements of 0, reenter a value.");
    		r = Double.parseDouble(x);
    	}
		if(r < 1)
    	{
    		JOptionPane.showMessageDialog(null, "Since shapes can't have negative measurements, this program assumes " + r +
    				" was meant to be postitive.");
    		r = Math.abs(r);
    	}
		radius = r;
	}
	
	/**
	 * The setHeight method stores a value in the height field.
	 * @param h : The value to store in height.
	 */
	public void setHeight (double h)
	{
		while(h == 0)
    	{
    		String x = JOptionPane.showInputDialog("Since shapes can't have measurements of 0, reenter a value.");
    		h = Double.parseDouble(x);
    	}
		if(h < 1)
    	{
    		JOptionPane.showMessageDialog(null, "Since shapes can't have negative measurements, this program assumes " + h +
    				" was meant to be postitive.");
    		h = Math.abs(h);
    	}
		height = h;
	}
	
	/**
	 * The getRadius method returns a Circle object's radius.
	 * @return The Circle object's radius.
	 */
	public double getRadius ()
	{
		return radius;
	}
	
	/**
	 * The getHeight method returns a Circle object's height.
	 * @return The Circle object's height.
	 */
	public double getHeight ()
	{
		return height;
	}
	
	/**
	 * The getCircle method calculates and returns a Circle object's area.
	 * Used specifically for Circle objects representing 2D circles.
	 * @return The Circle object's area.
	 */
	public double getCircle ()
	{
		return Math.PI * (radius * radius);
	}
	
	/**
	 * The getCylinder method calculates and returns a Circle object's volume. 
	 * Used specifically for Circle objects representing 3D cylinders.
	 * @return The Circle object's volume.
	 */
	public double getCylinder ()
	{
		return Math.PI * (radius * radius) * height;
	}
	
	/**
	 * The getSphere method calculates and returns a Circle object's volume.
	 * Used specifically for Circle objects representing 3D Spheres.
	 * @return The Circle object's volume.
	 */
	public double getSphere ()
	{
		return (4.0 / 3.0) * Math.PI * (radius * radius * radius);
	}
	
	/**
	 * The showCircle method displays a summarization of a Circle object's attributes and area calculation.
	 * Used specifically for Circle objects representing 2D circles. 
	 */
	public void showCircle()
	{
		JOptionPane.showMessageDialog(null, "The area of the circle with a radius of "
    			+ getRadius() + " = " + getCircle());
	}
	
	/**
	 * The showCylinder method displays a summarization of a Circle object's attributes and volume calculation.
	 * Used specifically for Circle objects representing 3D cylinders.
	 */
	public void showCylinder ()
	{
		JOptionPane.showMessageDialog(null, "The volume of the cylinder with a height of "
    			+ getHeight() + " and a radius of " + getRadius() +" = " + getCylinder());
	}
	
	/**
	 * The showSphere method displays a summarization of a Circle object's attributes and volume calculation.
	 * Used specifically for Circle objects representing 3D spheres.
	 */
	public void showSphere () 
	{
		JOptionPane.showMessageDialog(null, "The volume of the sphere with a radius of " 
				+ getRadius() +" = " + getSphere());
	}
}

/**
 * Parallelogram class, provides methods for calculating 
 * parallelograms, rectangles, trapezoids, rectangular prisms, 
 * and trapezoid prisms. 
 * @author Cameron Russell
 *
 */
class Parallelogram
{
	private double base1;
	private double base2;
	private double height;
	private double width;
	private double length;
	
	/**
	 * The setBase1 method stores a value in the base1 field.
	 * @param b1 : The value to store in base1.
	 */
	public void setBase1 (double b1)
	{
		while(b1 == 0)
    	{
    		String x = JOptionPane.showInputDialog("Since shapes can't have measurements of 0, reenter a value.");
    		b1 = Double.parseDouble(x);
    	}
		if(b1 < 1)
    	{
    		JOptionPane.showMessageDialog(null, "Since shapes can't have negative measurements, this program assumes " + b1 +
    				" was meant to be postitive.");
    		b1 = Math.abs(b1);
    	}
		base1 = b1;
	}
	
	/**
	 * The setBase2 method stores a value in the base2 field.
	 * @param b2 : The value to store in base2.
	 */
	public void setBase2 (double b2)
	{
		while(b2 == 0)
    	{
    		String x = JOptionPane.showInputDialog("Since shapes can't have measurements of 0, reenter a value.");
    		b2 = Double.parseDouble(x);
    	}
		if(b2 < 1)
    	{
    		JOptionPane.showMessageDialog(null, "Since shapes can't have negative measurements, this program assumes " + b2 +
    				" was meant to be postitive.");
    		b2 = Math.abs(b2);
    	}
		base2 = b2;
	}
	
	/**
	 * The setHeight method stores a value in the height field.
	 * @param h : The value to store in height.
	 */
	public void setHeight (double h)
	{
		while(h == 0)
    	{
    		String x = JOptionPane.showInputDialog("Since shapes can't have measurements of 0, reenter a value.");
    		h = Double.parseDouble(x);
    	}
		if(h < 1)
    	{
    		JOptionPane.showMessageDialog(null, "Since shapes can't have negative measurements, this program assumes " + h +
    				" was meant to be postitive.");
    		h = Math.abs(h);
    	}
		height = h;
	}
	
	/**
	 * The setWidth method stores a value in the width field.
	 * @param w : The value to store in width.
	 */
	public void setWidth (double w)
	{
		while(w == 0)
    	{
    		String x = JOptionPane.showInputDialog("Since shapes can't have measurements of 0, reenter a value.");
    		w = Double.parseDouble(x);
    	}
		if(w < 1)
    	{
    		JOptionPane.showMessageDialog(null, "Since shapes can't have negative measurements, this program assumes " + w +
    				" was meant to be postitive.");
    		w = Math.abs(w);
    	}
		width = w;
	}
	
	/**
	 * The setLength method stores a value in the length field.
	 * @param l : The value to store in length.
	 */
	public void setLength (double l)
	{
		while(l == 0)
    	{
    		String x = JOptionPane.showInputDialog("Since shapes can't have measurements of 0, reenter a value.");
    		l = Double.parseDouble(x);
    	}
		if(l < 1)
    	{
    		JOptionPane.showMessageDialog(null, "Since shapes can't have negative measurements, this program assumes " + l +
    				" was meant to be postitive.");
    		l = Math.abs(l);
    	}
		length = l;
	}
	
	/**
	 * The getBase1 method returns a Parallelogram object's base1.
	 * @return The Parallelogram object's base1.
	 */
	public double getBase1 ()
	{
		return base1;
	}
	
	/**
	 * The getBase2 method returns a Parallelogram object's base2.
	 * @return The Parallelogram object's base2.
	 */
	public double getBase2 ()
	{
		return base2;
	}
	
	/**
	 * The getHeight method returns a Parallelogram object's height.
	 * @return The Parallelogram object's height.
	 */
	public double getHeight ()
	{
		return height;
	}
	
	/**
	 * The getWidth method returns a Parallelogram object's width.
	 * @return The Parallelogram object's width.
	 */
	public double getWidth ()
	{
		return width;
	}
	
	/**
	 * The getLength method returns a Parallelogram object's length.
	 * @return The Parallelogram object's length.
	 */
	public double getLength ()
	{
		return length;
	}
	
	/**
	 * The getParallelogram method calculates and returns a Parallelogram object's area.
	 * Used specifically for Parallelogram objects representing 2D parallelograms.
	 * @return The Parallelogram object's area.
	 */
	public double getParallelogram ()
	{
		return base1 * height;
	}
	
	/**
	 * The getRectangle method calculates and returns a Parallelogram object's area.
	 * Used specifically for Parallelogram objects representing 2D rectangles.
	 * @return The Parallelogram object's area.
	 */
	public double getRectangle ()
	{
		return length * width;
	}
	
	/**
	 * The getTrapezoid method calculates and returns a Parallelogram object's area.
	 * Used specifically for Parallelogram objects representing 2D trapezoids.
	 * @return The Parallelogram object's area.
	 */
	public double getTrapezoid ()
	{
		return height * ((base1 + base2) / 2.0);
	}
	
	/**
	 * The getRectPrism method calculates and returns a Parallelogram object's volume.
	 * Used specifically for Parallelogram objects representing 3D rectangular prisms.
	 * @return The Parallelogram object's volume.
	 */
	public double getRectPrism ()
	{
		return length * width * height;
	}
	
	/**
	 * The getTrapPrism method calculates and returns a Parallelogram object's volume.
	 * Used specifically for Parallelogram objects representing 3D trapezoid prisms.
	 * @return The Parallelogram object's volume.
	 */
	public double getTrapPrism ()
	{
		return length * height * ((base1 + base2) / 2.0);
	}
	
	/**
	 * The showParallelogram method displays a Parallelogram object's attributes and area calculation.
	 * Used specifically for Parallelogram objects representing 2D parallelograms.
	 */
	public void showParallelogram ()
	{
		JOptionPane.showMessageDialog(null, "The area of the parallelogram with a base of " 
				+ getBase1() + " and a height of " + getHeight() + " = " + getParallelogram());
	}
	
	/**
	 * The showRectangle method displays a Parallelogram object's attributes and area calculation.
	 * Used specifically for Parallelogram objects representing 2D rectangles.
	 */
	public void showRectangle ()
	{
		JOptionPane.showMessageDialog(null, "The area of the rectangle with a length of " 
				+ getLength() + " and a width of " + getWidth() + " = " + getRectangle());
	}
	
	/**
	 * The showTrapezoid method displays a Parallelogram object's attributes and area calculation.
	 * Used specifically for Parallelogram objects representing 2D trapezoids.
	 */
	public void showTrapezoid ()
	{
		JOptionPane.showMessageDialog(null, "The area of the trapezoid with a bottom base of " 
				+ getBase1() + " and a top base of " + getBase2() + " and a height of " + getHeight() + " = " + getTrapezoid());
	}
	
	/**
	 * The showRectPrism method displays a Parallelogram object's attributes and volume calculation.
	 * Used specifically for Parallelogram objects representing 3D rectangular prisms.
	 */
	public void showRectPrism ()
	{
		JOptionPane.showMessageDialog(null, "The volume of the rectangular prism with a length of " 
				+ getLength() + " and a width of " + getWidth() + " and a height of " + getHeight() + " = " + getRectPrism());
	}
	
	/**
	 * The showTrapPrism method displays a Parallelogram object's attributes and volume calculation.
	 * Used specifically for Parallelogram objects representing 3D trapezoid prisms.
	 */
	public void showTrapPrism ()
	{
		JOptionPane.showMessageDialog(null, "The area of the trapezoid prism with a bottom base of " 
				+ getBase1() + " and a top base of " + getBase2() + " and a height of " + getHeight() + " and a length of " +
				getLength() + " = " + getTrapPrism());
	}
}