package zhuoranhuang.tagnew.ui.presenter;

/**
 * Created by zaneran on 2/17/2017.
 */

public interface Presenter {
    /* Subscribe in onResume. */
    void onSubscribe();
    /* Unsubscribe in onPause. */
    void onUnsubscribe();
}
