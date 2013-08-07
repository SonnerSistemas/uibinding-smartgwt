package org.synthful.smartgwt.client.widgets;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.HasText;
import com.smartgwt.client.widgets.menu.IconMenuButton;

public class UIIconMenuButton extends IconMenuButton implements HasText {

	public UIIconMenuButton() {
	}

	public UIIconMenuButton(JavaScriptObject jsObj) {
		super(jsObj);
	}

	public UIIconMenuButton(String title) {
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
