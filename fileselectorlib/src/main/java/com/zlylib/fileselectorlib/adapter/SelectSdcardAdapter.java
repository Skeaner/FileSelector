package com.zlylib.fileselectorlib.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.QuickViewHolder;
import com.zlylib.fileselectorlib.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * SelectSdcardAdapter
 * Created by zhangliyang on 2020/6/22.
 */

public class SelectSdcardAdapter extends BaseQuickAdapter<String, QuickViewHolder> {
    public SelectSdcardAdapter(List<String> data) {
        super(data);
    }

    @Override
    protected void onBindViewHolder(@NotNull QuickViewHolder helper, int position, @Nullable String item) {
        helper.setText(R.id.tv_item_select_sdcard, item);
    }

    @NotNull
    @Override
    protected QuickViewHolder onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup viewGroup, int viewType) {
        return new QuickViewHolder(LayoutInflater.from(context).inflate(R.layout.item_select_sdcard, viewGroup, false));
    }
}
