package org.synthful.smartgwt.client.widgets;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.TimeZone;
import com.google.gwt.i18n.client.TimeZoneInfo;
import com.google.gwt.i18n.client.constants.TimeZoneConstants;
import com.smartgwt.client.core.BaseClass;
import com.smartgwt.client.core.DataClass;
import com.smartgwt.client.core.Rectangle;
import com.smartgwt.client.data.Criteria;
import com.smartgwt.client.data.Criterion;
import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.data.Record;
import com.smartgwt.client.rpc.RPCRequest;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.DateDisplayFormat;
import com.smartgwt.client.types.DateItemSelectorFormat;
import com.smartgwt.client.types.FormErrorOrientation;
import com.smartgwt.client.types.OperatorId;
import com.smartgwt.client.types.TextMatchStyle;
import com.smartgwt.client.types.TimeDisplayFormat;
import com.smartgwt.client.types.TimeFormatter;
import com.smartgwt.client.types.TitleOrientation;
import com.smartgwt.client.types.ValueEnum;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.BaseWidget;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.FiscalCalendar;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.FormItemCanEditCriterionPredicate;
import com.smartgwt.client.widgets.form.FormItemCriterionGetter;
import com.smartgwt.client.widgets.form.FormItemCriterionSetter;
import com.smartgwt.client.widgets.form.FormItemErrorFormatter;
import com.smartgwt.client.widgets.form.FormItemHoverFormatter;
import com.smartgwt.client.widgets.form.FormItemIfFunction;
import com.smartgwt.client.widgets.form.FormItemInputTransformer;
import com.smartgwt.client.widgets.form.FormItemValueFormatter;
import com.smartgwt.client.widgets.form.FormItemValueParser;
import com.smartgwt.client.widgets.form.ValueIconMapper;
import com.smartgwt.client.widgets.form.fields.DateTimeItem;
import com.smartgwt.client.widgets.form.fields.FormItem;
import com.smartgwt.client.widgets.form.fields.FormItemIcon;
import com.smartgwt.client.widgets.form.fields.SelectItem;
import com.smartgwt.client.widgets.form.fields.TextItem;
import com.smartgwt.client.widgets.form.fields.events.BlurHandler;
import com.smartgwt.client.widgets.form.fields.events.ChangeHandler;
import com.smartgwt.client.widgets.form.fields.events.ChangedHandler;
import com.smartgwt.client.widgets.form.fields.events.ClickHandler;
import com.smartgwt.client.widgets.form.fields.events.DoubleClickHandler;
import com.smartgwt.client.widgets.form.fields.events.EditorEnterHandler;
import com.smartgwt.client.widgets.form.fields.events.EditorExitHandler;
import com.smartgwt.client.widgets.form.fields.events.FocusHandler;
import com.smartgwt.client.widgets.form.fields.events.FormItemInitHandler;
import com.smartgwt.client.widgets.form.fields.events.IconClickHandler;
import com.smartgwt.client.widgets.form.fields.events.IconKeyPressHandler;
import com.smartgwt.client.widgets.form.fields.events.ItemHoverHandler;
import com.smartgwt.client.widgets.form.fields.events.KeyDownEvent;
import com.smartgwt.client.widgets.form.fields.events.KeyDownHandler;
import com.smartgwt.client.widgets.form.fields.events.KeyPressHandler;
import com.smartgwt.client.widgets.form.fields.events.KeyUpHandler;
import com.smartgwt.client.widgets.form.fields.events.PickerIconClickHandler;
import com.smartgwt.client.widgets.form.fields.events.TitleClickHandler;
import com.smartgwt.client.widgets.form.fields.events.TitleDoubleClickHandler;
import com.smartgwt.client.widgets.form.fields.events.TitleHoverHandler;
import com.smartgwt.client.widgets.form.validator.Validator;
import com.smartgwt.client.widgets.grid.ListGridRecord;

public class UIDateTimeItem extends UIFormItem<DateTimeItem> {

	private TimeZoneConstants timeZoneConstants = GWT.create(TimeZoneConstants.class);
	private TimeZone timeZone = TimeZone.createTimeZone(TimeZoneInfo.buildTimeZoneData(timeZoneConstants.americaSaoPaulo()));
	
	private DateTimeFormat hourFormatter = DateTimeFormat.getFormat("HH");
	
	public UIDateTimeItem() {
		item = new DateTimeItem();
		item.addKeyDownHandler(new KeyDownHandler() {

			@Override
			public void onKeyDown(KeyDownEvent event) {
				if (event.getKeyName().equalsIgnoreCase("Enter")) {
					item.setValue(item.getTextField().getValue());
				}

			}
		});
	}
	
	public void setJsObj(JavaScriptObject jsObj) {
		item.setJsObj(jsObj);
	}

	public JavaScriptObject getJsObj() {
		return item.getJsObj();
	}

	public DateDisplayFormat getDisplayFormat() {
		return item.getDisplayFormat();
	}

	public String getInputFormat() {
		return item.getInputFormat();
	}

	public Boolean getUseTextField() {
		return item.getUseTextField();
	}

	public String getInvalidDateStringMessage() {
		return item.getInvalidDateStringMessage();
	}

	public SelectItem getMonthSelectorProperties() {
		return item.getMonthSelectorProperties();
	}

	public String getPickerIconPrompt() {
		return item.getPickerIconPrompt();
	}

	public DateItemSelectorFormat getSelectorFormat() {
		return item.getSelectorFormat();
	}

	public Boolean getShowChooserFiscalYearPicker() {
		return item.getShowChooserFiscalYearPicker();
	}

	public Boolean getShowChooserWeekPicker() {
		return item.getShowChooserWeekPicker();
	}

	public Date getStartDate() {
		return item.getStartDate();
	}

