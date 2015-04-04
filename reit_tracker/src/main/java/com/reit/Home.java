package com.reit;

import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.resource.CssResourceReference;

public class Home extends WebPage {
    public Home() {
        add(new Label("message", "Welcome to REIT Home!"));
    }
    

}