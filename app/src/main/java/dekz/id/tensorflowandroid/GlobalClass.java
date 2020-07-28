package dekz.id.tensorflowandroid;

import android.app.Application;

public class GlobalClass extends Application {
    private String youTubePlayer;

    public String getLink() {
        return youTubePlayer;
    }

    public String setLink(String aName) {
        youTubePlayer = aName;

        return youTubePlayer;
    }
}
