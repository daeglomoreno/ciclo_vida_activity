package umaee.example.ciclo_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Window;

public class MainActivity extends AppCompatActivity {


     String tag = "Ciclo de vida paso a paso de un activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // requestWindowFeature(Window.FEATURE_NO_TITLE);

        Log.d(tag, "Dentro del evento onCreate() ");
    }


    public void onStart()
    {
        super.onStart();
        Log.d(tag, "In the onStart() event");
    }

    public void onRestart()
    {
        super.onRestart();
        Log.d(tag, "In the onRestart() event");
    }

    public void onResume(){

        super.onResume();
        Log.d(tag, "En evento  onResume() ");
    }


    public void onPause()
    {
        super.onPause();
        Log.d(tag, "En evento onPause() ");
    }


    public void onStop()
    {
        super.onStop();
        Log.d(tag, "En evento onStop() ");
    }

    public void onDestroy()
    {
        super.onDestroy();
        Log.d(tag, "En evento  onDestroy() ");
    }


}