	public Alignment getTextAlign() {
		return item.getTextAlign();
	}

	public TextItem getTextFieldProperties() {
		return item.getTextFieldProperties();
	}

	public Boolean getUseSharedPicker() {
		return item.getUseSharedPicker();
	}

	public SelectItem getYearSelectorProperties() {
		return item.getYearSelectorProperties();
	}

	public void deselectValue() {
		item.deselectValue();
	}

	public void deselectValue(Boolean start) {
		item.deselectValue(start);
	}

	public void selectValue() {
		item.selectValue();
	}

	public Date getValueAsDate() {
		return item.getValueAsDate();
	}

	public int[] getSelectionRange() {
		return item.getSelectionRange();
	}

	public String getIconPrompt() {
		return item.getIconPrompt();
	}

	public VerticalAlignment getIconVAlign() {
		return item.getIconVAlign();
	}

	public int getIconWidth() {
		return item.getIconWidth();
	}

	public String getImageURLPrefix() {
		return item.getImageURLPrefix();
	}

	public String getImageURLSuffix() {
		return item.getImageURLSuffix();
	}

	public Boolean getImplicitSave() {
		return item.getImplicitSave();
	}

	public Boolean getImplicitSaveOnBlur() {
		return item.getImplicitSaveOnBlur();
	}

	public int getLeft() {
		return item.getLeft();
	}

	public String getLocateItemBy() {
		return item.getLocateItemBy();
	}

	public String getMultipleValueSeparator() {
		return item.getMultipleValueSeparator();
	}

	public OperatorId getOperator() {
		return item.getOperator();
	}

	public String getOptionOperationId() {
		return item.getOptionOperationId();
	}

	public Integer getPickerIconHeight() {
		return item.getPickerIconHeight();
	}

	public String getPickerIconName() {
		return item.getPickerIconName();
	}

	public String getPickerIconSrc() {
		return item.getPickerIconSrc();
	}

	public Integer getPickerIconWidth() {
		return item.getPickerIconWidth();
	}

	public String getPrintTextBoxStyle() {
		return item.getPrintTextBoxStyle();
	}

	public String getPrintTitleStyle() {
		return item.getPrintTitleStyle();
	}

	public String getPrompt() {
		return item.getPrompt();
	}

	public Boolean getRedrawOnChange() {
		return item.getRedrawOnChange();
	}

	public Boolean getRejectInvalidValueOnChange() {
		return item.getRejectInvalidValueOnChange();
	}

	public Boolean getRequired() {
		return item.getRequired();
	}

	public String getRequiredMessage() {
		return item.getRequiredMessage();
	}

	public int getRowSpan() {
		return item.getRowSpan();
	}

	public Boolean getSaveOnEnter() {
		return item.getSaveOnEnter();
	}

	public Boolean getSelectOnFocus() {
		return item.getSelectOnFocus();
	}

	public Boolean getShouldSaveValue() {
		return item.getShouldSaveValue();
	}

	public Boolean getShowDisabled() {
		return item.getShowDisabled();
	}

	public Boolean getShowErrorIcon() {
		return item.getShowErrorIcon();
	}

	public Boolean getShowErrorStyle() {
		return item.getShowErrorStyle();
	}

	public Boolean getShowErrorText() {
		return item.getShowErrorText();
	}

	public Boolean getShowFocused() {
		return item.getShowFocused();
	}

	public Boolean getShowFocusedIcons() {
		return item.getShowFocusedIcons();
	}

	public Boolean getShowFocusedPickerIcon() {
		return item.getShowFocusedPickerIcon();
	}

	public Boolean getShowHint() {
		return item.getShowHint();
	}

	public Boolean getShowIcons() {
		return item.getShowIcons();
	}

	public Boolean getShowOverIcons() {
		return item.getShowOverIcons();
	}

	public Boolean getShowPickerIcon() {
		return item.getShowPickerIcon();
	}

	public Boolean getShowTitle() {
		return item.getShowTitle();
	}

	public Boolean getShowValueIconOnly() {
		return item.getShowValueIconOnly();
	}

	public Boolean getStartRow() {
		return item.getStartRow();
	}

	public Boolean getStopOnError() {
		return item.getStopOnError();
	}

	public Boolean getSuppressValueIcon() {
		return item.getSuppressValueIcon();
	}

	public Boolean getSynchronousValidation() {
		return item.getSynchronousValidation();
	}

	public Integer getTabIndex() {
		return item.getTabIndex();
	}

	public String getTextBoxStyle() {
		return item.getTextBoxStyle();
	}

	public TimeDisplayFormat getTimeFormatter() {
		return item.getTimeFormatter();
	}

	public String getTitle() {
		return item.getTitle();
	}

	public Alignment getTitleAlign() {
		return item.getTitleAlign();
	}

	public int getTitleColSpan() {
		return item.getTitleColSpan();
	}

	public TitleOrientation getTitleOrientation() {
		return item.getTitleOrientation();
	}

	public String getTitleStyle() {
		return item.getTitleStyle();
	}

	public VerticalAlignment getTitleVAlign() {
		return item.getTitleVAlign();
	}

	public int getTop() {
		return item.getTop();
	}

	public Boolean getValidateOnChange() {
		return item.getValidateOnChange();
	}

	public Boolean getValidateOnExit() {
		return item.getValidateOnExit();
	}

	public OperatorId[] getValidOperators() {
		return item.getValidOperators();
	}

	public VerticalAlignment getVAlign() {
		return item.getVAlign();
	}

	public String getValueField() {
		return item.getValueField();
	}

	public Integer getValueIconHeight() {
		return item.getValueIconHeight();
	}

	public int getValueIconLeftPadding() {
		return item.getValueIconLeftPadding();
	}

