package com.example.porify.mydagger.di;

import com.example.porify.mydagger.MainActivity;
import com.example.porify.mydagger.SecondActivity;
import com.example.porify.mydagger.di.presenter_di.PresenterComponent;
import com.example.porify.mydagger.di.scope.AppScope;
import com.example.porify.mydagger.object.DatabaseObject;

import javax.inject.Singleton;

import dagger.Component;

// scope ：使用原来Jar包提供的和使用自定义的是完全相同的。
// 多个component 之间的scope不同相同
// 没有scope的component不能依赖有scope的component

@AppScope
@Component(modules = {DatabaseModule.class, HttpModule.class},
        dependencies = {PresenterComponent.class})
public interface MyComponent {

    void injectMainActivity(MainActivity mainActivity);

    void injectSecActivity(SecondActivity secondActivity);
}
