package com.example.md.mdview;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by libo on 2017/11/3.
 */

public class RunBehavior extends CoordinatorLayout.Behavior<View>{

    //带有参数的构造方法必须要重载，因为coordinatorlayout是根据反射（所以是包名.类名路径）获取这个behavior，是从这个构造方法获得对象的
    public RunBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 当 dependency这个哥哥发生变化时， 另一个child弟弟也要跟着去玩
     * @param parent
     * @param child
     * @param dependency
     * @return
     */
    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        //一个view根据另一个view的变化而变化，  dependency被 child监听

        int top = dependency.getTop();
        int left = dependency.getLeft();

        ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        params.topMargin = top - 400;
        params.leftMargin = left;
        child.setLayoutParams(params);
        return true;
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        //自己判断，返回true联动，返回flase不联动，即behavior不生效
        return true;
    }
}
