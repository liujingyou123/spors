package com.sport.limitsport

import android.support.annotation.LayoutRes
import android.view.View

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.sport.limitsport.home.model.Act

/**
 * Created by jingyouliu on 17/6/21.
 */

class TestAdapter(data: List<Act>?) : BaseQuickAdapter<Act, BaseViewHolder>(R.layout.adapter_shop, data) {

    override fun convert(helper: BaseViewHolder, item: Act) {

    }
}
