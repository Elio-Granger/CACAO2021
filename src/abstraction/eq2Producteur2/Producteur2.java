package abstraction.eq2Producteur2;



public class Producteur2 extends Producteur2VeudeurFeveCC {

	public Producteur2() {
		super();
	}
	
	public void next() {
		verifPeremption();
		prod();
		transfo();
		renouvellement();
		coutTotDuStep(); 
	}
}