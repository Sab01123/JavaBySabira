package com.question_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		PlayList pl = new PlayList();
		int c =0;
		
		while(c<4) {
			
			System.out.println("Enter Movie Name");
			String moviename = sc.next();
			
			System.out.println("Enter Song Name");
			String songname = sc.next();
			
			
			Song s1 = new Song(moviename, songname);
			pl.addSong(s1);
			c++;
		}
   List<Song> slist = pl.songs;
   for(Song i:slist) {
	   i.play();
   }
		
	}

}
