package com.yanis.ktx

/**
 * Created by zhangyanye on 2018/6/8.
 * Description:
 */
open class Style {

    private var block: Any.() -> Unit? = {}

    fun setStyle(block: Any.() -> Unit) {
        this@Style.block = block
    }

    fun apply() {
        block()
    }
}

fun Any.style(block: Any.() -> Unit) = Style().apply {
    setStyle(block)
}


open class ViewStyle : Style() {
    var background: Int? = null
    var padding: Int? = null

    fun isNotNull(property: Any?): Boolean {
        if (property == null) {
            return false
        }
        return true
    }
}


