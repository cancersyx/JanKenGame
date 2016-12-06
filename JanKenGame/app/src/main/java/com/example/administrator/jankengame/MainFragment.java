package com.example.administrator.jankengame;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/7/1.
 * 负责游戏的主界面，
 */
public class MainFragment extends Fragment implements View.OnClickListener {

    private TextView mTxtResult;
    private ImageView mImgViewComPlay;
    private ImageButton mImgBtnScissiors,mImgBtnStone,mImgBtnPaper;
    public EditText mEdtCountSet,mEdtCountPlayerWin,mEdtCountComWin,mEdtCountDraw;
    //新增统计游戏局数和输赢的变量
    private int miCountSet = 0,
                miCountPlayerWin = 0,
                miCountComWin = 0,
                miCountDraw = 0;
    private boolean mbShowResult = false;//记录程序是否打开局数统计界面
    private final static String TAG_FRAGMENT_RESULT_1 = "Result 1",TAG_FRAGMENT_RESULT_2= "Result 2";
    //按钮
    private Button mBtnShowResult1,
                    mBtnShowResult2,
                    mBtnHiddenResult;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //必须先调用getView()取得程序界面对象，然后才能调用它的findViewById()取得界面对象
        mTxtResult = (TextView) getView().findViewById(R.id.txtResult);
        mImgBtnScissiors = (ImageButton) getView().findViewById(R.id.imgBtnScissors);
        mImgBtnStone = (ImageButton) getView().findViewById(R.id.imgBtnStone);
        mImgBtnPaper = (ImageButton) getView().findViewById(R.id.imgBtnPaper);
        mImgViewComPlay = (ImageView) getView().findViewById(R.id.imgViewComPlay);
        //以下界面是在另一个Fragment中，因此必须调用所属的Activity才能取得这些界面组件
       /* mEdtCountSet = (EditText) getActivity().findViewById(R.id.edtCountSet);
        mEdtCountPlayerWin = (EditText) getActivity().findViewById(R.id.edtCountPlayWin);
        mEdtCountComWin = (EditText) getActivity().findViewById(R.id.edtCountComWin);
        mEdtCountDraw = (EditText) getActivity().findViewById(R.id.edtCountDraw);
        */
        mImgBtnScissiors.setOnClickListener(this);
        mImgBtnStone.setOnClickListener(this);
        mImgBtnPaper.setOnClickListener(this);

        //加入Button按钮
        mBtnShowResult1 = (Button) getView().findViewById(R.id.btnShowResult1);
        mBtnShowResult2 = (Button) getView().findViewById(R.id.btnShowResult2);
        mBtnHiddenResult = (Button) getView().findViewById(R.id.btnHiddenResult);

        //设置点击事件
        mBtnShowResult1.setOnClickListener(this);
        mBtnShowResult2.setOnClickListener(this);
        mBtnHiddenResult.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            //你出剪刀
            case R.id.imgBtnScissors:
                //决定电脑出拳
                int iComPlay = (int) (Math.random()*3 + 1);
                /**
                 * 1-剪刀
                 * 2-石头
                 * 3-布
                 */
                miCountSet++;
               // mEdtCountSet.setText(String.valueOf(miCountSet));
                if (iComPlay == 1){
                    mImgViewComPlay.setImageResource(R.drawable.scissors);
                    mTxtResult.setText(getString(R.string.result)+
                            getString(R.string.play_draw));
                    miCountDraw++;
                   // mEdtCountDraw.setText(String.valueOf(miCountDraw));
                }else if (iComPlay == 2){
                    mImgViewComPlay.setImageResource(R.drawable.stone);
                    mTxtResult.setText(getString(R.string.result)+
                            getString(R.string.play_lose));
                    miCountComWin++;
                   // mEdtCountComWin.setText(String.valueOf(miCountComWin));
                }else {
                    mImgViewComPlay.setImageResource(R.drawable.paper);
                    mTxtResult.setText(getString(R.string.result)+
                            getString(R.string.play_win));
                    miCountPlayerWin++;
                   // mEdtCountPlayerWin.setText(String.valueOf(miCountPlayerWin));
                }
                if (mbShowResult){
                    mEdtCountDraw.setText(String.valueOf(miCountSet));
                    mEdtCountDraw.setText(String.valueOf(miCountDraw));
                    mEdtCountComWin.setText(String.valueOf(miCountComWin));
                    mEdtCountPlayerWin.setText(String.valueOf(miCountPlayerWin));
                }

