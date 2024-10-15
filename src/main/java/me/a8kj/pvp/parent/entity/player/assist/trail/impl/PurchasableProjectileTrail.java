package me.a8kj.pvp.parent.entity.player.assist.trail.impl;

import java.util.List;
import java.util.Optional;

import org.bukkit.Effect;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

import me.a8kj.pvp.parent.behavior.Purchasable;
import me.a8kj.pvp.parent.entity.player.assist.trail.ProjectileTrail;
import me.a8kj.pvp.parent.entity.player.assist.trail.enums.ProjectileTrailType;
import me.a8kj.pvp.parent.entity.player.enums.PlayerStatisticsType;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class PurchasableProjectileTrail extends ProjectileTrail implements Purchasable {

    private int price;
    @Setter
    private static PlayerStatisticsType statisticsType;
    private List<String> description;
    private boolean available;
    private String displayName;

    public PurchasableProjectileTrail(String name, Effect effect, ProjectileTrailType type, int price,
            PlayerStatisticsType statisticsType, List<String> description,
            boolean available, String displayName) {
        super(name, effect, type);
        this.price = price;
        setStatisticsType(statisticsType);
        this.description = description;
        this.available = available;
        this.displayName = displayName;
    }

    public PurchasableProjectileTrail(String name, Effect effect, ProjectileTrailType type) {
        super(name, effect, type);
        this.price = 5000;
        setStatisticsType(PlayerStatisticsType.SPIRITS);
        this.description = null;
        this.available = true;
        this.displayName = name;
    }

    @Override
    public Optional<List<String>> getDescription() {
        return Optional.ofNullable(description);
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(displayName);
    }
}
