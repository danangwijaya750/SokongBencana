package com.dngwjy.infinite.sokongbencana.utilities.extensions

import android.content.Context
import android.widget.Toast

fun Context.toast(msg: String?) = msg.let{
    Toast.makeText(this,it,Toast.LENGTH_SHORT).show()
}