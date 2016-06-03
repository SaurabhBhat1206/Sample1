package com.events.hanle.fragexample;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Fragment fragment;
    Button btnFragment1, btnFragment2;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFragment1 = (Button)findViewById(R.id.displayfragment1);
        btnFragment2 = (Button)findViewById(R.id.displayfragment2);

        // get an instance of FragmentTransaction from your Activity
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //add a fragment
        MyFragment myFragment = new MyFragment();
        fragmentTransaction.add(R.id.myfragment, myFragment);
        fragmentTransaction.commit();

        btnFragment1.setOnClickListener(btnFragmentOnClickListener);
        btnFragment2.setOnClickListener(btnFragmentOnClickListener);
    }

    Button.OnClickListener btnFragmentOnClickListener
            = new Button.OnClickListener(){

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            Fragment newFragment;

            // Create new fragment
            if(v == btnFragment1){
                newFragment = new MyFragment();
            }else{
                newFragment = new MyFragment2();
            }

            // Create new transaction
            FragmentTransaction transaction = getFragmentManager().beginTransaction();

            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack
            transaction.replace(R.id.myfragment, newFragment);
            transaction.addToBackStack(null);

            // Commit the transaction
            transaction.commit();
        }};
}
