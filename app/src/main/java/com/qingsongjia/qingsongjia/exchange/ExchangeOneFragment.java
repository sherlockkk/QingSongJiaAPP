package com.qingsongjia.qingsongjia.exchange;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.qingsongjia.qingsongjia.R;
import com.qingsongjia.qingsongjia.adapter.ExchangeListAdapter;
import com.wan7451.base.WanListFragment;
import com.wan7451.wanadapter.recycle.WanAdapter;
import com.wan7451.wanadapter.recycle.WanViewHolder;

import java.util.ArrayList;

public class ExchangeOneFragment extends WanListFragment {

    ArrayList<String> date=new ArrayList<>();

    public ExchangeOneFragment() {
    }


    @Override
    protected boolean addData() {
        return false;
    }

    @Override
    protected boolean loadData() {

        date.add("");
        date.add("");
        date.add("");
        date.add("");
        date.add("");
        date.add("");

        loadFinish("");

        return false;
    }

    @Override
    public WanAdapter getAdapter() {

        return new ExchangeListAdapter(getContext(),date,R.layout.item_exchange_list);
    }

    @Override
    public void initView(View v) {
        super.initView(v);
        getMainView().getRefreshableView().removeItemDecoration(getItemDecore());

    }

    @Override
    public void onItemClickListener(int posotion, WanViewHolder holder) {

    }
}