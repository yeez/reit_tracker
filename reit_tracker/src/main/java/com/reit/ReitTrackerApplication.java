package com.reit;

import org.apache.wicket.protocol.http.WebApplication;

public class ReitTrackerApplication extends WebApplication {
    public ReitTrackerApplication() {
    }

    /**
     * @see org.apache.wicket.Application#getHomePage()
     */
    @Override
    public Class getHomePage() {
        return Home.class;
    }
}