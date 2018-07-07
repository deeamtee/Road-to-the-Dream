package com.ien.snowdrop.roadtothedream.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.ien.snowdrop.roadtothedream.Activity.MainActivity;
import com.ien.snowdrop.roadtothedream.Activity.ManActivity;
import com.ien.snowdrop.roadtothedream.Activity.ManProgramActivity;
import com.ien.snowdrop.roadtothedream.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PartOfBodyFragment extends Fragment implements View.OnClickListener {


    public PartOfBodyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_part_of_body, container, false);

        //(MainActivity) getActivity().getSupp
        Button btn_chest = (Button) view.findViewById(R.id.btn_chest);
        Button btn_back = (Button) view.findViewById(R.id.btn_back);
        Button btn_legs = (Button) view.findViewById(R.id.btn_legs);

        btn_chest.setOnClickListener(this);
        btn_back.setOnClickListener(this);
        btn_legs.setOnClickListener(this);

/*
        ImageView imageView1 = (ImageView) view.findViewById(R.id.imageView1);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.imageView3);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
*/


        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.btn_chest:
                intent = new Intent(super.getActivity(), ManActivity.class);
                getActivity().startActivity(intent);
                break;
            case R.id.btn_back:
                intent = new Intent(super.getActivity(), ManProgramActivity.class);
                getActivity().startActivity(intent);
                break;
            case R.id.btn_legs:
                intent = new Intent(super.getActivity(), ManProgramActivity.class);
                getActivity().startActivity(intent);
                break;
        }

    }
}
