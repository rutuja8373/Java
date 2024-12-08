import java.awt.*;
class screen extends Frame
{
   Menu file,edit,about;
   MenuItem i1,i2,i3,i4,i5;
   screen()
   {
	   setVisible(true);
	   setSize(500,500);
	   setLayout(new FlowLayout());
	   MenuBar mb=new MenuBar();
	   file=new Menu("File");
	   edit=new Menu("Edit");
	   about=new Menu("About");
	   i1=new MenuItem("New   ctrl+1");
	   i2=new MenuItem("Open");
	   i3=new MenuItem("Save");
	   i4=new MenuItem("show about");
	   i5=new MenuItem("Exit");
	   file.add(i1);
	   file.add(i2);
	   file.add(i3);
	   file.addSeparator();
	   file.add(i4);
	   file.addSeparator();
	   file.add(i5);
	   mb.add(file);
	   mb.add(edit);
	   mb.add(about);
	   setMenuBar(mb);
   }
}
class menu
{
	public static void main(String[] args) 
	{
		screen ob=new screen();
	}
}
