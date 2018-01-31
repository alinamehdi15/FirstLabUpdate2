package com.example.entec01.myapplication;

import android.support.annotation.Nullable;
import android.util.Log;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class Main3ActivityFragment extends Fragment {

    public static final String TAG = "Main3ActivityFragment";

    public Main3ActivityFragment() {
        Log.d(TAG, "In the Main3ActivityFragment method");
    }

    @Override
    public void onAttach(Context context) {
        Log.d(TAG, "In the onAttach method");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "In the onCreate method");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "In the onCreateView method");
        return inflater.inflate(R.layout.fragment_main3, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "In the onDActivityCreated method");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "In the onStart method");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "In the onResume method");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "In the onPause method");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "In the onStop method");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "In the onDestroyView method");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "In the onDestroy method");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "In the onDetach method");
    }

}
