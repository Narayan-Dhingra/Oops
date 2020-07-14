package com.example.oops;

import android.util.Log;

public class hotel {
    private String name;
    private String place;
    private int no_of_rooms;
    private int no_of_booked_rooms;

    protected int payments = 0;



//    public hotel(String name, String place, int no_of_rooms, int no_of_booked_rooms) {
//        this.name = name;
//        this.place = place;
//        this.no_of_rooms = no_of_rooms;
//        this.no_of_booked_rooms = no_of_booked_rooms;
//    }


    public int getPayments() {
        return payments;
    }



    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public int getNo_of_rooms() {
        return no_of_rooms;
    }


    public int getNo_of_booked_rooms() {
        return no_of_booked_rooms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setNo_of_rooms(int no_of_rooms) {
        this.no_of_rooms = no_of_rooms;
    }


    public void setNo_of_booked_rooms(int no_of_booked_rooms) {
        this.no_of_booked_rooms = no_of_booked_rooms;
    }

    public int calculate_available_rooms(int tRooms,int bRoom) {
        return tRooms-bRoom;
    }

    public static void welcome() {
        Log.d("narayan", "welcome: to hotel"  );
    }

    public class hotelx extends hotel {

        hotelx hotelx = new hotelx();


//        public hotelx(String name, String place, int no_of_rooms, int no_of_booked_rooms) {
//            super(name, place, no_of_rooms, no_of_booked_rooms);
//        }
    }

}
