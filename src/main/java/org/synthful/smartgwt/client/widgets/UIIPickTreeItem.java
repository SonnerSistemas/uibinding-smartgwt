package org.synthful.smartgwt.client.widgets;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.event.shared.HandlerRegistration;
import com.smartgwt.client.core.BaseClass;
import com.smartgwt.client.core.DataClass;
import com.smartgwt.client.core.Rectangle;
import com.smartgwt.client.data.Criteria;
import com.smartgwt.client.data.Criterion;
import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.data.Record;
import com.smartgwt.client.data.RecordList;
import com.smartgwt.client.rpc.RPCRequest;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.DateDisplayFormat;
import com.smartgwt.client.types.FormErrorOrientation;
import com.smartgwt.client.types.OperatorId;
import com.smartgwt.client.types.Overflow;
import com.smartgwt.client.types.TextMatchStyle;
import com.smartgwt.client.types.TimeDisplayFormat;
import com.smartgwt.client.types.TimeFormatter;
import com.smartgwt.client.types.TitleOrientation;
import com.smartgwt.client.types.ValueEnum;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.BaseWidget;
import com.smartgwt.client.widgets.Canvas;
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
import com.smartgwt.client.widgets.form.fields.FormItem;
import com.smartgwt.client.widgets.form.fields.FormItemIcon;
import com.smartgwt.client.widgets.form.fields.IPickTreeItem;
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
import com.smartgwt.client.widgets.form.fields.events.KeyDownHandler;
import com.smartgwt.client.widgets.form.fields.events.KeyPressHandler;
import com.smartgwt.client.widgets.form.fields.events.KeyUpHandler;
import com.smartgwt.client.widgets.form.fields.events.PickerIconClickHandler;
import com.smartgwt.client.widgets.form.fields.events.ShowValueHandler;
import com.smartgwt.client.widgets.form.fields.events.TitleClickHandler;
import com.smartgwt.client.widgets.form.fields.events.TitleDoubleClickHandler;
import com.smartgwt.client.widgets.form.fields.events.TitleHoverHandler;
import com.smartgwt.client.widgets.form.validator.Validator;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import com.smartgwt.client.widgets.tree.Tree;

public class UIIPickTreeItem extends UIFormItem<IPickTreeItem> {
	
	public UIIPickTreeItem() {
		item = new IPickTreeItem();
		item.setValueTree(new Tree());
	}

	public void setJsObj(JavaScriptObject jsObj) {
		item.setJsObj(jsObj);
	}

	public JavaScriptObject getJsObj() {
		return item.getJsObj();
	}

