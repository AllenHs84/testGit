package com.example.allenhuang.testrecycleviewcomplex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Lijizhou on 2016/2/21.
 * 代码解析BLOG: http://blog.csdn.net/leejizhou/article/details/50708349
 * QQ 3107777777
 */
public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    private String[] title = {"Blog : http://blog.csdn.net/Leejizhou.",
            "A good laugh and a long sleep are the best cures in the doctor's book.",
            "all or nothing, now or never ",
            "Be nice to people on the way up, because you'll need them on your way down.",
            "Be confident with yourself and stop worrying what other people think. Do what's best for your future happiness!",
            "Blessed is he whose fame does not outshine his truth.",
            "Create good memories today, so that you can have a good past"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        mRecyclerView=(RecyclerView)findViewById(R.id.rv_list);

        if (getIntent().getIntExtra("type", 0) == 1){

            LinearLayoutManager layoutManager = new LinearLayoutManager(this);
            layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
            mRecyclerView.setLayoutManager(layoutManager);

        }else if(getIntent().getIntExtra("type", 0) == 2){

            mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        }

        mRecyclerView.setAdapter(new RecyclerViewAdapter(this, title));


    }
}
