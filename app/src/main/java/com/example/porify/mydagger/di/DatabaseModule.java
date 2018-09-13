package com.example.porify.mydagger.di;

import com.example.porify.mydagger.object.DatabaseObject;

import dagger.Module;
import dagger.Provides;

@Module
public class DatabaseModule {

    @Provides
    public DatabaseObject provideDatabaseObject() {
        return new DatabaseObject();
    }
}
