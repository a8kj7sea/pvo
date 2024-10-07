package me.a8kj.pvp.parent.entity.area.domination;

import me.a8kj.pvp.parent.entity.area.domination.attributes.DominationOwner;

/**
 * Simple interface represent a domination area in pvp arena , which used to
 * represent clans who dominated an area in arena
 * 
 * @author A8kj7sea
 */
public interface Domination {

    /**
     * 
     * Getter function return a title of domination area
     * 
     * <br>
     * <br>
     * <b>example:</b> <br>
     * Snowy area
     * 
     * @return title of area
     */
    public String getTitle();

    /**
     * 
     * Getter function return a domination area owner
     * 
     * @return domination owner
     */
    public DominationOwner getDominationOwner();

    /**
     * 
     * Getter function return a domination area formatted time (countdown)
     * <br>
     * <br>
     * <b>example:</b> <br>
     * <br>
     * Snowy area<br>
     * <br>
     * 30:00
     * 
     * @return formatted time
     */
    public String getFormattedTime();

    /**
     * 
     * Getter function used to return a update time value in ticks
     * 
     * @return update time in ticks
     */
    public long getUpdateTime();

}
