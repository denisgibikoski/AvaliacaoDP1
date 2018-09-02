/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodFactory;

import meioTransporte.Transporte;

/**
 *
 * @author denis
 */
public abstract class TransporteFactory {

    protected abstract Transporte createTransporte(String tipo);

    public Transporte fazerEntrega(String tipo) {
        Transporte t = createTransporte(tipo);
        t.locomover();
        return t;
    }

}
