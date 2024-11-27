/*
 * prac14: Write a program to demonstrate the use of the InetAddress class
 * to retrieve host names and IP addresses for a given domain and local machine.
 */

 import java.applet.Applet;
 import java.awt.*;
 import java.net.InetAddress;
 
 public class prac14 extends Applet {
     StringBuilder output = new StringBuilder();
 
     @Override
     public void init() {
         try {
             // Get information for a specific domain
             InetAddress address1 = InetAddress.getByName("www.msbte.org.in");
             output.append("Host Name: ").append(address1.getHostName()).append("\n");
             output.append("IP Address: ").append(address1.getHostAddress()).append("\n\n");
 
             // Get information for the local host
             InetAddress localAddress = InetAddress.getLocalHost();
             output.append("Local Host Name: ").append(localAddress.getHostName()).append("\n");
             output.append("Local IP Address: ").append(localAddress.getHostAddress()).append("\n\n");
 
             // Get information for a specific IP address
             byte[] ip = {127, 0, 0, 1};
             InetAddress address2 = InetAddress.getByAddress(ip);
             output.append("Host Name for 127.0.0.1: ").append(address2.getHostName()).append("\n");
             output.append("IP Address for 127.0.0.1: ").append(address2.getHostAddress()).append("\n\n");
 
             // Check if the domain is reachable
             boolean reachable = address1.isReachable(5000); // 5-second timeout
             output.append("Is www.msbte.org.in reachable? ").append(reachable ? "Yes" : "No").append("\n");
         } catch (Exception e) {
             output.append("Error: ").append(e.getMessage());
         }
     }
 
     @Override
     public void paint(Graphics g) {
         g.drawString(output.toString(), 10, 20);
     }
 }
 
 /*
 <applet code="prac14.class" width="400" height="300">
 </applet>
 */
 