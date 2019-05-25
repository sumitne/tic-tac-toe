import java.awt.*;
import java.awt.event.*;
public class TTT extends Frame {
	Dialog d;
	public static String i = "X"; //for play button
	
	int k =0;
	public static String s1="10";
	public static String s2="2";
	public static String s3="3";
	public static String s4="4";
	public static String s5 ="5";//for taking values of buttons
	public static String s6="6";
	public static String s7="7";
	public static String s8=("8");
	public static String s9 = "9";
	Frame ff = new Frame();
	Font f = new Font("Sumit",Font.BOLD,50);
	Font f1 = new Font("Sumit",Font.ITALIC,50); 
	public void result(){
		if(s1==s2&&s2==s3){
			d.setFont(f);
			d.add(new Label(s1+(" WINS"),Label.CENTER));
			d.setVisible(true);
			d.add(new Label(null,Label.CENTER));
		}
		else if(s1==s4&&s4==s7){
			d.setFont(f);
			d.add(new Label(s1+(" WINS"),Label.CENTER));
			d.setVisible(true);
		}
		else if(s1==s5&&s5==s9){
			d.setFont(f);
			d.add(new Label(s1+(" WINS"),Label.CENTER));
			d.setVisible(true);
		}
		else if(s2==s5&&s5==s8){
			d.setFont(f);
			d.add(new Label(s2+(" WINS"),Label.CENTER));
			d.setVisible(true);
		}
		else if(s3==s5&&s5==s7){
			d.setFont(f);
			d.add(new Label(s3+(" WINS"),Label.CENTER));
			d.setVisible(true);
		}
		else if(s3==s6&&s6==s9){
			d.setFont(f);
			d.add(new Label(s3+(" WINS"),Label.CENTER));
			d.setVisible(true);
		}
		else if(s4==s5&&s5==s6){
			d.setFont(f);
			d.add(new Label(s4+(" WINS"),Label.CENTER));
			d.setVisible(true);
		}
		else if(s7==s8&&s8==s9){
			d.setFont(f);
			d.add(new Label(s7+(" WINS"),Label.CENTER));
			d.setVisible(true);
		}
else if (s1!="10"&&s2!="2"&&s3!="3"&&s4!="s4"&&s5!="5"&&s6!="6"&&s7!="7"&&s8!="8"&&s9!="9"){
	d.setFont(f);
	d.add(new Label("DRAW",Label.CENTER));
	d.setVisible(true);
}
		
	
		else{
			
		}
	}
	TTT(){
		
	    Button b1 = new Button();
		Button b2 = new Button();
		Button b3 = new Button();
		Button b4 = new Button();
		Button b5 = new Button();
		Button b6 = new Button();
		Button b7 = new Button();
		Button b8 = new Button();
		Button b9 = new Button();
		Button play = new Button("play");
		Button close = new Button("X");
		Button closed = new Button("Exit");
		Button ng = new Button("New Game");
		final TextField t = new TextField("       TIC TAC TOE");
		d= new Dialog(ff,"Result",true);
		t.setBounds(40,40,522,100);
		t.setBackground(Color.LIGHT_GRAY);
		t.setFont(f1);
		t.setEnabled(false);
		play.setBounds(600,150,180,180);
		play.setBackground(Color.YELLOW);
		play.setFont(f1);
		b1.setBounds(40,150,180,180);
		b1.setFont(f);
		b1.setBackground(Color.RED);
		b2.setBounds(215,150,180,180);
		b2.setBackground(Color.RED);
		b2.setFont(f);
		b3.setBounds(380,150,180,180);
		b3.setBackground(Color.RED);
		b3.setFont(f);
		b4.setBounds(40,320,180,180);
		b4.setBackground(Color.BLUE);
		b4.setFont(f);
		b5.setBounds(215,320,180,180);
		b5.setBackground(Color.BLUE);
		b5.setFont(f);
		b6.setBounds(380,320,180,180);
		b6.setBackground(Color.BLUE);
		b6.setFont(f);
		b7.setBounds(40,490,180,180);
		b7.setBackground(Color.GREEN);
		b7.setFont(f);
		b8.setBounds(215,490,180,180);
		b8.setBackground(Color.GREEN);
		b8.setFont(f);
		b9.setBounds(380,490,180,180);
		b9.setBackground(Color.GREEN);
		b9.setFont(f);
		close.setBounds(740,40,50,50);
		close.setFont(f);
		close.setBackground(Color.RED);
		closed.setBounds(390,340,100,50);
		closed.setBackground(Color.LIGHT_GRAY);
		ng.setBounds(10,340,270,50);
		ng.setBackground(Color.LIGHT_GRAY);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(t);
		add(play);
		add(close);
		setSize(800,800);
		setLayout(null);
		setVisible(true);
		close.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setVisible(false);
			}
		});
		closed.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ff.setVisible(false);              //for exit
				setVisible(false);
			}
		});
		ng.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ff.setVisible(false);
				i = "X";
				k=1;
				s1="10";
				s2="2";
				s3="3";
				s4="4";
				s5 ="5";//for taking values of buttons
			    s6="6";
				s7="7";
			    s8=("8");
				s9=("9");
				d= new Dialog(ff,"Result",true);
				d.setSize(500,400);
				d.add(closed);	
				d.add(ng);
				d.setLocationRelativeTo(null);
				d.setVisible(false);
				d.add(new Label(null,Label.CENTER));
				b1.setEnabled(true);
				b2.setEnabled(true);
				b3.setEnabled(true);
				b4.setEnabled(true);
				b5.setEnabled(true);
				b6.setEnabled(true);
				b7.setEnabled(true);
				b8.setEnabled(true);
				b9.setEnabled(true);             //for new game resetting all values to like before
				b1.setLabel(null);
				b2.setLabel(null);
				b3.setLabel(null);
				b4.setLabel(null);
				b5.setLabel(null);
				b6.setLabel(null);
				b7.setLabel(null);
				b8.setLabel(null);
				b9.setLabel(null);
			
				
		
			}
		});
		play.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				play.setLabel("");
						k=1;
			}
		});
		
		b1.addActionListener(new ActionListener(){
		 	public void actionPerformed(ActionEvent e){
		 		if(k==1){ //play button condition satisfied
				if(i.equals("0")){
				b1.setLabel(i);
				i="X";
				 s1 = b1.getLabel();
				b1.setEnabled(false);
				result();
				
				}
				else{
			   b1.setLabel(i);
			   i="0";
				 s1 = b1.getLabel();
				 
			   b1.setEnabled(false);
			   result();
				}
			
		 		}
				
			}
		});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(k==1){
				if(i.equals("0")){
				b2.setLabel(i);
				i="X";
				s2 = b2.getLabel();
				b2.setEnabled(false);
				result();
				}	
				else{
					b2.setLabel(i);
					i="0";
				 s2 = b2.getLabel();
					b2.setEnabled(false);
					result();
				}
				
				}
			}
		});
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(k==1){
				if(i.equals("0")){
				b3.setLabel(i);
				i="X";
			 s3 = b3.getLabel();
				b3.setEnabled(false);
				result();
				}
				else{
					b3.setLabel(i);
					i="0";
					 s3 = b3.getLabel();
					b3.setEnabled(false);
					result();
				}
			
				}
			}
		});
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(k==1){
				if(i.equals("0")){
				b4.setLabel(i);
				i="X";
				s4 = b4.getLabel();
				b4.setEnabled(false);
				result();
		         }
				else{
					b4.setLabel(i);
					i="0";
					s4 = b4.getLabel();
					b4.setEnabled(false);
					result();
				}
				}
			}
		});
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(k==1){
				if(i.equals("0")){
					b5.setLabel(i);
					i="X";
					s5 = b5.getLabel();
					b5.setEnabled(false);
					result();
					}
					else{
						b5.setLabel(i);
						i="0";
						s5 = b5.getLabel();
						b5.setEnabled(false);
						result();
					}
			}
			}
		});
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(k==1){
				if(i.equals("0")){
					b6.setLabel(i);
					i="X";
					s6 = b6.getLabel();
					b6.setEnabled(false);
					result();
					}
					else{
						b6.setLabel(i);
						i="0";
						s6 = b6.getLabel();
						b6.setEnabled(false);
						result();
					}
				}
			}
		});
		b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(k==1){
				if(i.equals("0")){
					b7.setLabel(i);
					i="X";
					s7 = b7.getLabel();
					b7.setEnabled(false);
					result();
					}
					else{
						b7.setLabel(i);
						i="0";
						s7 = b7.getLabel();
						b7.setEnabled(false);
						result();
					}
				}
			}
		});
		b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(k==1){
				if(i.equals("0")){
					b8.setLabel(i);
					i="X";
					s8 = b8.getLabel();
					b8.setEnabled(false);
					result();
					}
					else{
						b8.setLabel(i);
						i="0";
						s8 = b8.getLabel();
						b8.setEnabled(false);
						result();
					}
				}
			}
		});
		b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(k==1){
				if(i.equals("0")){
					b9.setLabel(i); 
					i="X";
					s9 = b9.getLabel();
					b9.setEnabled(false);
					result();
					}
					else{
						b9.setLabel(i);
						i="0";
						s9 = b9.getLabel();
						b9.setEnabled(false);
						result();
					}
				}
			}
		});
		
		setLocationRelativeTo(null);
		d.setSize(500,400);
		d.add(closed);	
		d.add(ng);
		d.setLocationRelativeTo(null);
		d.setVisible(false);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.fillRect(30,140, 540,540); //border
		g.fillRect(30,30,540,110);
	
	}
public static void main(String args[])
{
	new TTT();
}
}
