import android.content.Intent;
import android.os.Bundle;

import com.companies.myapplication1.MainActivity;
import com.companies.myapplication1.R;

public class Splash_activity extends MainActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

    Thread thread = new Thread(){
        @Override
        public void run() {
            try {


                sleep(3000);
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    };
    thread.start();
}
