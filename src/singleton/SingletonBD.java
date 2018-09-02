/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;


/**
 *
 * @author denis
 */
public class SingletonBD {

    private static SingletonBD instancia;
    
    private SingletonBD() {
        System.out.println("Conecao com o Banco de Dados Criada");
    }
    
    public static  SingletonBD  getInstancia(){
        if(instancia == null){
            instancia =  new SingletonBD();
        }else
            System.out.println("Conexao Reutinizada");
        return instancia;
    }
    
     public void doLogBanco(){
        System.out.println("Salvo no banco");
        
    }
    
    
}
