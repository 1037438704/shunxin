package zdl.tianxunda.com.shunxin;

import com.kongzue.baseframework.interfaces.DarkNavigationBarTheme;
import com.kongzue.baseframework.interfaces.DarkStatusBarTheme;
import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.interfaces.NavigationBarBackgroundColor;
import com.kongzue.baseframework.util.JumpParameter;

import zdl.tianxunda.com.shunxin.base.BaseAty;
/**
 * 创建人： Nine tails fox
 * 创建时间： 2018/11/10 10:00
 * 功能描述：主界面
 * 联系方式：1037438704@qq.com
 *
 * @author dell-pc
 */

@Layout(R.layout.activity_main)
@DarkStatusBarTheme(true)  //开启顶部状态栏图标、false 白色 true 黑色
@NavigationBarBackgroundColor(a = 0, r = 0, g = 0, b = 0)
//透明颜色   设置底部导航栏背景颜色（a = 255,r = 255,g = 255,b = 255 黑色的）
@DarkNavigationBarTheme(true) //开启底部导航栏按钮暗色
public class MainActivity extends BaseAty {


    @Override
    public void initViews() {

    }

    @Override
    public void initDatas(JumpParameter paramer) {

    }

    @Override
    public void setEvents() {

    }
}
