package disease;

import java.util.Random;

import org.junit.Test;

import com.ufu.disease.ag.Fitness;
import com.ufu.disease.to.Chromossomo;
import com.ufu.disease.to.Operator;

public class FitnessTest {

	@Test
	public void calculateFitness(){
		Random r = new Random();
		Chromossomo c = Chromossomo.buildChromossome(r);
		
		//Chromossomo c = new Chromossomo();
		c.getBandLike().setValue(2);
		c.getBandLike().setWeigth(0.9f);
		c.getBandLike().setOperator(Operator.MAIOR);
		
		Fitness fit = new Fitness();
		fit.calculateFitness(c,3);
	}
	
}
