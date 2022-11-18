import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator implements ActionListener {
    Frame f=new Frame();
    Label l=new Label("  Basic Calculator");
    Label l1=new Label("First Number");
    Label l2=new Label("Second Number");
    Label l3=new Label("Result");


    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();

    Button b1=new Button("+");
    Button b2=new Button("-");
    Button b3=new Button("*");
    Button b4=new Button("/");
    Button b5=new Button("Clear");
    Button b6=new Button("Exit");

    BasicCalculator(){
        l.setBounds(120,60,100,20);
        l1.setBounds(50,100,100,20);
        l2.setBounds(50,140,100,20);
        l3.setBounds(50,180,100,20);

        t1.setBounds(200,100,100,20);
        t2.setBounds(200,140,100,20);
        t3.setBounds(200,180,100,20);

        b1.setBounds(12,250,50,20);
        b2.setBounds(80,250,50,20);
        b3.setBounds(145,250,50,20);
        b4.setBounds(210,250,50,20);
        b5.setBounds(280,250,50,20);
        b6.setBounds(340,250,50,20);

        f.add(l);
        f.add(l1);
        f.add(l2);
        f.add(l3);


        f.add(t1);
        f.add(t2);
        f.add(t3);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,350);
        f.setLocation(500,200);
        f.setBackground(Color.green);
        f.setTitle("Basic Calculator");


    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==b1){
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(n1+n2));
        }
        if(e.getSource()==b2){
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(n1-n2));
        }
        if(e.getSource()==b3){
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(n1*n2));
        }
        if(e.getSource()==b4){
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(n1/n2));
        }
        if(e.getSource()==b5){
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
        if(e.getSource()==b6){
            System.exit(1);
        }

    }

    public static void main(String[] args){
        new BasicCalculator();
    }
}
