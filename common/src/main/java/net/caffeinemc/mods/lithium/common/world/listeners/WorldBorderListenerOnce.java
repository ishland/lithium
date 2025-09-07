package net.caffeinemc.mods.lithium.common.world.listeners;

import net.minecraft.world.level.border.BorderChangeListener;
import net.minecraft.world.level.border.WorldBorder;

public interface WorldBorderListenerOnce extends BorderChangeListener {

    void lithium$onWorldBorderShapeChange(WorldBorder worldBorder);

    default void onAreaReplaced(WorldBorder border) {
        this.lithium$onWorldBorderShapeChange(border);
    }

    @Override
    default void onSetSize(WorldBorder border, double size) {
        this.lithium$onWorldBorderShapeChange(border);
    }

    @Override
    default void onLerpSize(WorldBorder border, double fromSize, double toSize, long time) {
        this.lithium$onWorldBorderShapeChange(border);
    }

    @Override
    default void onSetCenter(WorldBorder border, double centerX, double centerZ) {
        this.lithium$onWorldBorderShapeChange(border);
    }

    @Override
    default void onSetWarningTime(WorldBorder border, int warningTime) {

    }

    @Override
    default void onSetWarningBlocks(WorldBorder border, int warningBlockDistance) {

    }

    @Override
    default void onSetDamagePerBlock(WorldBorder border, double damagePerBlock) {

    }

    @Override
    default void onSetSafeZone(WorldBorder border, double safeZoneRadius) {

    }
}
