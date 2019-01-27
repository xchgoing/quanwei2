package com.example.administrator.a2;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import java.util.UUID;

public class CrimeListActivity extends SingleFragmentAcctivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
