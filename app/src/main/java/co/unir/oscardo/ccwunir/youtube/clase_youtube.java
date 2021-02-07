package co.unir.oscardo.ccwunir.youtube;

import com.google.android.youtube.player.YouTubePlayerFragment;

import co.unir.oscardo.ccwunir.R;

public class clase_youtube extends YouTubePlayerFragment {

}
    /*
    private void initYouTube() {

        if (youTubePlayerFragment == null) {
            youTubePlayerFragment = (YouTubePlayerFragment) getFragmentById(R.id.youtube_frag);
            youTubePlayerFragment.initialize(getString(R.string.api_key), new YouTubePlayer.OnInitializedListener() {
                @Override
                public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {
                    Log.i("Detail","YouTube Player onInitializationSuccess");

                    // Don't do full screen
                    player.setFullscreen(false);
                    if (!wasRestored) {
                        youTubePlayer = player;
                        cueVideoIfNeeded();
                    }
                }

                @Override
                public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                    Log.i("Detail", "Failed: "+youTubeInitializationResult);
                    if (youTubeInitializationResult.isUserRecoverableError()) {
                        youTubeInitializationResult.getErrorDialog(getMainActivity(), RECOVERY_DIALOG_REQUEST).show();
                    } else {
                        callToast(youTubeInitializationResult.toString(), true);
                    }
                }
            });
        }
    }
    */
