package com.cleo.codebase.cases.loader.replaced;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.cleo.codebase.R;
import com.cleo.codebase.cases.loader.ClassLoaderActivity;

/**
 * author:gaoguanling
 * date:2021/10/12
 * time:12:47
 * email:gaoguanling@360.cn
 * link:
 */
public class DyJavaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_dynamic_activity);

        Log.e(ClassLoaderActivity.tag, this.getClass().getClassLoader().toString());
        Toast.makeText(this, "这是内置的Java Activity", Toast.LENGTH_LONG).show();
    }
}
