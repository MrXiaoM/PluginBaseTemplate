package top.mrxiaom.example.func;

import top.mrxiaom.example.ExamplePlugin;

@SuppressWarnings({"unused"})
public abstract class AbstractPluginHolder extends top.mrxiaom.pluginbase.func.AbstractPluginHolder<ExamplePlugin> {
    public AbstractPluginHolder(ExamplePlugin plugin) {
        super(plugin);
    }

    public AbstractPluginHolder(ExamplePlugin plugin, boolean register) {
        super(plugin, register);
    }
}
