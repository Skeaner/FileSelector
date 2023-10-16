package com.zlylib.fileselectorlib.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.QuickViewHolder;
import com.zlylib.fileselectorlib.R;
import com.zlylib.fileselectorlib.bean.BreadModel;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * BreadAdapter
 * Created by zhangliyang on 2020/6/20.
 */

public class BreadAdapter extends BaseQuickAdapter<BreadModel, QuickViewHolder> {

    public BreadAdapter(List<BreadModel> data) {
        super(data);
    }

    @Override
    protected void onBindViewHolder( QuickViewHolder holder, int position,  BreadModel item) {
        holder.setText(R.id.btn_bread, item.getCurName());
    }

    @NotNull
    @Override
    protected QuickViewHolder onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup viewGroup, int viewType) {
        return new QuickViewHolder(LayoutInflater.from(context).inflate(R.layout.bread_item, viewGroup, false));
    }
}
