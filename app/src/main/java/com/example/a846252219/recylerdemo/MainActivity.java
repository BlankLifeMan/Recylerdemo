package com.example.a846252219.recylerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private HomeAdapter homeAdapter;
    private List<String> mList;
    private RecyclerView.Adapter mHomeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            RecyclerView mRecyclerView = (RecyclerView) this.findViewById(R.id.rl_rl1);
            //设置布局管理器
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //设置item增加和删除时的动画
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        homeAdapter = new HomeAdapter(this, mList);
        mRecyclerView.setAdapter(mHomeAdapter);
    }
}
