package com.reit;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.Page;
import com.reit.Home;


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