/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author mbarbosa
 */
@ManagedBean
@ViewScoped
public class IndexBean implements Serializable{
    
    public String InsertarUsuario(){
      //System.out.println("Ingreso ..");
      return "Usuario";
   }
    
}
