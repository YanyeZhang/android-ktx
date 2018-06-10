package com.yanis.ktx

import android.graphics.Typeface
import android.widget.TextView

/**
 * Created by zhangyanye on 2018/6/7.
 * Description:
 */

class TextStyle : ViewStyle() {
    var textSize: Float? = null
    var textColor: Int? = null
    var textStyle: Typeface? = null
}

fun TextView.setStyle(style: TextStyle) = style.apply {
    if (isNotNull(textSize)) {
        this@setStyle.textSize = this.textSize!!
    }
    if (isNotNull(textColor)) {
        this@setStyle.setTextColor(this.textColor!!)
    }
    if (isNotNull(textStyle)) {
        this@setStyle.typeface = this.textStyle
    }
    if (isNotNull(background)) {
        this@setStyle.setBackgroundResource(this.background!!);
    }
    if (isNotNull(padding)) {
        val padding = this.padding!!
        this@setStyle.setPadding(padding, padding, padding, padding);
    }
}

fun TextView.setStyle(block: TextStyle.() -> Unit) = TextStyle().apply {
    block()
    setStyle(this)
}


