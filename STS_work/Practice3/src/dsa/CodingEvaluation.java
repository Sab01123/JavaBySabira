package dsa;

public class CodingEvaluation extends Evaluation{

	@Override
	void evaluationTiming() {
		// TODO Auto-generated method stub
		System.out.println("Evaluation timing is 2:00 to 3:30");
	}
public CodingEvaluation() {
	// TODO Auto-generated constructor stub
}
public CodingEvaluation(int i) {
	
	Evaluation e2=new Evaluation(i) {
		
		@Override
		void evaluationTiming() {
			// TODO Auto-generated method stub
			
		}
	};
	// TODO Auto-generated constructor stub
}


}