	public int getValueIconRightPadding() {
		return item.getValueIconRightPadding();
	}

	public int getValueIconSize() {
		return item.getValueIconSize();
	}

	public Integer getValueIconWidth() {
		return item.getValueIconWidth();
	}

	public Boolean getVisible() {
		return item.getVisible();
	}

	public int getWidth() {
		return item.getWidth();
	}

	public Boolean getWrapTitle() {
		return item.getWrapTitle();
	}

	public HandlerRegistration addBlurHandler(BlurHandler handler) {
		return item.addBlurHandler(handler);
	}

	public void blurItem() {
		item.blurItem();
	}

	public HandlerRegistration addChangeHandler(ChangeHandler handler) {
		return item.addChangeHandler(handler);
	}

	public HandlerRegistration addChangedHandler(ChangedHandler handler) {
		return item.addChangedHandler(handler);
	}

	public void clearValue() {
		item.clearValue();
	}

	public HandlerRegistration addClickHandler(ClickHandler handler) {
		return item.addClickHandler(handler);
	}

	public HandlerRegistration addDoubleClickHandler(DoubleClickHandler handler) {
		return item.addDoubleClickHandler(handler);
	}

	public HandlerRegistration addEditorEnterHandler(EditorEnterHandler handler) {
		return item.addEditorEnterHandler(handler);
	}

	public HandlerRegistration addEditorExitHandler(EditorExitHandler handler) {
		return item.addEditorExitHandler(handler);
	}

	public HandlerRegistration addFocusHandler(FocusHandler handler) {
		return item.addFocusHandler(handler);
	}

	public int getPageLeft() {
		return item.getPageLeft();
	}

	public int getPageTop() {
		return item.getPageTop();
	}

	public ListGridRecord getSelectedRecord() {
		return item.getSelectedRecord();
	}

	public String getValueFieldName() {
		return item.getValueFieldName();
	}

	public Boolean hasAdvancedCriteria() {
		return item.hasAdvancedCriteria();
	}

	public void hide() {
		item.hide();
	}

	public void hideIcon(String icon) {
		item.hideIcon(icon);
	}

	public HandlerRegistration addIconClickHandler(IconClickHandler handler) {
		return item.addIconClickHandler(handler);
	}

	public HandlerRegistration addIconKeyPressHandler(
			IconKeyPressHandler handler) {
		return item.addIconKeyPressHandler(handler);
	}

	public void invalidateDisplayValueCache() {
		item.invalidateDisplayValueCache();
	}

	public Boolean isDisabled() {
		return item.isDisabled();
	}

	public Boolean isDrawn() {
		return item.isDrawn();
	}

	public boolean isVisible() {
		return item.isVisible();
	}

	public HandlerRegistration addItemHoverHandler(ItemHoverHandler handler) {
		return item.addItemHoverHandler(handler);
	}

	public HandlerRegistration addKeyDownHandler(KeyDownHandler handler) {
		return item.addKeyDownHandler(handler);
	}

	public HandlerRegistration addKeyPressHandler(KeyPressHandler handler) {
		return item.addKeyPressHandler(handler);
	}

	public HandlerRegistration addKeyUpHandler(KeyUpHandler handler) {
		return item.addKeyUpHandler(handler);
	}

	public HandlerRegistration addPickerIconClickHandler(
			PickerIconClickHandler handler) {
		return item.addPickerIconClickHandler(handler);
	}

	public HandlerRegistration addTitleClickHandler(TitleClickHandler handler) {
		return item.addTitleClickHandler(handler);
	}

	public HandlerRegistration addTitleDoubleClickHandler(
			TitleDoubleClickHandler handler) {
		return item.addTitleDoubleClickHandler(handler);
	}

	public HandlerRegistration addTitleHoverHandler(TitleHoverHandler handler) {
		return item.addTitleHoverHandler(handler);
	}

	public String getName() {
		return item.getName();
	}

	public String getType() {
		return item.getType();
	}

	public int getVisibleHeight() {
		return item.getVisibleHeight();
	}

	public int getVisibleWidth() {
		return item.getVisibleWidth();
	}

	public Rectangle getPageRect() {
		return item.getPageRect();
	}

	public Rectangle getRect() {
		return item.getRect();
	}

	public Rectangle getIconRect(FormItemIcon icon) {
		return item.getIconRect(icon);
	}

	public RPCRequest getOptionFilterContext() {
		return item.getOptionFilterContext();
	}

	public Object getValue() {
		return item.getValue();
	}

	public int hashCode() {
		return item.hashCode();
	}

	public void redraw() {
		item.redraw();
	}

	public String getTooltip() {
		return item.getTooltip();
	}

	public Criteria getOptionCriteria() {
		return item.getOptionCriteria();
	}

	public Object _getValue() {
		return item._getValue();
	}

	public void enable() {
		item.enable();
	}

	public void disable() {
		item.disable();
	}

	public final Boolean canEditCriterion(Criterion criterion) {
		return item.canEditCriterion(criterion);
	}

	public boolean equals(Object arg0) {
		return item.equals(arg0);
	}

	public void setAttribute(String property, long value) {
		item.setAttribute(property, value);
	}

	public Long getAttributeAsLong(String property) {
		return item.getAttributeAsLong(property);
	}

	public double[] getAttributeAsDoubleArray(String property) {
		return item.getAttributeAsDoubleArray(property);
	}

	public void setAttribute(String property, Integer[] value) {
		item.setAttribute(property, value);
	}

	public void setAttribute(String property, BaseWidget[] value) {
		item.setAttribute(property, value);
	}

	public int[] getAttributeAsIntArray(String property) {
		return item.getAttributeAsIntArray(property);
	}

	public void setJavaScriptObject(JavaScriptObject jsObj) {
		item.setJavaScriptObject(jsObj);
	}

