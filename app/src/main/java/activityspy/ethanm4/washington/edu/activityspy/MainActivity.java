package activityspy.ethanm4.washington.edu.activityspy;


    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.util.Log;

    public class MainActivity extends AppCompatActivity {

        private static final String TAG = MainActivity.class.getName();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Log.i(TAG, "onCreate event fired.");
            if(savedInstanceState != null) {
                Log.i(TAG, "onCreate event fired. " + savedInstanceState.toString());
            }
        }


        @Override
        protected void onStart() {
            super.onStart();
            Log.i(TAG, "onStart event fired.");
        }


        @Override
        protected void onResume() {
            super.onResume();
            Log.i(TAG, "onResume event fired.");
        }


        @Override
        protected void onPause() {
            super.onPause();
            Log.i(TAG, "onPause event fired.");
        }



        @Override
        protected void onRestart(){
            super.onRestart();
            Log.i(TAG, "onRestart event fired.");
        }


        @Override
        protected void onStop() {
            super.onStop();
            Log.i(TAG, "onStop event fired.");
        }

        @Override
        protected void onDestroy() {
            Log.i(TAG, "onDestroy event fired.");
            Log.e(TAG, "We're going down, Captain!");
            super.onDestroy();











        }









    }