package com.razor.lifecycledemo;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.razor.lifecycledemo.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "in onCreate", Toast.LENGTH_SHORT).show();
        Log.i("info", "onCreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(this, "in onStart", Toast.LENGTH_SHORT).show();
        Log.i("info", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "in onStop", Toast.LENGTH_SHORT).show();
        Log.i("info", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "in onDestroy", Toast.LENGTH_SHORT).show();
        Log.i("info", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "in onPause", Toast.LENGTH_SHORT).show();
        Log.i("info", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "in onResume", Toast.LENGTH_SHORT).show();
        Log.i("info", "onResume");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}