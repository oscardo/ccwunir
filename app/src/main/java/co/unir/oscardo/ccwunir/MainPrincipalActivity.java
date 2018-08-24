package co.unir.oscardo.ccwunir;

import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import co.unir.oscardo.ccwunir.Constantes.Publicos;
import co.unir.oscardo.ccwunir.descarga_firebase.Consulta_Firebase;

public class MainPrincipalActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

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
    // TODO: hace falta revisar el menu inicial
    // TODO: hace falta revisar como se hace el guia inicial
    // TODO: hace falta documentar todo el código
    // TODO: hace falta revisar como se hace la guia inicial
    // TODO: hace falta el video de apoyo al trabajo
    // TODO: hace falta el documento de apoyo al trabajo
    // TODO: hace falta arreglar la parte web del proyecto
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
        // TODO: hace falta la configuracion
        // TODO: hace falta la acerca
        // TODO: hace falta la busqueda
        // TODO: hace falta la politicas
        // TODO: hace falta la salir
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
        // TODO: Hace falta el material para la semana o tema 7
        // TODO: Hace falta el material para la semana o tema 8
        int id = item.getItemId();
        FragmentManager fm = getSupportFragmentManager();
        if (id == R.id.nav_estudio_semana_1) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Temario()).commit();
        } else if (id == R.id.nav_estudio_semana_2) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Temario2Fragment()).commit();
        } else if (id == R.id.nav_estudio_semana_3) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Temario3Fragment()).commit();
        } else if (id == R.id.nav_estudio_semana_4) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Temario4Fragment()).commit();
        } else if (id == R.id.nav_estudio_semana_5) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Temario5Fragment()).commit();
        } else if (id == R.id.nav_estudio_semana_6) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Temario6Fragment()).commit();
        } else if (id == R.id.nav_estudio_semana_7) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Temario7Fragment()).commit();
        } else if (id == R.id.nav_estudio_semana_8) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Temario8Fragment()).commit();
        }

        // TODO: hace falta el video de la semana 7
        // TODO: hace falta el video de la semana 8
        if (id == R.id.nav_video_semana_1) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new VideoFragment()).commit();
        } else if (id == R.id.nav_video_semana_2) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Video2Fragment()).commit();
        } else if (id == R.id.nav_video_semana_3) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Video3Fragment()).commit();
        } else if (id == R.id.nav_video_semana_4) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Video4Fragment()).commit();
        } else if (id == R.id.nav_video_semana_5) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Video5Fragment()).commit();
        } else if (id == R.id.nav_video_semana_6) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Video6Fragment()).commit();
        } else if (id == R.id.nav_video_semana_7) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Video7Fragment()).commit();
        } else if (id == R.id.nav_video_semana_8) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Video8Fragment()).commit();
        }

        // TODO: Hace falta JSON
        // TODO: Hace falta revision de las versiones
        // TODO: Hace falta usuarios, recordar contraseña, login
        // TODO: Hace falta mejoras continuas
        // TODO: Hace falta test
        // TODO: Hace falta ver 7
        // TODO: Hace falta ver 8
        if (id == R.id.nav_test_semana_1) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new TestFragment()).commit();
        } else if (id == R.id.nav_test_semana_2) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Test2Fragment()).commit();
        } else if (id == R.id.nav_test_semana_3) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Test3Fragment()).commit();
        } else if (id == R.id.nav_test_semana_4) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Test4Fragment()).commit();
        } else if (id == R.id.nav_test_semana_5) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Test5Fragment()).commit();
        } else if (id == R.id.nav_test_semana_6) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Test6Fragment()).commit();
        } else if (id == R.id.nav_test_semana_7) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Test7Fragment()).commit();
        } else if (id == R.id.nav_test_semana_8) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Test8Fragment()).commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
