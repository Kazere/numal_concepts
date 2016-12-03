/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerical.venn;
import org.javatuples.*;

/**
 *
 * @author Aca
 */
public class venn_main {
    
}

class venn {
    //All the variables 
    static int a, b, c,
    ab, ac, bc,
    abc,
    A, B, C, U;
    
    
    //Single Venn Diagram
    public static int single_A(int N_, int U_){
        int A_ = U_ - N_;
        return A_;
    }
    
    public static int single_N(int A_, int U_){
        int N_ = U_ - A_;
        return N_;
    }
    
    public static int single_U(int A_, int N_){
        int U_ = A_ + N_;
        return U_;
    }
    
    //Double Venn Diagram
    //public static int double_
}
