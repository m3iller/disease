package disease;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import com.ufu.disease.ag.Fitness;
import com.ufu.disease.to.Chromossomo;
import com.ufu.disease.to.Operator;

public class FitnessTest {

	@Test
	public void calculateFitness(){
		Random r = new Random();
		Chromossomo c = Chromossomo.buildChromossome(r);
		//c = new Chromossomo();
		
		//Chromossomo c = new Chromossomo();
//		c.getBandLike().setValue(2);
//		c.getBandLike().setWeigth(0.9f);
//		c.getBandLike().setOperator(Operator.MAIOR);
		
		c.getMelaninIncontinence().setValue(1);
		c.getMelaninIncontinence().setWeigth(0.9f);
		c.getMelaninIncontinence().setOperator(Operator.MENOR);
		
		c.getFibrosis().setValue(0);
		c.getFibrosis().setWeigth(0.9f);
		c.getFibrosis().setOperator(Operator.DIFERENTE);
		
		c.getMunroIcroabcess().setValue(0);;
		c.getMunroIcroabcess().setWeigth(0.9f);
		c.getMunroIcroabcess().setOperator(Operator.IGUAL);
		
		Fitness fit = new Fitness();
		fit.calculateFitness(c,5);
		
		Assert.assertNotNull(c);
	}
	
}
