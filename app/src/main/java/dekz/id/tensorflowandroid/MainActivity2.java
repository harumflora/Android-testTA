package dekz.id.tensorflowandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity2 extends YouTubeBaseActivity {
    private static final String TAG = "MainActivity2";
    public String kodenya;

    YouTubePlayerView mYouTubePlayerView;
    Button btnPlay;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;
    TextView TextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(TAG, "onCreate: Starting.");
        btnPlay = (Button) findViewById(R.id.btnPlay);
        mYouTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtubePlay);

        final GlobalClass globalVariable = (GlobalClass) getApplicationContext();
        kodenya = globalVariable.getLink();

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "onClick: Done initializing.");

                btnPlay.setText("Playing:"+kodenya);
                youTubePlayer.loadVideo(kodenya);
            }
            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "onClick: Failed to initializing");
            }
        };
        btnPlay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Initializing YouTube Player.");
                mYouTubePlayerView.initialize(Youtubeconfig.getApiKey(), mOnInitializedListener);
            }
        });
    }
}