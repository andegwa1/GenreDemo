package com.example.al.genredemo.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;

import com.example.al.genredemo.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Al on 7/17/2017.
 */

public class ExitDialog extends Dialog {


    private final IExitDialogListener exitDialogListener;


//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//    }


    @OnClick(R.id.activity_quiz_ok)
    public void ok(View view){
        exitDialogListener.onOKClicked("You clicked OK!");
        System.exit(0);
    }

    @OnClick(R.id.activity_quiz_cancel)
    public void cancel(View view){
        cancel();
    }

    private int checkedID;

    public interface IExitDialogListener{

        public void onOKClicked(String msg);
        //abstract void onCancelClicked();
    }


    public ExitDialog(@NonNull Context context, IExitDialogListener exitDialogListener) {
        super(context, R.style.dialog);
        setContentView(R.layout.dialog_exit);
        //ButterKnife.bind(this);
        ButterKnife.bind(this);

        this.exitDialogListener = exitDialogListener;
    }


}
