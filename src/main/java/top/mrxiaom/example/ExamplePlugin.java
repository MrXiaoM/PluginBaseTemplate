package top.mrxiaom.example;

import org.jetbrains.annotations.NotNull;
import top.mrxiaom.pluginbase.BukkitPlugin;
import top.mrxiaom.pluginbase.EconomyHolder;

public class ExamplePlugin extends BukkitPlugin {
    public static ExamplePlugin getInstance() {
        return (ExamplePlugin) BukkitPlugin.getInstance();
    }

    public ExamplePlugin() {
        super(options()
                // 是否开启 BungeeCord 支持
                .bungee(false)
                // 是否开启数据库支持
                .database(false)
                .reconnectDatabaseWhenReloadConfig(true)
                // 是否开启 Vault 经济支持
                .vaultEconomy(true)
                // 自动注册不扫描 relocate 目标包，节省启动时间
                .scanIgnore("top.mrxiaom.example.utils")
        );
    }

    @NotNull
    public EconomyHolder getEconomy() {
        return options.economy();
    }

    @Override
    protected void beforeEnable() {
        options.registerDatabase(
                // 在这里添加数据库 (如果需要的话)
        );
    }

    @Override
    protected void afterEnable() {
        getLogger().info("ExamplePlugin 加载完毕");
    }
}
