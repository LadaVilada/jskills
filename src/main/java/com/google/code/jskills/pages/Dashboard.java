package com.google.code.jskills.pages;

import org.apache.wicket.markup.html.basic.Label;
import org.wicketstuff.shiro.ShiroConstraint;
import org.wicketstuff.shiro.annotation.ShiroSecurityConstraint;

import com.google.code.jskills.pages.master.MasterPage;

@ShiroSecurityConstraint(constraint = ShiroConstraint.IsAuthenticated)
public class Dashboard extends MasterPage {

	private static final long serialVersionUID = 2412488518806559865L;

	public Dashboard() {
		add(new Label("message", "This is Dashboard page"));
	}
}
