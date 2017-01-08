package screenParty.controller;

import screenParty.view.PartyFrame;

public class PartyController
{
	
	private PartyFrame baseFrame;
	public void start()
	{
	  baseFrame = new PartyFrame(this);	
	}

}
