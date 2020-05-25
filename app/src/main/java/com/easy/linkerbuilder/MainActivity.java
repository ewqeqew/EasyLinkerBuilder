package com.easy.linkerbuilder;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.walixiwa.easy.machine.model.BaseRuleModel;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //直接在代码中生成linker，这里只做demo示范。
        //自定义站源DEMO请看ModelBuilder

        Log.e("Linker", ModelBuilder.buildQingYunModel().toBase64Linker());

        //生成linker后如何自定义订阅源请看assets下的subscription.json

        findViewById(R.id.btn_create).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBuilderDialog();
            }
        });
    }


    private void showBuilderDialog() {
        final BaseRuleModel ruleModel = ModelBuilder.buildQingYunModel();
        new AlertDialog.Builder(this)
                .setTitle("创建引擎")
                .setMessage(ruleModel.toBase64Linker())
                .setCancelable(false)
                .setPositiveButton("复制Linker", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                        assert clipboardManager != null;
                        clipboardManager.setPrimaryClip(ClipData.newPlainText(null, ruleModel.toBase64Linker()));
                        Toast.makeText(MainActivity.this, "已复制Linker", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .show();
    }

}
