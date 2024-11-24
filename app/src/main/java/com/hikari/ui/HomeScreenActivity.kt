package com.example.hikari

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomeScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        // Initialize ViewPager and TabLayout
        val viewPager: ViewPager2 = findViewById(R.id.viewPager)
        val tabLayout: TabLayout = findViewById(R.id.tabLayout)

        viewPager.adapter = HomePagerAdapter(this)

        // Attach tabs with ViewPager
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "Anime"
                1 -> "Manga"
                2 -> "Settings"
                else -> null
            }
        }.attach()
    }
}

class HomePagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount() = 3 // Three tabs: Anime, Manga, Settings

    override fun createFragment(position: Int): Fragment = when (position) {
        0 -> AnimeFragment()
        1 -> MangaFragment()
        2 -> SettingsFragment()
        else -> throw IllegalStateException("Invalid tab position")
    }
}

// AnimeFragment
class AnimeFragment : Fragment(R.layout.fragment_anime) {
    // Handle Anime-specific logic here
}

// MangaFragment
class MangaFragment : Fragment(R.layout.fragment_manga) {
    // Handle Manga-specific logic here
}

// SettingsFragment
class SettingsFragment : Fragment(R.layout.fragment_settings) {
    // Handle Settings-specific logic here
}
