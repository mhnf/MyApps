package com.example.admin.mhabibnf;
/**
 * TANGGAL PENGERJAAN : 15 MEI 2019
 * NIM                : 10116369
 * NAMA               : MUHAMMAD HABIB NUR FAUZAN
 * KELAS              : IF - 8
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FriendsFragment extends Fragment {


    public FriendsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_friends, container, false);
    }

}
