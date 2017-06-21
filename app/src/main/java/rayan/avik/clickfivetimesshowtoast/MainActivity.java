package rayan.avik.clickfivetimesshowtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button click;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = 0;
        click = (Button) findViewById(R.id.button_click);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++ ;
                if(counter == 5){
                    Toast.makeText(MainActivity.this, "Thanks For Click", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
