package com.ien.snowdrop.roadtothedream.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.ien.snowdrop.roadtothedream.Activity.MainActivity;
import com.ien.snowdrop.roadtothedream.Activity.ManProgramActivity;
import com.ien.snowdrop.roadtothedream.R;


public class HomeFragment extends Fragment implements View.OnClickListener {
    boolean flag = true;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ImageButton imgButton_1 = (ImageButton) view.findViewById(R.id.imgButton_1);
        ImageButton imgButton_2 = (ImageButton) view.findViewById(R.id.imgButton_2);
        imgButton_1.setOnClickListener(this);
        imgButton_2.setOnClickListener(this);
        return view;
    }



    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.imgButton_1:
                 intent = new Intent(super.getActivity(), ManProgramActivity.class);
                getActivity().startActivity(intent);
                break;
            case R.id.imgButton_2:
                 intent = new Intent(super.getActivity(), ManProgramActivity.class);
                getActivity().startActivity(intent);
                break;
            case R.id.imgButton_3:
                intent = new Intent(super.getActivity(), ManProgramActivity.class);
                getActivity().startActivity(intent);
                break;

        }

}

       /* MusicFragment nextFrag= new MusicFragment();
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, nextFrag,"findThisFragment")
                .addToBackStack(null)
                .commit();*/

      /*  Log.i("OnClick:", "Button Pressed ");*/



}