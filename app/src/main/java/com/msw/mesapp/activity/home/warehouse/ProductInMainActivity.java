package com.msw.mesapp.activity.home.warehouse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.msw.mesapp.R;
import com.msw.mesapp.utils.ActivityUtil;
import com.msw.mesapp.utils.StatusBarUtils;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ProductInMainActivity extends AppCompatActivity {

    @Bind(R.id.back)
    ImageView back;
    @Bind(R.id.title)
    TextView title;
    @Bind(R.id.add)
    ImageView add;
    @Bind(R.id.tv1)
    TextView tv1;
    @Bind(R.id.tv2)
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_in_main);
        ButterKnife.bind(this);
        initView();
    }


    public void initTitle() {
        StatusBarUtils.setActivityTranslucent(this); //设置全屏
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        title.setText("产品入库");
        add.setVisibility(View.INVISIBLE);
    }
    public void initView() {
        initTitle();

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityUtil.switchTo(ProductInMainActivity.this,ProductInAddActivityDetail1Scan.class);
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityUtil.switchTo(ProductInMainActivity.this,ProductInActivity.class);
            }
        });
    }
}
