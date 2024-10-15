package me.a8kj.pvp.core.player.assist.trail.impl;

import org.bukkit.Effect;
import org.bukkit.entity.Projectile;

import me.a8kj.pvp.parent.entity.player.assist.trail.enums.ProjectileTrailType;
import me.a8kj.pvp.parent.entity.player.assist.trail.impl.PurchasableProjectileTrail;

public class HeartProjectTrail extends PurchasableProjectileTrail {

    public HeartProjectTrail(String name, Effect effect, ProjectileTrailType type) {
        super(name, effect, type);
    }

    @Override
    public void spawn(Projectile projectile) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'spawn'");
    }

}
