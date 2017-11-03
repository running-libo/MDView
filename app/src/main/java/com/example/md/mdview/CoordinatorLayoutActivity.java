package com.example.md.mdview;

import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class CoordinatorLayoutActivity extends AppCompatActivity implements View.OnTouchListener{
    private View viewGirl;
    private ViewGroup.MarginLayoutParams params;
    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_layout);

        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);
        viewGirl = findViewById(R.id.view_girl);
        params = (ViewGroup.MarginLayoutParams) viewGirl.getLayoutParams();

        coordinatorLayout.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                params.leftMargin = (int) (event.getX() - viewGirl.getMeasuredWidth() / 2);
                params.topMargin = (int) (event.getY() - viewGirl.getMeasuredHeight() / 2);
                viewGirl.setLayoutParams(params);
                break;
            case MotionEvent.ACTION_MOVE:
                params.leftMargin = (int) (event.getX() - viewGirl.getMeasuredWidth() / 2);
                params.topMargin = (int) (event.getY() - viewGirl.getMeasuredHeight() / 2);
                viewGirl.setLayoutParams(params);
                break;
        }
        return true;
    }
}
