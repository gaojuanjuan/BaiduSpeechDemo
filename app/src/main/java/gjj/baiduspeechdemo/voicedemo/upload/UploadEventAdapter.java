package gjj.baiduspeechdemo.voicedemo.upload;

import com.baidu.speech.EventListener;

import gjj.baiduspeechdemo.voicedemo.util.Logger;
import gjj.baiduspeechdemo.voicedemo.wakeup.IWakeupListener;


/**
 * Created by fujiayi on 2017/6/20.
 */

public class UploadEventAdapter implements EventListener {

    private static final int ERROR_NONE = 0;

    private IWakeupListener listener;

    public UploadEventAdapter() {

    }

    private static final String TAG = "WakeupEventAdapter";

    @Override
    public void onEvent(String name, String params, byte[] data, int offset, int length) {
        Logger.error(TAG, "name:" + name + "; params:" + params);

    }

}
