package org.synthful.smartgwt.client.widgets;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.i18n.client.TimeZone;
import com.google.gwt.i18n.client.TimeZoneInfo;
import com.google.gwt.i18n.client.constants.TimeZoneConstants;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.data.Record;
import com.smartgwt.client.data.RecordList;
import com.smartgwt.client.types.ListGridEditEvent;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;

public class UIListGrid extends ListGrid implements HasWidgets {

	private TimeZoneConstants timeZoneConstants = GWT.create(TimeZoneConstants.class);
	private TimeZone timeZone = TimeZone.createTimeZone(TimeZoneInfo.buildTimeZoneData(timeZoneConstants.americaSaoPaulo()));
	
	public UIListGrid() {
		super();
	}
	

	@Override
	public void add(Widget widget) {
		if (widget instanceof UIListGridField){
			ListGridField[] fields = getFields();

			ListGridField[] newFields = new ListGridField[fields.length+1];

			for (int i = 0; i < fields.length; i++) {
				newFields[i] = fields[i];
			}
			newFields[fields.length] = ((UIListGridField)widget).getSmartObject();
			setFields(newFields);
		}
		else if (widget instanceof UIListGridFieldArray){
			ListGridField[] newFields = ((UIListGridFieldArray)widget).toArray();
			setFields(newFields);
		}
		else if (widget instanceof UIDataSource){
			DataSource datasrc = ((UIDataSource)widget).getSmartObject();
			setDataSource(datasrc);
		}
	}

	@Override
	public Iterator<Widget> iterator() {
		List<Widget> fields = new ArrayList<Widget>(super.getFields().length);
		for (ListGridField field : super.getFields()) {
			fields.add(new UIListGridField(field));
		}
		return fields.iterator();
	}

	@Override
	public boolean remove(Widget widget) {
		if (widget instanceof UIListGridField){
			ListGridField[] fields = getFields();

			ListGridField[] newFields = new ListGridField[fields.length-1];

			boolean remove = false;
			for (int i = 0; i < fields.length; i++) {
				UIListGridField newField = (UIListGridField)widget;
				if (!fields[i].equals(newField.getSmartObject())){
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
	
	/**
	 * Remove all records
	 */
	public void removeAll() {
		RecordList recordList = getOriginalRecordList();
		if(getDataSource() == null) {
			if ( recordList != null ) {
				while (recordList.getLength()>0){				
					removeData( recordList.get(0) );
				}
			}
		} else {
			if ( recordList != null ) {
				for(int i=0; i<recordList.getLength(); i++) {
					removeData( recordList.get(i) );
				}
			}
		}
	}
	
	@Override
	public void destroy() {
		if(getDataSource() != null) {
			getDataSource().destroy();
		}
		super.destroy();
	}
	
	public void setEditEventAsString(String value) {
		if(value != null) {
			ListGridEditEvent editEvent = ListGridEditEvent.valueOf(value.toUpperCase());
			if(editEvent != null) {
				super.setEditEvent(editEvent);
			}
		}
	}
	
	@Override
	public void addData(Record record) {
		for (String iterable_element : record.getAttributes()) {
			Date obj = null;
			try {
				obj = record.getAttributeAsDate(iterable_element);
				Date date = (Date)obj;
				if(date != null && date.getHours() == 0 && timeZone.isDaylightTime(date)){
					date.setTime(date.getTime()+(60*60000));
					record.setAttribute(iterable_element,date);
				}
			} catch (Exception e) {
				continue;
			}
		}
		super.addData(record);
	}

}
