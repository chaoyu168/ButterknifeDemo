package com.example.butterknifedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

/**
 * Created by Administrator on 2019/3/23 0023
 * <p>
 * Desc: ButterKnife.bind(this);必须在setContentView();之后绑定；且父类bind绑定后，子类不需要再bind。
 * Activity中不需要做解绑操作
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv)
    TextView tv;
    @BindView(R.id.bt)
    Button bt;
    @BindView(R.id.iv)
    ImageView iv;
    @BindView(R.id.rg_home)
    RadioButton rgHome;
    @BindView(R.id.rg_wealth)
    RadioButton rgWealth;
    @BindView(R.id.rg_account)
    RadioButton rgAccount;
    @BindView(R.id.rg_main)
    RadioGroup rgMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //绑定初始化ButterKnife
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tv, R.id.bt, R.id.iv, R.id.rg_home, R.id.rg_wealth, R.id.rg_account, R.id.rg_main})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv:
                break;
            case R.id.bt:
                break;
            case R.id.iv:
                break;
        }
    }
    @OnCheckedChanged({R.id.rg_home,R.id.rg_account,R.id.rg_account})
    public void OnCheckedChangeListener(CompoundButton view, boolean ischanged ){
        switch (view.getId()) {
            case R.id.rg_home:
                if (ischanged){//注意：这里一定要有这个判断，只有对应该id的按钮被点击了，ischanged状态发生改变，才会执行下面的内容

                }
                break;
            case R.id.rg_wealth:
                if (ischanged) {

                }
                break;
            case R.id.rg_account:
                if (ischanged) {

                }
                break;
        }
    }

}
