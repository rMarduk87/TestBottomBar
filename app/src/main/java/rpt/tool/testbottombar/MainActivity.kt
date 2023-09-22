package rpt.tool.testbottombar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import github.com.st235.lib_expandablebottombar.ExpandableBottomBar
import github.com.st235.lib_expandablebottombar.MenuItemDescriptor
import rpt.tool.testbottombar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val menu = binding.expandableBottomBar.menu
        menu.add(
            MenuItemDescriptor.Builder(
                this,
                R.id.icon_30,
                R.drawable.ic_30,
                R.string._30, Color.RED
            )
                .build()
        )

        menu.add(
            MenuItemDescriptor.Builder(
                this,
                R.id.icon_45,
                R.drawable.ic_45
            )
                .textRes(R.string._45)
                .colorRes(R.color.purple_700)
                .build()
        )

        menu.add(
            MenuItemDescriptor.Builder(
                this,
                R.id.icon_60,
                R.drawable.ic_60,
                R.string._60,
                Color.parseColor("#5844f0")
            )
                .build()
        )
    }
}