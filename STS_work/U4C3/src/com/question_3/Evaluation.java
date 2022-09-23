package com.question_3;

public abstract class Evaluation {

	private final int numberOfQuestions;
	
	abstract void evaluationTiming();
	
	protected Evaluation(int numberOfQuestions) {
		this.numberOfQuestions = numberOfQuestions;
	}
	
	 void printNoOfQuestions() {
	System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions);
	}

	
	
}
