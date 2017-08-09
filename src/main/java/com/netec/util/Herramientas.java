
package com.netec.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Java
 */
public  class Herramientas {
    
    public static Date getFecha(String fecha)
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        String strFecha = fecha;
        Date fechaDate = null;
        
        try
        {
            fechaDate = formato.parse(strFecha);
            return fechaDate;
        }catch(ParseException e){
            e.printStackTrace();
            return fechaDate;
        }
    }
    
}
