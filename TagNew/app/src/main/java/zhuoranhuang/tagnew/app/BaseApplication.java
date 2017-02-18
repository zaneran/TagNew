package zhuoranhuang.tagnew.app;

import android.app.Application;
import android.content.Context;

/**
 * Provides Model layer with application context
 * without direct connection with View layers.
 *
 * Created by zaneran on 2/17/2017.
 */

public class BaseApplication extends Application {

    private static Context context;

    public static Context getAppContext(){
        return BaseApplication.context;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        BaseApplication.context = getApplicationContext();
    }
}
