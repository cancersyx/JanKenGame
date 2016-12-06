package com.example.administrator.jankengame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
//    private TextView mTxtResult;
//    private ImageView mImgViewComPlay;
//    private ImageButton mImgBtnScissiors,mImgBtnStone,mImgBtnPaper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mImgViewComPlay = (ImageView) findViewById(R.id.imgViewComPlay);
//        mTxtResult = (TextView) findViewById(R.id.txtResult);
//        mImgBtnScissiors = (ImageButton) findViewById(R.id.imgBtnScissors);
//        mImgBtnStone = (ImageButton) findViewById(R.id.imgBtnStone);
//        mImgBtnPaper = (ImageButton) findViewById(R.id.imgBtnPaper);
//
//        mImgBtnScissiors.setOnClickListener(this);
//        mImgBtnStone.setOnClickListener(this);
//        mImgBtnPaper.setOnClickListener(this);
    }

//    @Override
//    public void onClick(View view) {
//        switch (view.getId()){
//            case R.id.imgBtnScissors:
//                //决定电脑出拳
//                int iComPlay = (int) (Math.random()*3 + 1);
//                /**
//                 * 1-剪刀
//                 * 2-石头
//                 * 3-布
//                 */
//                if (iComPlay == 1){
//                    mImgViewComPlay.setImageResource(R.drawable.scissors);
//                    mTxtResult.setText(getString(R.string.result)+
//                    getString(R.string.play_draw));
//                }else if (iComPlay == 2){
//                    mImgViewComPlay.setImageResource(R.drawable.stone);
//                    mTxtResult.setText(getString(R.string.result)+
//                            getString(R.string.play_lose));
//                }else {
//                    mImgViewComPlay.setImageResource(R.drawable.paper);
//                    mTxtResult.setText(getString(R.string.result)+
//                            getString(R.string.play_win));
//                }
//
//                break;
//            case R.id.imgBtnStone:
//                //决定电脑出拳
//                int iComPlay2 = (int) (Math.random()*3 + 1);
//                /**
//                 * 1-剪刀
//                 * 2-石头
//                 * 3-布
//                 */
//                if (iComPlay2 == 1){
//                    mImgViewComPlay.setImageResource(R.drawable.scissors);
//                    mTxtResult.setText(getString(R.string.result)+
//                            getString(R.string.play_win));
//                }else if (iComPlay2 == 2){
//                    mImgViewComPlay.setImageResource(R.drawable.stone);
//                    mTxtResult.setText(getString(R.string.result)+
//                            getString(R.string.play_draw));
//                }else {
//                    mImgViewComPlay.setImageResource(R.drawable.paper);
//                    mTxtResult.setText(getString(R.string.result)+
//                            getString(R.string.play_lose));
//                }
//                break;
//            case R.id.imgBtnPaper:
//                //决定电脑出拳
//                int iComPlay3 = (int) (Math.random()*3 + 1);
//                if (iComPlay3 == 1){
//                    mImgViewComPlay.setImageResource(R.drawable.scissors);
//                    mTxtResult.setText(getString(R.string.result)+
//                            getString(R.string.play_lose));
//                }else if (iComPlay3 == 2){
//                    mImgViewComPlay.setImageResource(R.drawable.stone);
//                    mTxtResult.setText(getString(R.string.result)+
//                            getString(R.string.play_win));
//                }else {
//                    mImgViewComPlay.setImageResource(R.drawable.paper);
//                    mTxtResult.setText(getString(R.string.result)+
//                            getString(R.string.play_draw));
//                }
//                break;
//        }
//    }
}
