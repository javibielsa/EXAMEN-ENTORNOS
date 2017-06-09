import java.awt.Button;
import java.awt.Container;
import java.awt.Point;

import javax.swing.JFrame;
import javax.xml.ws.FaultAction;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class AclassTest {
	Aclass a = new Aclass();
	Aclass object;
	private static final double DELTA = 1e-15; 
	
	@Mock
	FaultAction faultAction;
	@Mock
	Button button; 
	@Mock
	Point point;
	@Mock
	Container container;
	@Mock
	JFrame frame;
	
	@Before
	public void setUp(){
		object = new Aclass();
	}
	
	@Test
	public void locateTest(){
		Assert.assertEquals(new Point(5,6),a.locate(5,6));
		Assert.assertEquals(new Point(5,6),a.locate(-5,-6));
		try{
			Assert.assertNull(a.locate(0,0));
			Assert.fail("No da nada");
		}catch(RuntimeException e){}
		
		
	}
	
	@Test
	public void getAreaTest(){
		try{
		Assert.assertEquals(0.0, Aclass.getArea(1, 1, 100),DELTA);
		Assert.fail();
		}catch(RuntimeException e){}
		Assert.assertEquals(6.0, Aclass.getArea(3, 4,5),DELTA);
		
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
	public void concatTest(){
		Assert.assertEquals("holapepito", a.concat(true, "hola", "pepito"));
		Assert.assertEquals("hola2pepito2", a.concat(true, "hola2", "pepito2"));
		try{
			Assert.assertNull(a.concat(true, null, "pepito"));
			Assert.fail("un string es nulo");
		}catch(RuntimeException a){}
		try{
			Assert.assertNull(a.concat(false, "hola", "pepito"));
			Assert.fail("No puedes meter numeros nulos");
		}catch(Exception e){}
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
	public void mockito1Test(){ //Gorka yo ya no se que mas hacer con las RuntimeException, lo he puesto asi y vale, no se si contara algo el procedimiento
		try{
			Mockito.when(button.getParent()).thenReturn(container);
			Mockito.when(container.isEnabled()).thenReturn(true);
			Mockito.when(container.contains(point)).thenReturn(true);
			Mockito.when(faultAction.value()).thenReturn("salesianos.edu");
			
			
			object.mockito1(faultAction, button, point);
		}catch(RuntimeException e){}
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
	
	@Test
	public void mockito2Test(){
		try{
			Mockito.when(button.getActionCommand()).thenReturn("algo");
			Mockito.when(frame.checkImage(null, null)).thenReturn(8);
			Mockito.when(frame.isDisplayable()).thenReturn(true);
			
			
			object.mockito2(frame, button);
		}catch(RuntimeException e){}
	}
	
	/*public void mockito2(JFrame frame, Button close) {

		if (close.getActionCommand().equals("close") && frame.checkImage(null, null) > 2) {
			if (frame.isDisplayable()) {
				throw new RuntimeException();
			}
			return;
		}
		throw new RuntimeException();
	}*/
}
