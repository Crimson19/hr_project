package com.iotek.Util;

import java.util.Date;
import java.sql.Timestamp;

public class TimeUtil {
    public  static Timestamp getTimeStamp(){
        return   new Timestamp(new Date().getTime());
    }
}