	public String[] getAttributeAsStringArray(String property) {
		return item.getAttributeAsStringArray(property);
	}

	public void setDisplayFormat(DateDisplayFormat displayFormat) {
		item.setDisplayFormat(displayFormat);
	}

	public void setCenturyThreshold(int centuryThreshold) {
		item.setCenturyThreshold(centuryThreshold);
	}

	public void setAttribute(String property, double[] value) {
		item.setAttribute(property, value);
	}

	public void setAttribute(String property, ValueEnum value) {
		item.setAttribute(property, value);
	}

	public int getCenturyThreshold() {
		return item.getCenturyThreshold();
	}

	public void setAttribute(String property, Object value) {
		item.setAttribute(property, value);
	}

	public void setAccessKey(String accessKey) {
		item.setAccessKey(accessKey);
	}

	public void setDateFormatter(DateDisplayFormat dateFormatter) {
		item.setDateFormatter(dateFormatter);
	}

	public String getAccessKey() {
		return item.getAccessKey();
	}

	public void setInputFormat(String inputFormat) {
		item.setInputFormat(inputFormat);
	}

	public void setAlign(Alignment align) {
		item.setAlign(align);
	}

	public void setAttribute(String property, Double value) {
		item.setAttribute(property, value);
	}

	public void setAttribute(String property, Integer value) {
		item.setAttribute(property, value);
	}

	public void setAttribute(String property, Float value) {
		item.setAttribute(property, value);
	}

	public Alignment getAlign() {
		return item.getAlign();
	}

	public DateDisplayFormat getDateFormatter() {
		return item.getDateFormatter();
	}

	public Object getAttributeAsObject(String property) {
		return item.getAttributeAsObject(property);
	}

	public Map getAttributeAsMap(String property) {
		return item.getAttributeAsMap(property);
	}

	public Record getAttributeAsRecord(String property) {
		return item.getAttributeAsRecord(property);
	}

	public void setAllowExpressions(Boolean allowExpressions) {
		item.setAllowExpressions(allowExpressions);
	}

	public String[] getAttributes() {
		return item.getAttributes();
	}

	public void fireEvent(GwtEvent<?> event) {
		item.fireEvent(event);
	}

	public void setUseTextField(Boolean useTextField) {
		item.setUseTextField(useTextField);
	}

	public void setDaySelectorProperties(SelectItem daySelectorProperties) {
		item.setDaySelectorProperties(daySelectorProperties);
	}

	public int getHandlerCount(Type<?> type) {
		return item.getHandlerCount(type);
	}

	public SelectItem getDaySelectorProperties() {
		return item.getDaySelectorProperties();
	}

	public void setDefaultChooserDate(Date defaultChooserDate) {
		item.setDefaultChooserDate(defaultChooserDate);
	}

	public Date getDefaultChooserDate() {
		return item.getDefaultChooserDate();
	}

	public void setEndDate(Date endDate) {
		item.setEndDate(endDate);
	}

	public Boolean getAllowExpressions() {
		return item.getAllowExpressions();
	}

	public Date getEndDate() {
		return item.getEndDate();
	}

	public void setEnforceDate(Boolean enforceDate) {
		item.setEnforceDate(enforceDate);
	}

	public Boolean getEnforceDate() {
		return item.getEnforceDate();
	}

	public void setAlwaysFetchMissingValues(Boolean alwaysFetchMissingValues) {
		item.setAlwaysFetchMissingValues(alwaysFetchMissingValues);
	}

	public Boolean getAlwaysFetchMissingValues() {
		return item.getAlwaysFetchMissingValues();
	}

	public void setBrowserSpellCheck(Boolean browserSpellCheck) {
		item.setBrowserSpellCheck(browserSpellCheck);
	}

	public Boolean getBrowserSpellCheck() {
		return item.getBrowserSpellCheck();
	}

	public void setInvalidDateStringMessage(String invalidDateStringMessage) {
		item.setInvalidDateStringMessage(invalidDateStringMessage);
	}

	public void setCanEdit(Boolean canEdit) {
		item.setCanEdit(canEdit);
	}

	public void setMaskDateSeparator(String maskDateSeparator) {
		item.setMaskDateSeparator(maskDateSeparator);
	}

	public void setMonthSelectorProperties(SelectItem monthSelectorProperties) {
		item.setMonthSelectorProperties(monthSelectorProperties);
	}

	public Boolean getCanEdit() {
		return item.getCanEdit();
	}

	public void setPickerIconPrompt(String pickerIconPrompt) {
		item.setPickerIconPrompt(pickerIconPrompt);
	}

	public void setSelectorFormat(DateItemSelectorFormat selectorFormat) {
		item.setSelectorFormat(selectorFormat);
	}

	public void setCanFocus(Boolean canFocus) {
		item.setCanFocus(canFocus);
	}

	public Boolean getCanFocus() {
		return item.getCanFocus();
	}

	public void setCellHeight(Integer cellHeight) {
		item.setCellHeight(cellHeight);
	}

	public void setShowChooserFiscalYearPicker(
			Boolean showChooserFiscalYearPicker) {
		item.setShowChooserFiscalYearPicker(showChooserFiscalYearPicker);
	}

	public Integer getCellHeight() {
		return item.getCellHeight();
	}

	public void setCellStyle(String cellStyle) {
		item.setCellStyle(cellStyle);
	}

	public void setShowChooserWeekPicker(Boolean showChooserWeekPicker) {
		item.setShowChooserWeekPicker(showChooserWeekPicker);
	}

	public String getCellStyle() {
		return item.getCellStyle();
	}

	public void setStartDate(Date startDate) {
		item.setStartDate(startDate);
	}

	public Canvas getContainerWidget() {
		return item.getContainerWidget();
	}

