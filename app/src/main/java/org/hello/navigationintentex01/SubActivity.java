package org.hello.navigationintentex01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class SubActivity extends AppCompatActivity {

    private static final String TAG = "Sub_Activity";
    private Context mContext = SubActivity.this;
    private NavigationView nav;

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "onNewIntent: 호출됨");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        init();

        NavigationViewHelper.enableNavigation(mContext,nav);
    }

    //여기다 findViewById 모두 적기
    private void init(){
        nav = findViewById(R.id.nav);
    }
}