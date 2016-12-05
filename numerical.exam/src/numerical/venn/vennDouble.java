/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerical.venn;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.util.Set;


/**
 *
 * @author Aca
 */
public class vennDouble extends JFrame
{
    String a, b, ab, u, n;
    
    public vennDouble()
    {
        setTitle("Venn Diagram Double Set");
        setSize(500,350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    void initStrings()
    {
        a = "";
        b = "";
        ab = "";
        u = "";
        n = "";
    }
    
    private void setContainers(int A_, int B_, int a_b_, int u_)
    {
        initStrings();
        a = String.valueOf(A_ - a_b_);
        b = String.valueOf(B_ - a_b_);
        ab = String.valueOf(a_b_);
        n = String.valueOf(u_ - ((A_ + B_) - (a_b_)));
        u = String.valueOf(u_);
    }
    
    public void paint(Graphics g)
    {
        //String A = "A = " + String.valueOf(A_set);
        //String U = "U = " + String.valueOf(U_set);
        g.setColor(Color.YELLOW);
        g.fillOval(200, 50, 200, 200);
        g.setColor(Color.CYAN);
        g.fillOval(100, 50, 200, 200);
        g.setColor(Color.BLACK);
        g.drawOval(100, 50, 200, 200);
        g.drawOval(200, 50, 200, 200);
        g.drawString("a = " + a, 125, 175);
        g.drawString("b = " + b, 325, 175);
        g.drawString("A^B = " + ab, 225, 175);
        g.drawString("U = " + u, 50, 50);
        g.drawString("N = " + n, 50, 300);
        //g.drawChars(testCharArr(), 10, 100, 300, 300);
        
        
        
    }
    
    public static void drawDoubleVenn(int A_set, int B_set, int A_int_B, int Universal)
    {
        vennDouble d = new vennDouble();
        d.setContainers(A_set, B_set, A_int_B, Universal);
        d.paint(null);
    }
    
    public static void main(String[] args)
    {
        drawDoubleVenn(100, 100, 50, 200);
    }
 
}