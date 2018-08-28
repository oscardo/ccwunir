package co.unir.oscardo.ccwunir;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import co.unir.oscardo.ccwunir.Constantes.Publicos;
import co.unir.oscardo.ccwunir.Objetos.FirebaseRefententes;

public class MainPrincipalActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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


    // TODO: hace falta revisar el menu inicial
    // TODO: hace falta revisar como se hace el guia inicial
    // TODO: hace falta documentar todo el código
    // TODO: hace falta revisar como se hace la guia inicial
    // TODO: hace falta el video de apoyo al trabajo
    // TODO: hace falta el documento de apoyo al trabajo
    // TODO: hace falta arreglar la parte web del proyecto
    // TODO: crear una base de datos SQLite para llevar el historico, log y demás información
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
        FragmentManager fm = getSupportFragmentManager();
        int id = item.getItemId();
        // TODO: hace falta la configuracion
        // TODO: hace falta la acerca
        // TODO: hace falta la busqueda
        // TODO: hace falta la politicas
        // TODO: hace falta la salir
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_configuracion) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Configuracion()).commit();
        } else if(id == R.id.action_acerca){
            fm.beginTransaction().replace(R.id.Contenedor_Central, new AcercaDe()).commit();
        } else if(id == R.id.action_busqueda){
            fm.beginTransaction().replace(R.id.Contenedor_Central, new AcercaDe()).commit();
        } else if(id == R.id.action_politica) {
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Politicas()).commit();
        } else if(id == R.id.action_universidad){
                fm.beginTransaction().replace(R.id.Contenedor_Central, new Universidad()).commit();
        } else if(id == R.id.action_salir){
            Intent Salir = new Intent(this, Salir.class);
            //aqui cerrar sesion
            startActivity(Salir);
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        // TODO: Hace falta el material para la semana o tema 7
        // TODO: Hace falta el material para la semana o tema 8

        // FirebaseDatabase database = FirebaseDatabase.getInstance();
        // DatabaseReference myRef = database.getReference("version");
        // myRef.getKey(); // Nombre en la base de datos nada más
        // myRef.addListenerForSingleValueEvent(); //solo una vez va a correr este código
        // myRef.setValue(4); //va a cambiar en el sentido de la APP a firebase
        // myRef.push().setValue(1); //esto setea la APP y crea un nuevo parametro en la base de datos

        /*
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                int ver = dataSnapshot.getValue(Integer.class);
                Log.i("Dato: ", ver + " ");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.e("Error: " , databaseError.getMessage());
            }
        });
        */

        FirebaseRefententes Evaluar = new FirebaseRefententes();
        int id = item.getItemId();
        FragmentManager fm = getSupportFragmentManager();
        if (id == R.id.nav_estudio_semana_1) {
            Evaluar.Evaluar(this, "1", 1);
            //Evaluar.Validacion(this, "tema_1", "test_1", "pregunta_1", "pregunta_1");
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Temario()).commit();

        } else if (id == R.id.nav_estudio_semana_2) {
            Evaluar.Evaluar(this, "2", 1);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Temario2Fragment()).commit();
        } else if (id == R.id.nav_estudio_semana_3) {
            Evaluar.Evaluar(this, "3", 1);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Temario3Fragment()).commit();
        } else if (id == R.id.nav_estudio_semana_4) {
            Evaluar.Evaluar(this, "4", 1);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Temario4Fragment()).commit();
        } else if (id == R.id.nav_estudio_semana_5) {
            Evaluar.Evaluar(this, "5", 1);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Temario5Fragment()).commit();
        } else if (id == R.id.nav_estudio_semana_6) {
            Evaluar.Evaluar(this, "6", 1);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Temario6Fragment()).commit();
        } else if (id == R.id.nav_estudio_semana_7) {
            Evaluar.Evaluar(this, "7", 1);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Temario7Fragment()).commit();
        } else if (id == R.id.nav_estudio_semana_8) {
            Evaluar.Evaluar(this, "8", 1);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Temario8Fragment()).commit();
        }

        // TODO: hace falta el video de la semana 7
        // TODO: hace falta el video de la semana 8
        if (id == R.id.nav_video_semana_1) {
            Evaluar.Evaluar(this, "1", 2);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new VideoFragment()).commit();
        } else if (id == R.id.nav_video_semana_2) {
            Evaluar.Evaluar(this, "2", 2);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Video2Fragment()).commit();
        } else if (id == R.id.nav_video_semana_3) {
            Evaluar.Evaluar(this, "3", 2);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Video3Fragment()).commit();
        } else if (id == R.id.nav_video_semana_4) {
            Evaluar.Evaluar(this, "4", 2);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Video4Fragment()).commit();
        } else if (id == R.id.nav_video_semana_5) {
            Evaluar.Evaluar(this, "5", 2);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Video5Fragment()).commit();
        } else if (id == R.id.nav_video_semana_6) {
            Evaluar.Evaluar(this, "6", 2);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Video6Fragment()).commit();
        } else if (id == R.id.nav_video_semana_7) {
            Evaluar.Evaluar(this, "7", 2);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Video7Fragment()).commit();
        } else if (id == R.id.nav_video_semana_8) {
            Evaluar.Evaluar(this, "8", 2);
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
            Evaluar.Evaluar(this, "1", 3);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new TestFragment()).commit();
        } else if (id == R.id.nav_test_semana_2) {
            Evaluar.Evaluar(this, "2", 3);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Test2Fragment()).commit();
        } else if (id == R.id.nav_test_semana_3) {
            Evaluar.Evaluar(this, "3", 3);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Test3Fragment()).commit();
        } else if (id == R.id.nav_test_semana_4) {
            Evaluar.Evaluar(this, "4", 3);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Test4Fragment()).commit();
        } else if (id == R.id.nav_test_semana_5) {
            Evaluar.Evaluar(this, "5", 3);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Test5Fragment()).commit();
        } else if (id == R.id.nav_test_semana_6) {
            Evaluar.Evaluar(this, "6", 3);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Test6Fragment()).commit();
        } else if (id == R.id.nav_test_semana_7) {
            Evaluar.Evaluar(this, "7", 3);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Test7Fragment()).commit();
        } else if (id == R.id.nav_test_semana_8) {
            Evaluar.Evaluar(this, "8", 3);
            fm.beginTransaction().replace(R.id.Contenedor_Central, new Test8Fragment()).commit();
        } else if (id == R.id.nav_salir) {
            //fm.beginTransaction().replace(R.id.action_salir, new Salir()).commit();
            Intent Salir = new Intent(this, Salir.class);
            //aqui cerrar sesion
            startActivity(Salir);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
