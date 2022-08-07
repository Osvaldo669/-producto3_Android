package com.example.practica3;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleySingle {

    private RequestQueue requestQueue;
    private  static  VolleySingle mInstance;

    private VolleySingle(Context context){
        requestQueue = Volley.newRequestQueue(context.getApplicationContext());
    }

    public static  synchronized VolleySingle getmInstance(Context context){
        if(mInstance==null){
            mInstance= new VolleySingle(context);
        }
        return  mInstance;
    }

    public  RequestQueue getRequestQueue(){return requestQueue;}
}
