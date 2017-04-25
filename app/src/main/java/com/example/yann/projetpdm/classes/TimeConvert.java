package com.example.yann.projetpdm.classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by Yann on 24/04/2017.
 */

public class TimeConvert {
    public static long hourToMs(int hour){
        return hour * 1000 * 3600;
    }
    public static long minToMs(int min){
        return min * 1000 * 60;
    }
    public static SimpleDateFormat getDateFormat(){
        return new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
    }
}
