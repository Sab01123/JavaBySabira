package com.question_3;

import java.util.Comparator;

public class Memberscomp implements Comparator<Members>{

	@Override
	public int compare(Members o1, Members o2) {
		// TODO Auto-generated method stub
		return o1.getMembershipEnddate().getYear()>o2.getMembershipEnddate().getYear() ? +1:-1;
	}

}
