/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meioTransporte;

import meioLocomocao.Locomocao;
import singleton.SingletonLog;

/**
 *
 * @author denis
 */
public class MeioAerio implements Locomocao{

    @Override
    public void getLocomover() {
    
        SingletonLog.getInstance().doLog("Locomove Pelo AR");
    
    }
    
}
