package me.a8kj.pvp.parent.entity.area.domination;

/**
 * 
 * Simple interface represent a Domination area updater,which used to update
 * domination area time
 * 
 * @author A8kj7sea
 */
@FunctionalInterface
public interface DominationUpdater {

    /**
     * Simple function used to update domination timer and title
     * It used to check on owner of domination and update it
     * 
     * @param domination
     */
    public void update(Domination domination);

}
