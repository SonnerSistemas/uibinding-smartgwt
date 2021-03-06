package org.synthful.smartgwt.client.widgets;

import java.util.Iterator;

import org.synthful.smartgwt.client.HasUILayoutAlign;
import org.synthful.smartgwt.client.HasWidgetsUtil;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.layout.HLayout;

public class UIHLayout
	extends HLayout
	implements HasWidgets, HasUILayoutAlign
{
	public void add(Widget w){
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
	
	@Override
	public void destroy() {
		try {
			for(Canvas member : getMembers()) {
				member.destroy();
			}
		} catch (Throwable e) {
//			e.printStackTrace();
		}
		super.destroy();
	}

	@Override
	public void setDefaultLayoutHAlign(Alignment alignment) {
		setDefaultLayoutAlign(alignment);
	}

	@Override
	public void setDefaultLayoutVAlign(VerticalAlignment alignment) {
		setDefaultLayoutAlign(alignment);
	}

	@Override
	public void setLayoutHAlign(Alignment alignment) {
		setAlign(alignment);
	}

	@Override
	public void setLayoutVAlign(VerticalAlignment alignment) {
		setAlign(alignment);
	}
}
