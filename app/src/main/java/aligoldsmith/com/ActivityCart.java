package aligoldsmith.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ActivityCart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame1,new MyCartFragment()).commit();

    }
}