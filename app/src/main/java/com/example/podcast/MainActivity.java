package com.example.podcast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu , menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case
                    R.id.A:

                Toast.makeText(this, "A", Toast.LENGTH_SHORT).show();
                break;

            case R.id.B:
                Toast.makeText(this, "B", Toast.LENGTH_SHORT).show();
                break;

            case R.id.C:
                Toast.makeText(this, "C", Toast.LENGTH_SHORT).show();
                break;
            case R.id.D:
                Toast.makeText(this, "D", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;
    }
}