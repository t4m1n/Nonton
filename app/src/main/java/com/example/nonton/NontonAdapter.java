package com.example.nonton;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NontonAdapter extends BaseAdapter {

    private String[] namaFilm;
    private int[] gambarFilm;
    private Activity activity;


    public NontonAdapter(MainActivity activity, String[] namaFilm,int[] gambarFilm) {
        this.activity = activity;
        this.namaFilm = namaFilm;
        this.gambarFilm = gambarFilm;


    }
    @Override
    public int getCount() {
        return namaFilm.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       LayoutInflater inflater = activity.getLayoutInflater();
           view = inflater.inflate(R.layout.tampilannontongrid,null);



       ViewHolder holder = new ViewHolder (view);

       holder.tvNamaFilm.setText(namaFilm[i]);
       holder.imgFilmList.setImageResource(gambarFilm[i]);
       return view;

    }

    static
    class ViewHolder {
        @BindView(R.id.img_filmlist)
        ImageView imgFilmList;
        @BindView(R.id.tv_namafilm)
        TextView tvNamaFilm;

        ViewHolder (View view) {
            ButterKnife.bind(this,view);
        }

    }
}
