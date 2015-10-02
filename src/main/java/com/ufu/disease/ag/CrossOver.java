package com.ufu.disease.ag;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.ufu.disease.to.Chromossomo;
import com.ufu.disease.to.Gene;

public class CrossOver {

	public Chromossomo crossOver(Chromossomo c1, Chromossomo c2) throws IllegalArgumentException, IllegalAccessException {
		
		Chromossomo novo = new Chromossomo();
		novo.getIdDermatology().setValue(AlgoritGenetic.id++);
		//System.out.println("idcriado:" +AlgoritGenetic.id);
		
		Random r = new Random();
		Field[] fieldsChromoOne = c1.getClass().getDeclaredFields();
		Field[] fieldsChromoTwo = c2.getClass().getDeclaredFields();
		
		int diff = -1;
		List<Integer> points = new ArrayList<Integer>();
		while(diff <=1) {
			int p1 = r.nextInt((33 - 2) + 1) + 2;
			int p2 = r.nextInt((33 - 2) + 1) + 2;
			points = new ArrayList<Integer>();
			points.add(p1);
			points.add(p2);
			Collections.sort(points);
			diff = points.get(1) - points.get(0);
		}
		
		for(int i=1; i <= points.get(0); i++) {
			//System.out.println("primeiro : " + i);
			Field f = fieldsChromoOne[i];
			f.setAccessible(true);
			Gene geneChromoOne = (Gene) f.get(c1);
			
			Field fNovo = fieldsChromoOne[i];
			fNovo.setAccessible(true);
			fNovo.set(novo, geneChromoOne);
		}
		
		for(int i=35; i >= points.get(1); i--) {
			//System.out.println("segundo : " + i);
			Field f = fieldsChromoOne[i];
			f.setAccessible(true);
			Gene geneChromoOne = (Gene) f.get(c1);
			
			Field fNovo = fieldsChromoOne[i];
			fNovo.setAccessible(true);
			fNovo.set(novo, geneChromoOne);
		}
		
		for(int i=points.get(0)+1; i < points.get(1); i++) {
			//System.out.println("terceiro : " + i);
			Field f = fieldsChromoTwo[i];
			f.setAccessible(true);
			Gene geneChromoOne = (Gene) f.get(c2);
			//System.out.println(geneChromoOne.toString());
			Field fNovo = fieldsChromoTwo[i];
			fNovo.setAccessible(true);
			fNovo.set(novo, geneChromoOne);
		}
		
		return novo;
	}
	
}
