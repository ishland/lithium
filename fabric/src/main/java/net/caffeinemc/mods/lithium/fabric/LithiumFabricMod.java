package net.caffeinemc.mods.lithium.fabric;

import net.caffeinemc.mods.lithium.common.LithiumMod;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import org.spongepowered.asm.mixin.MixinEnvironment;

public class LithiumFabricMod implements ModInitializer {

    @Override
    public void onInitialize() {
        ModContainer mod = FabricLoader.getInstance()
                .getModContainer("lithium")
                .orElseThrow(NullPointerException::new);

        LithiumMod.onInitialization(mod.getMetadata().getVersion().getFriendlyString());

//        MixinEnvironment.getCurrentEnvironment().audit();
    }
}
