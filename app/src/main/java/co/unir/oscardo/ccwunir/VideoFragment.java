package co.unir.oscardo.ccwunir;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.android.youtube.player.YouTubePlayerView;

import co.unir.oscardo.ccwunir.Constantes.Publicos;
import co.unir.oscardo.ccwunir.youtube.clase_youtube;


/**
 * A simple {@link Fragment} subclass.
 */
public class VideoFragment extends Fragment{
    Context contexto;
    public VideoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_video, container, false);
        YouTubePlayerSupportFragment youTubePlayerFragment = YouTubePlayerSupportFragment.newInstance();
        youTubePlayerFragment.initialize(Publicos.Clave_Youtube, new YouTubePlayer.OnInitializedListener() {
            public YouTubePlayer YPlayer;

            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {

                if (!wasRestored) {
                    YPlayer = player;
                    YPlayer.setFullscreen(false);
                    YPlayer.loadVideo("CrRjxHLfiZo"); //ID del video actual
                    YPlayer.play();
                }
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.i("Detalle", "Fallo: "+youTubeInitializationResult);
                String error = "Error al inicializar Youtube: " + youTubeInitializationResult.toString();
                Toast.makeText(contexto, error, Toast.LENGTH_LONG).show();
            }
        });
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.youtube_fragment, youTubePlayerFragment).commit();
        return view;
    }
}
