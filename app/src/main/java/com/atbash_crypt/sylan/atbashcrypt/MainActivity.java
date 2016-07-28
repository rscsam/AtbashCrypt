package com.atbash_crypt.sylan.atbashcrypt;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("AtbashCrypt by Sylan");
        final Button bEncrypt = (Button) findViewById(R.id.bttn_encrypt);
        final Button bDecrypt = (Button) findViewById(R.id.bttn_decrypt);
        EditText etText = (EditText) findViewById(R.id.et_text);
        final TextView tvResult = (TextView) findViewById(R.id.tv_result);
        bEncrypt.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        String in = ((EditText) findViewById(R.id.et_text)).getText().toString();
                        String out = Atbash.encrypt(in);
                        tvResult.setText(out);
                        View view = getCurrentFocus();
                        if (view != null) {
                            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                        }
                    }
                });
        bDecrypt.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        String in = ((EditText) findViewById(R.id.et_text)).getText().toString();
                        String out = Atbash.encrypt(in);
                        tvResult.setText(out);
                        View view = getCurrentFocus();
                        if (view != null) {
                            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                        }
                    }
                });
    }
}
