package com.xiangxue.windowdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.xiangxue.windowdemo.utils.SuspensionWindowUtil

class MainActivity : AppCompatActivity() {

    private var tvShow : TextView? = null
    private var tvHide : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         tvShow = findViewById(R.id.tv_showdialog)
         tvHide = findViewById(R.id.tv_hidedialog)


        var util:SuspensionWindowUtil = SuspensionWindowUtil(this)

        tvShow?.setOnClickListener(View.OnClickListener {
            util.showSuspensionView() })
    }
}
