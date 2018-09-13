package com.example.porify.mydagger.di.presenter_di;

import com.example.porify.mydagger.MainActivity;
import com.example.porify.mydagger.di.scope.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(modules = {PresenterModule.class})
public interface PresenterComponent {

//    void injectMainActivity(MainActivity mainActivity); // 报错，不能注入到同一个类

    public Presenter providePresenter();
}
