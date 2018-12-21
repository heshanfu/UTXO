package com.androidevlinux.percy.UTXO.activities

import android.os.Bundle
import com.androidevlinux.percy.UTXO.BuildConfig
import com.androidevlinux.percy.UTXO.R
import com.vansuita.materialabout.builder.AboutBuilder

/**
 * Created by Percy on 6/27/2018.
 */

class AboutTheDevActivity : BaseFragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val builder = AboutBuilder.with(this)
                .setAppIcon(R.mipmap.ic_launcher)
                .setAppName(R.string.app_name)
                .setPhoto(R.mipmap.ic_photo)
                .setCover(R.mipmap.profile_cover)
                .setLinksAnimated(true)
                .setDividerDashGap(13)
                .setName("Prashant Gahlot")
                .setSubTitle("Android Developer")
                .addLinkedInLink("prashant-gahlot-37914988")
                .setBrief("I love everything related to open source software and block chain ;)")
                .setLinksColumnsCount(4)
                .addGitHubLink("percy-g2")
                .addEmailLink("contact.prashantgahlot@gmail.com")
                .addWebsiteLink("http://androdevlinux.in/")
                .addFiveStarsAction()
                .setAppTitle("Version : " + BuildConfig.VERSION_NAME)
                .addShareAction(R.string.app_name)
                .setActionsColumnsCount(2)
                .setWrapScrollView(true)
                .setShowAsCard(true)
        val view = builder.build()
        setContentView(view)
    }
}
