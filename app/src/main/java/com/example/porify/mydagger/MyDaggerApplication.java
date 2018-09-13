package com.example.porify.mydagger;

import android.app.Application;

import com.example.porify.mydagger.di.DaggerMyComponent;
import com.example.porify.mydagger.di.DatabaseModule;
import com.example.porify.mydagger.di.HttpModule;
import com.example.porify.mydagger.di.MyComponent;
import com.example.porify.mydagger.di.presenter_di.DaggerPresenterComponent;

public class MyDaggerApplication extends Application {

   private MyComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        myComponent = DaggerMyComponent.builder()
                .httpModule(new HttpModule())
                .databaseModule(new DatabaseModule())
                .presenterComponent(DaggerPresenterComponent.create())
                .build();
    }

    public MyComponent getMyComponent() {
        return myComponent;
    }

}
