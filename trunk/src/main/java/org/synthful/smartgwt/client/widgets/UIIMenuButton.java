package org.synthful.smartgwt.client.widgets;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.HasText;
import com.smartgwt.client.widgets.menu.IMenuButton;
import com.smartgwt.client.widgets.menu.Menu;

public class UIIMenuButton extends IMenuButton implements HasText {

	public UIIMenuButton() {
		super();
	}

	public UIIMenuButton(JavaScriptObject jsObj) {
		super(jsObj);
	}

	public UIIMenuButton(String title, Menu menu) {
		super(title, menu);
	}

	public UIIMenuButton(String title) {
		super(title);
	}

	@Override
	public String getText() {
		return super.getTitle();
	}

	@Override
	public void setText(String text) {
		super.setTitle(text);
	}

}
