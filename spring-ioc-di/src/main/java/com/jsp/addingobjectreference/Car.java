package com.jsp.addingobjectreference;

public class Car {
	Musicplayer musicplayer;
	
	
	
	
	public Car(Musicplayer musicplayer) {
		super();
		this.musicplayer = musicplayer;
	}




	public void run() {
		musicplayer.play();
	}

}
