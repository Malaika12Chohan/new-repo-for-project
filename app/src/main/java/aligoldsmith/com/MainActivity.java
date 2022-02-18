package aligoldsmith.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.Sign_Up);
        button = (Button) findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(intent);
                        Intent iintent = new Intent(MainActivity.this,NavigationBar.class);
                        startActivity(iintent);
                    }
                });
    }

}
