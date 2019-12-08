package com.example.finalproject;

import android.content.Intent;
import android.view.View;

import java.util.Calendar;

public class CalendarBtnListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {

        // Code to add to calendar
        Calendar calendarEvent = Calendar.getInstance();
        Intent intent = new Intent(Intent.ACTION_EDIT);
        intent.setType("vnd.android.cursor.item/event");
        intent.putExtra("beginTime", calendarEvent.getTimeInMillis());
        intent.putExtra("endTime", calendarEvent.getTimeInMillis() + 60 * 60 * 1000);
        intent.putExtra("title", "Sample Event");
        intent.putExtra("allDay", true);
        intent.putExtra("rule", "FREQ=YEARLY");
        //startActivity(intent);
    }
}
