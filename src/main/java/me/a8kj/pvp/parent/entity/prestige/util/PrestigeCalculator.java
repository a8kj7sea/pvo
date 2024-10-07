package me.a8kj.pvp.parent.entity.prestige.util;

import me.a8kj.pvp.parent.entity.prestige.Prestige;
import me.a8kj.pvp.parent.entity.prestige.attributes.PrestigeRequirements;

import static java.lang.Math.ceil;

public class PrestigeCalculator {

    public double calculateProgressPrecentage(int currentStatistics, Prestige currentPrestige) {
        PrestigeRequirements prestigeRequirements = currentPrestige.getRequirements();
        double progressPrecentage = currentStatistics / prestigeRequirements.getMaxAmount() * 100.0;
        return ceil(progressPrecentage);
    }

    public int calculateFilledChar(int length, int currentStatistics, Prestige currentPrestige) {
        return (int) Math.min(length, currentStatistics * length / 100);
    }

}
