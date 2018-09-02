/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.Calendar;

/**
 *
 * @author denis
 */
public class SingletonLog {
    
    private static SingletonLog instancia;
    
    private SingletonLog(){
        
    }
    
    public void doLog(String descricaoEnvento){
        SingletonBD.getInstancia().doLogBanco();
        System.out.println(Calendar.getInstance().getTime()+": "+descricaoEnvento);
        
    }
    public  static  SingletonLog getInstance(){
        if (instancia == null) {
            instancia =  new SingletonLog();
        }
        return  instancia;
    }
    
}
