package zdl.tianxunda.com.shunxin;

import android.app.Application;

import com.kongzue.baseokhttp.HttpRequest;
import com.kongzue.dialog.v2.DialogSettings;

import static com.kongzue.dialog.v2.DialogSettings.THEME_DARK;
import static com.kongzue.dialog.v2.DialogSettings.THEME_LIGHT;
import static com.kongzue.dialog.v2.DialogSettings.TYPE_IOS;

/**
 * 创建人： Nine tails fox
 * 创建时间： 2018/11/6 14:32
 * 功能描述： application类
 * 联系方式：1037438704@qq.com
 *
 * @author dell-pc
 */

public class MyApplication extends Application {
    public static MyApplication instance;

    public static MyApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        DialogSettings.use_blur = true;                 //设置是否启用模糊

        DialogSettings.type = TYPE_IOS;
        DialogSettings.tip_theme = THEME_DARK;
        DialogSettings.dialog_theme = THEME_LIGHT;

        DialogSettings.dialog_title_text_size = -1;     //设置对话框标题文字大小，<=0不启用
        DialogSettings.dialog_message_text_size = -1;   //设置对话框内容文字大小，<=0不启用
        DialogSettings.dialog_button_text_size = -1;    //设置对话框按钮文字大小，<=0不启用
        DialogSettings.tip_text_size = -1;              //设置提示框文字大小，<=0不启用
        DialogSettings.dialog_menu_text_size = -1;    //设置菜单默认字号，<=0不启用
        DialogSettings.ios_normal_button_color = -1;
//        DialogSettings.ios_normal_button_color = this.getResources().getColor(R.color.color_frame);    //设置iOS风格默认按钮文字颜色，=-1不启用
//        DialogSettings.ios_normal_ok_button_color = this.getResources().getColor(R.color.theme_color);
//        DialogSettings.dialog_menu_text_size = this.getResources().getColor(R.color.black_1);      //设置菜单默认字号，<=0不启用
//        MobSDK.init(this);
        //所有接口的总路径
        HttpRequest.serviceUrl = "http://app.coinwind.io/index.php/Api/";
    }
}
