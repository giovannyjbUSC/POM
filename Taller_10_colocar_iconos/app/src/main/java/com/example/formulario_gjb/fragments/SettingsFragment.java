package com.example.formulario_gjb.fragments;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.example.formulario_gjb.R;

public class SettingsFragment extends PreferenceFragmentCompat {
   // R.xml.root_preferences
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
    }
}