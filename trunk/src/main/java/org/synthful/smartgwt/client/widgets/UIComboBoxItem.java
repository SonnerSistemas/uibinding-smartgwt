package org.synthful.smartgwt.client.widgets;

import com.smartgwt.client.widgets.form.fields.ComboBoxItem;
import com.smartgwt.client.widgets.grid.ListGrid;

public class UIComboBoxItem extends UIFormItem<ComboBoxItem>{

	public UIComboBoxItem(){
		item = new ComboBoxItem();
	}
	public void setPickListProperties(ListGrid properties){
		item.setPickListProperties(properties);
	}
	public void setShowAllOptions(Boolean allOptions){
		item.setShowAllOptions(allOptions);
	}
}
