package com.example.porify.mydagger.di;

import com.example.porify.mydagger.di.scope.AppScope;
import com.example.porify.mydagger.object.HttpObject;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class HttpModule {

//    @Singleton // scope
    @AppScope
    @Provides @Named("url1")
    public HttpObject provideHttpObject() {
        return new HttpObject();
    }

    @AppScope
    @Provides @Named("url2")
    public HttpObject provideHttpObject2() {
        return new HttpObject();
    }
}
