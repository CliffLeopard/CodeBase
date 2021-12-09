package com.cleo.codebase.cases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatImageView
import com.bumptech.glide.Glide
import com.cleo.codebase.R

class GlideActivity : AppCompatActivity() {
    private lateinit var img: AppCompatImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glide)
        img = findViewById(R.id.img)
        val url = "http://p26-be-pack-sign.pglstatp-toutiao.com/ad.union.api/0ca889ec0257296a52094933ba24cd81~tplv-qgppglrh0x-noop.image?x-expires=1942272000&x-signature=IsK%2Bi71vQLSo8n0CNp0MfkcW5lE%3D"
        val url2 = "https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=2761266866,1242382534&fm=179&app=35&f=PNG?w=120&h=170&s=1785D84E93E1895B4AFABBAF0300F008"
        val url3 = "http://p6-be-pack-sign.pglstatp-toutiao.com/web.business.image/202108302d0e5ab14fef679a4ed0b7c9~tplv-qgppglrh0x-cs:456:300:q80.jpeg?x-expires=1942272000&x-signature=OPm892DghC7Y6%2Ba6tdf2E3amTg8%3D"
        val url4 = "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F2017-11-09%2F5a03b6daef103.jpg%3Fdown&refer=http%3A%2F%2Fpic1.win4000.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1638007992&t=34274de2b4e7c2badc569eb95dde0afd"
        Glide.with(this)
            .load(url)
            .into(img)
    }
}