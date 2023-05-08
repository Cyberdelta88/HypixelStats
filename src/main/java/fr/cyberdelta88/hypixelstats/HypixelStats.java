package fr.cyberdelta88.hypixelstats;

import fr.cyberdelta88.hypixelstats.commands.CmdPlanck;
import org.bukkit.plugin.java.JavaPlugin;

public final class HypixelStats extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("hypixelstats").setExecutor(new CmdPlanck());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
