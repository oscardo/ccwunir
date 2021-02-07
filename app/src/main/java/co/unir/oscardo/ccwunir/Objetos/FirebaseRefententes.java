package co.unir.oscardo.ccwunir.Objetos;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import co.unir.oscardo.ccwunir.Clases.CCWUnir;
import co.unir.oscardo.ccwunir.Constantes.Publicos;

public class FirebaseRefententes {

    public void Evaluar(Context contexto, String Semana, int TipoValor) {
        // contexto Contexto de la aplicación
        try{
            int tema = 0;
            String test = "";
            ArrayList<String> Semana_Test_Pregunta = new ArrayList<>();
            ArrayList<String> respuestas = new ArrayList<>();
            //@param Semana 0,1,2,3,4,5,6,7
            tema = Integer.parseInt(Semana) - 1;
            //@param Test test_# donde # es 1,2,3,4,5,6,7,8
            test = Publicos.FIREBASE_TEST + Semana;
            //@param Semana_Test_Pregunta pregunta_# donde 1 al 10
            for(int i=1; i<11; i++) {
                Semana_Test_Pregunta.add(Publicos.FIREBASE_SEMANA_TEST_PREGUNTA + String.valueOf(i));
            }
            //@param Semana_Test_Posibilidades donde pregunta_# de 1 al 10,
            //* respuesta_#_1, respuesta_#_2, respuesta_#_3, respuesta_#_4
            //* respuesta_real
            respuestas.add(0, Semana_Test_Pregunta.get(1));
            respuestas.add(1, Publicos.FIREBASE_RESPUESTA + Semana + "_1");
            respuestas.add(2, Publicos.FIREBASE_RESPUESTA + Semana + "_2");
            respuestas.add(3, Publicos.FIREBASE_RESPUESTA + Semana + "_3");
            respuestas.add(4, Publicos.FIREBASE_RESPUESTA + Semana + "_4");
            respuestas.add(5, Publicos.FIREBASE_RESPUESTA_REAL);
            Validacion(contexto, String.valueOf(tema), test, Semana_Test_Pregunta, respuestas, TipoValor);
            } catch(OutOfMemoryError e1) {
                e1.printStackTrace();
                Log.e("Memory exceptions","exceptions"+e1);
            }
    }

    /**
     * @param contexto Contexto de la aplicación
     * @param Semana 0,1,2,3,4,5,6,7
     * @param Test test_# donde # es 1,2,3,4,5,6,7,8
     * @param Semana_Test_Pregunta pregunta_# donde 1 al 10
     * @param Semana_Test_Posibilidades donde pregunta_# de 1 al 10,
     *                                  respuesta_#_1, respuesta_#_2, respuesta_#_3, respuesta_#_4
     *                                  respuesta_real
     */
    public void Validacion(Context contexto, String Semana, String Test, ArrayList<String> Semana_Test_Pregunta, ArrayList<String> Semana_Test_Posibilidades, int TipoValor){

       FirebaseDatabase database = FirebaseDatabase.getInstance();
       DatabaseReference referencia_mayor = database.getReference(Publicos.FIREBASE_VERSION);
       DatabaseReference referencia_version_interna = database.getReference(Semana).child(Publicos.FIREBASE_VERSION);

       DatabaseReference referencia_codigo = database.getReference(Semana).child(Publicos.FIREBASE_CODIGO); //getReference("0").push().child("codigo");
       DatabaseReference referencia_nombre = database.getReference(Semana).child(Publicos.FIREBASE_NOMBRE);
       DatabaseReference referencia_video = database.getReference(Semana).child(Publicos.FIREBASE_VIDEO);

       final int[] version = {0};
       final int[] version_interna = {0};
       final int[] codigo = {0};
       final String[] nombre = {""};
       final String[] video = {""};

       // DatabaseReference referencia_semana = database.getReference(Publicos.FIREBASE_PRIMERA_SEMANA);
       // DatabaseReference referencia_video = database.getReference(Publicos.FIREBASE_VIDEO);
            // myRef.getKey(); // Nombre en la base de datos nada más
            // myRef.addListenerForSingleValueEvent(); //solo una vez va a correr este código
            // myRef.setValue(4); //va a cambiar en el sentido de la APP a firebase
            // myRef.push().setValue(1); //esto setea la APP y crea un nuevo parametro en la base de datos

        referencia_mayor.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                version[0] = dataSnapshot.getValue(Integer.class);
                Log.i("Semana: ", "Version: " + version[0]);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.e("Error: " , databaseError.getMessage());
            }
        });

        referencia_version_interna.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                //codigo[0] = dataSnapshot.getValue(String.class);
                version_interna[0] = dataSnapshot.getValue(Integer.class);
                Log.i("Semana: ", "version interna: " + String.valueOf(version_interna[0]));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.e("Error: " , databaseError.getMessage());
                Log.i("Error: " , databaseError.getMessage());
            }
        });

        referencia_codigo.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                //codigo[0] = dataSnapshot.getValue(String.class);
                codigo[0] = dataSnapshot.getValue(Integer.class);
                Log.i("Semana: ", "Código: " + String.valueOf(codigo[0]));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.e("Error: " , databaseError.getMessage());
                Log.i("Error: " , databaseError.getMessage());
            }
        });

        referencia_nombre.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                nombre[0] = dataSnapshot.getValue(String.class);
                Log.i("Semana: ", "Nombre: " + nombre[0]);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.e("Error: " , databaseError.getMessage());
            }
        });

        if(TipoValor == 2) {
            referencia_video.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    //codigo[0] = dataSnapshot.getValue         (String.class);
                    video[0] = dataSnapshot.getValue(String.class);
                    Log.i("Semana: ", "Video: " + video[0]);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                    Log.e("Error: ", databaseError.getMessage());
                    Log.i("Error: ", databaseError.getMessage());
                }
            });
        }
        //
        if(TipoValor == 3) {
            for (String pregunta_pregunta : Semana_Test_Pregunta) {
                for (String pregunta : Semana_Test_Posibilidades) {

                    DatabaseReference referencia_test = database.getReference(Semana)
                            .child(Test)
                            .child(pregunta_pregunta)
                            .child(pregunta);
                    final String[] posilidad_1 = {""};
                    referencia_test.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            //codigo[0] = dataSnapshot.getValue(String.class);
                            posilidad_1[0] = dataSnapshot.getValue(String.class);
                            Log.i("Semana: ", "Resp: " + posilidad_1[0]);
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {
                            Log.e("Error: ", databaseError.getMessage());
                            Log.i("Error: ", databaseError.getMessage());
                        }
                    });
                }
            }
        }
        /*
        final int[] version = {0};
        final int[] version_interna = {0};
        final int[] codigo = {0};
        final String[] nombre = {""};
        final String[] video = {""};
        */

       /*
        referencia_semana.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                CCWUnir CCW = dataSnapshot.getValue(CCWUnir.class);
                Log.i("Código:" , CCW.getCodigo());
                Log.i("Nombre:" , CCW.getNombre());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.e("Error: " , databaseError.getMessage());
            }
        });
        */

    }


}

