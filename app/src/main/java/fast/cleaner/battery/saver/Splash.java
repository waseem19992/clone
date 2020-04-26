package fast.cleaner.battery.saver;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.intagpc.myapplication.R;

public class Splash extends Activity {

    TextView privacy,enter;
    SharedPreferences sharedpreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash);

        privacy=(TextView) findViewById(R.id.privacy);
        enter=(TextView) findViewById(R.id.enter);
        privacy.setMovementMethod(LinkMovementMethod.getInstance());


        sharedpreferences = getSharedPreferences("waseem", Context.MODE_PRIVATE);
        editor=sharedpreferences.edit();



        if (sharedpreferences.getBoolean("first", false)) {
            startActivity(new Intent(Splash.this,MainActivity.class));
            finish();
        }


        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putBoolean("first",true);
                editor.apply();
                startActivity(new Intent(Splash.this,MainActivity.class));
                finish();
            }
        });
    }
}
