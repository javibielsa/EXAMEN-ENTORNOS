import java.awt.Button;
import java.awt.Point;

import javax.xml.ws.FaultAction;

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
	
	@Test
	public void getAreaTest(){
		
		
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
	
	@Test
	public void concatTest() throws Exception{
		Assert.assertEquals("holapepito", a.concat(true, "hola", "pepito"));
		Assert.assertEquals("hola2pepito2", a.concat(true, "hola2", "pepito2"));
		try{
			Assert.assertNull(a.concat(true, null, "pepito"));
			Assert.fail("un string es nulo");
		}catch(RuntimeException a){}
		/*try{
			Assert.assertNull(a.concat(false, "hola", "pepito"));
			Assert.fail("No puedes meter numeros nulos");
		}catch(Exception e){}*/
	}
	
	/*public String concat(boolean append, String a, String b) {
		if (null == a || null == b) {
			throw new RuntimeException();
		}
		String result = null;
		if (append) {
			result = a + b;
		}
		return result.toLowerCase();

	}*/
	
	@Test
	public void mockito1Test(){
		
	}
	
	/*public void mockito1(FaultAction faultAction, Button button, Point point) {

		if (button.getParent().isEnabled() && button.getParent().contains(point)) {
			if (faultAction.value().toUpperCase().compareTo("SALESIANOS.EDU") > 0) {
				return;
			}
			throw new RuntimeException();
		}

		throw new RuntimeException();

	}*/
}
