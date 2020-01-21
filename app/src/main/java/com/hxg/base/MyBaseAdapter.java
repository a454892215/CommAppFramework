package com.hxg.base;

import android.content.Context;

import androidx.annotation.NonNull;

import com.common.base.BaseRVAdapter;
import com.common.base.BaseViewHolder;

import java.util.List;

public  class MyBaseAdapter<T> extends BaseRVAdapter<T> {

    public MyBaseAdapter(Context context, int itemLayoutId, List<T> list) {
        super(context, itemLayoutId, list);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        if (getItemViewType(position) == VIEW_TYPE_EMPTY) return;
    }
}
