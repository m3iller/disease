package com.ufu.disease.ag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.ufu.disease.to.Chromossomo;
import com.ufu.disease.to.ChromossomoComparator;

public class AlgoritGenetic {

	private static Integer generation = 50;
	private static Integer elementos = 50;
	private static Integer sizeTournament =3;
	public static Integer id = 1000;

	public void randomElements() {
	}

	public static List<Chromossomo> createPopulation() {
		
		List<Chromossomo> pop = new ArrayList<Chromossomo>();
		Random random = new Random();
		for (int i = 0; i < elementos; i++) {
			pop.add(Chromossomo.buildChromossome(random));
		}
		//Chromossomo.printPopulation(pop);
		return pop;
	}

	public static void main(String[] args) {
		Long init = 0l;
		Long end = 0l;
		for (int i = 1; i <= 6; i++) {
			init = System.currentTimeMillis();
			System.out.println("Tempo Execucao:" + ((end - init) / 1000));
			List<Chromossomo> popupalcao = createPopulation();
			for (int j = 1; j <= generation; j++) {
				//System.out.println("Classe " + i);
				
				//calcula fitness
				for (Chromossomo c : popupalcao) {
					Fitness f = new Fitness();
					f.calculateFitness(c, i);
				}
				
				//soma aptididao
				Float fitnessSum = 0.0f;
				for(Chromossomo cr : popupalcao) {
					fitnessSum = fitnessSum + Float.valueOf(
							String.format("%.2f", cr.getFitness()).replace(",", "."));
				}
				//System.out.println("soma fit:" + fitnessSum);
				
				//System.out.println("ANTES:"+  popupalcao);
				TournamentStocastic tournament = new TournamentStocastic();
				//for(int times =0; times <= 24; times++) {
					// faz torneio de 3 e cross over retornando 2 novos elementos
				List<Chromossomo> tourElements = tournament.tournamentTimes(fitnessSum, popupalcao,sizeTournament, 24);
				//}
				//System.out.println("DEPOIS:" + popupalcao);
				
				for (Chromossomo c : tourElements) {
					Fitness f = new Fitness();
					f.calculateFitness(c, i);
				}
				//System.out.println("TOUR:" + tourElements);
				//System.out.println("POP:" + popupalcao);
				
				popupalcao.addAll(tourElements);
				Collections.sort(popupalcao, new ChromossomoComparator());
				
				popupalcao = popupalcao.subList(0, 49);
				//System.out.println(popupalcao);
			}
			
			System.out.println("Classe: " + i);
			System.out.println(popupalcao);
			end = System.currentTimeMillis();
		}
	}
}