	public void setCriteriaField(String criteriaField) {
		item.setCriteriaField(criteriaField);
	}

	public void setTextAlign(Alignment textAlign) {
		item.setTextAlign(textAlign);
	}

	public String getCriteriaField() {
		return item.getCriteriaField();
	}

	public void setTextFieldProperties(TextItem textFieldProperties) {
		item.setTextFieldProperties(textFieldProperties);
	}

	public void setDataPath(String dataPath) {
		item.setDataPath(dataPath);
	}

	public String getDataPath() {
		return item.getDataPath();
	}

	public void setUseMask(Boolean useMask) {
		item.setUseMask(useMask);
	}

	public void setUseSharedPicker(Boolean useSharedPicker) {
		item.setUseSharedPicker(useSharedPicker);
	}

	public void setYearSelectorProperties(SelectItem yearSelectorProperties) {
		item.setYearSelectorProperties(yearSelectorProperties);
	}

	public String getEnteredValue() {
		return item.getEnteredValue();
	}

	public FiscalCalendar getFiscalCalendar() {
		return item.getFiscalCalendar();
	}

	public void setDecimalPad(Integer decimalPad) {
		item.setDecimalPad(decimalPad);
	}

	public Integer getDecimalPad() {
		return item.getDecimalPad();
	}

	public void setFiscalCalendar() {
		item.setFiscalCalendar();
	}

	public void setDecimalPrecision(Integer decimalPrecision) {
		item.setDecimalPrecision(decimalPrecision);
	}

	public void setFiscalCalendar(FiscalCalendar fiscalCalendar) {
		item.setFiscalCalendar(fiscalCalendar);
	}

	public void setSelectionRange(int start, int end) {
		item.setSelectionRange(start, end);
	}

	public Integer getDecimalPrecision() {
		return item.getDecimalPrecision();
	}

	public void setDefaultIconSrc(String defaultIconSrc) {
		item.setDefaultIconSrc(defaultIconSrc);
	}

	public String getDefaultIconSrc() {
		return item.getDefaultIconSrc();
	}

	public void setEditorValueFormatter(FormItemValueFormatter formatter) {
		item.setEditorValueFormatter(formatter);
	}

	public void setDisabled(Boolean disabled) {
		item.setDisabled(disabled);
	}

	public void setEditorValueParser(FormItemValueParser valueParser) {
		item.setEditorValueParser(valueParser);
	}

	public Boolean getDisabled() {
		return item.getDisabled();
	}

	public void setDisableIconsOnReadOnly(Boolean disableIconsOnReadOnly) {
		item.setDisableIconsOnReadOnly(disableIconsOnReadOnly);
	}

	public Boolean getDisableIconsOnReadOnly() {
		return item.getDisableIconsOnReadOnly();
	}

	public void setDisplayField(String displayField) {
		item.setDisplayField(displayField);
	}

	public String getDisplayField() {
		return item.getDisplayField();
	}

	public void setEditPendingCSSText(String editPendingCSSText) {
		item.setEditPendingCSSText(editPendingCSSText);
	}

	public String getEditPendingCSSText() {
		return item.getEditPendingCSSText();
	}

	public void setEmptyDisplayValue(String emptyDisplayValue) {
		item.setEmptyDisplayValue(emptyDisplayValue);
	}

	public String getEmptyDisplayValue() {
		return item.getEmptyDisplayValue();
	}

	public void setEmptyValueIcon(String emptyValueIcon) {
		item.setEmptyValueIcon(emptyValueIcon);
	}

	public String getEmptyValueIcon() {
		return item.getEmptyValueIcon();
	}

	public void setEndRow(Boolean endRow) {
		item.setEndRow(endRow);
	}

	public Boolean getEndRow() {
		return item.getEndRow();
	}

	public void setErrorIconHeight(int errorIconHeight) {
		item.setErrorIconHeight(errorIconHeight);
	}

	public int getErrorIconHeight() {
		return item.getErrorIconHeight();
	}

	public void setErrorIconSrc(String errorIconSrc) {
		item.setErrorIconSrc(errorIconSrc);
	}

	public String getErrorIconSrc() {
		return item.getErrorIconSrc();
	}

	public void setErrorIconWidth(int errorIconWidth) {
		item.setErrorIconWidth(errorIconWidth);
	}

	public int getErrorIconWidth() {
		return item.getErrorIconWidth();
	}

	public void setErrorMessageWidth(int errorMessageWidth) {
		item.setErrorMessageWidth(errorMessageWidth);
	}

	public int getErrorMessageWidth() {
		return item.getErrorMessageWidth();
	}

	public void setFetchMissingValues(Boolean fetchMissingValues) {
		item.setFetchMissingValues(fetchMissingValues);
	}

	public Boolean getFetchMissingValues() {
		return item.getFetchMissingValues();
	}

	public void setFilterLocally(Boolean filterLocally) {
		item.setFilterLocally(filterLocally);
	}

	public Boolean getFilterLocally() {
		return item.getFilterLocally();
	}

	public void setGlobalTabIndex(Integer globalTabIndex) {
		item.setGlobalTabIndex(globalTabIndex);
	}

	public Integer getGlobalTabIndex() {
		return item.getGlobalTabIndex();
	}

	public void setHeight(int height) {
		item.setHeight(height);
	}

	public int getHeight() {
		return item.getHeight();
	}

	public void setHint(String hint) {
		item.setHint(hint);
	}

	public String getHint() {
		return item.getHint();
	}

	public void setHintStyle(String hintStyle) {
		item.setHintStyle(hintStyle);
	}

	public String getHintStyle() {
		return item.getHintStyle();
	}

	public void setHoverAlign(Alignment hoverAlign) {
		item.setHoverAlign(hoverAlign);
	}

