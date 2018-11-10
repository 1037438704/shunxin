package zdl.tianxunda.com.shunxin.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.kongzue.baseframework.BaseActivity;

/**
 * Created by dell-pc on 2018/11/6.
 */

public abstract class BaseAty extends BaseActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
}
