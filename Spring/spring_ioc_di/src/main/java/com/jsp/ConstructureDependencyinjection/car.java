package com.jsp.ConstructureDependencyinjection;

public class car {
 
	musicplayer musicplayer;

	public car( musicplayer musicplayer) {
		 
		this.musicplayer = musicplayer;
	}
	
	public void run()
	{
		musicplayer.play();
	}
	

}
