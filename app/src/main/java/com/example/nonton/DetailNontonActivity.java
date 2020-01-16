package com.example.nonton;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DetailNontonActivity extends AppCompatActivity {

    public static final String EXTRA_GF = "gF";
    public static final String EXTRA_NF = "nF";
    public static final String EXTRA_DF = "dF";

    @BindView(R.id.imgphoto)
    ImageView imgPhoto;
    @BindView(R.id.tv_judul)
    TextView tvJudul;
    @BindView(R.id.tv_deskripsi)
    TextView tvDeskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_nonton);
        ButterKnife.bind(this);
        view();
    }

    private void view() {
        imgPhoto.setImageResource(getIntent().getIntExtra(EXTRA_GF, 0));
        tvJudul.setText(getIntent().getStringExtra(EXTRA_NF));
        tvDeskripsi.setText(getIntent().getIntExtra(EXTRA_DF, 0));
    }

}
