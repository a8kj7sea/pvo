package me.a8kj.pvp.parent.test;

import java.util.Optional;

import me.a8kj.pvp.parent.entity.player.enums.PlayerStatisticsType;
import me.a8kj.pvp.parent.entity.prestige.Prestige;
import me.a8kj.pvp.parent.entity.prestige.attributes.PrestigeRequirements;
import me.a8kj.pvp.parent.entity.prestige.impl.SimpleProgressBar;

public class Test {

    public static void main(String[] args) {

        Prestige prestige = new Prestige() {

            @Override
            public PrestigeRequirements getRequirements() {
                return new PrestigeRequirements() {

                    @Override
                    public int getMinAmount() {
                        return 0;
                    }

                    @Override
                    public int getMaxAmount() {
                        return 100;
                    }

                };
            }

            @Override
            public String getName() {
                return "unranked";
            }

            @Override
            public String getColor() {
                return "&f";
            }

            @Override
            public PlayerStatisticsType getStatisticsType() {
                return PlayerStatisticsType.DEATHS;
            }

            @Override
            public Optional<Prestige> getNextPrestige() {
                return null;
            }

        };

        SimpleProgressBar simpleProgressBar = new SimpleProgressBar("#", "-", 9);


        int currentDeaths = 41;

        System.err.println(simpleProgressBar.draw(prestige, currentDeaths));

    }
}
