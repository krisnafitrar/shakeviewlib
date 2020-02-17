package com.github.shakeview;

import android.content.Context;
import android.os.Vibrator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

public class ShakeLib {
    private Context mContext;
    private Vibrator vibrate;

    public ShakeLib(Context mContext)
    {
        this.mContext = mContext;
    }

    public void setShake(View mView)
    {
        mView.startAnimation( AnimationUtils.loadAnimation( mContext,R.anim.shake ) );
    }

    public void setShakeWithVibrate(View mView, int duration)
    {
        mView.startAnimation( AnimationUtils.loadAnimation( mContext,R.anim.shake ) );
        vibrate.vibrate( duration );
    }

    public void setShakeWithMessage(View mView,String msg,boolean isLong)
    {
        mView.startAnimation( AnimationUtils.loadAnimation( mContext,R.anim.shake ) );
        if(isLong){
            Toast.makeText( mContext, msg, Toast.LENGTH_LONG ).show();
        }else{
            Toast.makeText( mContext, msg, Toast.LENGTH_SHORT ).show();
        }
    }

    public void setVibrate(int duration)
    {
        vibrate.vibrate( duration );
    }


    public void setToastMessage(String msg, boolean isLong)
    {
        if(isLong){
            Toast.makeText( mContext, msg, Toast.LENGTH_LONG ).show();
        }else{
            Toast.makeText( mContext, msg, Toast.LENGTH_SHORT ).show();
        }
    }

    public void setShakeWithVibrateMsg(View mView,int duration,String msg,boolean isLong)
    {
        mView.startAnimation( AnimationUtils.loadAnimation( mContext,R.anim.shake ) );
        vibrate.vibrate( duration );
        if(isLong){
            Toast.makeText( mContext, msg, Toast.LENGTH_LONG ).show();
        }else{
            Toast.makeText( mContext, msg, Toast.LENGTH_SHORT ).show();
        }
    }

}
