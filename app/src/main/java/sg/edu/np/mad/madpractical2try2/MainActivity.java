package sg.edu.np.mad.madpractical2try2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "Create");
        User user = new User();
        user.name="Jin Yang";
        user.description = "17 year old dude";
        user.id = 1;
        user.followed = false;

        Button follow = findViewById(R.id.followbutton);

        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.followed == false){
                    user.followed = true;
                    follow.setText("Unfollow");
                }
                else{
                    user.followed = false;
                    follow.setText("follow");
                }
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TAG, "Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "Destroy");
    }
}