package com.sport.limitsport.main.home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sport.limitsport.R
import com.sport.limitsport.home.adapter.SportsAdapter
import com.sport.limitsport.home.model.Act
import com.sport.limitsport.view.StaggedDecoration

/**
 * Created by jingyouliu on 17/6/21.
 */
class ActivityFragment : Fragment() {
    private var recyclerView: RecyclerView? = null
    private var adapter: SportsAdapter? = null
    private var data = ArrayList<Act>()
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater?.inflate(R.layout.fragment_activity, null)
        initView(view)
        return view
    }

    fun initView(view: View?) {
        recyclerView = view?.findViewById(R.id.recyclerView) as RecyclerView

        if (adapter == null) adapter = SportsAdapter(data)

        recyclerView?.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView?.adapter = adapter

        recyclerView?.addItemDecoration(StaggedDecoration(16))

    }
}