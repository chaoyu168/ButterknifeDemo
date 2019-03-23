package com.example.butterknifedemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2019/3/23 0023
 * <p>
 * Desc: ButterKnife.bind(this，view);这里的this不能替换成getActivity（）
 * Fragment 中必须在onDestroyView()中做解绑操作
 */
public class MyFragment extends Fragment {
    @BindView(R.id.tv)
    TextView tv;
    @BindView(R.id.bt)
    Button bt;
    @BindView(R.id.iv)
    ImageView iv;
    @BindView(R.id.et)
    EditText et;
    private Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        //返回一个Unbinder值（进行解绑），注意这里的this不能使用getActivity()
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //解绑
        unbinder.unbind();
    }

    @OnClick(R.id.tv)
    public void onTvClicked() {
    }

    @OnClick(R.id.bt)
    public void onBtClicked() {
    }

    @OnClick(R.id.iv)
    public void onIvClicked() {
    }

    @OnClick(R.id.et)
    public void onEtClicked() {
    }
}
