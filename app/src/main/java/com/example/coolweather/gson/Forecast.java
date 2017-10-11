package com.example.coolweather.gson;

/**
 * Created by Administrator on 2017/10/9.
 */

public class Forecast {
    public  String date;
    public More more;
    public Temperature temperature;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        public String info;
    }
}
