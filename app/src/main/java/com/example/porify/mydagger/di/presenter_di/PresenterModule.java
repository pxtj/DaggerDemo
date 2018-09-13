package com.example.porify.mydagger.di.presenter_di;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {

    @Provides
    public Presenter providePresenter() {
        return new Presenter();
    }
}
