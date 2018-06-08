import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
public class RGBSource
{
	Scanner ein = new Scanner (System.in);
	//Deklarieren der Fenster:
	private Frame f;
	//Deklarieren der Elemente:
	private Scrollbar scR;
	private Scrollbar scG;
	private Scrollbar scB;
	// private Button copy;
	private Button close;
	private Label l;
	private Label lRot;
	private Label lGruen;
	private Label lBlau;
	private Label nR;
	private Label nG;
	private Label nB;
	private TextField tf;
	private int rot;
	private int gruen;
	private int blau;
	private Color rgb;
	private String rgbString;
	//Ende
	public RGBSource()
	{
	//Aufrufen und bezeichnen der Elemente:
	f = new Frame();
	l = new Label("");
	rot = 125;
	gruen = 125;
	blau = 125;
	rgbString = (rot+","+gruen+","+blau);
	rgb = new Color(rot,gruen,blau);
	scR = new Scrollbar(Scrollbar.HORIZONTAL,125,1,0,256);
	scG = new Scrollbar(Scrollbar.HORIZONTAL,125,1,0,256);
	scB = new Scrollbar(Scrollbar.HORIZONTAL,125,1,0,256);
	lRot = new Label("Rot");
	lGruen = new Label("Grün");
	lBlau = new Label("Blau");
	nR = new Label("125");
	nG = new Label("125");
	nB = new Label("125");
	tf = new TextField(rgbString+"");
	// copy = new Button("Kopieren");
	close = new Button("Schließen");
	}
	//Frame-Eigenschaften:
	public void frameFestlegen()
	{
	f.setTitle("RGBMixer");
	f.setSize(400,325);
	f.addWindowListener(new WindowAdapter()
	{
		public void windowClosing (WindowEvent e)
		{System.exit(0);}
		public void windowIconfied (WindowEvent e)
		{System.exit(0);}
	}
	);
	f.setVisible(true);
	
	//Events:
	
	//-Scrollbars:
	scR.addAdjustmentListener(new AdjustmentListener(){
	public void adjustmentValueChanged(AdjustmentEvent e)
		{
			rot = scR.getValue();
			rgb = new Color(rot,gruen,blau);
			l.setBackground(rgb);
			nR.setText(rot+"");
			rgbString = (rot+","+gruen+","+blau);
			tf.setText(rgbString+"");
		}
	});
	
	scG.addAdjustmentListener(new AdjustmentListener(){
	public void adjustmentValueChanged(AdjustmentEvent e)
		{
			gruen = scG.getValue();
			rgb = new Color(rot,gruen,blau);
			l.setBackground(rgb);
			nG.setText(gruen+"");
			rgbString = (rot+","+gruen+","+blau);
			tf.setText(rgbString+"");
		}
	});
	
	scB.addAdjustmentListener(new AdjustmentListener(){
	public void adjustmentValueChanged(AdjustmentEvent e)
		{
			blau = scB.getValue();
			rgb = new Color(rot,gruen,blau);
			l.setBackground(rgb);
			nB.setText(blau+"");
			rgbString = (rot+","+gruen+","+blau);
			tf.setText(rgbString+"");
		}
	});
	// -Copy:
// 	copy.addActionListener(new ActionListener(){
// 	public void actionPerformed(ActionEvent e)
// 		{}
// 	});
// 	
// 	
	//-Schließen:
	close.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
		{System.exit(0);}
	});
	
	//Layoutwahl:
	
	f.setLayout(null);
	//f.setLayout(new BorderLayout());
	//f.setLayout(new FlowLayout());
	
	//Elemente im Frame anordnen:
	l.setSize(400,200);
	l.setLocation(0,0);
	l.setBackground(rgb);
	
	lRot.setSize(40,15);
	lRot.setLocation(10,210);
	
	lGruen.setSize(40,15);
	lGruen.setLocation(10,230);
	
	lBlau.setSize(40,15);
	lBlau.setLocation(10,250);
	
	scR.setSize(256,15);
	scR.setLocation(50,210);
	
	scG.setSize(256,15);
	scG.setLocation(50,230);
	
	scB.setSize(256,15);
	scB.setLocation(50,250);
	
	nR.setSize(25,15);
	nR.setLocation(320,210);
	
	nG.setSize(25,15);
	nG.setLocation(320,230);
	
	nB.setSize(25,15);
	nB.setLocation(320,250);
	
	tf.setSize(100,25);
	tf.setLocation(120,270);
	
	// copy.setSize(100,25);
// 	copy.setLocation(225,270);
	
	close.setSize(100,25);
	close.setLocation(120,300);
		
	//Elemente hinzufügen:
	f.add(l, BorderLayout.NORTH);
	f.add(lRot, BorderLayout.CENTER);
	f.add(lGruen, BorderLayout.CENTER);
	f.add(lBlau, BorderLayout.CENTER);
	f.add(scR, BorderLayout.CENTER);
	f.add(scG, BorderLayout.CENTER);
	f.add(scB, BorderLayout.CENTER);
	f.add(nR, BorderLayout.CENTER);
	f.add(nG, BorderLayout.CENTER);
	f.add(nB, BorderLayout.CENTER);
	f.add(tf, BorderLayout.SOUTH);
	// f.add(copy, BorderLayout.SOUTH);
	f.add(close, BorderLayout.SOUTH);
	//Ende
	}
}