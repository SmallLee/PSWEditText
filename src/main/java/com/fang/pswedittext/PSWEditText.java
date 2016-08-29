package com.fang.pswedittext;

import android.content.Context;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by hecun on 2016/8/29.
 */
public class PSWEditText extends EditText {
    public PSWEditText(Context context) {
       this(context,null);
    }

    public PSWEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public void showPassWord(boolean flag){
        if(flag){
            //设置明文显示
            setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        }else{
            //设置密文显示
            setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        //保证每次切换明文密文后光标都在最后面，默认是会切换到最前端
        setSelection(getText().length());
    }
}
