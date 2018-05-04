package com.elmira.dailyclean;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class AllCleaningItems extends AppCompatActivity {
    public static String EXTRA_DAILY_CLEANING_ITEM = "com.elmira.dailyclean.EXTRA_DAILY_CLEANING_ITEM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_cleaning_items);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        Menu bottomNavigationMenu = bottomNavigationView.getMenu();
        MenuItem bottomNavigationMenuItem = bottomNavigationMenu.getItem(0);
        bottomNavigationMenuItem.setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_all_cleaning_items:
                        break;
                    case R.id.menu_daily_cleaning_item:
                        Intent dailyCleaningItemIntent = new Intent(AllCleaningItems.this, DailyCleaningItem.class);
                        startActivity(dailyCleaningItemIntent);
                        break;
                    case R.id.menu_daily_cleaning_timer:
                        Intent dailyCleaningTimerIntent = new Intent(AllCleaningItems.this, DailyCleaningTimer.class);
                        startActivity(dailyCleaningTimerIntent);
                        break;
                }
                return true;
            }
        });
//        Intent intent = new Intent(this, DailyCleaningItem.class);
//        TextView textView = (TextView) findViewById(R.id.textView);
//        String randomCleaningItem = textView.getText().toString();
//        System.out.println("ALL ITEMS ==> randomCleaningItem: " + randomCleaningItem);
//        intent.putExtra(EXTRA_DAILY_CLEANING_ITEM, randomCleaningItem);
//        startActivity(intent);
    }
}
