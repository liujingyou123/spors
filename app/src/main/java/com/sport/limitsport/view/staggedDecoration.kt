package com.sport.limitsport.view

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by jingyouliu on 17/6/21.
 */
class StaggedDecoration(var space:Int) : RecyclerView.ItemDecoration(){
    override fun getItemOffsets(outRect: Rect?, view: View?, parent: RecyclerView?, state: RecyclerView.State?) {
        var position = parent?.getChildLayoutPosition(view)
        outRect?.left = space
        outRect?.right = space
    }
}