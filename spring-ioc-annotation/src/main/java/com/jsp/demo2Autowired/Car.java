package com.jsp.demo2Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Car {
	@Autowired
	 
	MusicPlayer musicPlayer;
	
	public void run() {
		musicPlayer.play();
	}

}
