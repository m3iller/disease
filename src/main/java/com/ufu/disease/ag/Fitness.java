package com.ufu.disease.ag;

import java.util.List;

import com.udojava.evalex.Expression;
import com.ufu.disease.dao.DermatologyDAO;
import com.ufu.disease.to.Chromossomo;
import com.ufu.disease.to.Gene;

public class Fitness {

	private static Float threshold = 0.7f;

	public Fitness() {
	}

	public void calculateFitness(Chromossomo chromoAleatorio, Integer classAG) {
		DermatologyDAO dao = new DermatologyDAO();
		List<Chromossomo> listChromosso = dao.searchDermtology(null, null);

		int truePositive = 1;
		int falsePositive = 1;
		int falseNegative = 1;
		int trueNegative = 1;

		for (Chromossomo c : listChromosso) {
			// verifica se atributos sao equivalentes
			boolean compareValues = functionCompare(c, chromoAleatorio);
			if (compareValues) {
				if (c.getClassDisease().getValue() == classAG) {
					++truePositive;
				} else {
					++falsePositive;
				}
			} else {
				if (c.getClassDisease().getValue() == classAG) {
					++falseNegative;
				} else {
					++trueNegative;
				}
			}
		}
		
		Float se  = truePositive / Float.valueOf((truePositive + falseNegative));
		Float sp = trueNegative / Float.valueOf((trueNegative + falsePositive));
		
		Float fitness = se * sp;
		chromoAleatorio.setFitness(fitness);
		System.out.println(chromoAleatorio.getFitness());
	}

