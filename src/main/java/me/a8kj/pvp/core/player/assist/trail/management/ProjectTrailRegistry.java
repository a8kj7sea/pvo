package me.a8kj.pvp.core.player.assist.trail.management;

import lombok.NonNull;
import me.a8kj.common.structures.Pair;
import me.a8kj.pvp.parent.entity.player.assist.trail.ProjectileTrail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectTrailRegistry
        implements me.a8kj.pvp.parent.entity.player.assist.trail.management.ProjectTrailRegistry {

    private final Map<String, ProjectileTrail> trails = new HashMap<>();

    @Override
    public void register(@NonNull String key, @NonNull ProjectileTrail value) {
        if (trails.containsKey(key.toLowerCase())) {
            throw new IllegalArgumentException("An entry for the key '" + key + "' already exists.");
        }
        trails.put(key.toLowerCase(), value);
    }

    @Override
    public void unregister(@NonNull String key) {
        if (!trails.containsKey(key.toLowerCase())) {
            throw new IllegalArgumentException("No entry found for the key '" + key + "'.");
        }
        trails.remove(key.toLowerCase());
    }

    @Override
    public boolean hasEntry(@NonNull String key) {
        return trails.containsKey(key.toLowerCase());
    }

    @Override
    public @NonNull ProjectileTrail get(@NonNull String key) {
        ProjectileTrail trail = trails.get(key.toLowerCase());
        if (trail == null) {
            throw new IllegalArgumentException("No value found for the key '" + key + "'.");
        }
        return trail;
    }

    @Override
    public @NonNull Iterable<Pair<String, ProjectileTrail>> entries() {
        List<Pair<String, ProjectileTrail>> entryList = new ArrayList<>();
        for (Map.Entry<String, ProjectileTrail> entry : trails.entrySet()) {
            entryList.add(Pair.of(entry.getKey(), entry.getValue()));
        }
        return entryList;
    }
}
