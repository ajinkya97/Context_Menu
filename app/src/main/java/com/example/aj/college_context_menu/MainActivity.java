package com.example.aj.college_context_menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    Button btnone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img=(ImageView)findViewById(R.id.myimage);
        registerForContextMenu(img);

    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
    }
    public boolean onContextItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.center:
                img.setScaleType(ImageView.ScaleType.CENTER);
                Toast.makeText(this, "center", Toast.LENGTH_SHORT).show();
                return true;
            case  R.id.fit_xy:
                img.setScaleType(ImageView.ScaleType.FIT_XY);
                Toast.makeText(this, "fit xy", Toast.LENGTH_SHORT).show();
                return true;
            case  R.id.fit_end:
                img.setScaleType(ImageView.ScaleType.FIT_END);
                Toast.makeText(this, "fit end", Toast.LENGTH_SHORT).show();
                return true;
            case  R.id.fit_start:
                img.setScaleType(ImageView.ScaleType.FIT_START);
                Toast.makeText(this, "fit start", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
