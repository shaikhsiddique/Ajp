/*
 * prac15: Write a program to demonstrate the use of the URL class
 * to retrieve details like protocol, host, port, and file for a given URL.
 *
 * <applet code="prac15.class" width="400" height="300">
 * </applet>
 */

 import java.applet.Applet;
 import java.awt.Graphics;
 import java.net.URL;
 
 public class prac15 extends Applet {
     String protocol = "";
     String host = "";
     String port = "";
     String file = "";
 
     @Override
     public void init() {
         try {
             URL url = new URL("http://www.msbte.org.in");
             protocol = "Protocol: " + url.getProtocol();
             host = "Host: " + url.getHost();
             port = "Port: " + (url.getPort() == -1 ? "Default Port" : url.getPort());
             file = "File: " + url.getFile();
         } catch (Exception e) {
             protocol = "Error: " + e.getMessage();
         }
     }
 
     @Override
     public void paint(Graphics g) {
         g.drawString(protocol, 20, 20);
         g.drawString(host, 20, 40);
         g.drawString(port, 20, 60);
         g.drawString(file, 20, 80);
     }
 }
/*<applet code="prac15.class" width="400" height="300"></applet> */ 