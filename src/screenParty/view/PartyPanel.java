package screenParty.view;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import screenParty.controller.PartyController;

public class PartyPanel extends JPanel
{

	private PartyController controller;
	private SpringLayout layout;

	public PartyPanel(PartyController controller)
	{
		this.layout = new SpringLayout();
		this.controller = controller;
		this.setupPanel();
		this.setupLayout();
		this.setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(layout);

	}

	private void setupListeners()
	{

	}

	private void setupLayout()
	{
		this.addMouseMotionListener(new MouseMotionListener()
		{

			public void mouseDragged(MouseEvent arg0)
			{
				randomizeColor();

			}

			public void mouseMoved(MouseEvent arg0)
			{
				// TODO Auto-generated method stub

			}

		});
	}

	private void randomizeColor()
	{
		Random rand = new Random();
		this.setBackground(new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
	}
}
