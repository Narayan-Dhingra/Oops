package com.example.oops;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    hotel.hotelx hotelx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hotel hotel = new hotel();/*("test hotel", "Delhi", 100, 80);*/
        hotel hotel2 = new hotel(); /* ("test hotel2", "mumbai", 88, 62); */
        hotel.setName("taj");
        Log.d("narayan", "hotel 1 name " +hotel.getName());
        hotel.setNo_of_rooms(90);
        Log.d("narayan", "hotel 1 rooms" +hotel.getNo_of_rooms());
        Log.d("narayan", "hotel 2 rooms " +hotel2.getNo_of_rooms());

        int freeRooms = hotel.calculate_available_rooms(hotel.getNo_of_rooms(), hotel.getNo_of_booked_rooms());
        Log.d("narayan", "free rooms in hotel 1 " +freeRooms);


//        hotelx.setPayments(500);
//        hotelx = new hotel.hotelx();
//        Log.d("narayan", "Protected modifier attribute from hotel class :" +hotelx.getPayments() );



    }

}
