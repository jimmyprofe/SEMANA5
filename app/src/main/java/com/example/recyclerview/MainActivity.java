package com.example.recyclerview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TableLayout;

import com.example.recyclerview.adaptador.Adaptadorfragment;
import com.example.recyclerview.classVO.perrosVO;
import com.example.recyclerview.fragment.Fragment_mascotas;
import com.example.recyclerview.fragment.Fragment_perfil;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TabLayout tableLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mitoolbar = (Toolbar) findViewById(R.id.miactionbar);

        tableLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        setUpViewPager();

        if (mitoolbar != null){
            setSupportActionBar(mitoolbar);
        }





    }
    private ArrayList<Fragment> agregarfragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new Fragment_mascotas());
        fragments.add(new Fragment_perfil());
        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new Adaptadorfragment(getSupportFragmentManager(), agregarfragments()));
        tableLayout.setupWithViewPager(viewPager);
        tableLayout.getTabAt(0).setIcon(R.drawable.ic_action_name);
        tableLayout.getTabAt(1).setIcon(R.drawable.ic_perfil_perro);
    }



    //metodo para mostrar el menu

    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();

        if (id == R.id.estrella){
            Intent intent = new Intent(this, MainActivity2_mascotas.class);
            startActivity(intent);
        } if (id == R.id.menu_contacto){
            Intent intent = new Intent(this, MainActivity2_email.class);
            startActivity(intent);
        } if (id == R.id.menu_acercade){
            DialogoDesarrollador();
        }

        return true;
    }

    public AlertDialog DialogoDesarrollador() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Desarrollador:  Jimmy Suárez").setMessage("Lic. En Matemáticas y Computación \n\njimmyprofeapp@gmail.com \n\nversión 1.0");
        builder.show();
        return builder.create();
    }

}