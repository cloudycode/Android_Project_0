package uk.co.studio.neo.portfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    /**
     * Display a toast when a button has been clicked
     * */
    public void displayToast(String text) {
        Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        toast.show();
    }
    /**
     * Called when the user clicks on the button Spotify Streamer
     * */
    public void launchSpotifyStreamer(View view) {
        String spotifyText = "This button will launch my Spotify streamer app!";
        displayToast(spotifyText);
    }

    /**
     * Called when the user clicks on the button Scores
     * */
    public void launchScores(View view) {
        String scoreText = "This button will launch my scores app!";
        displayToast(scoreText);
    }

    /**
     * Called when the user clicks on the button Library app
     * */
    public void launchLibrary(View view) {
        String libraryText = "This button will launch my library app!";
        displayToast(libraryText);
    }

    /**
     * Called when the user clicks on the button Scores
     * */
    public void launchBuiltItBigger(View view) {
        String bibText = "This button will launch my built it bigger app!";
        displayToast(bibText);
    }

    /**
     * Called when the user clicks on the button Scores
     * */
    public void launchXYZReader(View view) {
        String xyzText = "This button will launch my XYZ reader app!";
        displayToast(xyzText);
    }

    /**
     * Called when the user clicks on the button Scores
     * */
    public void launchCapstone(View view) {
        String capstoneText = "This button will launch my capstone app!";
        displayToast(capstoneText);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
