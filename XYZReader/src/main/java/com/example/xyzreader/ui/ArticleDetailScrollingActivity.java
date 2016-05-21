package com.example.xyzreader.ui;

import android.os.Bundle;
import android.app.Activity;

import com.example.xyzreader.R;

public class ArticleDetailScrollingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_detail_scrolling);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
