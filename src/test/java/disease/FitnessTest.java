package disease;

import java.util.Random;

import org.junit.Test;

import com.ufu.disease.ag.Fitness;
import com.ufu.disease.to.Chromossomo;

public class FitnessTest {

	@Test
	public void calculateFitness(){
		Random r = new Random();
		Chromossomo c = Chromossomo.buildChromossome(r);
		
		Fitness fit = new Fitness();
		fit.calculateFitness(c);
		
	}
	
}
