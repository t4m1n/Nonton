package com.example.nonton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.nonton.DetailNontonActivity.EXTRA_DF;
import static com.example.nonton.DetailNontonActivity.EXTRA_GF;
import static com.example.nonton.DetailNontonActivity.EXTRA_NF;

public class MainActivity extends AppCompatActivity {

    String [] namaFilm = {"Bombshell", "Ip Man", "Star Wars", "Spies In Disguise", "Knives Out", "Habibie", "The Grudge", "Last Christmas"};
    int [] gambarFilm = {R.drawable.bombshell, R.drawable.ipman, R.drawable.starwars,
            R.drawable.spiesindisguies, R.drawable.knivesout, R.drawable.habibie,
            R.drawable.thegrudge, R.drawable.lastchristmas};
    int [] detailFilm = {R.string.Bombshell, R.string.Ipman, R.string.Starwars,
            R.string.Spies, R.string.KnivesOut, R.string.Habibie,
            R.string.TheGrudge, R.string.LastChristmas};

    @BindView(R.id.grid_nonton)
    GridView gridNonton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



        NontonAdapter adapter = new NontonAdapter(MainActivity.this, namaFilm, gambarFilm);

            gridNonton.setAdapter(adapter);

            gridNonton.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent detailIntent = new Intent(MainActivity.this, DetailNontonActivity.class);
                    detailIntent.putExtra(EXTRA_NF, namaFilm[i]);
                    detailIntent.putExtra(EXTRA_GF, gambarFilm[i]);
                    detailIntent.putExtra(EXTRA_DF, detailFilm[i]);
                    startActivity(detailIntent);

                }
            });

        }
    }
