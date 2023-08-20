package com.example.menuu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.i1:
                Toast.makeText(this,"ITEM1",Toast.LENGTH_LONG).show();
                break;
            case R.id.si1:
                Toast.makeText(this,"SUB-ITEM1",Toast.LENGTH_LONG).show();
                break;
            case R.id.si2:
                Toast.makeText(this,"SUB-ITEM2",Toast.LENGTH_LONG).show();
                break;
            case R.id.i2:
                Toast.makeText(this,"ITEM2",Toast.LENGTH_LONG).show();
                break;
            case R.id.i3:
                Toast.makeText(this,"ITEM3",Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }
}