package org.synthful.smartgwt.client.widgets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.FormItem;
import com.smartgwt.client.widgets.form.fields.TextItem;

public class UIDynamicForm extends DynamicForm implements HasWidgets {

	@Override
	public void add(Widget widget) {
		if (widget instanceof UIFormItem){
			
			FormItem[] fields = getFields();

			FormItem[] newFields = new FormItem[fields.length+1];

			for (int i = 0; i < fields.length; i++) {
				newFields[i] = fields[i];
			}
			newFields[fields.length] = ((UIFormItem)widget).getFormItem();
			setFields(newFields);
		}
	}

	@Override
	public Iterator<Widget> iterator() {
		List<Widget> fields = new ArrayList<Widget>(super.getFields().length);
		for (FormItem field : super.getFields()) {
			if (field instanceof TextItem){
				fields.add(new UITextItem((TextItem)field));
			}
		}
		return fields.iterator();
	}

	@Override
	public boolean remove(Widget widget) {
		if (widget instanceof UIListGridField){
			FormItem[] fields = getFields();

			FormItem[] newFields = new FormItem[fields.length-1];

			boolean remove = false;
			for (int i = 0; i < fields.length; i++) {
				UIFormItem newField = (UIFormItem)widget;
				if (!fields[i].equals(newField.getFormItem())){
					remove = true;
					newFields[i] = fields[i];
				}
			}
			if (remove){
				setFields(newFields);
			}
			return remove;
		}
		return false;
	}

}
