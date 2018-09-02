 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meioTransporte;

import meioLocomocao.Locomocao;

/**
 *
 * @author denis
 */
public  abstract class Transporte {
    
    protected Locomocao locomocao;
    
    public void locomover(){
        locomocao.getLocomover();
    }
}
