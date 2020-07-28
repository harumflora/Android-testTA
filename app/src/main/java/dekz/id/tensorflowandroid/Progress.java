package dekz.id.tensorflowandroid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Progress extends AppCompatActivity {
    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        textView = (TextView) findViewById(R.id.textt);
        textView.setVisibility(View.INVISIBLE);
        progressBar.setMax(100);
        progressBar.setScaleY(3f);
        progressAnimation();
        SharedPreferences preferences = getSharedPreferences("checkbox", MODE_PRIVATE);
        String checkbox = preferences.getString("remember","");
        if (checkbox.equals("true")){
            SharedPreferences s = getSharedPreferences("checkbox", MODE_PRIVATE);
            SharedPreferences.Editor editor = s.edit();
            editor.putString("remember","true");
            editor.apply();
            Intent intent = new Intent(Progress.this, MainActivity.class);
            startActivity(intent);
        }
        else if (checkbox.equals("false")){
        }
    }
    public void progressAnimation(){
        ProgressBar_Animation anim = new ProgressBar_Animation(this,progressBar, textView, 0f, 100f);
        anim.setDuration(8000);
        progressBar.setAnimation(anim);

    }
}
