package org.synthful.smartgwt.client.widgets;

import java.util.ArrayList;
import java.util.Iterator;

import org.synthful.smartgwt.client.HasWidgetsUtil;
import org.synthful.smartgwt.client.UIMasquerade;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.widgets.Canvas;

public class UICanvas
	extends Canvas
	implements HasWidgets
{
	@Override
	public void add(Widget w) {
		Canvas c = getUIMasqueradedCanvas(w);
		if (c!=null){
			super.addChild(c);
		}
		else{
			super.addChild(w);
		}
	}

	@Override
	public Iterator<Widget> iterator() {
		return widgets.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		this.widgets.remove(w);
		Canvas c = getUIMasqueradedCanvas(w);
		if (c!=null){
			this.removeChild(c);
		}
		this.widgets.remove(w);
		return HasWidgetsUtil.remove(this, w);
	}
		
	static public Canvas getUIMasqueradedCanvas(Widget w){
		if (w instanceof UIMasquerade<?>){
			UIMasquerade<?> uim = (UIMasquerade<?>)w;
			Object uio = uim.getSmartObject();
			if (uio instanceof Canvas)
				return (Canvas)uio;
		}
		return null;
	}
	
	final private ArrayList<Widget> widgets = new ArrayList<Widget>();
}
