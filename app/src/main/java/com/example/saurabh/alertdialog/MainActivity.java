package com.example.saurabh.alertdialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    final Context context = this;

    @Bind(R.id.showCustomAlertDialog)
    Button showCustomAlertDialog;

    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        showCustomAlertDialog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                dialog = new Dialog(context);
                dialog.setContentView(R.layout.dialog_signin);

                Button dialogButtonOk = (Button) dialog.findViewById(R.id.dialogButtonOk);
                TextView textViewHeader = (TextView) dialog.findViewById(R.id.textViewheader);
                TextView textViewMessage = (TextView) dialog.findViewById(R.id.textViewMessage);
                Button firstRightButton = (Button) dialog.findViewById(R.id.firstRightButton);
                Button firstLeftButton = (Button) dialog.findViewById(R.id.firstLeftButton);
                Button secondRightButton = (Button) dialog.findViewById(R.id.secondRightButton);
                Button secondLeftButton = (Button) dialog.findViewById(R.id.secondLeftButton);
                Button thirdButton = (Button) dialog.findViewById(R.id.thirdButton);

                dialogButtonOk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });

                firstRightButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "firstRightButton", Toast.LENGTH_SHORT).show();
                    }
                });

                firstLeftButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "firstLeftButton", Toast.LENGTH_SHORT).show();
                    }
                });
                secondRightButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "secondRightButton", Toast.LENGTH_SHORT).show();
                    }
                });
                secondLeftButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "secondLeftButton", Toast.LENGTH_SHORT).show();
                    }
                });
                thirdButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "thirdButton", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();
            }
        });
    }
}
