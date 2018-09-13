package com.example.porify.mydagger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.porify.mydagger.di.DaggerMyComponent;
import com.example.porify.mydagger.di.presenter_di.Presenter;
import com.example.porify.mydagger.object.DatabaseObject;
import com.example.porify.mydagger.object.HttpObject;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    DatabaseObject databaseObject;

    @Inject @Named("url1")
    HttpObject httpObject;

    @Inject @Named("url2")
    HttpObject httpObject2;

    @Inject
    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        DaggerMyComponent.create().injectMainActivity(this);
        ((MyDaggerApplication) getApplication()).getMyComponent().injectMainActivity(this);

        Log.d(TAG, "onCreate: httpObject:"+ httpObject.hashCode());
        Log.d(TAG, "onCreate: httpObject2:"+ httpObject2.hashCode());
        Log.d(TAG, "onCreate: presenter:"+ presenter.hashCode());

    }

    public void click(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
