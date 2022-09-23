package com.question_3;

public class Main {

	void MessegeToStudents(Evaluation evaluation) {
		if(evaluation instanceof DsaEvaluation) {
			System.out.println("its dsa evaluation");
			DsaEvaluation d = (DsaEvaluation)evaluation;
			d.printNoOfQuestions();
			d.evaluationTiming();
		}
		else {
			if(evaluation instanceof CoadingEvaluation) {
				System.out.println("its coding evalution");
				CoadingEvaluation c =(CoadingEvaluation)evaluation;
				c.printNoOfQuestions();
				c.evaluationTiming();
			}
		}

}
	public static void main(String[] args) {

		Main m = new Main();
		
		m.MessegeToStudents(new DsaEvaluation(5));
		m.MessegeToStudents(new CoadingEvaluation(4));
		
	}

}
