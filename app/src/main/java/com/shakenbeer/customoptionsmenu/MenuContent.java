package com.shakenbeer.customoptionsmenu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stas Melnychenko on 23.07.2015.
 */
public class MenuContent {
    public static final List<MenuItem> ITEMS = new ArrayList<>();

    public static final MenuItem HomeMenuItem = new MenuItem(R.drawable.ic_home_black_24dp, R.string.action_home, HomeActivity.class);
    public static final MenuItem PromoMenuItem = new MenuItem(R.drawable.ic_account_star_variant_black_24dp, R.string.action_promotions, PromotionsActivity.class);
    public static final MenuItem SearchMenuItem = new MenuItem(R.drawable.ic_magnify_black_24dp, R.string.action_search, SearchActivity.class);
    public static final MenuItem GamesMenuItem = new MenuItem(R.drawable.ic_gamepad_variant_black_24dp, R.string.action_games, GamesActivity.class);
    public static final MenuItem SettingsMenuItem = new MenuItem(R.drawable.ic_settings_black_24dp, R.string.action_settings, SettingsActivity.class);
    public static final MenuItem MessagesMenuItem = new MenuItem(R.drawable.ic_email_black_24dp, R.string.action_logout, MessagesActivity.class);

    static {
        ITEMS.add(HomeMenuItem);
        ITEMS.add(PromoMenuItem);
        ITEMS.add(SearchMenuItem);
        ITEMS.add(GamesMenuItem);
        ITEMS.add(SettingsMenuItem);
        ITEMS.add(MessagesMenuItem);
    }


    public static class MenuItem {
        public int iconId;
        public int textId;
        public Class activityClass;

        public MenuItem(int iconId, int textId, Class activityClass) {
            this.iconId = iconId;
            this.textId = textId;
            this.activityClass = activityClass;
        }
    }
}
