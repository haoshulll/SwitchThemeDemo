package com.example.haoshul.switchthemedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    public static int currentTheme = R.style.BlueTheme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (currentTheme != -1)
            setTheme(currentTheme);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

    }

    @OnClick(R.id.button)
    public void onClick() {
        switchTheme();
    }

    private void switchTheme() {
        if (currentTheme == R.style.BlueTheme){
            currentTheme = R.style.OrangeTheme;
        }else {
            currentTheme = R.style.BlueTheme;
        }
        recreate();//等同于下面两句代码
//        finish();
//        startActivity(getIntent());
    }
}