	public boolean functionCompare(Chromossomo chromoOriginal,
			Chromossomo chromoAleatory) {

		boolean compareElements = false;
		if (chromoAleatory.getErythema().getWeigth() >= threshold) {
			compareElements = compareExpression(chromoOriginal.getErythema(),
					chromoAleatory.getErythema());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getScaling().getWeigth() >= threshold) {
			compareElements = compareExpression(chromoOriginal.getScaling(),
					chromoAleatory.getScaling());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getDefiniteBorders().getWeigth() >= threshold) {
			compareElements = compareExpression(
					chromoOriginal.getDefiniteBorders(),
					chromoAleatory.getDefiniteBorders());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getItching().getWeigth() >= threshold) {
			compareElements = compareExpression(chromoOriginal.getItching(),
					chromoAleatory.getItching());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getKoebnerPhenomenon().getWeigth() >= threshold) {
			compareElements = compareExpression(
					chromoOriginal.getKoebnerPhenomenon(),
					chromoAleatory.getKoebnerPhenomenon());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getPolygonalPapules().getWeigth() >= threshold) {
			compareElements = compareExpression(
					chromoOriginal.getPolygonalPapules(),
					chromoAleatory.getPolygonalPapules());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getFollicularPapules().getWeigth() >= threshold) {
			compareElements = compareExpression(
					chromoOriginal.getFollicularPapules(),
					chromoAleatory.getFollicularPapules());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getOralMucosalInvolvement().getWeigth() >= threshold) {
			compareElements = compareExpression(
					chromoOriginal.getOralMucosalInvolvement(),
					chromoAleatory.getOralMucosalInvolvement());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getKneeElbowInvolvement().getWeigth() >= threshold) {
			compareElements = compareExpression(
					chromoOriginal.getKneeElbowInvolvement(),
					chromoAleatory.getKneeElbowInvolvement());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getScalpInvolvement().getWeigth() >= threshold) {
			compareElements = compareExpression(
					chromoOriginal.getScalpInvolvement(),
					chromoAleatory.getScalpInvolvement());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getFamilyHistory().getWeigth() >= threshold) {
			compareElements = compareExpression(
					chromoOriginal.getFamilyHistory(),
					chromoAleatory.getFamilyHistory());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getMelaninIncontinence().getWeigth() >= threshold) {
			compareElements = compareExpression(
					chromoOriginal.getMelaninIncontinence(),
					chromoAleatory.getMelaninIncontinence());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getEosinophils().getWeigth() >= threshold) {
			compareElements = compareExpression(
					chromoOriginal.getEosinophils(),
					chromoAleatory.getEosinophils());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getPnlInfiltrate().getWeigth() >= threshold) {
			compareElements = compareExpression(
					chromoOriginal.getPnlInfiltrate(),
					chromoAleatory.getPnlInfiltrate());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getFibrosis().getWeigth() >= threshold) {
			compareElements = compareExpression(chromoOriginal.getFibrosis(),
					chromoAleatory.getFibrosis());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getExocytosis().getWeigth() >= threshold) {
			compareElements = compareExpression(chromoOriginal.getExocytosis(),
					chromoAleatory.getExocytosis());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getAcanthosis().getWeigth() >= threshold) {
			compareElements = compareExpression(chromoOriginal.getAcanthosis(),
					chromoAleatory.getAcanthosis());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getHyperkeratosis().getWeigth() >= threshold) {
			compareElements = compareExpression(
					chromoOriginal.getHyperkeratosis(),
					chromoAleatory.getHyperkeratosis());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getParakeratosis().getWeigth() >= threshold) {
			compareElements = compareExpression(
					chromoOriginal.getParakeratosis(),
					chromoAleatory.getParakeratosis());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getClubbing().getWeigth() >= threshold) {
			compareElements = compareExpression(chromoOriginal.getClubbing(),
					chromoAleatory.getClubbing());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getElongation().getWeigth() >= threshold) {
			compareElements = compareExpression(chromoOriginal.getElongation(),
					chromoAleatory.getElongation());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getThinning().getWeigth() >= threshold) {
			compareElements = compareExpression(chromoOriginal.getThinning(),
					chromoAleatory.getThinning());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getSpongiform().getWeigth() >= threshold) {
			compareElements = compareExpression(chromoOriginal.getSpongiform(),
					chromoAleatory.getSpongiform());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getMunroIcroabcess().getWeigth() >= threshold) {
			compareElements = compareExpression(
					chromoOriginal.getMunroIcroabcess(),
					chromoAleatory.getMunroIcroabcess());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getFocalHypergranulosis().getWeigth() >= threshold) {
			compareElements = compareExpression(
					chromoOriginal.getFocalHypergranulosis(),
					chromoAleatory.getFocalHypergranulosis());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getDisappearance().getWeigth() >= threshold) {
			compareElements = compareExpression(
					chromoOriginal.getDisappearance(),
					chromoAleatory.getDisappearance());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getVacuolisation().getWeigth() >= threshold) {
			compareElements = compareExpression(
					chromoOriginal.getVacuolisation(),
					chromoAleatory.getVacuolisation());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getSpongiosis().getWeigth() >= threshold) {
			compareElements = compareExpression(chromoOriginal.getSpongiosis(),
					chromoAleatory.getSpongiosis());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getSawYooth().getWeigth() >= threshold) {
			compareElements = compareExpression(chromoOriginal.getSawYooth(),
					chromoAleatory.getSawYooth());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getFollicular().getWeigth() >= threshold) {
			compareElements = compareExpression(chromoOriginal.getFollicular(),
					chromoAleatory.getFollicular());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getPerifollicular().getWeigth() >= threshold) {
			compareElements = compareExpression(
					chromoOriginal.getPerifollicular(),
					chromoAleatory.getPerifollicular());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getInflammatory().getWeigth() >= threshold) {
			compareElements = compareExpression(
					chromoOriginal.getInflammatory(),
					chromoAleatory.getInflammatory());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getBandLike().getWeigth() >= threshold) {
			compareElements = compareExpression(chromoOriginal.getBandLike(),
					chromoAleatory.getBandLike());
			if (compareElements == false)
				return false;
		}
		if (chromoAleatory.getAge().getWeigth() >= threshold) {
			compareElements = compareExpression(chromoOriginal.getAge(),
					chromoAleatory.getAge());
			if (compareElements == false)
				return false;
		}

		return compareElements;
	}

	public boolean compareExpression(Gene original, Gene aleatorio) {
		Expression expression = new Expression(String.format("%s%s%s",
				original.getValue(), aleatorio.getOperator().getNumVal(),
				aleatorio.getValue()));
		Integer result = expression.eval().intValue();
		return result == 1 ? true : false;
	}

}
