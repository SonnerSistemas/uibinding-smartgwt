package org.synthful.smartgwt.client.widgets;

import com.google.gwt.core.client.JavaScriptObject;
import com.smartgwt.client.widgets.form.fields.SpacerItem;

public class UISpacerItem extends UIFormItem<SpacerItem> {
	public UISpacerItem() {
		item = new SpacerItem();
	}

	private UISpacerItem(SpacerItem item) {
		this.item = item;
	}

	public static UISpacerItem getOrCreateRef(JavaScriptObject jsObj) {
		return new UISpacerItem(SpacerItem.getOrCreateRef(jsObj));
	}

	public Boolean getShowTitle() {
		return item.getShowTitle();
	}

	public int getWidth() {
		return item.getWidth();
	}

	public void setHeight(int height) {
		item.setHeight(height);
	}

	public void setJavaScriptObject(JavaScriptObject jsObj) {
		item.setJavaScriptObject(jsObj);
	}

	public void setShowTitle(Boolean showTitle) {
		item.setShowTitle(showTitle);
	}

	public void setWidth(int width) {
		item.setWidth(width);
	}
}