package com.example.parsetagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("dyMe5niAv8uij6RGau4yYBCdvyKLuhrdvXd2uujk")
                .clientKey("w6PvJ6kFDSIOPkRWsatO25ME2lMWQw7kRJPJWMEW")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
