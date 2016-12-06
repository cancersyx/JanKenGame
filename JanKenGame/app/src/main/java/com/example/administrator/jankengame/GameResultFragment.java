package com.example.administrator.jankengame;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by Administrator on 2016/7/1.
 */
public class GameResultFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_game_result,container,false);
    }
    @Override
    public void onResume() {
        super.onResume();
        MainFragment frag = (MainFragment) getFragmentManager().findFragmentById(R.id.fragMain);
        frag.mEdtCountSet = (EditText) getActivity().findViewById(R.id.edtCountSet);
        frag.mEdtCountPlayerWin = (EditText) getActivity().findViewById(R.id.edtCountPlayWin);
        frag.mEdtCountComWin = (EditText) getActivity().findViewById(R.id.edtCountComWin);
        frag.mEdtCountDraw = (EditText) getActivity().findViewById(R.id.edtCountDraw);
    }
}