	public Alignment getHoverAlign() {
		return item.getHoverAlign();
	}

	public void setHoverDelay(Integer hoverDelay) {
		item.setHoverDelay(hoverDelay);
	}

	public Integer getHoverDelay() {
		return item.getHoverDelay();
	}

	public void setHoverHeight(Integer hoverHeight) {
		item.setHoverHeight(hoverHeight);
	}

	public Integer getHoverHeight() {
		return item.getHoverHeight();
	}

	public void setHoverOpacity(Integer hoverOpacity) {
		item.setHoverOpacity(hoverOpacity);
	}

	public Integer getHoverOpacity() {
		return item.getHoverOpacity();
	}

	public void setHoverStyle(String hoverStyle) {
		item.setHoverStyle(hoverStyle);
	}

	public String getHoverStyle() {
		return item.getHoverStyle();
	}

	public void setHoverVAlign(VerticalAlignment hoverVAlign) {
		item.setHoverVAlign(hoverVAlign);
	}

	public VerticalAlignment getHoverVAlign() {
		return item.getHoverVAlign();
	}

	public void setHoverWidth(Integer hoverWidth) {
		item.setHoverWidth(hoverWidth);
	}

	public Integer getHoverWidth() {
		return item.getHoverWidth();
	}

	public void setIconHeight(int iconHeight) {
		item.setIconHeight(iconHeight);
	}

	public int getIconHeight() {
		return item.getIconHeight();
	}

	public void setIconPrompt(String iconPrompt) {
		item.setIconPrompt(iconPrompt);
	}

	public void setIconVAlign(VerticalAlignment iconVAlign) {
		item.setIconVAlign(iconVAlign);
	}

	public void setIconWidth(int iconWidth) {
		item.setIconWidth(iconWidth);
	}

	public void setImageURLPrefix(String imageURLPrefix) {
		item.setImageURLPrefix(imageURLPrefix);
	}

	public void setImageURLSuffix(String imageURLSuffix) {
		item.setImageURLSuffix(imageURLSuffix);
	}

	public void setImplicitSave(Boolean implicitSave) {
		item.setImplicitSave(implicitSave);
	}

	public void setImplicitSaveOnBlur(Boolean implicitSaveOnBlur) {
		item.setImplicitSaveOnBlur(implicitSaveOnBlur);
	}

	public void setLeft(int left) {
		item.setLeft(left);
	}

	public void setLocateItemBy(String locateItemBy) {
		item.setLocateItemBy(locateItemBy);
	}

	public void setMultipleValueSeparator(String multipleValueSeparator) {
		item.setMultipleValueSeparator(multipleValueSeparator);
	}

	public void setOperator(OperatorId operator) {
		item.setOperator(operator);
	}

	public void setOptionOperationId(String optionOperationId) {
		item.setOptionOperationId(optionOperationId);
	}

	public void setPickerIconHeight(Integer pickerIconHeight) {
		item.setPickerIconHeight(pickerIconHeight);
	}

	public void setPickerIconName(String pickerIconName) {
		item.setPickerIconName(pickerIconName);
	}

	public void setPickerIconSrc(String pickerIconSrc) {
		item.setPickerIconSrc(pickerIconSrc);
	}

	public void setPickerIconWidth(Integer pickerIconWidth) {
		item.setPickerIconWidth(pickerIconWidth);
	}

	public void setPrintTextBoxStyle(String printTextBoxStyle) {
		item.setPrintTextBoxStyle(printTextBoxStyle);
	}

	public void setPrintTitleStyle(String printTitleStyle) {
		item.setPrintTitleStyle(printTitleStyle);
	}

	public void setPrompt(String prompt) {
		item.setPrompt(prompt);
	}

	public void setRedrawOnChange(Boolean redrawOnChange) {
		item.setRedrawOnChange(redrawOnChange);
	}

	public void setRejectInvalidValueOnChange(Boolean rejectInvalidValueOnChange) {
		item.setRejectInvalidValueOnChange(rejectInvalidValueOnChange);
	}

	public void setRequired(Boolean required) {
		item.setRequired(required);
	}

	public void setRequiredMessage(String requiredMessage) {
		item.setRequiredMessage(requiredMessage);
	}

	public void setRowSpan(int rowSpan) {
		item.setRowSpan(rowSpan);
	}

	public void setSaveOnEnter(Boolean saveOnEnter) {
		item.setSaveOnEnter(saveOnEnter);
	}

	public void setSelectOnFocus(Boolean selectOnFocus) {
		item.setSelectOnFocus(selectOnFocus);
	}

	public void setShouldSaveValue(Boolean shouldSaveValue) {
		item.setShouldSaveValue(shouldSaveValue);
	}

	public void setShowDisabled(Boolean showDisabled) {
		item.setShowDisabled(showDisabled);
	}

	public void setShowErrorIcon(Boolean showErrorIcon) {
		item.setShowErrorIcon(showErrorIcon);
	}

	public void setShowErrorStyle(Boolean showErrorStyle) {
		item.setShowErrorStyle(showErrorStyle);
	}

	public void setShowErrorText(Boolean showErrorText) {
		item.setShowErrorText(showErrorText);
	}

	public void setShowFocused(Boolean showFocused) {
		item.setShowFocused(showFocused);
	}

	public void setShowFocusedIcons(Boolean showFocusedIcons) {
		item.setShowFocusedIcons(showFocusedIcons);
	}

	public void setShowFocusedPickerIcon(Boolean showFocusedPickerIcon) {
		item.setShowFocusedPickerIcon(showFocusedPickerIcon);
	}

	public void setShowHint(Boolean showHint) {
		item.setShowHint(showHint);
	}

	public void setShowIcons(Boolean showIcons) {
		item.setShowIcons(showIcons);
	}

