# PSWEditText
动态显示与隐藏密码的EditText

##效果图

![img](https://github.com/SmallLee/PSWEditText/blob/master/GIF2.gif)


##使用
与普通EditText一样

```Java
 <com.fang.pswedittext.PSWEditText
        android:id = "@+id/et"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint = "请输入密码"
        />
```
代码

```Java
 checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                pswEditText.showPassWord(isChecked);
            }
        });
```

##方法介绍

```Java
 /**
     * 是否显示密码
     * @param flag true,显示密码，否则隐藏
     */
    public void showPassWord(boolean flag){
    .....
    }
```

