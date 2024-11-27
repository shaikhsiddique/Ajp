/*Write a program using AWT to create a menubar where menubar contains menu items such as File, Edit, contains menu items such as File, Edit,View and create a submenu underthe File menu: New 
and Open.  */                                                                                                                                                

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class prac5 extends Applet {
    public void init() {
        MenuBar mb = new MenuBar();
        
        Menu file = new Menu("File");
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        file.add(newItem);
        file.add(openItem);
        
        Menu edit = new Menu("Edit");
        Menu view = new Menu("View");
        
        mb.add(file);
        mb.add(edit);
        mb.add(view);
        
        setMenuBar(mb);
    }
}
/*
  <applet code="prac5.class" width="400" height="300">
    </applet>
 */