	public void setShowOverIcons(Boolean showOverIcons) {
		item.setShowOverIcons(showOverIcons);
	}

	public void setShowPickerIcon(Boolean showPickerIcon) {
		item.setShowPickerIcon(showPickerIcon);
	}

	public void setShowTitle(Boolean showTitle) {
		item.setShowTitle(showTitle);
	}

	public void setShowValueIconOnly(Boolean showValueIconOnly) {
		item.setShowValueIconOnly(showValueIconOnly);
	}

	public void setStartRow(Boolean startRow) {
		item.setStartRow(startRow);
	}

	public void setStopOnError(Boolean stopOnError) {
		item.setStopOnError(stopOnError);
	}

	public void setSuppressValueIcon(Boolean suppressValueIcon) {
		item.setSuppressValueIcon(suppressValueIcon);
	}

	public void setSynchronousValidation(Boolean synchronousValidation) {
		item.setSynchronousValidation(synchronousValidation);
	}

	public void setTabIndex(Integer tabIndex) {
		item.setTabIndex(tabIndex);
	}

	public void setTextBoxStyle(String textBoxStyle) {
		item.setTextBoxStyle(textBoxStyle);
	}

	public void setTimeFormatter(TimeDisplayFormat timeFormatter) {
		item.setTimeFormatter(timeFormatter);
	}

	public void setTitle(String title) {
		item.setTitle(title);
	}

	public void setTitleAlign(Alignment titleAlign) {
		item.setTitleAlign(titleAlign);
	}

	public void setTitleColSpan(int titleColSpan) {
		item.setTitleColSpan(titleColSpan);
	}

	public void setTitleOrientation(TitleOrientation titleOrientation) {
		item.setTitleOrientation(titleOrientation);
	}

	public void setTitleStyle(String titleStyle) {
		item.setTitleStyle(titleStyle);
	}

	public void setTitleVAlign(VerticalAlignment titleVAlign) {
		item.setTitleVAlign(titleVAlign);
	}

	public void setTop(int top) {
		item.setTop(top);
	}

	public void setValidateOnChange(Boolean validateOnChange) {
		item.setValidateOnChange(validateOnChange);
	}

	public void setValidateOnExit(Boolean validateOnExit) {
		item.setValidateOnExit(validateOnExit);
	}

	public void setValidOperators(OperatorId... validOperators) {
		item.setValidOperators(validOperators);
	}

	public void setVAlign(VerticalAlignment vAlign) {
		item.setVAlign(vAlign);
	}

	public void setValueField(String valueField) {
		item.setValueField(valueField);
	}

	public void setValueIconHeight(Integer valueIconHeight) {
		item.setValueIconHeight(valueIconHeight);
	}

	public void setValueIconLeftPadding(int valueIconLeftPadding) {
		item.setValueIconLeftPadding(valueIconLeftPadding);
	}

	public void setValueIconRightPadding(int valueIconRightPadding) {
		item.setValueIconRightPadding(valueIconRightPadding);
	}

	public void setValueIconSize(int valueIconSize) {
		item.setValueIconSize(valueIconSize);
	}

	public void setValueIconWidth(Integer valueIconWidth) {
		item.setValueIconWidth(valueIconWidth);
	}

	public void setVisible(Boolean visible) {
		item.setVisible(visible);
	}

	public void setWidth(int width) {
		item.setWidth(width);
	}

	public void setWrapTitle(Boolean wrapTitle) {
		item.setWrapTitle(wrapTitle);
	}

	public void focusInItem() {
		item.focusInItem();
	}

	public String getDisplayFieldName() {
		return item.getDisplayFieldName();
	}

	public String getFieldName() {
		return item.getFieldName();
	}

	public String getFullDataPath() {
		return item.getFullDataPath();
	}

	public FormItemIcon getIcon(String name) {
		return item.getIcon(name);
	}

	public Boolean shouldFetchMissingValue(Object newValue) {
		return item.shouldFetchMissingValue(newValue);
	}

	public Boolean shouldSaveOnEnter() {
		return item.shouldSaveOnEnter();
	}

	public void show() {
		item.show();
	}

	public void showIcon(String icon) {
		item.showIcon(icon);
	}

	public void stopHover() {
		item.stopHover();
	}

	public void updateState() {
		item.updateState();
	}

	public Boolean validate() {
		return item.validate();
	}

	public String getClassName() {
		return item.getClassName();
	}

	public void setInitHandler(FormItemInitHandler initHandler) {
		item.setInitHandler(initHandler);
	}

	public void setAttribute(String attribute, String value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, Boolean value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, Map value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, int[] value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, BaseClass[] value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, DataClass[] value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, double value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, int value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, Date value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, ValueEnum[] value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, DataClass value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, BaseClass value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, JavaScriptObject value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, String[] value) {
		item.setAttribute(attribute, value);
	}

	public void setAttribute(String attribute, boolean value) {
		item.setAttribute(attribute, value);
	}

	public String getAttribute(String attribute) {
		return item.getAttribute(attribute);
	}

	public String getAttributeAsString(String attribute) {
		return item.getAttributeAsString(attribute);
	}

	public Date getAttributeAsDate(String attribute) {
		return item.getAttributeAsDate(attribute);
	}

	public Double getAttributeAsDouble(String attribute) {
		return item.getAttributeAsDouble(attribute);
	}

	public JavaScriptObject getAttributeAsJavaScriptObject(String attribute) {
		return item.getAttributeAsJavaScriptObject(attribute);
	}

	public Integer getAttributeAsInt(String attribute) {
		return item.getAttributeAsInt(attribute);
	}

	public Float getAttributeAsFloat(String attribute) {
		return item.getAttributeAsFloat(attribute);
	}

	public Boolean getAttributeAsBoolean(String attribute) {
		return item.getAttributeAsBoolean(attribute);
	}

