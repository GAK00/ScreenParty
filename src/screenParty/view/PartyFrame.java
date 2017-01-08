package screenParty.view;

import javax.swing.JFrame;

import screenParty.controller.PartyController;

public class PartyFrame extends JFrame
{

	private PartyController controller;
	private PartyPanel panel;

	public PartyFrame(PartyController controller)
	{
		super();
		this.controller = controller;
		this.panel = new PartyPanel(this.controller);
		setupFrame();

	}

	private void setupFrame()
	{
		this.setTitle("Rave");
		this.setSize(this.getMaximumSize());
		this.setResizable(false);
		this.setContentPane(panel);
		this.setVisible(true);

	}

}
