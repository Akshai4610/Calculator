import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener
{
    boolean OperatorClicked=false;
    String OldValues;
    String NewValues;
    int Option=0;
    Float Result;
    JFrame jf;
    JLabel displayLabel;
    JButton Seven;JButton Eight;JButton Nine;JButton Four;JButton Five;JButton Six;
    JButton One;JButton Two;JButton Three;JButton Zero;JButton Point; JButton Equel;
    JButton Division;JButton Multiplication;JButton Subtraction;JButton Addition;
    JButton Clear;
    public Calculator()
    {
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(500,500);
        jf.setLocation(400,150);
        
        displayLabel=new JLabel();
        displayLabel.setBounds(30,25,420,45);
        displayLabel.setBackground(Color.CYAN);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.BLUE);
        jf.add(displayLabel);

        Seven=new JButton("7");
        Seven.setBounds(30,150,80,60);
        Seven.setFont(new Font("Caliberi",Font.BOLD,30));
        Seven.addActionListener(this);
        jf.add(Seven);
        
        Eight=new JButton("8");
        Eight.setBounds(120,150,80,60);
        Eight.setFont(new Font("Caliberi",Font.BOLD,30));
        Eight.addActionListener(this);
        jf.add(Eight);

        Nine=new JButton("9");
        Nine.setBounds(210,150,80,60);
        Nine.setFont(new Font("Caliberi",Font.BOLD,30));
        Nine.addActionListener(this);
        jf.add(Nine);

        Four=new JButton("4");
        Four.setBounds(30,220,80,60);
        Four.setFont(new Font("Caliberi",Font.BOLD,30));
        Four.addActionListener(this);
        jf.add(Four);

        Five=new JButton("5");
        Five.setBounds(120,220,80,60);
        Five.setFont(new Font("Caliberi",Font.BOLD,30));
        Five.addActionListener(this);
        jf.add(Five);

        Six=new JButton("6");
        Six.setBounds(210,220,80,60);
        Six.setFont(new Font("Caliberi",Font.BOLD,30));
        Six.addActionListener(this);
        jf.add(Six);

        One=new JButton("1");
        One.setBounds(30,290,80,60);
        One.setFont(new Font("Caliberi",Font.BOLD,30));
        One.addActionListener(this);
        jf.add(One);

        Two=new JButton("2");
        Two.setBounds(120,290,80,60);
        Two.setFont(new Font("Caliberi",Font.BOLD,30));
        Two.addActionListener(this);
        jf.add(Two);

        Three=new JButton("3");
        Three.setBounds(210,290,80,60);
        Three.setFont(new Font("Caliberi",Font.BOLD,30));
        Three.addActionListener(this);
        jf.add(Three);

        Zero=new JButton("0");
        Zero.setBounds(120,360,80,60);
        Zero.setFont(new Font("Caliberi",Font.BOLD,30));
        Zero.addActionListener(this);
        jf.add(Zero);

        Point=new JButton(".");
        Point.setBounds(30,360,80,60);
        Point.setFont(new Font("Caliberi",Font.BOLD,30));
        Point.addActionListener(this);
        jf.add(Point);

        Equel=new JButton("=");
        Equel.setBounds(210,360,80,60);
        Equel.setFont(new Font("Caliberi",Font.BOLD,30));
        Equel.addActionListener(this);
        jf.add(Equel);

        Division=new JButton("/");
        Division.setBounds(310,150,80,60);
        Division.setFont(new Font("Caliberi",Font.BOLD,30));
        Division.addActionListener(this);
        jf.add(Division);

        Multiplication=new JButton("x");
        Multiplication.setBounds(310,220,80,60);
        Multiplication.setFont(new Font("Caliberi",Font.BOLD,30));
        Multiplication.addActionListener(this);
        jf.add(Multiplication);

        Subtraction=new JButton("-");
        Subtraction.setBounds(310,290,80,60);
        Subtraction.setFont(new Font("Caliberi",Font.BOLD,30));
        Subtraction.addActionListener(this);
        jf.add(Subtraction);

        Addition=new JButton("+");
        Addition.setBounds(310,360,80,60);
        Addition.setFont(new Font("Caliberi",Font.BOLD,30));
        Addition.addActionListener(this);
        jf.add(Addition);

        Clear=new JButton("Clear");
        Clear.setBounds(310,80,80,60);
        Clear.setFont(new Font("Caliberi",Font.BOLD,15));
        Clear.addActionListener(this);
        jf.add(Clear);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String ar[])
    {
        Calculator c=new Calculator();
    }
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==Seven)
        {
            if(OperatorClicked==true)
            {
                displayLabel.setText("7");
                OperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"7");
            }
        }
        else if(e.getSource()==Eight)
        {
            if(OperatorClicked==true)
            {
                displayLabel.setText("8");
                OperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"8");
            }
        }
        else if(e.getSource()==Nine)
        {
            if(OperatorClicked==true)
            {
                displayLabel.setText("9");
                OperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"9");
            }
        }
        else if(e.getSource()==Four)
        {
            if(OperatorClicked==true)
            {
                displayLabel.setText("4");
                OperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"4");
            }
        }
        else if(e.getSource()==Five)
        {
            if(OperatorClicked==true)
            {
                displayLabel.setText("5");
                OperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"5");
            }
        }
        else if(e.getSource()==Six)
        {
            if(OperatorClicked==true)
            {
                displayLabel.setText("6");
                OperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"6");
            }
        }
        else if(e.getSource()==One)
        {
            if(OperatorClicked==true)
            {
                displayLabel.setText("1");
                OperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"1");
            }
        }
        else if(e.getSource()==Two)
        {
            if(OperatorClicked==true)
            {
                displayLabel.setText("2");
                OperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"2");
            }
        }
        else if(e.getSource()==Three)
        {
            if(OperatorClicked==true)
            {
                displayLabel.setText("3");
                OperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"3");
            }
        }
        else if(e.getSource()==Zero)
        {
            if(OperatorClicked==true)
            {
                displayLabel.setText("0");
                OperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"0");
            }
        }
        else if(e.getSource()==Point)
        {
            if(OperatorClicked)
            {
                displayLabel.setText(".");
                OperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+".");
            }
        }
        else if(e.getSource()==Equel)
        {
            if(Option==1)
            {
                NewValues=displayLabel.getText();
                Float OldValuesF=Float.parseFloat(OldValues);
                Float NewValuesF=Float.parseFloat(NewValues);
                Result=OldValuesF/NewValuesF;
                displayLabel.setText(Result+"");
            }
            else if(Option==2)
            {
                NewValues=displayLabel.getText();
                Float OldValuesF=Float.parseFloat(OldValues);
                Float NewValuesF=Float.parseFloat(NewValues);
                Result=OldValuesF*NewValuesF;
                displayLabel.setText(Result+"");
            }
            else if(Option==3)
            {
                NewValues=displayLabel.getText();
                Float OldValuesF=Float.parseFloat(OldValues);
                Float NewValuesF=Float.parseFloat(NewValues);
                Result=OldValuesF-NewValuesF;
                displayLabel.setText(Result+"");
            }
            else if(Option==4)
            {
                NewValues=displayLabel.getText();
                Float OldValuesF=Float.parseFloat(OldValues);
                Float NewValuesF=Float.parseFloat(NewValues);
                Result=OldValuesF+NewValuesF;
                displayLabel.setText(Result+"");
            }
        }
        else if(e.getSource()==Division)
        {
            OperatorClicked=true;
            OldValues=displayLabel.getText();
            Option=1;
        }
        else if(e.getSource()==Multiplication)
        {
            OperatorClicked=true;
            OldValues=displayLabel.getText();
            Option=2;
        }
        else if(e.getSource()==Subtraction)
        {
            OperatorClicked=true;
            OldValues=displayLabel.getText();
            Option=3;
        }
        else if(e.getSource()==Addition)
        {
            OperatorClicked=true;
            OldValues=displayLabel.getText();
            Option=4;
        }
        else if(e.getSource()==Clear)
        {
            displayLabel.setText("");
        }
    }
}