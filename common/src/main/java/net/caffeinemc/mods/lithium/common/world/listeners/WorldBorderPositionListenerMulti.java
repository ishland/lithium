package net.caffeinemc.mods.lithium.common.world.listeners;

import net.minecraft.world.level.border.BorderChangeListener;
import net.minecraft.world.level.border.WorldBorder;

import java.util.WeakHashMap;

public class WorldBorderPositionListenerMulti implements BorderChangeListener {

    private final WeakHashMap<WorldBorderListenerOnce, Object> delegate;

    public WorldBorderPositionListenerMulti() {
        this.delegate = new WeakHashMap<>();
    }

    public void add(WorldBorderListenerOnce listener) {
        this.delegate.put(listener, null);
    }

    public void onAreaReplaced(WorldBorder border) {
        for (WorldBorderListenerOnce listener : this.delegate.keySet()) {
            listener.onAreaReplaced(border);
        }
        this.delegate.clear();
    }

    @Override
    public void onSetSize(WorldBorder border, double size) {
        for (WorldBorderListenerOnce listener : this.delegate.keySet()) {
            listener.onSetSize(border, size);
        }
        this.delegate.clear();
    }

    @Override
    public void onLerpSize(WorldBorder border, double fromSize, double toSize, long time) {
        for (WorldBorderListenerOnce listener : this.delegate.keySet()) {
            listener.onLerpSize(border, fromSize, toSize, time);
        }
        this.delegate.clear();
    }

    @Override
    public void onSetCenter(WorldBorder border, double centerX, double centerZ) {
        for (WorldBorderListenerOnce listener : this.delegate.keySet()) {
            listener.onSetCenter(border, centerX, centerZ);
        }
        this.delegate.clear();
    }

    @Override
    public void onSetWarningTime(WorldBorder border, int warningTime) {
    }

    @Override
    public void onSetWarningBlocks(WorldBorder border, int warningBlockDistance) {
    }

    @Override
    public void onSetDamagePerBlock(WorldBorder border, double damagePerBlock) {
    }

    @Override
    public void onSetSafeZone(WorldBorder border, double safeZoneRadius) {
    }
}
