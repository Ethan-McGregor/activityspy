//Ethan McGregor
//1-16-17
//Activityspy
//this program is intended to practice use of log for debugging purposes.

package activityspy.ethanm4.washington.edu.activityspy;

    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.util.Log;

    public class MainActivity extends AppCompatActivity {

        private static final String TAG = "MyActivity";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Log.d(TAG, "onCreate event fired");
            if(savedInstanceState != null) {
                Log.d(TAG, "onCreate event fired " + "(" + savedInstanceState.toString() + ")" );
            }
            if(1 + 1 == 3){
                Log.wtf(TAG, "We have a problem....");
            }
        }

        @Override
        protected void onStart() {
            super.onStart();
            Log.d(TAG, "onStart event fired");
        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.d(TAG, "onResume event fired");
        }

        @Override
        protected void onPause() {
            super.onPause();
            Log.d(TAG, "onPause event fired");
        }

        @Override
        protected void onRestart(){
            super.onRestart();
            Log.d(TAG, "onRestart event fired");
        }

        @Override
        protected void onStop() {
            super.onStop();
            Log.d(TAG, "onStop event fired");
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.d(TAG, "onDestroy event fired");
            Log.w(TAG, "We're going down, Captain!");

        }
    }