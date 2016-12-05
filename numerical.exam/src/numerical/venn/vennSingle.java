/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerical.venn;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics;


/**
 *
 * @author Aca
 */
public class vennSingle extends JFrame
{
    
    String a, u, n;
    
    void initStrings()
    {
        a = "";
        u = "";
        n = "";
    }
    
    private void setContainers(int A_, int u_)
    {
        initStrings();
        a = String.valueOf(A_);
        n = String.valueOf(u_ - A_);
        u = String.valueOf(u_);
    }
    
    
    public vennSingle()
    {
        setTitle("Venn Diagram Single Set");
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.CYAN);
        g.fillOval(100, 100, 200, 200);
        g.setColor(Color.BLACK);
        g.drawOval(100, 100, 200, 200);
        g.drawString("A = " + a, 180, 180);
        g.drawString("U = " + u, 100, 100);
        g.drawString("N = " + n, 100, 300);
    }
    
    public static void drawSingleVenn(int A_set, int U_set)
    {
        vennSingle s = new vennSingle();
        s.setContainers(A_set, U_set);
        s.paint(null);
    }
    
    public static void main(String[] args)
    {
        drawSingleVenn(50, 100);
    }
}