/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author SHREE
 */
public class openPdf {
    public static void openById(String id){
       try{
       if((new File("E:\\"+id+".pdf")).exists()){
       Process p=Runtime
               .getRuntime()
               .exec("rundll32 url.dll,FileProtocolHandler E:\\"+id+".pdf");           
       }
       else
           JOptionPane.showMessageDialog(null, "File does not Exists");
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }
}
