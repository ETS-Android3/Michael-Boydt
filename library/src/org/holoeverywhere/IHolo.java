
package org.holoeverywhere;

import org.holoeverywhere.app.Application;
import org.holoeverywhere.app.Application.Config;
import org.holoeverywhere.app.Application.Config.PreferenceImpl;
import org.holoeverywhere.preference.SharedPreferences;

import com.actionbarsherlock.internal.view.menu.ContextMenuListener;

public interface IHolo extends ContextMenuListener {
    public Config getConfig();

    public SharedPreferences getDefaultSharedPreferences();

    public LayoutInflater getLayoutInflater();

    public SharedPreferences getSharedPreferences(PreferenceImpl impl,
            String name, int mode);

    public SharedPreferences getSharedPreferences(String name, int mode);

    public Application getSupportApplication();

    public boolean isABSSupport();
}
