/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import AeroportoFacede.AeroportoFacede;
import AeroportoFacede.Procedimento;
import meioTransporte.Transporte;
import methodFactory.TransporteFactory;
import methodFactory.Transportes;

/**
 *
 * @author denis
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TransporteFactory  transportes = new Transportes();
     
        
        Transporte aviao = transportes.fazerEntrega("AR");
        
        Transporte navio = transportes.fazerEntrega("AGUA");
        
        Transporte carro = transportes.fazerEntrega("TERRA");
        
        
        AeroportoFacede aeroporto = new AeroportoFacede();
        
        Procedimento procedimentoDecolar = aeroporto.getProcedimento(AeroportoFacede.DECOLAR);
        
         Procedimento procedimentoPousar = aeroporto.getProcedimento(AeroportoFacede.POUSAR);
        
    }
    
}
