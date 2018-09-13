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
public class ProcedimentoDecolar extends Procedimento implements Aeroporto{



    @Override
    public Procedimento getProcedimento() {
     ProcedimentoDecolar procedimentoDecolar = new ProcedimentoDecolar();
       System.out.println("Decolando........");
       
       return procedimentoDecolar; }
    
}
