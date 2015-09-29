package com.ufu.disease.ag;

import java.util.List;

import com.udojava.evalex.Expression;
import com.ufu.disease.dao.DermatologyDAO;
import com.ufu.disease.to.Chromossomo;
import com.ufu.disease.to.Gene;

public class Fitness {

	private static Float threshold = 0.3f;

	public Fitness(){
	}
	
	public void calculateFitness(Chromossomo chromoAleatorio) {
		DermatologyDAO dao = new DermatologyDAO();
		List<Chromossomo> listChromosso = dao.searchDermtology(null, null);

		for (Chromossomo c : listChromosso) {
			boolean compareElements = functionCompare(c, chromoAleatorio);
			if(compareElements) {
				
			}
		}
	}

	public boolean functionCompare(Chromossomo chromoOriginal, Chromossomo chromoAleatory) {

			
		
		 boolean compareElements = false;
		 if( chromoAleatory.getErythema().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getErythema(), chromoAleatory.getErythema());
		 }
		 if( chromoAleatory.getScaling().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getScaling(), chromoAleatory.getScaling());
		 }
		 if( chromoAleatory.getDefiniteBorders().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getDefiniteBorders(), chromoAleatory.getDefiniteBorders());
		 }
		 if( chromoAleatory.getItching().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getItching(), chromoAleatory.getItching());
		 }
		 if( chromoAleatory.getKoebnerPhenomenon().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getKoebnerPhenomenon(), chromoAleatory.getKoebnerPhenomenon());
		 }
		 if( chromoAleatory.getPolygonalPapules().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getPolygonalPapules(), chromoAleatory.getPolygonalPapules());
		 }
		 if( chromoAleatory.getFollicularPapules().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getFollicularPapules(), chromoAleatory.getFollicularPapules());
		 }
		 if( chromoAleatory.getOralMucosalInvolvement().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getOralMucosalInvolvement(), chromoAleatory.getOralMucosalInvolvement());
		 }
		 if( chromoAleatory.getKneeElbowInvolvement().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getKneeElbowInvolvement(), chromoAleatory.getKneeElbowInvolvement());
		 }
		 if( chromoAleatory.getScalpInvolvement().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getScalpInvolvement(), chromoAleatory.getScalpInvolvement());
		 }
		 if( chromoAleatory.getFamilyHistory().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getFamilyHistory(), chromoAleatory.getFamilyHistory());
		 }
		 if( chromoAleatory.getMelaninIncontinence().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getMelaninIncontinence(), chromoAleatory.getMelaninIncontinence());
		 }
		 if( chromoAleatory.getEosinophils().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getEosinophils(), chromoAleatory.getEosinophils());
		 }
		 if( chromoAleatory.getPnlInfiltrate().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getPnlInfiltrate(), chromoAleatory.getPnlInfiltrate());
		 }
		 if( chromoAleatory.getFibrosis().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getFibrosis(), chromoAleatory.getFibrosis());
		 }
		 if( chromoAleatory.getExocytosis().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getExocytosis(), chromoAleatory.getExocytosis());
		 }
		 if( chromoAleatory.getAcanthosis().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getAcanthosis(), chromoAleatory.getAcanthosis());
		 }
		 if( chromoAleatory.getHyperkeratosis().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getHyperkeratosis(), chromoAleatory.getHyperkeratosis());
		 }
		 if( chromoAleatory.getParakeratosis().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getParakeratosis(), chromoAleatory.getParakeratosis());
		 }
		 if( chromoAleatory.getClubbing().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getClubbing(), chromoAleatory.getClubbing());
		 }
		 if( chromoAleatory.getElongation().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getElongation(), chromoAleatory.getElongation());
		 }
		 if( chromoAleatory.getThinning().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getThinning(), chromoAleatory.getThinning());
		 }
		 if( chromoAleatory.getSpongiform().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getSpongiform(), chromoAleatory.getSpongiform());
		 }
		 if( chromoAleatory.getMunroIcroabcess().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getMunroIcroabcess(), chromoAleatory.getMunroIcroabcess());
		 }
		 if( chromoAleatory.getFocalHypergranulosis().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getFocalHypergranulosis(), chromoAleatory.getFocalHypergranulosis());
		 }
		 if( chromoAleatory.getDisappearance().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getDisappearance(), chromoAleatory.getDisappearance());
		 }
		 if( chromoAleatory.getVacuolisation().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getVacuolisation(), chromoAleatory.getVacuolisation());
		 }
		 if( chromoAleatory.getSpongiosis().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getSpongiosis(), chromoAleatory.getSpongiosis());
		 }
		 if( chromoAleatory.getSawYooth().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getSawYooth(), chromoAleatory.getSawYooth());
		 }
		 if( chromoAleatory.getFollicular().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getFollicular(), chromoAleatory.getFollicular());
		 }
		 if( chromoAleatory.getPerifollicular().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getPerifollicular(), chromoAleatory.getPerifollicular());
		 }
		 if( chromoAleatory.getInflammatory().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getInflammatory(), chromoAleatory.getInflammatory());
		 }
		 if( chromoAleatory.getBandLike().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getBandLike(), chromoAleatory.getBandLike());
		 }
		 if( chromoAleatory.getAge().getWeigth() >= threshold) {
			 compareElements = compareExpression(chromoOriginal.getAge(), chromoAleatory.getAge());
		 }

		 return compareElements;
	}

	public boolean compareExpression(Gene original, Gene aleatorio) {
		Expression expression = new Expression(String.format("%s%s%s",
				original.getValue(), aleatorio.getOperator().getNumVal(),
				aleatorio.getValue()));
		Integer result = expression.eval().intValue();
		return result ==1 ? true : false;
	}

}
