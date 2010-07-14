package org.synthful.smartgwt.client.widgets;

import org.synthful.smartgwt.client.UIMasqueradedWidgetArray;

import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.data.DataSourceField;
import com.smartgwt.client.widgets.grid.ListGridField;

public class UIDataSourceFieldArray
extends UIMasqueradedWidgetArray<UIDataSourceField, DataSourceField>{

	@Override
	public void add(Widget widget) {
		if (widget instanceof UIListGridField){
			addMasqueradedWidget((UIDataSourceField)widget);
		}
	}

	@Override
	public boolean remove(Widget widget) {
		if (widget instanceof UIListGridField){
			return removeMasqueradedWidget((UIDataSourceField)widget);
		}
		return false;
	}
	
	public ListGridField[] toArray(){
		ListGridField[] a = new ListGridField[items.size()];
		items.toArray(a);
		return a;
	}
}