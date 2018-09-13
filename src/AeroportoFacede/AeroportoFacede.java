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
public class AeroportoFacede {
    
    public static final int DECOLAR=0;
    public static final int POUSAR=1;
    
    public Procedimento getProcedimento(int tipo){
        switch(tipo){
            case DECOLAR:
                Aeroporto decolando = new ProcedimentoDecolar();
                return decolando.getProcedimento();
            case POUSAR:
                Aeroporto pousar = new ProcedimentoPousar();
                return pousar.getProcedimento();
             default:
                 return null;
        }
       
    }
    
}
