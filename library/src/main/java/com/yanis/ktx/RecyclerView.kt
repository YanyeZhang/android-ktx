package com.yanis.ktx

import android.support.v7.widget.RecyclerView

/**
 * Created by zhangyanye on 2018/6/8.
 * Description:
 */
class RecyclerViewStyle : ViewStyle() {
    var layoutManager: RecyclerView.LayoutManager? = null
}

fun RecyclerView.setStyle(style: RecyclerViewStyle) = style.apply {
    if (isNotNull(layoutManager)) {
        this@setStyle.layoutManager = this.layoutManager!!
    }
}

fun RecyclerView.setStyle(block: RecyclerView.() -> Unit) = RecyclerViewStyle().apply {
    block()
    setStyle(this)
}