package com.question_2;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

	public List<Song> songs = new ArrayList<>();
	
	 public void addSong(Song song) {
		 boolean b1 = true;
		 for(Song i:songs) {
			 
			 if(song.equals(i)) {
				 b1 = false;
				 
			 }		 
		 }
		 if(b1 == false) {
			 System.out.println("Song is already added in the playlist");
		 }
		 else {
			 songs.add(song);
			 System.out.println("Song added to the playlist successfully");
		 }
		
	 }

}
