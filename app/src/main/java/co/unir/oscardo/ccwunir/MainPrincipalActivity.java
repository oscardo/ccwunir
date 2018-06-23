package co.unir.oscardo.ccwunir;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.AndroidException;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;

import co.unir.oscardo.ccwunir.Constantes.Publicos;

public class MainPrincipalActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    //D:\Android\material\ccwunir\app\src\main\res\Documentacion\pdf
    private static String Semana1 = Environment.getExternalStorageDirectory().getPath()+ Publicos.PDF + "semana1.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        /*
        File file = new File(Semana1);
        File pdfFile = new File("res/raw/pdf/semana1.pdf");

        if (file.exists()) {
            Uri path = Uri.fromFile(file);
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setDataAndType(path, "application/pdf");
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            try {
                startActivity(intent);
            }
            catch (ActivityNotFoundException e) {
                Toast.makeText(this,

                        "No Application Available to View PDF",
                        Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this,
                    "Error en cargar PDF",
                    Toast.LENGTH_LONG).show();
        }

        */

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_configuracion) {
            return true;
        } else if(id == R.id.action_acerca){
            return true;
        } else if(id == R.id.action_busqueda){
            return true;
        } else if(id == R.id.action_politica){
            return true;
        } else if(id == R.id.action_salir){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_estudio_semana_1) {
            // Handle the camera action
            View view;

        } else if (id == R.id.nav_estudio_semana_2) {

        } else if (id == R.id.nav_estudio_semana_3) {

        } else if (id == R.id.nav_estudio_semana_4) {

        } else if (id == R.id.nav_estudio_semana_5) {

        } else if (id == R.id.nav_estudio_semana_6) {

        } else if (id == R.id.nav_estudio_semana_7) {

        } else if (id == R.id.nav_estudio_semana_8) {

        }

        if (id == R.id.nav_video_semana_1) {
            // Handle the camera action
        } else if (id == R.id.nav_video_semana_2) {

        } else if (id == R.id.nav_video_semana_3) {

        } else if (id == R.id.nav_video_semana_4) {

        } else if (id == R.id.nav_video_semana_5) {

        } else if (id == R.id.nav_video_semana_6) {

        } else if (id == R.id.nav_video_semana_7) {

        } else if (id == R.id.nav_video_semana_8) {

        }

        if (id == R.id.nav_test_semana_1) {
            // Handle the camera action
        } else if (id == R.id.nav_test_semana_2) {

        } else if (id == R.id.nav_test_semana_3) {

        } else if (id == R.id.nav_test_semana_4) {

        } else if (id == R.id.nav_test_semana_5) {

        } else if (id == R.id.nav_test_semana_6) {

        } else if (id == R.id.nav_test_semana_7) {

        } else if (id == R.id.nav_test_semana_8) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
