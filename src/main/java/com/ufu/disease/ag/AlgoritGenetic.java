package com.ufu.disease.ag;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.ufu.disease.to.Chromossomo;

public class AlgoritGenetic {
	
	private static Integer generation = 50;
	
	public void randomElements() {
	}
	
	public static List<Chromossomo> createPopulation() {
		List<Chromossomo> pop = new ArrayList<Chromossomo>();
		Random random = new Random();
		
		for(int i=0; i < generation; i++ ) {
			pop.add(Chromossomo.buildChromossome(random));
		}
		
		Chromossomo.printPopulation(pop);
		return pop;
	}
	
	public static void main(String[] args) {
		List<Chromossomo> popupalcao = createPopulation();
		
		for(int i=1; i<=6; i++) {
		System.out.println("Classe " + i);
		
		for(Chromossomo c: popupalcao) {
			Fitness f = new Fitness();
			//f.calculateFitness(c,1);
				f.calculateFitness(c,i);
			}
		}
	}
}
