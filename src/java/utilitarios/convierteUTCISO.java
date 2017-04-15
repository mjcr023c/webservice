/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author MJCR-L
 */
public class convierteUTCISO {

    public String convierteHoraMilisegundosAUTCISO(long horaMilis) {
        Date curDate = new Date(horaMilis);
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd'T'hh:mm:ss.s'TZD'");
        String DateToStr = format.format(curDate);
        return DateToStr;
    }

}
