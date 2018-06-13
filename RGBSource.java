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
// 	private Button copy;
// 	private Button close;
	private Label l;
	private Label lRot;
	private Label lGruen;
	private Label lBlau;
	private Label nR;
	private Label nG;
	private Label nB;
	private Label history;
	private Label h1;
	private Label h2;
	private Label h3;
	private Label h4;
	private Label h5;
	private Label h6;
	private Label h7;
	private Label be;
	private Button save;
//	private Button set;
	private TextField tf;
	private int rot;
	private int gruen;
	private int blau;
	private Color rgb;
	private Color rgb1;
	private Color rgb2;
	private Color rgb3;
	private Color rgb4;
	private Color rgb5;
	private Color rgb6;
	private Color rgb7;
	private String rgbString;
//	public Clipboard clipboard;
//	private MenuBar menu = new MenuBar();


	//Ende
	public RGBSource()
	{
	//Aufrufen und bezeichnen der Elemente:
	f = new Frame();
	l = new Label("");
	rot = 125;
	gruen = 125;
	blau = 125;
//	clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	rgbString = (rot+","+gruen+","+blau);
	rgb = new Color(rot,gruen,blau);
	rgb1 = new Color(rot,gruen,blau);
	rgb2 = new Color(rot,gruen,blau);
	rgb3 = new Color(rot,gruen,blau);
	rgb4 = new Color(rot,gruen,blau);
	rgb5 = new Color(rot,gruen,blau);
	rgb6 = new Color(rot,gruen,blau);
	rgb7 = new Color(rot,gruen,blau);
	scR = new Scrollbar(Scrollbar.HORIZONTAL,125,1,0,256);
	scG = new Scrollbar(Scrollbar.HORIZONTAL,125,1,0,256);
	scB = new Scrollbar(Scrollbar.HORIZONTAL,125,1,0,256);
	lRot = new Label("Rot");
	lGruen = new Label("Grün");
	lBlau = new Label("Blau");
	nR = new Label("125");
	nG = new Label("125");
	nB = new Label("125");
	history = new Label("Historie");
	h1 = new Label("");
	h2 = new Label("");
	h3 = new Label("");
	h4 = new Label("");
	h5 = new Label("");
	h6 = new Label("");
	h7 = new Label("");
	be = new Label("");
	save = new Button("Speichern");
//	set = new Button("Setzen");
	tf = new TextField(rgbString+"");
// 	copy = new Button("Kopieren");
// 	close = new Button("Schließen");
// 	Menu RGB = new Menu("RGB");
// 	MenuItem saveinmenu = new MenuItem("Speichern");
// 	MenuItem closeinmenu = new MenuItem("Schließen");
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
	//-Copy:
// 	copy.addActionListener(new ActionListener(){
// 	public void actionPerformed(ActionEvent e)
// 		{
// 		
// 		}
// 	});
	//-Textfeld-Set
// 	set.addActionListener(new ActionListener(){
// 	public void actionPerformed(ActionEvent e)
// 	{
// 		
// 		rgb = new Color(convrot,convgruen,convblau);
// 		l.setBackground(rgb);
// 	}
// 	});
	//-Save:
	save.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
		{
			rgb7 = rgb6;
			rgb6 = rgb5;
			rgb5 = rgb4;
			rgb4 = rgb3;
			rgb3 = rgb2;
			rgb2 = rgb1;
			rgb1 = rgb;
			h1.setBackground(rgb1);
			h2.setBackground(rgb2);
			h3.setBackground(rgb3);
			h4.setBackground(rgb4);
			h5.setBackground(rgb5);
			h6.setBackground(rgb6);
			h7.setBackground(rgb7);
		}
	});
	//-Read:
//		h1.addActionListener(new ActionListener(){
//		public void actionPerformed(ActionEvent e)
// 		{
// 			rgb = rgb1;
// 			l.setBackground(rgb);
// 		}
// 	});
			
	//-Schließen:
//	close.addActionListener(new ActionListener(){
// 	public void actionPerformed(ActionEvent e)
// 		{System.exit(0);}
// 	});
	
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
	
	history.setSize(50,15);
	history.setLocation(10,275);
	
	h1.setSize(15,15);
	h1.setLocation(70,275);
	h1.setBackground(rgb1);
	
	h2.setSize(15,15);
	h2.setLocation(90,275);
	h2.setBackground(rgb2);
	
	h3.setSize(15,15);
	h3.setLocation(110,275);
	h3.setBackground(rgb3);
	
	h4.setSize(15,15);
	h4.setLocation(130,275);
	h4.setBackground(rgb4);
	
	h5.setSize(15,15);
	h5.setLocation(150,275);
	h5.setBackground(rgb5);
	
	h6.setSize(15,15);
	h6.setLocation(170,275);
	h6.setBackground(rgb6);
	
	h7.setSize(15,15);
	h7.setLocation(190,275);
	h7.setBackground(rgb7);
	
	be.setSize(50,15);
	be.setLocation(10,295);
	
	save.setSize(70,15);
	save.setLocation(210,275);
		
	tf.setSize(95,25);
	tf.setLocation(70,295);
	
// 	copy.setSize(95,25);
//  copy.setLocation(170,295);
	
// 	close.setSize(100,25);
// 	close.setLocation(270,295);
		
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
	f.add(history, BorderLayout.CENTER);
	f.add(h1, BorderLayout.CENTER);
	f.add(h2, BorderLayout.CENTER);
	f.add(h3, BorderLayout.CENTER);
	f.add(h4, BorderLayout.CENTER);
	f.add(h5, BorderLayout.CENTER);
	f.add(h6, BorderLayout.CENTER);
	f.add(h7, BorderLayout.CENTER);
	f.add(be, BorderLayout.CENTER);
	f.add(tf, BorderLayout.SOUTH);
	f.add(save, BorderLayout.CENTER);
// 	f.add(copy, BorderLayout.SOUTH);
//	f.add(close, BorderLayout.SOUTH);

	
//	RGB.add(saveinmenu);
// 	RGB.add(closeinmenu);


	//Ende
	}
}