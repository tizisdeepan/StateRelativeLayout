package com.deepan.staterelativelayout

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout

class StateRelativeLayout : RelativeLayout {
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle)

    fun setState(id: Int) {
        for (i in 0..childCount) {
            val child = getChildAt(i)
            if (child.id == id) child.visibility = View.VISIBLE else child.visibility = View.GONE
        }
    }
}