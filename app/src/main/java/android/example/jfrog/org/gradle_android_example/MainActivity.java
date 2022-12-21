package android.example.jfrog.org.gradle_android_example;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import org.apache.log4j.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger testLogger = Logger.getLogger("test");
    }
}
