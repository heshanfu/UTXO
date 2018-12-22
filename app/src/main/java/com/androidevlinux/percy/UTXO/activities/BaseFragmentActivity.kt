package com.androidevlinux.percy.UTXO.activities

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.androidevlinux.percy.UTXO.R


abstract class BaseFragmentActivity : AppCompatActivity() {
    protected var mToolbar: Toolbar? = null

    @LayoutRes
    protected open fun getLayoutResId(): Int {
        return R.layout.activity_base
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())

        // Set a Toolbar to replace the ActionBar
        mToolbar = findViewById(R.id.toolbar)
        setSupportActionBar(mToolbar)
    }

    protected fun insertFragment(fragment: androidx.fragment.app.Fragment) {
        // Insert the fragment by replacing any existing fragment
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction()
                .setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out, android.R.animator.fade_in, android.R.animator.fade_out)
                .replace(R.id.content_frame, fragment)
                .commit()
    }
}