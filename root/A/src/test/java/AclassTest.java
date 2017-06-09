import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

public class AclassTest {
	Aclass a = new Aclass();
	
	@Test
	public void locateTest() throws RuntimeException{
		Assert.assertEquals(new Point(5,6),a.locate(5,6));
		Assert.assertEquals(new Point(5,6),a.locate(-5,-6));
		try{
			Assert.assertNull(a.locate(0,0));
			Assert.fail("No puedes meter numeros nulos");
		}catch(RuntimeException e){}
		
		
	}
	
	/*public static double getArea(double a, double b, double c) {
		double s = (a + b + c) / 2.0; // s = perimeter/2
		// If we can not form a triangle return 0.0
		if (a + b <= c || b + c <= a || a + c <= b) {
			throw new RuntimeException();
		} else {
			double x = ((s) * (s - a) * (s - b) * (s - c)); // herons formula
			double area = Math.sqrt(x);
			return area;
		}
	}*/
}
