package dsa;

public abstract class Evaluation {

	private final int noq;
	abstract void evaluationTiming();

	
public Evaluation() {
	this.noq =0;
	// TODO Auto-generated constructor stub
}

	public Evaluation(int noq) {
	super();
	this.noq = noq;
}
	
	void printNoOfQuestion() {
		System.out.println("No. of Questions in Evalu "+noq);

	}

	
	
	
}
