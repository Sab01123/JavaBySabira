package dsa;

public class Main {
	void messageToStudents(Evaluation evaluation) {
		
		if(evaluation instanceof DsaEvaluation) {
			System.out.println("its a dsa evaluation");
			DsaEvaluation dsaEvaluation=(DsaEvaluation)evaluation;
			dsaEvaluation.evaluationTiming();
			dsaEvaluation.printNoOfQuestion();
			
		}
		else {
			System.out.println("its a coding evaluation");
			CodingEvaluation codingEvaluation=  (CodingEvaluation)evaluation;
			codingEvaluation.evaluationTiming();
			codingEvaluation.printNoOfQuestion();
		}
		
	}
	 public static void main(String[] args) {
		 
		 Main main=new Main();
			
			
		 main.messageToStudents(new DsaEvaluation(5));
		 main.messageToStudents(new CodingEvaluation(4));
	 }
}
