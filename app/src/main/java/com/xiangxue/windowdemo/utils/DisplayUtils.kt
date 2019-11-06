package com.xiangxue.windowdemo.utils

import android.content.Context

/**
 * Date:2019-11-06
 * author:lwb
 * Desc:
 */
class DisplayUtils {

    /**
     * convert px to its equivalent dp
     *
     * 将px转换为与之相等的dp
     */

    open fun px2dp(context: Context, pxValue: Float): Int {
        val scale = context.resources.displayMetrics.density
        return (pxValue / scale + 0.5f).toInt()
    }

    open fun dp2px(context: Context, dipValue: Float): Int {
        val scale = context.resources.displayMetrics.density
        return (dipValue * scale + 0.5f).toInt()
    }
}