package com.example.porify.mydagger;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.porify.mydagger.object.DatabaseObject;
import com.example.porify.mydagger.object.HttpObject;

import javax.inject.Inject;
import javax.inject.Named;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = SecondActivity.class.getSimpleName();

    @Inject
    DatabaseObject databaseObject;

    @Inject @Named("url1")
    HttpObject httpObject;

    @Inject @Named("url2")
    HttpObject httpObject2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        DaggerMyComponent.create().injectSecActivity(this); //局部注入

        // 全局注入
        ((MyDaggerApplication) getApplication()).getMyComponent().injectSecActivity(this);

        Log.d(TAG, "onCreate: httpObject:"+ httpObject.hashCode());
        Log.d(TAG, "onCreate: httpObject2:"+ httpObject2.hashCode());

    }

    public void click(View view) {
        Toast.makeText(this, databaseObject.toString() + " , " + httpObject.toString(), Toast.LENGTH_SHORT).show();
    }
}
