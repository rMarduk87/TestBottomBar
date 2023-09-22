package rpt.tool.testbottombar

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import github.com.st235.lib_expandablebottombar.ExpandableBottomBar
import github.com.st235.lib_expandablebottombar.MenuItemDescriptor

class BottomBarFragment : Fragment() {

    companion object {

        fun newInstance(): BottomBarFragment {
            return BottomBarFragment()
        }
    }


    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.bottom_bar_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val bottomBar: ExpandableBottomBar = view.findViewById(R.id.expandable_bottom_bar)
        val menu = bottomBar.menu
        menu.add(
            MenuItemDescriptor.Builder(
                requireContext(),
                R.id.icon_30,
                R.drawable.ic_30,
                R.string._30, Color.GRAY
            )
                .build()
        )

        menu.add(
            MenuItemDescriptor.Builder(
                requireContext(),
                R.id.icon_45,
                R.drawable.ic_45
            )
                .textRes(R.string._45)
                .colorRes(R.color.purple_200)
                .build()
        )

        menu.add(
            MenuItemDescriptor.Builder(
                requireContext(),
                R.id.icon_60,
                R.drawable.ic_60,
                R.string._60,
                Color.parseColor("#58a5f0")
            )
                .build()
        )

        val bottomBar2: ExpandableBottomBar = view.findViewById(R.id.expandable_bottom_bar2)
        val menu2 = bottomBar2.menu
        menu2.add(
            MenuItemDescriptor.Builder(
                requireContext(),
                R.id.icon_30,
                R.drawable.ic_30,
                R.string._30, Color.GRAY
            )
                .build()
        )

        menu2.add(
            MenuItemDescriptor.Builder(
                requireContext(),
                R.id.icon_45,
                R.drawable.ic_45
            )
                .textRes(R.string._45)
                .colorRes(R.color.purple_200)
                .build()
        )

        menu2.add(
            MenuItemDescriptor.Builder(
                requireContext(),
                R.id.icon_60,
                R.drawable.ic_60,
                R.string._60,
                Color.parseColor("#58a5f0")
            )
                .build()
        )

        val bottomBar3: ExpandableBottomBar = view.findViewById(R.id.expandable_bottom_bar3)
        val menu3 = bottomBar3.menu
        menu3.add(
            MenuItemDescriptor.Builder(
                requireContext(),
                R.id.icon_30,
                R.drawable.ic_30,
                R.string._30, Color.GRAY
            )
                .build()
        )

        menu3.add(
            MenuItemDescriptor.Builder(
                requireContext(),
                R.id.icon_45,
                R.drawable.ic_45
            )
                .textRes(R.string._45)
                .colorRes(R.color.purple_200)
                .build()
        )

        menu3.add(
            MenuItemDescriptor.Builder(
                requireContext(),
                R.id.icon_60,
                R.drawable.ic_60,
                R.string._60,
                Color.parseColor("#58a5f0")
            )
                .build()
        )
        super.onViewCreated(view, savedInstanceState)
    }

}