	public int hashCode() {
		return item.hashCode();
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

	public boolean equals(Object obj) {
		return item.equals(obj);
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

	public void setCanSelectParentItems(Boolean canSelectParentItems) {
		item.setCanSelectParentItems(canSelectParentItems);
	}

	public void setAttribute(String property, double[] value) {
		item.setAttribute(property, value);
	}

	public Boolean getCanSelectParentItems() {
		return item.getCanSelectParentItems();
	}

	public void setAttribute(String property, ValueEnum value) {
		item.setAttribute(property, value);
	}

	public void setAttribute(String property, Object value) {
		item.setAttribute(property, value);
	}

	public void setAccessKey(String accessKey) {
		item.setAccessKey(accessKey);
	}

	public void setDisplayField(String displayField) {
		item.setDisplayField(displayField);
	}

	public String getAccessKey() {
		return item.getAccessKey();
	}

	public void setAlign(Alignment align) {
		item.setAlign(align);
	}

	public String getDisplayField() {
		return item.getDisplayField();
	}

	public void setApplyPromptToCanvas(Boolean applyPromptToCanvas) {
		item.setApplyPromptToCanvas(applyPromptToCanvas);
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

	public Boolean getApplyPromptToCanvas() {
		return item.getApplyPromptToCanvas();
	}

	public Alignment getAlign() {
		return item.getAlign();
	}

	public Object getAttributeAsObject(String property) {
		return item.getAttributeAsObject(property);
	}

	public void setAutoDestroy(Boolean autoDestroy) {
		item.setAutoDestroy(autoDestroy);
	}

	public void setEmptyDisplayValue(String emptyDisplayValue) {
		item.setEmptyDisplayValue(emptyDisplayValue);
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

	public String getEmptyDisplayValue() {
		return item.getEmptyDisplayValue();
	}

	public Boolean getAutoDestroy() {
		return item.getAutoDestroy();
	}

	public String toString() {
		return item.toString();
	}

	public int getHandlerCount(Type<?> type) {
		return item.getHandlerCount(type);
	}

	public void setEmptyMenuMessage(String emptyMenuMessage) {
		item.setEmptyMenuMessage(emptyMenuMessage);
	}

	public void setCanvas(Canvas canvas) {
		item.setCanvas(canvas);
	}

	public String getEmptyMenuMessage() {
		return item.getEmptyMenuMessage();
	}

	public void setLoadDataOnDemand(Boolean loadDataOnDemand) {
		item.setLoadDataOnDemand(loadDataOnDemand);
	}

	public Canvas getCanvas() {
		return item.getCanvas();
	}

	public Boolean getLoadDataOnDemand() {
		return item.getLoadDataOnDemand();
	}

	public void setOptionDataSource(DataSource optionDataSource) {
		item.setOptionDataSource(optionDataSource);
	}

	public Boolean getAllowExpressions() {
		return item.getAllowExpressions();
	}

	public void setEditCriteriaInInnerForm(Boolean editCriteriaInInnerForm) {
		item.setEditCriteriaInInnerForm(editCriteriaInInnerForm);
	}

	public Boolean getEditCriteriaInInnerForm() {
		return item.getEditCriteriaInInnerForm();
	}

	public void setOverflow(Overflow overflow) {
		item.setOverflow(overflow);
	}

	public DataSource getOptionDataSource() {
		return item.getOptionDataSource();
	}

	public Overflow getOverflow() {
		return item.getOverflow();
	}

	public void setPrompt(String prompt) {
		item.setPrompt(prompt);
	}

	public String getPrompt() {
		return item.getPrompt();
	}

	public void setAlwaysFetchMissingValues(Boolean alwaysFetchMissingValues) {
		item.setAlwaysFetchMissingValues(alwaysFetchMissingValues);
	}

	public void setShouldSaveValue(Boolean shouldSaveValue) {
		item.setShouldSaveValue(shouldSaveValue);
	}

	public void setValueField(String valueField) {
		item.setValueField(valueField);
	}

	public Boolean getShouldSaveValue() {
		return item.getShouldSaveValue();
	}

	public String getValueField() {
		return item.getValueField();
	}

	public Boolean hasAdvancedCriteria() {
		return item.hasAdvancedCriteria();
	}

	public void fetchData() {
		item.fetchData();
	}

	public void setDataSource(DataSource dataSource) {
		item.setDataSource(dataSource);
	}

	public HandlerRegistration addShowValueHandler(ShowValueHandler handler) {
		return item.addShowValueHandler(handler);
	}

	public Boolean getAlwaysFetchMissingValues() {
		return item.getAlwaysFetchMissingValues();
	}

	public DataSource getDataSource() {
		return item.getDataSource();
	}

	public void setValueTree(Tree valueTree) {
		item.setValueTree(valueTree);
	}

	public void setBrowserSpellCheck(Boolean browserSpellCheck) {
		item.setBrowserSpellCheck(browserSpellCheck);
	}

	public Boolean getBrowserSpellCheck() {
		return item.getBrowserSpellCheck();
	}

	public void setCanEdit(Boolean canEdit) {
		item.setCanEdit(canEdit);
	}

	public void storeValue(Object value) {
		item.storeValue(value);
	}

	public Boolean getCanEdit() {
		return item.getCanEdit();
	}

	public void storeValue(Record value) {
		item.storeValue(value);
	}

	public void setCanFocus(Boolean canFocus) {
		item.setCanFocus(canFocus);
	}

	public void storeValue(RecordList value) {
		item.storeValue(value);
	}

	public Boolean getCanFocus() {
		return item.getCanFocus();
	}

	public void setCellHeight(Integer cellHeight) {
		item.setCellHeight(cellHeight);
	}

	public void setCanEditCriterionPredicate(FormItemCanEditCriterionPredicate predicate) {
		item.setCanEditCriterionPredicate(predicate);
	}

	public Integer getCellHeight() {
		return item.getCellHeight();
	}

	public void setCellStyle(String cellStyle) {
		item.setCellStyle(cellStyle);
	}

	public String getCellStyle() {
		return item.getCellStyle();
	}

	public void setCriterionGetter(FormItemCriterionGetter getter) {
		item.setCriterionGetter(getter);
	}

	public Canvas getContainerWidget() {
		return item.getContainerWidget();
	}

	public void setCriteriaField(String criteriaField) {
		item.setCriteriaField(criteriaField);
	}

	public String getCriteriaField() {
		return item.getCriteriaField();
	}

	public void setCriterionSetter(FormItemCriterionSetter setter) {
		item.setCriterionSetter(setter);
	}

	public void setDataPath(String dataPath) {
		item.setDataPath(dataPath);
	}

	public String getDataPath() {
		return item.getDataPath();
	}

	public void setDateFormatter(DateDisplayFormat dateFormatter) {
		item.setDateFormatter(dateFormatter);
	}

	public DateDisplayFormat getDateFormatter() {
		return item.getDateFormatter();
	}

	public void setDecimalPad(Integer decimalPad) {
		item.setDecimalPad(decimalPad);
	}

	public Integer getDecimalPad() {
		return item.getDecimalPad();
	}

	public void setDecimalPrecision(Integer decimalPrecision) {
		item.setDecimalPrecision(decimalPrecision);
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

	public void setDisabled(Boolean disabled) {
		item.setDisabled(disabled);
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

	public void setEditPendingCSSText(String editPendingCSSText) {
		item.setEditPendingCSSText(editPendingCSSText);
	}

	public String getEditPendingCSSText() {
		return item.getEditPendingCSSText();
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

	public String getIconPrompt() {
		return item.getIconPrompt();
	}

	public void setIconVAlign(VerticalAlignment iconVAlign) {
		item.setIconVAlign(iconVAlign);
	}

	public VerticalAlignment getIconVAlign() {
		return item.getIconVAlign();
	}

	public void setIconWidth(int iconWidth) {
		item.setIconWidth(iconWidth);
	}

	public int getIconWidth() {
		return item.getIconWidth();
	}

	public void setImageURLPrefix(String imageURLPrefix) {
		item.setImageURLPrefix(imageURLPrefix);
	}

	public String getImageURLPrefix() {
		return item.getImageURLPrefix();
	}

	public void setImageURLSuffix(String imageURLSuffix) {
		item.setImageURLSuffix(imageURLSuffix);
	}

	public String getImageURLSuffix() {
		return item.getImageURLSuffix();
	}

	public void setImplicitSave(Boolean implicitSave) {
		item.setImplicitSave(implicitSave);
	}

	public Boolean getImplicitSave() {
		return item.getImplicitSave();
	}

	public void setImplicitSaveOnBlur(Boolean implicitSaveOnBlur) {
		item.setImplicitSaveOnBlur(implicitSaveOnBlur);
	}

	public Boolean getImplicitSaveOnBlur() {
		return item.getImplicitSaveOnBlur();
	}

	public void setInputFormat(String inputFormat) {
		item.setInputFormat(inputFormat);
	}

	public String getInputFormat() {
		return item.getInputFormat();
	}

	public void setLeft(int left) {
		item.setLeft(left);
	}

	public int getLeft() {
		return item.getLeft();
	}

	public void setLocateItemBy(String locateItemBy) {
		item.setLocateItemBy(locateItemBy);
	}

	public String getLocateItemBy() {
		return item.getLocateItemBy();
	}

	public void setMultipleValueSeparator(String multipleValueSeparator) {
		item.setMultipleValueSeparator(multipleValueSeparator);
	}

	public String getMultipleValueSeparator() {
		return item.getMultipleValueSeparator();
	}

	public void setOperator(OperatorId operator) {
		item.setOperator(operator);
	}

	public OperatorId getOperator() {
		return item.getOperator();
	}

	public void setOptionOperationId(String optionOperationId) {
		item.setOptionOperationId(optionOperationId);
	}

	public String getOptionOperationId() {
		return item.getOptionOperationId();
	}

	public void setPickerIconHeight(Integer pickerIconHeight) {
		item.setPickerIconHeight(pickerIconHeight);
	}

	public Integer getPickerIconHeight() {
		return item.getPickerIconHeight();
	}

	public void setPickerIconName(String pickerIconName) {
		item.setPickerIconName(pickerIconName);
	}

	public String getPickerIconName() {
		return item.getPickerIconName();
	}

	public void setPickerIconPrompt(String pickerIconPrompt) {
		item.setPickerIconPrompt(pickerIconPrompt);
	}

	public String getPickerIconPrompt() {
		return item.getPickerIconPrompt();
	}

	public void setPickerIconSrc(String pickerIconSrc) {
		item.setPickerIconSrc(pickerIconSrc);
	}

	public String getPickerIconSrc() {
		return item.getPickerIconSrc();
	}

	public void setPickerIconWidth(Integer pickerIconWidth) {
		item.setPickerIconWidth(pickerIconWidth);
	}

	public Integer getPickerIconWidth() {
		return item.getPickerIconWidth();
	}

	public void setPrintTextBoxStyle(String printTextBoxStyle) {
		item.setPrintTextBoxStyle(printTextBoxStyle);
	}

	public String getPrintTextBoxStyle() {
		return item.getPrintTextBoxStyle();
	}

	public void setPrintTitleStyle(String printTitleStyle) {
		item.setPrintTitleStyle(printTitleStyle);
	}

	public String getPrintTitleStyle() {
		return item.getPrintTitleStyle();
	}

	public void setRedrawOnChange(Boolean redrawOnChange) {
		item.setRedrawOnChange(redrawOnChange);
	}

	public Boolean getRedrawOnChange() {
		return item.getRedrawOnChange();
	}

	public void setRejectInvalidValueOnChange(Boolean rejectInvalidValueOnChange) {
		item.setRejectInvalidValueOnChange(rejectInvalidValueOnChange);
	}

	public Boolean getRejectInvalidValueOnChange() {
		return item.getRejectInvalidValueOnChange();
	}

	public void setRequired(Boolean required) {
		item.setRequired(required);
	}

	public Boolean getRequired() {
		return item.getRequired();
	}

	public void setRequiredMessage(String requiredMessage) {
		item.setRequiredMessage(requiredMessage);
	}

	public String getRequiredMessage() {
		return item.getRequiredMessage();
	}

	public void setRowSpan(int rowSpan) {
		item.setRowSpan(rowSpan);
	}

	public int getRowSpan() {
		return item.getRowSpan();
	}

	public void setSaveOnEnter(Boolean saveOnEnter) {
		item.setSaveOnEnter(saveOnEnter);
	}

	public Boolean getSaveOnEnter() {
		return item.getSaveOnEnter();
	}

	public void setSelectOnFocus(Boolean selectOnFocus) {
		item.setSelectOnFocus(selectOnFocus);
	}

	public Boolean getSelectOnFocus() {
		return item.getSelectOnFocus();
	}

	public void setShowDisabled(Boolean showDisabled) {
		item.setShowDisabled(showDisabled);
	}

	public Boolean getShowDisabled() {
		return item.getShowDisabled();
	}

	public void setShowErrorIcon(Boolean showErrorIcon) {
		item.setShowErrorIcon(showErrorIcon);
	}

	public Boolean getShowErrorIcon() {
		return item.getShowErrorIcon();
	}

	public void setShowErrorStyle(Boolean showErrorStyle) {
		item.setShowErrorStyle(showErrorStyle);
	}

	public Boolean getShowErrorStyle() {
		return item.getShowErrorStyle();
	}

	public void setShowErrorText(Boolean showErrorText) {
		item.setShowErrorText(showErrorText);
	}

	public Boolean getShowErrorText() {
		return item.getShowErrorText();
	}

	public void setShowFocused(Boolean showFocused) {
		item.setShowFocused(showFocused);
	}

	public Boolean getShowFocused() {
		return item.getShowFocused();
	}

	public void setShowFocusedIcons(Boolean showFocusedIcons) {
		item.setShowFocusedIcons(showFocusedIcons);
	}

	public Boolean getShowFocusedIcons() {
		return item.getShowFocusedIcons();
	}

	public void setShowFocusedPickerIcon(Boolean showFocusedPickerIcon) {
		item.setShowFocusedPickerIcon(showFocusedPickerIcon);
	}

	public Boolean getShowFocusedPickerIcon() {
		return item.getShowFocusedPickerIcon();
	}

	public void setShowHint(Boolean showHint) {
		item.setShowHint(showHint);
	}

	public Boolean getShowHint() {
		return item.getShowHint();
	}

	public void setShowIcons(Boolean showIcons) {
		item.setShowIcons(showIcons);
	}

	public Boolean getShowIcons() {
		return item.getShowIcons();
	}

	public void setShowOverIcons(Boolean showOverIcons) {
		item.setShowOverIcons(showOverIcons);
	}

	public Boolean getShowOverIcons() {
		return item.getShowOverIcons();
	}

	public void setShowPickerIcon(Boolean showPickerIcon) {
		item.setShowPickerIcon(showPickerIcon);
	}

	public Boolean getShowPickerIcon() {
		return item.getShowPickerIcon();
	}

	public void setShowTitle(Boolean showTitle) {
		item.setShowTitle(showTitle);
	}

	public Boolean getShowTitle() {
		return item.getShowTitle();
	}

	public void setShowValueIconOnly(Boolean showValueIconOnly) {
		item.setShowValueIconOnly(showValueIconOnly);
	}

	public Boolean getShowValueIconOnly() {
		return item.getShowValueIconOnly();
	}

	public void setStartRow(Boolean startRow) {
		item.setStartRow(startRow);
	}

	public Boolean getStartRow() {
		return item.getStartRow();
	}

	public void setStopOnError(Boolean stopOnError) {
		item.setStopOnError(stopOnError);
	}

	public Boolean getStopOnError() {
		return item.getStopOnError();
	}

	public void setSuppressValueIcon(Boolean suppressValueIcon) {
		item.setSuppressValueIcon(suppressValueIcon);
	}

	public Boolean getSuppressValueIcon() {
		return item.getSuppressValueIcon();
	}

	public void setSynchronousValidation(Boolean synchronousValidation) {
		item.setSynchronousValidation(synchronousValidation);
	}

	public Boolean getSynchronousValidation() {
		return item.getSynchronousValidation();
	}

	public void setTabIndex(Integer tabIndex) {
		item.setTabIndex(tabIndex);
	}

	public Integer getTabIndex() {
		return item.getTabIndex();
	}

	public void setTextAlign(Alignment textAlign) {
		item.setTextAlign(textAlign);
	}

	public Alignment getTextAlign() {
		return item.getTextAlign();
	}

	public void setTextBoxStyle(String textBoxStyle) {
		item.setTextBoxStyle(textBoxStyle);
	}

	public String getTextBoxStyle() {
		return item.getTextBoxStyle();
	}

	public void setTimeFormatter(TimeDisplayFormat timeFormatter) {
		item.setTimeFormatter(timeFormatter);
	}

	public TimeDisplayFormat getTimeFormatter() {
		return item.getTimeFormatter();
	}

	public void setTitle(String title) {
		item.setTitle(title);
	}

	public String getTitle() {
		return item.getTitle();
	}

	public void setTitleAlign(Alignment titleAlign) {
		item.setTitleAlign(titleAlign);
	}

	public Alignment getTitleAlign() {
		return item.getTitleAlign();
	}

	public void setTitleColSpan(int titleColSpan) {
		item.setTitleColSpan(titleColSpan);
	}

	public int getTitleColSpan() {
		return item.getTitleColSpan();
	}

	public void setTitleOrientation(TitleOrientation titleOrientation) {
		item.setTitleOrientation(titleOrientation);
	}

	public TitleOrientation getTitleOrientation() {
		return item.getTitleOrientation();
	}

	public void setTitleStyle(String titleStyle) {
		item.setTitleStyle(titleStyle);
	}

	public String getTitleStyle() {
		return item.getTitleStyle();
	}

	public void setTitleVAlign(VerticalAlignment titleVAlign) {
		item.setTitleVAlign(titleVAlign);
	}

	public VerticalAlignment getTitleVAlign() {
		return item.getTitleVAlign();
	}

	public void setTop(int top) {
		item.setTop(top);
	}

	public int getTop() {
		return item.getTop();
	}

	public void setValidateOnChange(Boolean validateOnChange) {
		item.setValidateOnChange(validateOnChange);
	}

	public Boolean getValidateOnChange() {
		return item.getValidateOnChange();
	}

	public void setValidateOnExit(Boolean validateOnExit) {
		item.setValidateOnExit(validateOnExit);
	}

	public Boolean getValidateOnExit() {
		return item.getValidateOnExit();
	}

	public void setValidOperators(OperatorId... validOperators) {
		item.setValidOperators(validOperators);
	}

	public OperatorId[] getValidOperators() {
		return item.getValidOperators();
	}

	public void setVAlign(VerticalAlignment vAlign) {
		item.setVAlign(vAlign);
	}

	public VerticalAlignment getVAlign() {
		return item.getVAlign();
	}

	public void setValueIconHeight(Integer valueIconHeight) {
		item.setValueIconHeight(valueIconHeight);
	}

	public Integer getValueIconHeight() {
		return item.getValueIconHeight();
	}

	public void setValueIconLeftPadding(int valueIconLeftPadding) {
		item.setValueIconLeftPadding(valueIconLeftPadding);
	}

	public int getValueIconLeftPadding() {
		return item.getValueIconLeftPadding();
	}

	public void setValueIconRightPadding(int valueIconRightPadding) {
		item.setValueIconRightPadding(valueIconRightPadding);
	}

	public int getValueIconRightPadding() {
		return item.getValueIconRightPadding();
	}

	public void setValueIconSize(int valueIconSize) {
		item.setValueIconSize(valueIconSize);
	}

	public int getValueIconSize() {
		return item.getValueIconSize();
	}

	public void setValueIconWidth(Integer valueIconWidth) {
		item.setValueIconWidth(valueIconWidth);
	}

	public Integer getValueIconWidth() {
		return item.getValueIconWidth();
	}

	public void setVisible(Boolean visible) {
		item.setVisible(visible);
	}

	public Boolean getVisible() {
		return item.getVisible();
	}

	public void setWidth(int width) {
		item.setWidth(width);
	}

	public int getWidth() {
		return item.getWidth();
	}

	public void setWrapTitle(Boolean wrapTitle) {
		item.setWrapTitle(wrapTitle);
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

	public void hide() {
		item.hide();
	}

	public void hideIcon(String icon) {
		item.hideIcon(icon);
	}

	public HandlerRegistration addIconClickHandler(IconClickHandler handler) {
		return item.addIconClickHandler(handler);
	}

	public HandlerRegistration addIconKeyPressHandler(IconKeyPressHandler handler) {
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

	public HandlerRegistration addPickerIconClickHandler(PickerIconClickHandler handler) {
		return item.addPickerIconClickHandler(handler);
	}

	public void stopHover() {
		item.stopHover();
	}

	public HandlerRegistration addTitleClickHandler(TitleClickHandler handler) {
		return item.addTitleClickHandler(handler);
	}

	public HandlerRegistration addTitleDoubleClickHandler(TitleDoubleClickHandler handler) {
		return item.addTitleDoubleClickHandler(handler);
	}

	public HandlerRegistration addTitleHoverHandler(TitleHoverHandler handler) {
		return item.addTitleHoverHandler(handler);
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

	public void setName(String name) {
		item.setName(name);
	}

	public String getName() {
		return item.getName();
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

	public String getType() {
		return item.getType();
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

	public void setValue(int value) {
		item.setValue(value);
	}

	public void setValue(float value) {
		item.setValue(value);
	}

	public void setValue(double value) {
		item.setValue(value);
	}

	public void setValue(Date value) {
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

	public void redraw() {
		item.redraw();
	}

	public Rectangle getIconRect(FormItemIcon icon) {
		return item.getIconRect(icon);
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

	public String getTooltip() {
		return item.getTooltip();
	}

	public void setOptionFilterContext(RPCRequest rpcRequestProperties) {
		item.setOptionFilterContext(rpcRequestProperties);
	}

	public RPCRequest getOptionFilterContext() {
		return item.getOptionFilterContext();
	}

	public void setOptionCriteria(Criteria optionCriteria) {
		item.setOptionCriteria(optionCriteria);
	}

	public Criteria getOptionCriteria() {
		return item.getOptionCriteria();
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

	public Object getValue() {
		return item.getValue();
	}

	public Object _getValue() {
		return item._getValue();
	}

	public void showPicker() {
		item.showPicker();
	}

	public void setValueFormatter(FormItemValueFormatter formatter) {
		item.setValueFormatter(formatter);
	}

	public void setEditorValueFormatter(FormItemValueFormatter formatter) {
		item.setEditorValueFormatter(formatter);
	}

	public void setEditorValueParser(FormItemValueParser valueParser) {
		item.setEditorValueParser(valueParser);
	}

	public void setValueIconMapper(ValueIconMapper valueIconMapper) {
		item.setValueIconMapper(valueIconMapper);
	}

	public void setDisplayFormat(DateDisplayFormat displayFormat) {
		item.setDisplayFormat(displayFormat);
	}

	public void setDisplayFormat(TimeFormatter displayFormat) {
		item.setDisplayFormat(displayFormat);
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

	public final Criterion getCriterion() {
		return item.getCriterion();
	}

	public final Criterion getCriterion(TextMatchStyle textMatchStyle) {
		return item.getCriterion(textMatchStyle);
	}

	public final void setCriterion(Criterion criterion) {
		item.setCriterion(criterion);
	}
	
}
