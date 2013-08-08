package org.synthful.smartgwt.client.widgets;

import java.util.Iterator;

import org.synthful.smartgwt.client.HasWidgetsUtil;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.IconButton;
import com.smartgwt.client.widgets.toolbar.RibbonGroup;

public class UIRibbonGroup extends RibbonGroup implements HasWidgets {
	
	public void add(Widget w){
		if (w instanceof IconButton)
			addControl((IconButton) w);
	    else if (w instanceof Canvas)
	    	HasWidgetsUtil.add(this, w);
	}

	@Override
	public Iterator<Widget> iterator(){
		return HasWidgetsUtil.iterator(this);
	}

	@Override
	public boolean remove(Widget w){
		return HasWidgetsUtil.remove(this, w);
	}
	

}
