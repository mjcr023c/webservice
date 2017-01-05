/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.text.Format;

/**
 *
 * @author MJCR-L
 */
public class convierteUTCISO {

    public String convierteHoraMilisegundosAUTCISO(long horaMilis) {
        Date curDate = new Date(horaMilis);
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd'T'hh:mm:ss.s'TZD'");
//        format.setTimeZone(TimeZone.getTimeZone("GMT"));
        String DateToStr = format.format(curDate);
        return DateToStr;
    }

//    public static void main(String args[]) {
//        System.out.println(convierteHoraMilisegundosAUTCISO(99999));
//    }
}
