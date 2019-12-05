package com.example.fragmentassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmentassignment.fragments.AreaOfCircle;
import com.example.fragmentassignment.fragments.AutomorphicFragment;
import com.example.fragmentassignment.fragments.PalindromeFragment;
import com.example.fragmentassignment.fragments.ReverseNumFragment;
import com.example.fragmentassignment.fragments.ReverseStringFragment;
import com.example.fragmentassignment.fragments.SumFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnSum, btnArea, btnAutomorphic, btnReverseNum, btnPalindrome, btnReverseString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.bindControlsAndListeners();
    }
    private void bindControlsAndListeners(){

        this.btnSum = findViewById(R.id.btnSum);
        this.btnSum.setOnClickListener(this);

        this.btnArea = findViewById(R.id.btnArea);
        this.btnArea.setOnClickListener(this);

        this.btnAutomorphic = findViewById(R.id.btnAutomorphic);
        this.btnAutomorphic.setOnClickListener(this);

        this.btnReverseNum = findViewById(R.id.btnReverseNum);
        this.btnReverseNum.setOnClickListener(this);

        this.btnReverseString = findViewById(R.id.btnReverseString);
        this.btnReverseString.setOnClickListener(this);

        this.btnPalindrome = findViewById(R.id.btnPalindrome);
        this.btnPalindrome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (v.getId()){
            case R.id.btnSum:
                SumFragment sumFragment = new SumFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,sumFragment);
                fragmentTransaction.commit();

                break;
            case R.id.btnArea:
                AreaOfCircle areaOfCircle = new AreaOfCircle();
                fragmentTransaction.replace(R.id.fragmentContainer,areaOfCircle);
                fragmentTransaction.commit();
                break;
            case R.id.btnAutomorphic:
                AutomorphicFragment automorphicFragment = new AutomorphicFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,automorphicFragment);
                fragmentTransaction.commit();
                break;
            case R.id.btnReverseNum:
                ReverseNumFragment reverseNumFragment = new ReverseNumFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,reverseNumFragment);
                fragmentTransaction.commit();
                break;
            case R.id.btnReverseString:
                ReverseStringFragment reverseStringFragment = new ReverseStringFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,reverseStringFragment);
                fragmentTransaction.commit();
                break;
            case R.id.btnPalindrome:
                PalindromeFragment palindromeFragment = new PalindromeFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,palindromeFragment);
                fragmentTransaction.commit();
                break;


        }
    }
}
