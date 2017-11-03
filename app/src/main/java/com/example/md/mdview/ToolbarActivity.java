package com.example.md.mdview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ToolbarActivity extends AppCompatActivity implements Toolbar.OnMenuItemClickListener {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        init();
    }

    private void init() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.mipmap.competition);
        toolbar.setLogo(R.mipmap.competition_h);
        toolbar.setTitle("title");
        toolbar.setSubtitle("subtitle");
        toolbar.setOnMenuItemClickListener(this);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"点击图标",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_1:
                Toast.makeText(getApplicationContext(),"菜单1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_2:
                Toast.makeText(getApplicationContext(),"菜单2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_3:
                Toast.makeText(getApplicationContext(),"菜单3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_4:
                Toast.makeText(getApplicationContext(),"菜单4",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //引入options菜单
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
}
