package disease;

import java.lang.reflect.Field;
import java.util.Random;

import org.junit.Test;

import com.ufu.disease.ag.CrossOver;
import com.ufu.disease.to.Chromossomo;

public class CrossOverTeste {

	@Test
	public void crossOverTest() throws IllegalArgumentException, IllegalAccessException{
		Random r = new Random();
		Chromossomo c1 = Chromossomo.buildChromossome(r);
		Chromossomo c2 = Chromossomo.buildChromossome(r);
	
		CrossOver cross= new CrossOver();
		cross.crossOver(c1, c2);
		
	}
	
	@Test
	public void reflectionTest() throws IllegalArgumentException, IllegalAccessException {
		Random r = new Random();
		Chromossomo c= Chromossomo.buildChromossome(r);
		
		for (Field field : c.getClass().getDeclaredFields()) {
		    field.setAccessible(true); // You might want to set modifier to public first.
		    Object value = field.get(c); 
		    if (value != null) {
		        System.out.println(field.getName() + "=" + value);
		    }
		}
		
	}
	
}
