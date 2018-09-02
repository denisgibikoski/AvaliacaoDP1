/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodFactory;

import meioTransporte.Automovel;
import meioTransporte.Aviao;
import meioTransporte.Navio;
import meioTransporte.Transporte;

/**
 *
 * @author denis
 */
public abstract class TransporteFactoryConcreto extends TransporteFactory {

    @Override
    protected Transporte createTransporte(String tipo) {

        switch (tipo) {
            
            case "AUTOMOVEL":
                return new Automovel();
            case "NAVIO":
                return new Navio();
            case "AVIAO":
                return new Aviao();
            default:
                break;
        }
        return null;

    }

}
