import java.awt.*;
class AddDemo extends Frame
{
   Label l1,l2,l3;
   TextField t1,t2,t3;
   Button b1,b2;
   AddDemo()
   {
	 setVisible(true);
	setSize(500,500);
	setTitle("Addition");
	setLayout(new FlowLayout());
	l1=new Label("Enter First No");
	l2=new Label("Enter Second No");
	l3=new Label("Result");
	t1=new TextField(10);
	t2=new TextField(10);
	t3=new TextField(10);
	b1=new Button("Add");
	b2=new Button("clear");
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(l3);
	add(t3);
	add(b1);
	add(b2);
   }
public static void main(String arg[])
{
     AddDemo ob=new AddDemo();
}
}