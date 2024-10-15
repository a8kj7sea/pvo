package me.a8kj.pvp.parent.entity.player.assist.trail;

import java.util.Optional;

import org.bukkit.Effect;
import org.bukkit.entity.Projectile;
import org.jetbrains.annotations.Nullable;

import lombok.Data;
import me.a8kj.common.result.ResultType;
import me.a8kj.pvp.parent.entity.player.assist.trail.enums.ProjectileTrailType;

@Data
public abstract class ProjectileTrail {

    protected final String name;
    private final Effect effect;
    private final ProjectileTrailType type;

    private @Nullable String permission;

    public abstract void spawn(Projectile projectile);

    public ResultType despawn(Projectile projectile) {
        if (projectile == null)
            return ResultType.ERROR;
        if (!projectile.isValid())
            return ResultType.FAILURE;

        projectile.remove();
        return ResultType.SUCCESS;
    }

    public Optional<String> getPermission() {
        return Optional.ofNullable(permission);
    }

}
