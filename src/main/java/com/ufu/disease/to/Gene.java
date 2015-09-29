package com.ufu.disease.to;

import java.util.Random;

public class Gene {
	
	private Float weigth;
	private Operator operator;
	private Integer value;
	
	public Gene(){
		super();
	}
	
	public Gene(Random random, int min, int max){
		weigth = Float.valueOf(String.format("%.2f", random.nextFloat()).replace(",", "."));
		value = random.nextInt((min - max) + 1) + max;
		operator = Operator.getRandom();
	}
	
	public final Float getWeigth() {
		return weigth;
	}
	public final void setWeigth(Float weigth) {
		this.weigth = weigth;
	}
	public final Integer getValue() {
		return value;
	}
	public final void setValue(Integer value) {
		this.value = value;
	}
	public final Operator getOperator() {
		return operator;
	}
	public final void setOperator(Operator operator) {
		this.operator = operator;
	}
}