                break;
            case R.id.imgBtnStone:
                //决定电脑出拳
                int iComPlay2 = (int) (Math.random()*3 + 1);
                /**
                 * 1-剪刀
                 * 2-石头
                 * 3-布
                 */
                miCountSet++;
                //mEdtCountSet.setText(String.valueOf(miCountSet));
                if (iComPlay2 == 1){
                    mImgViewComPlay.setImageResource(R.drawable.scissors);
                    mTxtResult.setText(getString(R.string.result)+
                            getString(R.string.play_win));
                    miCountPlayerWin++;
                   // mEdtCountPlayerWin.setText(String.valueOf(miCountPlayerWin));
                }else if (iComPlay2 == 2){
                    mImgViewComPlay.setImageResource(R.drawable.stone);
                    mTxtResult.setText(getString(R.string.result)+
                            getString(R.string.play_draw));
                    miCountDraw++;
                   // mEdtCountDraw.setText(String.valueOf(miCountDraw));
                }else {
                    mImgViewComPlay.setImageResource(R.drawable.paper);
                    mTxtResult.setText(getString(R.string.result)+
                            getString(R.string.play_lose));
                    miCountComWin++;
                    //mEdtCountComWin.setText(String.valueOf(miCountComWin));
                }
                if (mbShowResult){
                    mEdtCountDraw.setText(String.valueOf(miCountSet));
                    mEdtCountDraw.setText(String.valueOf(miCountDraw));
                    mEdtCountComWin.setText(String.valueOf(miCountComWin));
                    mEdtCountPlayerWin.setText(String.valueOf(miCountPlayerWin));
                }
                break;
            case R.id.imgBtnPaper:
                //决定电脑出拳
                int iComPlay3 = (int) (Math.random()*3 + 1);
                miCountSet++;
               // mEdtCountSet.setText(String.valueOf(miCountSet));
                if (iComPlay3 == 1){
                    mImgViewComPlay.setImageResource(R.drawable.scissors);
                    mTxtResult.setText(getString(R.string.result)+
                            getString(R.string.play_lose));
                    miCountComWin++;
                   // mEdtCountComWin.setText(String.valueOf(miCountComWin));
                }else if (iComPlay3 == 2){
                    mImgViewComPlay.setImageResource(R.drawable.stone);
                    mTxtResult.setText(getString(R.string.result)+
                            getString(R.string.play_win));
                    miCountPlayerWin++;
                    //mEdtCountPlayerWin.setText(String.valueOf(miCountPlayerWin));
                }else {
                    mImgViewComPlay.setImageResource(R.drawable.paper);
                    mTxtResult.setText(getString(R.string.result)+
                            getString(R.string.play_draw));
                    miCountDraw++;
                   // mEdtCountDraw.setText(String.valueOf(miCountDraw));
                }
                if (mbShowResult){
                    mEdtCountDraw.setText(String.valueOf(miCountSet));
                    mEdtCountDraw.setText(String.valueOf(miCountDraw));
                    mEdtCountComWin.setText(String.valueOf(miCountComWin));
                    mEdtCountPlayerWin.setText(String.valueOf(miCountPlayerWin));
                }
                break;
            case R.id.btnShowResult1:
                GameResultFragment fragGameResult = new GameResultFragment();
                FragmentTransaction fragTran = getFragmentManager().beginTransaction();
                fragTran.replace(R.id.frameLay,fragGameResult,TAG_FRAGMENT_RESULT_1);
                fragTran.commit();
                mbShowResult = true;
                break;
            case R.id.btnShowResult2:
                GameResultFragment2 fragGameResult2 = new GameResultFragment2();
                FragmentTransaction fragTran2 = getFragmentManager().beginTransaction();
                fragTran2.replace(R.id.frameLay,fragGameResult2,TAG_FRAGMENT_RESULT_2);
                fragTran2.commit();
                mbShowResult = true;
                break;
            case R.id.btnHiddenResult:
               mbShowResult = false;
                FragmentManager fragMgr3 = getFragmentManager();

                GameResultFragment fragGameResult3 = (GameResultFragment) fragMgr3.
                        findFragmentByTag(TAG_FRAGMENT_RESULT_1);
                if (null !=fragGameResult3){
                    FragmentTransaction fragTran3 = fragMgr3.beginTransaction();
                    fragTran3.remove(fragGameResult3);
                    fragTran3.commit();
                    return;
                }

                GameResultFragment2 fragGameResult4 = (GameResultFragment2) fragMgr3.
                        findFragmentByTag(TAG_FRAGMENT_RESULT_2);
                if (null !=fragGameResult4){
                    FragmentTransaction fragTran3 = fragMgr3.beginTransaction();
                    fragTran3.remove(fragGameResult4);
                    fragTran3.commit();
                    return;
                }

                break;
        }
    }
}