	public void setProperty(String property, String value) {
		item.setProperty(property, value);
	}

	public void setProperty(String property, boolean value) {
		item.setProperty(property, value);
	}

	public void setProperty(String property, int value) {
		item.setProperty(property, value);
	}

	public void setProperty(String property, double value) {
		item.setProperty(property, value);
	}

	public void setProperty(String property, JavaScriptObject value) {
		item.setProperty(property, value);
	}

	public void setOptionDataSource(DataSource dataSource) {
		item.setOptionDataSource(dataSource);
	}

	public void setName(String name) {
		item.setName(name);
	}

	public void setValidators(Validator... validators) {
		item.setValidators(validators);
	}

	public void setIcons(FormItemIcon... icons) {
		item.setIcons(icons);
	}

	public void setErrorOrientation(FormErrorOrientation errorOrientation) {
		item.setErrorOrientation(errorOrientation);
	}

	public void setType(String type) {
		item.setType(type);
	}

	public void setColSpan(String colSpan) {
		item.setColSpan(colSpan);
	}

	public void setColSpan(int colSpan) {
		item.setColSpan(colSpan);
	}

	public void setDefaultValue(String defaultValue) {
		item.setDefaultValue(defaultValue);
	}

	public void setDefaultValue(Integer defaultValue) {
		item.setDefaultValue(defaultValue);
	}

	public void setDefaultValue(Date defaultValue) {
		item.setDefaultValue(defaultValue);
	}

	public void setDefaultValue(Boolean defaultValue) {
		item.setDefaultValue(defaultValue);
	}

	public void setDefaultValue(Float defaultValue) {
		item.setDefaultValue(defaultValue);
	}

	public void setValueMap(String... valueMap) {
		item.setValueMap(valueMap);
	}

	public void setValueMap(LinkedHashMap valueMap) {
		item.setValueMap(valueMap);
	}

	public void setValueIcons(Map valueIcons) {
		item.setValueIcons(valueIcons);
	}

	public void setWidth(String width) {
		item.setWidth(width);
	}

	public void setHeight(String height) {
		item.setHeight(height);
	}

	public void setRedrawOnChange(boolean redrawOnChange) {
		item.setRedrawOnChange(redrawOnChange);
	}

	public void setEditorType(FormItem editorType) {
		item.setEditorType(editorType);
	}

	public void setValue(Date value) {
		if (value != null) {
			String hours = hourFormatter.format(value);
			if("00".equals(hours) && timeZone.isDaylightTime(value))
				value.setTime(value.getTime()+(60*60000));
		}
		item.setValue(value);
	}

	public void setValue(int value) {
		item.setValue(value);
	}

	public void setValue(float value) {
		item.setValue(value);
	}

	public void setValue(double value) {
		item.setValue(value);
	}

	public void setValue(String value) {
		item.setValue(value);
	}

	public void setValue(boolean value) {
		item.setValue(value);
	}

	public void setValue(Object value) {
		item.setValue(value);
	}

	public String getDisplayValue() {
		return item.getDisplayValue();
	}

	public String getDisplayValue(String value) {
		return item.getDisplayValue(value);
	}

	public Rectangle getIconPageRect(FormItemIcon icon) {
		return item.getIconPageRect(icon);
	}

	public JavaScriptObject getConfig() {
		return item.getConfig();
	}

	public JavaScriptObject getEditorTypeConfig() {
		return item.getEditorTypeConfig();
	}

	public void setTooltip(String tooltip) {
		item.setTooltip(tooltip);
	}

	public void setOptionFilterContext(RPCRequest rpcRequestProperties) {
		item.setOptionFilterContext(rpcRequestProperties);
	}

	public void setOptionCriteria(Criteria optionCriteria) {
		item.setOptionCriteria(optionCriteria);
	}

	public void setShowIfCondition(FormItemIfFunction showIf) {
		item.setShowIfCondition(showIf);
	}

	public void setErrorFormatter(FormItemErrorFormatter errorFormatter) {
		item.setErrorFormatter(errorFormatter);
	}

	public void setInputTransformer(FormItemInputTransformer inputTransformer) {
		item.setInputTransformer(inputTransformer);
	}

	public void setItemHoverFormatter(FormItemHoverFormatter hoverFormatter) {
		item.setItemHoverFormatter(hoverFormatter);
	}

	public void setItemTitleHoverFormatter(FormItemHoverFormatter hoverFormatter) {
		item.setItemTitleHoverFormatter(hoverFormatter);
	}

	public DynamicForm getForm() {
		return item.getForm();
	}

	public void showPicker() {
		item.showPicker();
	}

	public void setValueFormatter(FormItemValueFormatter formatter) {
		item.setValueFormatter(formatter);
	}

	public void setValueIconMapper(ValueIconMapper valueIconMapper) {
		item.setValueIconMapper(valueIconMapper);
	}

//	public void setDisplayFormat(TimeFormatter displayFormat) {
//		item.setDisplayFormat(displayFormat);
//	}
//
	public void setCanEditCriterionPredicate(
			FormItemCanEditCriterionPredicate predicate) {
		item.setCanEditCriterionPredicate(predicate);
	}

	public void setCriterionGetter(FormItemCriterionGetter getter) {
		item.setCriterionGetter(getter);
	}

	public final Criterion getCriterion() {
		return item.getCriterion();
	}

	public final Criterion getCriterion(TextMatchStyle textMatchStyle) {
		return item.getCriterion(textMatchStyle);
	}

	public void setCriterionSetter(FormItemCriterionSetter setter) {
		item.setCriterionSetter(setter);
	}

	public final void setCriterion(Criterion criterion) {
		item.setCriterion(criterion);
	}

	public String toString() {
		return item.toString();
	}

}
