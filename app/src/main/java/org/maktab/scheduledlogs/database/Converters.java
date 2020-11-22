package org.maktab.scheduledlogs.database;

import androidx.room.TypeConverter;

import java.util.Date;

public class Converters {

    @TypeConverter
    public static Date LongToDate(long currentDate){
        return new Date(currentDate);
    }
    @TypeConverter
    public static Long DateToLong(Date date){
        return date.getTime();
    }

}
