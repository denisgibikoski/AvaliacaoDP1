/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AeroportoFacede;

/**
 *
 * @author denis
 */
public class ProcedimentoPousar extends Procedimento implements Aeroporto{

    @Override
    public Procedimento getProcedimento() {
     ProcedimentoPousar procedimentoPousar = new ProcedimentoPousar();
       System.out.println("Pousando........");
       
       return procedimentoPousar;
    }
    
}
