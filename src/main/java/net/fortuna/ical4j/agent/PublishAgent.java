package net.fortuna.ical4j.agent;

import net.fortuna.ical4j.model.Calendar;

/**
 * Created by fortuna on 19/07/2017.
 */
public interface PublishAgent {

    /**
     * Apply transformations to the specified calendar.
     * @param object
     * @return the transformed calendar
     */
    Calendar publish(Calendar object) throws Exception;
}
