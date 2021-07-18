package com.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class getHoraActual {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        System.out.println("Hora actual: " + dateFormat.format(date));
    }
}
