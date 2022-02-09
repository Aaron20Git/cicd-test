package com.example.cicdtest

import android.content.Context

class ResourceComparer {

    fun isEqual(ctx: Context, resId: Int, string: String): Boolean {
        return ctx.getString(resId) == string

    }
}