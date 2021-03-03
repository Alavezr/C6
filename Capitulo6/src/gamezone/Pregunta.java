/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone;

/**
 *
 * @author alave
 */
public class Pregunta {
    
    private String texto;
    private Respuesta[] respuesta;
    private int indice;
    
    public Pregunta(String texto){
        this.texto = texto;
        this.respuesta = new Respuesta[4];
        
    }
    
    public void addRespuesta(Respuesta respuesta){
        if(indice <= 3){
            this.respuesta[indice]=respuesta;
            indice ++;
        
        
        }
    
    
    
    }
    public boolean contestar(int indice){
        return this.respuesta[indice].getStatus();
    }
}
