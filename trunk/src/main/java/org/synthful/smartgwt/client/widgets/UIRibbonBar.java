package org.synthful.smartgwt.client.widgets;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.logical.shared.AttachEvent.Handler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.core.Function;
import com.smartgwt.client.core.Rectangle;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.AnimationAcceleration;
import com.smartgwt.client.types.AnimationEffect;
import com.smartgwt.client.types.BackgroundRepeat;
import com.smartgwt.client.types.ClickMaskMode;
import com.smartgwt.client.types.Cursor;
import com.smartgwt.client.types.DragAppearance;
import com.smartgwt.client.types.DragIntersectStyle;
import com.smartgwt.client.types.DrawPosition;
import com.smartgwt.client.types.EdgeName;
import com.smartgwt.client.types.LayoutPolicy;
import com.smartgwt.client.types.LayoutResizeBarPolicy;
import com.smartgwt.client.types.LocatorStrategy;
import com.smartgwt.client.types.LocatorTypeStrategy;
import com.smartgwt.client.types.Overflow;
import com.smartgwt.client.types.PercentBoxModel;
import com.smartgwt.client.types.Positioning;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.types.Visibility;
import com.smartgwt.client.util.PrintHTMLCallback;
import com.smartgwt.client.util.PrintProperties;
import com.smartgwt.client.widgets.AnimationCallback;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.events.DoubleClickHandler;
import com.smartgwt.client.widgets.events.DragMoveHandler;
import com.smartgwt.client.widgets.events.DragRepositionMoveHandler;
import com.smartgwt.client.widgets.events.DragRepositionStartHandler;
import com.smartgwt.client.widgets.events.DragRepositionStopHandler;
import com.smartgwt.client.widgets.events.DragResizeMoveHandler;
import com.smartgwt.client.widgets.events.DragResizeStartHandler;
import com.smartgwt.client.widgets.events.DragResizeStopHandler;
import com.smartgwt.client.widgets.events.DragStartHandler;
import com.smartgwt.client.widgets.events.DragStopHandler;
import com.smartgwt.client.widgets.events.DrawHandler;
import com.smartgwt.client.widgets.events.DropHandler;
import com.smartgwt.client.widgets.events.DropMoveHandler;
import com.smartgwt.client.widgets.events.DropOutHandler;
import com.smartgwt.client.widgets.events.DropOverHandler;
import com.smartgwt.client.widgets.events.FocusChangedHandler;
import com.smartgwt.client.widgets.events.HoverHandler;
import com.smartgwt.client.widgets.events.HoverHiddenHandler;
import com.smartgwt.client.widgets.events.KeyDownHandler;
import com.smartgwt.client.widgets.events.KeyPressHandler;
import com.smartgwt.client.widgets.events.MouseDownHandler;
import com.smartgwt.client.widgets.events.MouseMoveHandler;
import com.smartgwt.client.widgets.events.MouseOutHandler;
import com.smartgwt.client.widgets.events.MouseOverHandler;
import com.smartgwt.client.widgets.events.MouseStillDownHandler;
import com.smartgwt.client.widgets.events.MouseUpHandler;
import com.smartgwt.client.widgets.events.MouseWheelHandler;
import com.smartgwt.client.widgets.events.MovedHandler;
import com.smartgwt.client.widgets.events.ParentMovedHandler;
import com.smartgwt.client.widgets.events.ResizedHandler;
import com.smartgwt.client.widgets.events.RightMouseDownHandler;
import com.smartgwt.client.widgets.events.ScrolledHandler;
import com.smartgwt.client.widgets.events.ShowContextMenuHandler;
import com.smartgwt.client.widgets.events.VisibilityChangedHandler;
import com.smartgwt.client.widgets.form.ValuesManager;
import com.smartgwt.client.widgets.form.fields.CanvasItem;
import com.smartgwt.client.widgets.form.fields.FormItem;
import com.smartgwt.client.widgets.menu.Menu;
import com.smartgwt.client.widgets.toolbar.RibbonBar;
import com.smartgwt.client.widgets.toolbar.RibbonGroup;
import com.smartgwt.client.widgets.toolbar.ToolStripButton;
import com.smartgwt.client.widgets.toolbar.ToolStripMenuButton;
import com.smartgwt.client.widgets.toolbar.ToolStripSpacer;
import com.smartgwt.logicalstructure.core.LogicalStructureObject;
import com.smartgwt.logicalstructure.widgets.CanvasLogicalStructure;
import com.smartgwt.logicalstructure.widgets.layout.LayoutLogicalStructure;
import com.smartgwt.logicalstructure.widgets.toolbar.RibbonBarLogicalStructure;
import com.smartgwt.logicalstructure.widgets.toolbar.ToolStripLogicalStructure;

public class UIRibbonBar
	extends RibbonBar{
	
	private RibbonBar item;

	public void setJavaScriptObject(JavaScriptObject jsObj) {
		item.setJavaScriptObject(jsObj);
	}

	public void setScClassName(String scClassName) {
		item.setScClassName(scClassName);
	}

	public void setGroupTitleAlign(Alignment groupTitleAlign)
			throws IllegalStateException {
		item.setGroupTitleAlign(groupTitleAlign);
	}

	public void setLayoutData(Object layoutData) {
		item.setLayoutData(layoutData);
	}

	public void setConfigOnly(boolean configOnly) {
		item.setConfigOnly(configOnly);
	}

	public void setGroupTitleOrientation(VerticalAlignment groupTitleOrientation)
			throws IllegalStateException {
		item.setGroupTitleOrientation(groupTitleOrientation);
	}

	public void sinkEvents(int eventBitsToAdd) {
		item.sinkEvents(eventBitsToAdd);
	}

	public LogicalStructureObject setLogicalStructure(
			RibbonBarLogicalStructure s) {
		return item.setLogicalStructure(s);
	}

	public void setCanDropComponents(Boolean canDropComponents)
			throws IllegalStateException {
		item.setCanDropComponents(canDropComponents);
	}

	public void setResizeBarClass(String resizeBarClass)
			throws IllegalStateException {
		item.setResizeBarClass(resizeBarClass);
	}

	public void setResizeBarSize(int resizeBarSize)
			throws IllegalStateException {
		item.setResizeBarSize(resizeBarSize);
	}

	public void setSeparatorClass(String separatorClass)
			throws IllegalStateException {
		item.setSeparatorClass(separatorClass);
	}

	public void setSeparatorSize(int separatorSize)
			throws IllegalStateException {
		item.setSeparatorSize(separatorSize);
	}

	public void setShowGroupTitle(Boolean showGroupTitle)
			throws IllegalStateException {
		item.setShowGroupTitle(showGroupTitle);
	}

	public void setPosition(String position) {
		item.setPosition(position);
	}

	public void setHtmlElement(Element element) {
		item.setHtmlElement(element);
	}

	public void setID(String id) {
		item.setID(id);
	}

	public void setConfig(JavaScriptObject config) {
		item.setConfig(config);
	}

	public void setVerticalStyleName(String verticalStyleName)
			throws IllegalStateException {
		item.setVerticalStyleName(verticalStyleName);
	}

	public void setDefaultResizeBars(LayoutResizeBarPolicy defaultResizeBars) {
		item.setDefaultResizeBars(defaultResizeBars);
	}

	public void setDropLineThickness(int dropLineThickness)
			throws IllegalStateException {
		item.setDropLineThickness(dropLineThickness);
	}

	public void setEnforcePolicy(Boolean enforcePolicy) {
		item.setEnforcePolicy(enforcePolicy);
	}

	public void setHPolicy(LayoutPolicy hPolicy) {
		item.setHPolicy(hPolicy);
	}

	public void setLayoutBottomMargin(Integer layoutBottomMargin) {
		item.setLayoutBottomMargin(layoutBottomMargin);
	}

	public void setLayoutLeftMargin(Integer layoutLeftMargin) {
		item.setLayoutLeftMargin(layoutLeftMargin);
	}

	public void setLayoutMargin(Integer layoutMargin) {
		item.setLayoutMargin(layoutMargin);
	}

	public LogicalStructureObject setLogicalStructure(
			ToolStripLogicalStructure s) {
		return item.setLogicalStructure(s);
	}

	public void setPixelSize(int width, int height) {
		item.setPixelSize(width, height);
	}

	public void setSize(String width, String height) {
		item.setSize(width, height);
	}

	public void setLayoutRightMargin(Integer layoutRightMargin) {
		item.setLayoutRightMargin(layoutRightMargin);
	}

	public void setStyleDependentName(String styleSuffix, boolean add) {
		item.setStyleDependentName(styleSuffix, add);
	}

	public void setStyleName(String style, boolean add) {
		item.setStyleName(style, add);
	}

	public void setLayoutTopMargin(Integer layoutTopMargin) {
		item.setLayoutTopMargin(layoutTopMargin);
	}

	public void setStylePrimaryName(String style) {
		item.setStylePrimaryName(style);
	}

	public void setLeaveScrollbarGap(Boolean leaveScrollbarGap)
			throws IllegalStateException {
		item.setLeaveScrollbarGap(leaveScrollbarGap);
	}

	public void setLocateMembersBy(LocatorStrategy locateMembersBy) {
		item.setLocateMembersBy(locateMembersBy);
	}

	public void sinkBitlessEvent(String eventTypeName) {
		item.sinkBitlessEvent(eventTypeName);
	}

	public void setLocateMembersType(LocatorTypeStrategy locateMembersType) {
		item.setLocateMembersType(locateMembersType);
	}

	public void unsinkEvents(int eventBitsToRemove) {
		item.unsinkEvents(eventBitsToRemove);
	}

	public void setManagePercentBreadth(Boolean managePercentBreadth)
			throws IllegalStateException {
		item.setManagePercentBreadth(managePercentBreadth);
	}

	public void setMemberOverlap(int memberOverlap)
			throws IllegalStateException {
		item.setMemberOverlap(memberOverlap);
	}

	public void setMembersMargin(int membersMargin) {
		item.setMembersMargin(membersMargin);
	}

	public void setNullProperty(String property) {
		item.setNullProperty(property);
	}

	public void setMinMemberSize(int minMemberSize)
			throws IllegalStateException {
		item.setMinMemberSize(minMemberSize);
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

	public void setOverflow(Overflow overflow) throws IllegalStateException {
		item.setOverflow(overflow);
	}

	public void setProperty(String property, float value) {
		item.setProperty(property, value);
	}

	public void setProperty(String property, double value) {
		item.setProperty(property, value);
	}

	public void setProperty(String property, Element value) {
		item.setProperty(property, value);
	}

	public void setProperty(String property, JavaScriptObject value) {
		item.setProperty(property, value);
	}

	public void setPaddingAsLayoutMargin(Boolean paddingAsLayoutMargin) {
		item.setPaddingAsLayoutMargin(paddingAsLayoutMargin);
	}

	public String toString() {
		return item.toString();
	}

	public LogicalStructureObject setLogicalStructure(LogicalStructureObject s) {
		return item.setLogicalStructure(s);
	}

	public void setReverseOrder(Boolean reverseOrder) {
		item.setReverseOrder(reverseOrder);
	}

	public void setCanDragReposition(Boolean canDragReposition) {
		item.setCanDragReposition(canDragReposition);
	}

	public void setShowDragPlaceHolder(Boolean showDragPlaceHolder) {
		item.setShowDragPlaceHolder(showDragPlaceHolder);
	}

	public void setCanDragResize(Boolean canDragResize) {
		item.setCanDragResize(canDragResize);
	}

	public void setShowDropLines(Boolean showDropLines) {
		item.setShowDropLines(showDropLines);
	}

	public void setCanDragScroll(Boolean canDragScroll) {
		item.setCanDragScroll(canDragScroll);
	}

	public void setStackZIndex(String stackZIndex) throws IllegalStateException {
		item.setStackZIndex(stackZIndex);
	}

	public void setCanDrop(Boolean canDrop) {
		item.setCanDrop(canDrop);
	}

	public void setVertical(Boolean vertical) {
		item.setVertical(vertical);
	}

	public void setCanDropBefore(Boolean canDropBefore) {
		item.setCanDropBefore(canDropBefore);
	}

	public void setVPolicy(LayoutPolicy vPolicy) {
		item.setVPolicy(vPolicy);
	}

	public void setCanFocus(Boolean canFocus) {
		item.setCanFocus(canFocus);
	}

	public void setCanHover(Boolean canHover) {
		item.setCanHover(canHover);
	}

	public void setCanSelectText(Boolean canSelectText) {
		item.setCanSelectText(canSelectText);
	}

	public void setCanvasItem(CanvasItem canvasItem)
			throws IllegalStateException {
		item.setCanvasItem(canvasItem);
	}

	public void setChildrenSnapResizeToGrid(Boolean childrenSnapResizeToGrid) {
		item.setChildrenSnapResizeToGrid(childrenSnapResizeToGrid);
	}

	public void setChildrenSnapToGrid(Boolean childrenSnapToGrid) {
		item.setChildrenSnapToGrid(childrenSnapToGrid);
	}

	public void setContents(String contents) {
		item.setContents(contents);
	}

	public void setContextMenu(Menu contextMenu) {
		item.setContextMenu(contextMenu);
	}

	public void setVisibleMember(Canvas member) {
		item.setVisibleMember(member);
	}

	public void setCursor(Cursor cursor) {
		item.setCursor(cursor);
	}

	public void setDataPath(String dataPath) {
		item.setDataPath(dataPath);
	}

	public void setMembers(Canvas... members) {
		item.setMembers(members);
	}

	public void setPlaceHolderProperties(Canvas placeHolderProperties)
			throws IllegalStateException {
		item.setPlaceHolderProperties(placeHolderProperties);
	}

	public void setPlaceHolderDefaults(Canvas placeHolderDefaults)
			throws IllegalStateException {
		item.setPlaceHolderDefaults(placeHolderDefaults);
	}

	public void setDefaultLayoutAlign(Alignment alignment)
			throws IllegalStateException {
		item.setDefaultLayoutAlign(alignment);
	}

	public void setDefaultLayoutAlign(VerticalAlignment alignment)
			throws IllegalStateException {
		item.setDefaultLayoutAlign(alignment);
	}

	public void setDropLineProperties(Canvas dropLineProperties)
			throws IllegalStateException {
		item.setDropLineProperties(dropLineProperties);
	}

	public void showMember(Canvas member) {
		item.showMember(member);
	}

	public void showMember(Canvas member, Function callback) {
		item.showMember(member, callback);
	}

	public void setDefaultHeight(int defaultHeight) {
		item.setDefaultHeight(defaultHeight);
	}

	public void setDefaultWidth(int defaultWidth) {
		item.setDefaultWidth(defaultWidth);
	}

	public void setDisabledCursor(Cursor disabledCursor) {
		item.setDisabledCursor(disabledCursor);
	}

	public LogicalStructureObject setLogicalStructure(LayoutLogicalStructure s) {
		return item.setLogicalStructure(s);
	}

	public void setDoubleClickDelay(int doubleClickDelay) {
		item.setDoubleClickDelay(doubleClickDelay);
	}

	public void setDragAppearance(DragAppearance dragAppearance) {
		item.setDragAppearance(dragAppearance);
	}

	public void setDragIntersectStyle(DragIntersectStyle dragIntersectStyle) {
		item.setDragIntersectStyle(dragIntersectStyle);
	}

	public void setDragOpacity(Integer dragOpacity) {
		item.setDragOpacity(dragOpacity);
	}

	public void setDragRepositionAppearance(
			DragAppearance dragRepositionAppearance) {
		item.setDragRepositionAppearance(dragRepositionAppearance);
	}

	public void setDragRepositionCursor(Cursor dragRepositionCursor) {
		item.setDragRepositionCursor(dragRepositionCursor);
	}

	public void setDragResizeAppearance(DragAppearance dragResizeAppearance) {
		item.setDragResizeAppearance(dragResizeAppearance);
	}

	public void setDragScrollDelay(int dragScrollDelay) {
		item.setDragScrollDelay(dragScrollDelay);
	}

	public void setDragStartDistance(int dragStartDistance) {
		item.setDragStartDistance(dragStartDistance);
	}

	public void setDragType(String dragType) {
		item.setDragType(dragType);
	}

	public void setDynamicContents(Boolean dynamicContents) {
		item.setDynamicContents(dynamicContents);
	}

	public void setEdgeBackgroundColor(String edgeBackgroundColor)
			throws IllegalStateException {
		item.setEdgeBackgroundColor(edgeBackgroundColor);
	}

	public void setEdgeCenterBackgroundColor(String edgeCenterBackgroundColor)
			throws IllegalStateException {
		item.setEdgeCenterBackgroundColor(edgeCenterBackgroundColor);
	}

	public void setEdgeImage(String edgeImage) throws IllegalStateException {
		item.setEdgeImage(edgeImage);
	}

	public void setEdgeMarginSize(int edgeMarginSize) {
		item.setEdgeMarginSize(edgeMarginSize);
	}

	public void setEdgeOffset(Integer edgeOffset) throws IllegalStateException {
		item.setEdgeOffset(edgeOffset);
	}

	public void setEdgeOpacity(Integer edgeOpacity)
			throws IllegalStateException {
		item.setEdgeOpacity(edgeOpacity);
	}

	public void setEdgeShowCenter(Boolean edgeShowCenter)
			throws IllegalStateException {
		item.setEdgeShowCenter(edgeShowCenter);
	}

	public void setEdgeSize(int edgeSize) throws IllegalStateException {
		item.setEdgeSize(edgeSize);
	}

	public void setExtraSpace(int extraSpace) throws IllegalStateException {
		item.setExtraSpace(extraSpace);
	}

	public void setHoverAlign(Alignment hoverAlign) {
		item.setHoverAlign(hoverAlign);
	}

	public void setHoverAutoDestroy(Boolean hoverAutoDestroy) {
		item.setHoverAutoDestroy(hoverAutoDestroy);
	}

	public void setHoverDelay(int hoverDelay) {
		item.setHoverDelay(hoverDelay);
	}

	public void setHoverHeight(Integer hoverHeight) {
		item.setHoverHeight(hoverHeight);
	}

	public void setHoverMoveWithMouse(Boolean hoverMoveWithMouse) {
		item.setHoverMoveWithMouse(hoverMoveWithMouse);
	}

	public void setHoverOpacity(Integer hoverOpacity) {
		item.setHoverOpacity(hoverOpacity);
	}

	public void setHoverStyle(String hoverStyle) {
		item.setHoverStyle(hoverStyle);
	}

	public void setHoverVAlign(VerticalAlignment hoverVAlign) {
		item.setHoverVAlign(hoverVAlign);
	}

	public void setHoverWidth(Integer hoverWidth) {
		item.setHoverWidth(hoverWidth);
	}

	public void setHoverWrap(Boolean hoverWrap) {
		item.setHoverWrap(hoverWrap);
	}

	public void setHtmlPosition(DrawPosition htmlPosition) {
		item.setHtmlPosition(htmlPosition);
	}

	public void setKeepInParentRect(Boolean keepInParentRect) {
		item.setKeepInParentRect(keepInParentRect);
	}

	public void setKeepInParentRect(Integer... keepInParentRect) {
		item.setKeepInParentRect(keepInParentRect);
	}

	public void setLayoutAlign(Alignment layoutAlign)
			throws IllegalStateException {
		item.setLayoutAlign(layoutAlign);
	}

	public void setLayoutAlign(VerticalAlignment layoutAlign)
			throws IllegalStateException {
		item.setLayoutAlign(layoutAlign);
	}

	public void setLocateChildrenBy(LocatorStrategy locateChildrenBy) {
		item.setLocateChildrenBy(locateChildrenBy);
	}

	public void setLocateChildrenType(LocatorTypeStrategy locateChildrenType) {
		item.setLocateChildrenType(locateChildrenType);
	}

	public void setLocatePeersBy(LocatorStrategy locatePeersBy) {
		item.setLocatePeersBy(locatePeersBy);
	}

	public void setLocatePeersType(LocatorTypeStrategy locatePeersType) {
		item.setLocatePeersType(locatePeersType);
	}

	public void setMargin(Integer margin) {
		item.setMargin(margin);
	}

	public void setMatchElement(Boolean matchElement) {
		item.setMatchElement(matchElement);
	}

	public void setMaxHeight(int maxHeight) {
		item.setMaxHeight(maxHeight);
	}

	public void setMaxWidth(int maxWidth) {
		item.setMaxWidth(maxWidth);
	}

	public void setMenuConstructor(String menuConstructor)
			throws IllegalStateException {
		item.setMenuConstructor(menuConstructor);
	}

	public void setMinHeight(int minHeight) {
		item.setMinHeight(minHeight);
	}

	public void setMinWidth(int minWidth) {
		item.setMinWidth(minWidth);
	}

	public void setMouseStillDownDelay(int mouseStillDownDelay) {
		item.setMouseStillDownDelay(mouseStillDownDelay);
	}

	public void setMouseStillDownInitialDelay(int mouseStillDownInitialDelay) {
		item.setMouseStillDownInitialDelay(mouseStillDownInitialDelay);
	}

	public void setNoDoubleClicks(Boolean noDoubleClicks) {
		item.setNoDoubleClicks(noDoubleClicks);
	}

	public void setOpacity(Integer opacity) {
		item.setOpacity(opacity);
	}

	public void setPadding(Integer padding) {
		item.setPadding(padding);
	}

	public void setPeers(Canvas... peers) throws IllegalStateException {
		item.setPeers(peers);
	}

	public void setPercentBox(PercentBoxModel percentBox)
			throws IllegalStateException {
		item.setPercentBox(percentBox);
	}

	public void setPercentSource(Canvas percentSource) {
		item.setPercentSource(percentSource);
	}

	public void setPosition(Positioning position) {
		item.setPosition(position);
	}

	public void setPrintChildrenAbsolutelyPositioned(
			Boolean printChildrenAbsolutelyPositioned) {
		item.setPrintChildrenAbsolutelyPositioned(printChildrenAbsolutelyPositioned);
	}

	public void setPrompt(String prompt) {
		item.setPrompt(prompt);
	}

	public void setRedrawOnResize(Boolean redrawOnResize) {
		item.setRedrawOnResize(redrawOnResize);
	}

	public void setResizeBarTarget(String resizeBarTarget)
			throws IllegalStateException {
		item.setResizeBarTarget(resizeBarTarget);
	}

	public void setResizeFrom(EdgeName... resizeFrom) {
		item.setResizeFrom(resizeFrom);
	}

	public void setScrollbarSize(int scrollbarSize) {
		item.setScrollbarSize(scrollbarSize);
	}

	public void setShadowDepth(int shadowDepth) throws IllegalStateException {
		item.setShadowDepth(shadowDepth);
	}

	public void setShadowImage(String shadowImage) throws IllegalStateException {
		item.setShadowImage(shadowImage);
	}

	public void setShadowOffset(Integer shadowOffset) {
		item.setShadowOffset(shadowOffset);
	}

	public void setShadowSoftness(Integer shadowSoftness) {
		item.setShadowSoftness(shadowSoftness);
	}

	public void setShouldPrint(Boolean shouldPrint) {
		item.setShouldPrint(shouldPrint);
	}

	public void setShowCustomScrollbars(Boolean showCustomScrollbars) {
		item.setShowCustomScrollbars(showCustomScrollbars);
	}

	public void setShowDragShadow(Boolean showDragShadow) {
		item.setShowDragShadow(showDragShadow);
	}

	public void setShowEdges(Boolean showEdges) throws IllegalStateException {
		item.setShowEdges(showEdges);
	}

	public void setShowHover(Boolean showHover) {
		item.setShowHover(showHover);
	}

	public void setShowHoverComponents(Boolean showHoverComponents) {
		item.setShowHoverComponents(showHoverComponents);
	}

	public void setShowResizeBar(Boolean showResizeBar) {
		item.setShowResizeBar(showResizeBar);
	}

	public void setShowShadow(Boolean showShadow) throws IllegalStateException {
		item.setShowShadow(showShadow);
	}

	public void setSkinImgDir(String skinImgDir) {
		item.setSkinImgDir(skinImgDir);
	}

	public void setSnapAxis(String snapAxis) {
		item.setSnapAxis(snapAxis);
	}

	public void setSnapEdge(String snapEdge) {
		item.setSnapEdge(snapEdge);
	}

	public void setSnapHDirection(String snapHDirection) {
		item.setSnapHDirection(snapHDirection);
	}

	public void setSnapHGap(int snapHGap) {
		item.setSnapHGap(snapHGap);
	}

	public void setSnapOffsetLeft(Integer snapOffsetLeft) {
		item.setSnapOffsetLeft(snapOffsetLeft);
	}

	public void setSnapOffsetTop(Integer snapOffsetTop) {
		item.setSnapOffsetTop(snapOffsetTop);
	}

	public void setSnapOnDrop(Boolean snapOnDrop) {
		item.setSnapOnDrop(snapOnDrop);
	}

	public void setSnapResizeToGrid(Boolean snapResizeToGrid) {
		item.setSnapResizeToGrid(snapResizeToGrid);
	}

	public void setSnapTo(String snapTo) {
		item.setSnapTo(snapTo);
	}

	public void setSnapToGrid(Boolean snapToGrid) {
		item.setSnapToGrid(snapToGrid);
	}

	public void setSnapVDirection(String snapVDirection) {
		item.setSnapVDirection(snapVDirection);
	}

	public void setSnapVGap(int snapVGap) {
		item.setSnapVGap(snapVGap);
	}

	public void setStyleName(String styleName) {
		item.setStyleName(styleName);
	}

	public void setTabIndex(Integer tabIndex) {
		item.setTabIndex(tabIndex);
	}

	public void setUseBackMask(Boolean useBackMask) {
		item.setUseBackMask(useBackMask);
	}

	public void setUseOpacityFilter(Boolean useOpacityFilter)
			throws IllegalStateException {
		item.setUseOpacityFilter(useOpacityFilter);
	}

	public void setValuesManager(ValuesManager valuesManager) {
		item.setValuesManager(valuesManager);
	}

	public void setVisibility(Visibility visibility) {
		item.setVisibility(visibility);
	}

	public void setImage(String identifier, String URL) {
		item.setImage(identifier, URL);
	}

	public void setImage(String identifier, String URL, String imgDir) {
		item.setImage(identifier, URL, imgDir);
	}

	public void setPageLeft(int left) {
		item.setPageLeft(left);
	}

	public void setPageTop(int top) {
		item.setPageTop(top);
	}

	public void setRight(int right) {
		item.setRight(right);
	}

	public void shouldDragScroll() {
		item.shouldDragScroll();
	}

	public void show() {
		item.show();
	}

	public void showNextTo(Canvas otherWidget) {
		item.showNextTo(otherWidget);
	}

	public void showNextTo(Canvas otherWidget, String side) {
		item.showNextTo(otherWidget, side);
	}

	public void showRecursively() {
		item.showRecursively();
	}

	public void updateHover() {
		item.updateHover();
	}

	public void updateHover(String hoverHTML) {
		item.updateHover(hoverHTML);
	}

	public void setVisible(boolean visible) {
		item.setVisible(visible);
	}

	public void setHeight(int height) {
		item.setHeight(height);
	}

	public void setHeight100() {
		item.setHeight100();
	}

	public void setWidth100() {
		item.setWidth100();
	}

	public void setHeight(String height) {
		item.setHeight(height);
	}

	public void setTitle(String title) {
		item.setTitle(title);
	}

	public void setTooltip(String tooltip) {
		item.setTooltip(tooltip);
	}

	public void setWidth(int width) {
		item.setWidth(width);
	}

	public void setWidth(String width) {
		item.setWidth(width);
	}

	public void setLeft(int left) {
		item.setLeft(left);
	}

	public void setLeft(String left) {
		item.setLeft(left);
	}

	public void setTop(int top) {
		item.setTop(top);
	}

	public void setFacetId(String facetId) {
		item.setFacetId(facetId);
	}

	public void setTop(String top) {
		item.setTop(top);
	}

	public void setDisabled(boolean disabled) {
		item.setDisabled(disabled);
	}

	public void setDragTarget(Canvas dragTarget) {
		item.setDragTarget(dragTarget);
	}

	public Boolean willAcceptDrop() {
		return item.willAcceptDrop();
	}

	public void setGroupTitle(String groupTitle) {
		item.setGroupTitle(groupTitle);
	}

	public void setIsGroup(Boolean isGroup) {
		item.setIsGroup(isGroup);
	}

	public void setSmoothFade(Boolean smoothFade) throws IllegalStateException {
		item.setSmoothFade(smoothFade);
	}

	public void setKeepInParentRect(Rectangle rectangle) {
		item.setKeepInParentRect(rectangle);
	}

	public void setPrefix(String prefix) {
		item.setPrefix(prefix);
	}

	public void setResizeFrom(String... resizeFrom) {
		item.setResizeFrom(resizeFrom);
	}

	public void setDropTypes(String... dropTypes) {
		item.setDropTypes(dropTypes);
	}

	public void updateShadow() {
		item.updateShadow();
	}

	public void setZIndex(int newIndex) {
		item.setZIndex(newIndex);
	}

	public void setRect(Rectangle rectangle) {
		item.setRect(rectangle);
	}

	public void setRect(int left, int top, int width, int height) {
		item.setRect(left, top, width, height);
	}

	public void setParentElement(Canvas parentElement)
			throws IllegalStateException {
		item.setParentElement(parentElement);
	}

	public void setChildren(Canvas... children) {
		item.setChildren(children);
	}

	public String showClickMask(Function clickActionCallback,
			ClickMaskMode mode, Canvas[] unmaskedTargets) {
		return item.showClickMask(clickActionCallback, mode, unmaskedTargets);
	}

	public Boolean visibleAtPoint(int x, int y, boolean withinViewport,
			Canvas ignoreWidgets, Canvas upToParent) {
		return item.visibleAtPoint(x, y, withinViewport, ignoreWidgets,
				upToParent);
	}

	public LogicalStructureObject setLogicalStructure(CanvasLogicalStructure s) {
		return item.setLogicalStructure(s);
	}

	public String getScClassName() {
		return item.getScClassName();
	}

	public Widget getParent() {
		return item.getParent();
	}

	public boolean isAttached() {
		return item.isAttached();
	}

	public void onBrowserEvent(Event event) {
		item.onBrowserEvent(event);
	}

	public void removeFromParent() {
		item.removeFromParent();
	}

	public void setAnimateMembers(Boolean animateMembers) {
		item.setAnimateMembers(animateMembers);
	}

	public void setAccessKey(String accessKey) {
		item.setAccessKey(accessKey);
	}

	public boolean isConfigOnly() {
		return item.isConfigOnly();
	}

	public void setAnimateMemberTime(Integer animateMemberTime) {
		item.setAnimateMemberTime(animateMemberTime);
	}

	public LogicalStructureObject getLogicalStructure() {
		return item.getLogicalStructure();
	}

	public void setAnimateAcceleration(AnimationAcceleration animateAcceleration) {
		item.setAnimateAcceleration(animateAcceleration);
	}

	public String getResizeBarClass() {
		return item.getResizeBarClass();
	}

	public void setAnimateFadeTime(Integer animateFadeTime) {
		item.setAnimateFadeTime(animateFadeTime);
	}

	public int getResizeBarSize() {
		return item.getResizeBarSize();
	}

	public void setAnimateHideAcceleration(
			AnimationAcceleration animateHideAcceleration) {
		item.setAnimateHideAcceleration(animateHideAcceleration);
	}

	public String getSeparatorClass() {
		return item.getSeparatorClass();
	}

	public int getSeparatorSize() {
		return item.getSeparatorSize();
	}

	public void setAnimateHideTime(Integer animateHideTime) {
		item.setAnimateHideTime(animateHideTime);
	}

	public void setAnimateMoveAcceleration(
			AnimationAcceleration animateMoveAcceleration) {
		item.setAnimateMoveAcceleration(animateMoveAcceleration);
	}

	public Boolean getShowGroupTitle() {
		return item.getShowGroupTitle();
	}

	public boolean isCreated() {
		return item.isCreated();
	}

	public void setAnimateMoveTime(Integer animateMoveTime) {
		item.setAnimateMoveTime(animateMoveTime);
	}

	public Boolean getVertical() {
		return item.getVertical();
	}

	public JavaScriptObject getOrCreateJsObj() {
		return item.getOrCreateJsObj();
	}

	public void setAnimateRectAcceleration(
			AnimationAcceleration animateRectAcceleration) {
		item.setAnimateRectAcceleration(animateRectAcceleration);
	}

	public String getVerticalStyleName() {
		return item.getVerticalStyleName();
	}

	public void setAnimateRectTime(Integer animateRectTime) {
		item.setAnimateRectTime(animateRectTime);
	}

	public void setAnimateResizeAcceleration(
			AnimationAcceleration animateResizeAcceleration) {
		item.setAnimateResizeAcceleration(animateResizeAcceleration);
	}

	public void setAnimateResizeTime(Integer animateResizeTime) {
		item.setAnimateResizeTime(animateResizeTime);
	}

	public void setAnimateScrollAcceleration(
			AnimationAcceleration animateScrollAcceleration) {
		item.setAnimateScrollAcceleration(animateScrollAcceleration);
	}

	public void setAnimateScrollTime(Integer animateScrollTime) {
		item.setAnimateScrollTime(animateScrollTime);
	}

	public void setAnimateShowAcceleration(
			AnimationAcceleration animateShowAcceleration) {
		item.setAnimateShowAcceleration(animateShowAcceleration);
	}

	public void setAnimateShowTime(Integer animateShowTime) {
		item.setAnimateShowTime(animateShowTime);
	}

	public String getStylePrimaryName() {
		return item.getStylePrimaryName();
	}

	public void setAnimateTime(int animateTime) {
		item.setAnimateTime(animateTime);
	}

	public void removeStyleDependentName(String styleSuffix) {
		item.removeStyleDependentName(styleSuffix);
	}

	public void removeStyleName(String style) {
		item.removeStyleName(style);
	}

	public void setAppImgDir(String appImgDir) {
		item.setAppImgDir(appImgDir);
	}

	public Integer getLayoutMargin() {
		return item.getLayoutMargin();
	}

	public void setAriaRole(String ariaRole) throws IllegalStateException {
		item.setAriaRole(ariaRole);
	}

	public void setAutoDraw(Boolean autoDraw) throws IllegalStateException {
		item.setAutoDraw(autoDraw);
	}

	public Integer getLayoutRightMargin() {
		return item.getLayoutRightMargin();
	}

	public Integer getLayoutTopMargin() {
		return item.getLayoutTopMargin();
	}

	public Boolean getLeaveScrollbarGap() {
		return item.getLeaveScrollbarGap();
	}

	public LocatorStrategy getLocateMembersBy() {
		return item.getLocateMembersBy();
	}

	public LocatorTypeStrategy getLocateMembersType() {
		return item.getLocateMembersType();
	}

	public void setAutoShowParent(Boolean autoShowParent) {
		item.setAutoShowParent(autoShowParent);
	}

	public Boolean getManagePercentBreadth() {
		return item.getManagePercentBreadth();
	}

	public void setBackgroundColor(String backgroundColor) {
		item.setBackgroundColor(backgroundColor);
	}

	public int getMemberOverlap() {
		return item.getMemberOverlap();
	}

	public void setBackgroundImage(String backgroundImage) {
		item.setBackgroundImage(backgroundImage);
	}

	public int getMembersMargin() {
		return item.getMembersMargin();
	}

	public void setBackgroundPosition(String backgroundPosition)
			throws IllegalStateException {
		item.setBackgroundPosition(backgroundPosition);
	}

	public int getMinMemberSize() {
		return item.getMinMemberSize();
	}

	public void setBackgroundRepeat(BackgroundRepeat backgroundRepeat)
			throws IllegalStateException {
		item.setBackgroundRepeat(backgroundRepeat);
	}

	public Overflow getOverflow() {
		return item.getOverflow();
	}

	public Boolean getPaddingAsLayoutMargin() {
		return item.getPaddingAsLayoutMargin();
	}

	public void setBorder(String border) {
		item.setBorder(border);
	}

	public void setCanAcceptDrop(Boolean canAcceptDrop) {
		item.setCanAcceptDrop(canAcceptDrop);
	}

	public int hashCode() {
		return item.hashCode();
	}

	public void initNativeObject() {
		item.initNativeObject();
	}

	public void setCanDrag(Boolean canDrag) {
		item.setCanDrag(canDrag);
	}

	public Boolean getReverseOrder() {
		return item.getReverseOrder();
	}

	public Boolean getShowDragPlaceHolder() {
		return item.getShowDragPlaceHolder();
	}

	public Boolean getShowDropLines() {
		return item.getShowDropLines();
	}

	public String getStackZIndex() {
		return item.getStackZIndex();
	}

	public LayoutPolicy getVPolicy() {
		return item.getVPolicy();
	}

	public void getMemberDefaultBreadth(Canvas member, int defaultBreadth) {
		item.getMemberDefaultBreadth(member, defaultBreadth);
	}

	public void getMemberOffset(Canvas member, int defaultOffset,
			String alignment) {
		item.getMemberOffset(member, defaultOffset, alignment);
	}

	public Boolean hasMember(Canvas canvas) {
		return item.hasMember(canvas);
	}

	public void hideDropLine() {
		item.hideDropLine();
	}

	public void membersChanged() {
		item.membersChanged();
	}

	public void reflow() {
		item.reflow();
	}

	public void reflow(String reason) {
		item.reflow(reason);
	}

	public void reflowNow() {
		item.reflowNow();
	}

	public void removeMember(Canvas member) {
		item.removeMember(member);
	}

	public void removeMembers(Canvas[] members) {
		item.removeMembers(members);
	}

	public void reorderMember(int memberNum, int newPosition) {
		item.reorderMember(memberNum, newPosition);
	}

	public void reorderMembers(int start, int end, int newPosition) {
		item.reorderMembers(start, end, newPosition);
	}

	public void setAlign(Alignment alignment) {
		item.setAlign(alignment);
	}

	public void setAlign(VerticalAlignment alignment) {
		item.setAlign(alignment);
	}

	public Canvas[] getMembers() {
		return item.getMembers();
	}

	public void hideMember(Canvas member) {
		item.hideMember(member);
	}

	public void hideMember(Canvas member, Function callback) {
		item.hideMember(member, callback);
	}

	public Canvas getMember(int index) {
		return item.getMember(index);
	}

	public Canvas getMember(String memberID) {
		return item.getMember(memberID);
	}

	public int getMemberNumber(Canvas member) {
		return item.getMemberNumber(member);
	}

	public int getMemberNumber(String memberID) {
		return item.getMemberNumber(memberID);
	}

	public LocatorStrategy getLocateChildrenBy() {
		return item.getLocateChildrenBy();
	}

	public LocatorTypeStrategy getLocateChildrenType() {
		return item.getLocateChildrenType();
	}

	public LocatorStrategy getLocatePeersBy() {
		return item.getLocatePeersBy();
	}

	public LocatorTypeStrategy getLocatePeersType() {
		return item.getLocatePeersType();
	}

	public Integer getMargin() {
		return item.getMargin();
	}

	public Canvas getMasterElement() throws IllegalStateException {
		return item.getMasterElement();
	}

	public Boolean getMatchElement() {
		return item.getMatchElement();
	}

	public int getMaxHeight() {
		return item.getMaxHeight();
	}

	public int getMaxWidth() {
		return item.getMaxWidth();
	}

	public String getMenuConstructor() {
		return item.getMenuConstructor();
	}

	public int getMinHeight() {
		return item.getMinHeight();
	}

	public int getMinWidth() {
		return item.getMinWidth();
	}

	public int getMouseStillDownDelay() {
		return item.getMouseStillDownDelay();
	}

	public int getMouseStillDownInitialDelay() {
		return item.getMouseStillDownInitialDelay();
	}

	public Boolean getNoDoubleClicks() {
		return item.getNoDoubleClicks();
	}

	public Integer getOpacity() {
		return item.getOpacity();
	}

	public Integer getPadding() {
		return item.getPadding();
	}

	public Canvas[] getPeers() {
		return item.getPeers();
	}

	public PercentBoxModel getPercentBox() {
		return item.getPercentBox();
	}

	public Canvas getPercentSource() {
		return item.getPercentSource();
	}

	public Positioning getPosition() {
		return item.getPosition();
	}

	public Boolean getPrintChildrenAbsolutelyPositioned() {
		return item.getPrintChildrenAbsolutelyPositioned();
	}

	public String getPrompt() {
		return item.getPrompt();
	}

	public Boolean getRedrawOnResize() {
		return item.getRedrawOnResize();
	}

	public String getResizeBarTarget() {
		return item.getResizeBarTarget();
	}

	public EdgeName[] getResizeFrom() {
		return item.getResizeFrom();
	}

	public int getScrollbarSize() {
		return item.getScrollbarSize();
	}

	public int getShadowDepth() {
		return item.getShadowDepth();
	}

	public String getShadowImage() {
		return item.getShadowImage();
	}

	public Integer getShadowOffset() {
		return item.getShadowOffset();
	}

	public Integer getShadowSoftness() {
		return item.getShadowSoftness();
	}

	public Boolean getShouldPrint() {
		return item.getShouldPrint();
	}

	public Boolean getShowCustomScrollbars() {
		return item.getShowCustomScrollbars();
	}

	public Boolean getShowDragShadow() {
		return item.getShowDragShadow();
	}

	public Boolean getShowEdges() {
		return item.getShowEdges();
	}

	public Boolean getShowHover() {
		return item.getShowHover();
	}

	public Boolean getShowHoverComponents() {
		return item.getShowHoverComponents();
	}

	public Boolean getShowResizeBar() {
		return item.getShowResizeBar();
	}

	public Boolean getShowShadow() {
		return item.getShowShadow();
	}

	public String getSkinImgDir() {
		return item.getSkinImgDir();
	}

	public String getSnapAxis() {
		return item.getSnapAxis();
	}

	public String getSnapEdge() {
		return item.getSnapEdge();
	}

	public String getSnapHDirection() {
		return item.getSnapHDirection();
	}

	public int getSnapHGap() {
		return item.getSnapHGap();
	}

	public Integer getSnapOffsetLeft() {
		return item.getSnapOffsetLeft();
	}

	public Integer getSnapOffsetTop() {
		return item.getSnapOffsetTop();
	}

	public Boolean getSnapOnDrop() {
		return item.getSnapOnDrop();
	}

	public Boolean getSnapResizeToGrid() {
		return item.getSnapResizeToGrid();
	}

	public String getSnapTo() {
		return item.getSnapTo();
	}

	public Boolean getSnapToGrid() {
		return item.getSnapToGrid();
	}

	public String getSnapVDirection() {
		return item.getSnapVDirection();
	}

	public int getSnapVGap() {
		return item.getSnapVGap();
	}

	public String getStyleName() {
		return item.getStyleName();
	}

	public Integer getTabIndex() {
		return item.getTabIndex();
	}

	public Canvas getTopElement() throws IllegalStateException {
		return item.getTopElement();
	}

	public Boolean getUseBackMask() {
		return item.getUseBackMask();
	}

	public Boolean getUseOpacityFilter() {
		return item.getUseOpacityFilter();
	}

	public ValuesManager getValuesManager() {
		return item.getValuesManager();
	}

	public Visibility getVisibility() {
		return item.getVisibility();
	}

	public int getOffsetX() {
		return item.getOffsetX();
	}

	public int getOffsetY() {
		return item.getOffsetY();
	}

	public int getPageBottom() {
		return item.getPageBottom();
	}

	public int getPageLeft() {
		return item.getPageLeft();
	}

	public int getPageRight() {
		return item.getPageRight();
	}

	public int getPageTop() {
		return item.getPageTop();
	}

	public int getRight() {
		return item.getRight();
	}

	public int getScrollBottom() {
		return item.getScrollBottom();
	}

	public int getScrollHeight() {
		return item.getScrollHeight();
	}

	public int getScrollLeft() {
		return item.getScrollLeft();
	}

	public int getScrollRight() {
		return item.getScrollRight();
	}

	public int getScrollTop() {
		return item.getScrollTop();
	}

	public int getScrollWidth() {
		return item.getScrollWidth();
	}

	public int getViewportHeight() {
		return item.getViewportHeight();
	}

	public int getViewportWidth() {
		return item.getViewportWidth();
	}

	public int getVisibleHeight() {
		return item.getVisibleHeight();
	}

	public int getVisibleWidth() {
		return item.getVisibleWidth();
	}

	public int getVSnapOrigin() {
		return item.getVSnapOrigin();
	}

	public int getVSnapOrigin(Canvas snapChild) {
		return item.getVSnapOrigin(snapChild);
	}

	public int getVSnapPosition(int coordinate) {
		return item.getVSnapPosition(coordinate);
	}

	public int getVSnapPosition(int coordinate, String direction) {
		return item.getVSnapPosition(coordinate, direction);
	}

	public void handleHover() {
		item.handleHover();
	}

	public void hide() {
		item.hide();
	}

	public void hideClickMask() {
		item.hideClickMask();
	}

	public void hideClickMask(String ID) {
		item.hideClickMask(ID);
	}

	public void hideContextMenu() {
		item.hideContextMenu();
	}

	public Boolean intersects(Canvas other) {
		return item.intersects(other);
	}

	public Boolean isDirty() {
		return item.isDirty();
	}

	public Boolean isDisabled() {
		return item.isDisabled();
	}

	public Boolean isDrawn() {
		return item.isDrawn();
	}

	public Boolean keyUp() {
		return item.keyUp();
	}

	public void layoutChildren(String reason) {
		item.layoutChildren(reason);
	}

	public String linkHTML(String href) {
		return item.linkHTML(href);
	}

	public String linkHTML(String href, String text, String target, String ID,
			Integer tabIndex, String accessKey) {
		return item.linkHTML(href, text, target, ID, tabIndex, accessKey);
	}

	public void markForDestroy() {
		item.markForDestroy();
	}

	public void markForRedraw() {
		item.markForRedraw();
	}

	public void markForRedraw(String reason) {
		item.markForRedraw(reason);
	}

	public void moveAbove(Canvas canvas) {
		item.moveAbove(canvas);
	}

	public void moveBelow(Canvas canvas) {
		item.moveBelow(canvas);
	}

	public Boolean moveBy(int deltaX, int deltaY) {
		return item.moveBy(deltaX, deltaY);
	}

	public void redraw() {
		item.redraw();
	}

	public void redraw(String reason) {
		item.redraw(reason);
	}

	public void removeChild(Canvas child) {
		item.removeChild(child);
	}

	public void removeChild(Canvas child, String name) {
		item.removeChild(child, name);
	}

	public void removePeer(Canvas peer) {
		item.removePeer(peer);
	}

	public void removePeer(Canvas peer, String name) {
		item.removePeer(peer, name);
	}

	public void scrollBy(int dX, int dY) {
		item.scrollBy(dX, dY);
	}

	public void scrollTo() {
		item.scrollTo();
	}

	public void scrollTo(Integer left, Integer top) {
		item.scrollTo(left, top);
	}

	public void scrollToBottom() {
		item.scrollToBottom();
	}

	public void scrollToLeft() {
		item.scrollToLeft();
	}

	public void scrollToRight() {
		item.scrollToRight();
	}

	public void scrollToTop() {
		item.scrollToTop();
	}

	public void sendToBack() {
		item.sendToBack();
	}

	public void setBottom(int bottom) {
		item.setBottom(bottom);
	}

	public Canvas[] getParentElements() {
		return item.getParentElements();
	}

	public String getTitle() {
		return item.getTitle();
	}

	public String getTooltip() {
		return item.getTooltip();
	}

	public Integer getWidth() {
		return item.getWidth();
	}

	public String getWidthAsString() {
		return item.getWidthAsString();
	}

	public int getLeft() {
		return item.getLeft();
	}

	public String getLeftAsString() {
		return item.getLeftAsString();
	}

	public int getTop() {
		return item.getTop();
	}

	public String getTopAsString() {
		return item.getTopAsString();
	}

	public void setAnimateShowEffect(AnimationEffect animateShowEffect) {
		item.setAnimateShowEffect(animateShowEffect);
	}

	public String getPrefix() {
		return item.getPrefix();
	}

	public boolean moveTo(int left, int top) {
		return item.moveTo(left, top);
	}

	public Boolean resizeBy(int deltaX, int deltaY) {
		return item.resizeBy(deltaX, deltaY);
	}

	public Boolean resizeTo(String width, String height) {
		return item.resizeTo(width, height);
	}

	public Boolean resizeTo(int width, int height) {
		return item.resizeTo(width, height);
	}

	public void scrollByPercent(int dX, int dY) {
		item.scrollByPercent(dX, dY);
	}

	public void scrollToPercent(int left, int top) {
		item.scrollToPercent(left, top);
	}

	public boolean isVisible() {
		return item.isVisible();
	}

	public int getZIndex() {
		return item.getZIndex();
	}

	public int getNextZIndex() {
		return item.getNextZIndex();
	}

	public Rectangle getPageRect() {
		return item.getPageRect();
	}

	public Rectangle getRect() {
		return item.getRect();
	}

	public String getPrintHTML(PrintProperties printProperties,
			PrintHTMLCallback callback) {
		return item.getPrintHTML(printProperties, callback);
	}

	public Canvas getParentElement() {
		return item.getParentElement();
	}

	public int getOffsetHeight() {
		return item.getOffsetHeight();
	}

	public int getOffsetWidth() {
		return item.getOffsetWidth();
	}

	public void setAutoHeight() {
		item.setAutoHeight();
	}

	public void setAutoWidth() {
		item.setAutoWidth();
	}

	public void addGroup(RibbonGroup group) {
		item.addGroup(group);
	}

	public void addGroup(RibbonGroup group, Integer position) {
		item.addGroup(group, position);
	}

	public HandlerRegistration addDrawHandler(DrawHandler handler) {
		return item.addDrawHandler(handler);
	}

	public void addStyleDependentName(String styleSuffix) {
		item.addStyleDependentName(styleSuffix);
	}

	public void addFormItem(FormItem formItem) {
		item.addFormItem(formItem);
	}

	public void addFormItem(FormItem formItem, int position) {
		item.addFormItem(formItem, position);
	}

	public void addButton(ToolStripButton button) {
		item.addButton(button);
	}

	public void addButton(ToolStripButton button, int position) {
		item.addButton(button, position);
	}

	public void addMenuButton(ToolStripMenuButton button) {
		item.addMenuButton(button);
	}

	public void addMenuButton(ToolStripMenuButton button, int position) {
		item.addMenuButton(button, position);
	}

	public void addSpacer(int space) {
		item.addSpacer(space);
	}

	public void addSpacer(ToolStripSpacer toolStripSpacer) {
		item.addSpacer(toolStripSpacer);
	}

	public void addFill() {
		item.addFill();
	}

	public void addSeparator() {
		item.addSeparator();
	}

	public void addResizer() {
		item.addResizer();
	}

	public void addMembers(Canvas... newMembers) {
		item.addMembers(newMembers);
	}

	public void addMembers(Canvas[] newMembers, int position) {
		item.addMembers(newMembers, position);
	}

	public void addMember(Widget widget) {
		item.addMember(widget);
	}

	public void addMember(Canvas component) {
		item.addMember(component);
	}

	public void addMember(Widget widget, int position) {
		item.addMember(widget, position);
	}

	public void addMember(Canvas component, int position) {
		item.addMember(component, position);
	}

	public Canvas addChild(Canvas newChild) {
		return item.addChild(newChild);
	}

	public Canvas addChild(Canvas newChild, String name, Boolean autoDraw) {
		return item.addChild(newChild, name, autoDraw);
	}

	public Canvas addPeer(Canvas newPeer) {
		return item.addPeer(newPeer);
	}

	public Canvas addPeer(Canvas newPeer, String name, Boolean autoDraw,
			Boolean preDraw) {
		return item.addPeer(newPeer, name, autoDraw, preDraw);
	}

	public void adjustForContent(boolean immediate) {
		item.adjustForContent(immediate);
	}

	public HandlerRegistration addClickHandler(ClickHandler handler) {
		return item.addClickHandler(handler);
	}

	public HandlerRegistration addDoubleClickHandler(DoubleClickHandler handler) {
		return item.addDoubleClickHandler(handler);
	}

	public HandlerRegistration addDragMoveHandler(DragMoveHandler handler) {
		return item.addDragMoveHandler(handler);
	}

	public HandlerRegistration addDragRepositionMoveHandler(
			DragRepositionMoveHandler handler) {
		return item.addDragRepositionMoveHandler(handler);
	}

	public HandlerRegistration addDragRepositionStartHandler(
			DragRepositionStartHandler handler) {
		return item.addDragRepositionStartHandler(handler);
	}

	public HandlerRegistration addDragRepositionStopHandler(
			DragRepositionStopHandler handler) {
		return item.addDragRepositionStopHandler(handler);
	}

	public HandlerRegistration addDragResizeMoveHandler(
			DragResizeMoveHandler handler) {
		return item.addDragResizeMoveHandler(handler);
	}

	public HandlerRegistration addDragResizeStartHandler(
			DragResizeStartHandler handler) {
		return item.addDragResizeStartHandler(handler);
	}

	public HandlerRegistration addDragResizeStopHandler(
			DragResizeStopHandler handler) {
		return item.addDragResizeStopHandler(handler);
	}

	public HandlerRegistration addDragStartHandler(DragStartHandler handler) {
		return item.addDragStartHandler(handler);
	}

	public HandlerRegistration addDragStopHandler(DragStopHandler handler) {
		return item.addDragStopHandler(handler);
	}

	public HandlerRegistration addDropMoveHandler(DropMoveHandler handler) {
		return item.addDropMoveHandler(handler);
	}

	public HandlerRegistration addDropOutHandler(DropOutHandler handler) {
		return item.addDropOutHandler(handler);
	}

	public HandlerRegistration addDropOverHandler(DropOverHandler handler) {
		return item.addDropOverHandler(handler);
	}

	public HandlerRegistration addFocusChangedHandler(
			FocusChangedHandler handler) {
		return item.addFocusChangedHandler(handler);
	}

	public HandlerRegistration addHoverHandler(HoverHandler handler) {
		return item.addHoverHandler(handler);
	}

	public HandlerRegistration addHoverHiddenHandler(HoverHiddenHandler handler) {
		return item.addHoverHiddenHandler(handler);
	}

	public HandlerRegistration addKeyDownHandler(KeyDownHandler handler) {
		return item.addKeyDownHandler(handler);
	}

	public HandlerRegistration addKeyPressHandler(KeyPressHandler handler) {
		return item.addKeyPressHandler(handler);
	}

	public HandlerRegistration addMouseDownHandler(MouseDownHandler handler) {
		return item.addMouseDownHandler(handler);
	}

	public HandlerRegistration addMouseMoveHandler(MouseMoveHandler handler) {
		return item.addMouseMoveHandler(handler);
	}

	public HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
		return item.addMouseOutHandler(handler);
	}

	public HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
		return item.addMouseOverHandler(handler);
	}

	public HandlerRegistration addMouseStillDownHandler(
			MouseStillDownHandler handler) {
		return item.addMouseStillDownHandler(handler);
	}

	public HandlerRegistration addMouseUpHandler(MouseUpHandler handler) {
		return item.addMouseUpHandler(handler);
	}

	public HandlerRegistration addMouseWheelHandler(MouseWheelHandler handler) {
		return item.addMouseWheelHandler(handler);
	}

	public HandlerRegistration addMovedHandler(MovedHandler handler) {
		return item.addMovedHandler(handler);
	}

	public HandlerRegistration addDropHandler(DropHandler handler) {
		return item.addDropHandler(handler);
	}

	public HandlerRegistration addParentMovedHandler(ParentMovedHandler handler) {
		return item.addParentMovedHandler(handler);
	}

	public HandlerRegistration addResizedHandler(ResizedHandler handler) {
		return item.addResizedHandler(handler);
	}

	public HandlerRegistration addRightMouseDownHandler(
			RightMouseDownHandler handler) {
		return item.addRightMouseDownHandler(handler);
	}

	public HandlerRegistration addScrolledHandler(ScrolledHandler handler) {
		return item.addScrolledHandler(handler);
	}

	public HandlerRegistration addShowContextMenuHandler(
			ShowContextMenuHandler handler) {
		return item.addShowContextMenuHandler(handler);
	}

	public HandlerRegistration addVisibilityChangedHandler(
			VisibilityChangedHandler handler) {
		return item.addVisibilityChangedHandler(handler);
	}

	public void addStyleName(String style) {
		item.addStyleName(style);
	}

	public void animateMove(Integer left, Integer top,
			AnimationCallback callback, int duration,
			AnimationAcceleration acceleration) {
		item.animateMove(left, top, callback, duration, acceleration);
	}

	public void animateFade(int opacity) {
		item.animateFade(opacity);
	}

	public void animateFade(int opacity, AnimationCallback callback) {
		item.animateFade(opacity, callback);
	}

	public void animateFade(int opacity, AnimationCallback callback,
			int duration) {
		item.animateFade(opacity, callback, duration);
	}

	public void animateHide(AnimationEffect effect) {
		item.animateHide(effect);
	}

	public void animateHide(AnimationEffect effect, AnimationCallback callback) {
		item.animateHide(effect, callback);
	}

	public void animateHide(AnimationEffect effect, AnimationCallback callback,
			int duration) {
		item.animateHide(effect, callback, duration);
	}

	public void addChild(Widget widget) {
		item.addChild(widget);
	}

	public Canvas addChild(Canvas newChild, String name, boolean autoDraw) {
		return item.addChild(newChild, name, autoDraw);
	}

	public HandlerRegistration addAttachHandler(Handler handler) {
		return item.addAttachHandler(handler);
	}

	public void fireEvent(GwtEvent<?> event) {
		item.fireEvent(event);
	}

	public Widget asWidget() {
		return item.asWidget();
	}

	public Boolean getAnimateMembers() {
		return item.getAnimateMembers();
	}

	public Integer getAnimateMemberTime() {
		return item.getAnimateMemberTime();
	}

	public void draw() {
		item.draw();
	}

	public String getAccessKey() {
		return item.getAccessKey();
	}

	public void destroy() {
		item.destroy();
	}

	public AnimationAcceleration getAnimateAcceleration() {
		return item.getAnimateAcceleration();
	}

	public void doOnRender(Function function) {
		item.doOnRender(function);
	}

	public Integer getAnimateFadeTime() {
		return item.getAnimateFadeTime();
	}

	public AnimationAcceleration getAnimateHideAcceleration() {
		return item.getAnimateHideAcceleration();
	}

	public Boolean getCanDropComponents() {
		return item.getCanDropComponents();
	}

	public Integer getAnimateHideTime() {
		return item.getAnimateHideTime();
	}

	public AnimationAcceleration getAnimateMoveAcceleration() {
		return item.getAnimateMoveAcceleration();
	}

	public Integer getAnimateMoveTime() {
		return item.getAnimateMoveTime();
	}

	public AnimationAcceleration getAnimateRectAcceleration() {
		return item.getAnimateRectAcceleration();
	}

	public Integer getAnimateRectTime() {
		return item.getAnimateRectTime();
	}

	public AnimationAcceleration getAnimateResizeAcceleration() {
		return item.getAnimateResizeAcceleration();
	}

	public Integer getAnimateResizeTime() {
		return item.getAnimateResizeTime();
	}

	public AnimationAcceleration getAnimateScrollAcceleration() {
		return item.getAnimateScrollAcceleration();
	}

	public Integer getAnimateScrollTime() {
		return item.getAnimateScrollTime();
	}

	public AnimationAcceleration getAnimateShowAcceleration() {
		return item.getAnimateShowAcceleration();
	}

	public Integer getAnimateShowTime() {
		return item.getAnimateShowTime();
	}

	public int getAnimateTime() {
		return item.getAnimateTime();
	}

	public String getAppImgDir() {
		return item.getAppImgDir();
	}

	public String getAriaRole() {
		return item.getAriaRole();
	}

	public Boolean getAutoDraw() {
		return item.getAutoDraw();
	}

	public Boolean getAutoShowParent() {
		return item.getAutoShowParent();
	}

	public String getBackgroundColor() {
		return item.getBackgroundColor();
	}

	public String getBackgroundImage() {
		return item.getBackgroundImage();
	}

	public String getBackgroundPosition() {
		return item.getBackgroundPosition();
	}

	public BackgroundRepeat getBackgroundRepeat() {
		return item.getBackgroundRepeat();
	}

	public String getBorder() {
		return item.getBorder();
	}

	public boolean equals(Object obj) {
		return item.equals(obj);
	}

	public Boolean getCanAcceptDrop() {
		return item.getCanAcceptDrop();
	}

	public Boolean getCanDrag() {
		return item.getCanDrag();
	}

	public Boolean getCanDragReposition() {
		return item.getCanDragReposition();
	}

	public Boolean getCanDragResize() {
		return item.getCanDragResize();
	}

	public Boolean getCanDragScroll() {
		return item.getCanDragScroll();
	}

	public Boolean getCanDrop() {
		return item.getCanDrop();
	}

	public Boolean getCanDropBefore() {
		return item.getCanDropBefore();
	}

	public void blur() {
		item.blur();
	}

	public void bringToFront() {
		item.bringToFront();
	}

	public void clear() {
		item.clear();
	}

	public void clickMaskUp() {
		item.clickMaskUp();
	}

	public void clickMaskUp(String ID) {
		item.clickMaskUp(ID);
	}

	public Boolean contains(Canvas canvas) {
		return item.contains(canvas);
	}

	public Boolean contains(Canvas canvas, Boolean testSelf) {
		return item.contains(canvas, testSelf);
	}

	public Boolean containsEvent() {
		return item.containsEvent();
	}

	public Boolean containsFocus() {
		return item.containsFocus();
	}

	public Boolean containsPoint(int x, int y) {
		return item.containsPoint(x, y);
	}

	public Boolean containsPoint(int x, int y, Boolean withinViewport) {
		return item.containsPoint(x, y, withinViewport);
	}

	public void deparent() {
		item.deparent();
	}

	public void depeer() {
		item.depeer();
	}

	public void disable() {
		item.disable();
	}

	public void enable() {
		item.enable();
	}

	public void focus() {
		item.focus();
	}

	public int getBottom() {
		return item.getBottom();
	}

	public String getAttribute(String attribute) {
		return item.getAttribute(attribute);
	}

	public int getAbsoluteLeft() {
		return item.getAbsoluteLeft();
	}

	public int getAbsoluteTop() {
		return item.getAbsoluteTop();
	}

	public AnimationEffect getAnimateShowEffect() {
		return item.getAnimateShowEffect();
	}

	public void animateMove(Integer left, Integer top) {
		item.animateMove(left, top);
	}

	public void animateMove(Integer left, Integer top,
			AnimationCallback callback) {
		item.animateMove(left, top, callback);
	}

	public void animateMove(Integer left, Integer top,
			AnimationCallback callback, int duration) {
		item.animateMove(left, top, callback, duration);
	}

	public void animateScroll(int scrollLeft, int scrollTop) {
		item.animateScroll(scrollLeft, scrollTop);
	}

	public void animateScroll(int scrollLeft, int scrollTop,
			AnimationCallback callback) {
		item.animateScroll(scrollLeft, scrollTop, callback);
	}

	public void animateScroll(int scrollLeft, int scrollTop,
			AnimationCallback callback, int duration) {
		item.animateScroll(scrollLeft, scrollTop, callback, duration);
	}

	public void animateRect(Integer left, Integer top, Integer width,
			Integer height) {
		item.animateRect(left, top, width, height);
	}

	public void animateRect(Integer left, Integer top, Integer width,
			Integer height, AnimationCallback callback) {
		item.animateRect(left, top, width, height, callback);
	}

	public void animateRect(Integer left, Integer top, Integer width,
			Integer height, AnimationCallback callback, int duration) {
		item.animateRect(left, top, width, height, callback, duration);
	}

	public void animateResize(Integer width, Integer height) {
		item.animateResize(width, height);
	}

	public void animateResize(Integer width, Integer height,
			AnimationCallback callback) {
		item.animateResize(width, height, callback);
	}

	public void animateResize(Integer width, Integer height,
			AnimationCallback callback, int duration) {
		item.animateResize(width, height, callback, duration);
	}

	public void animateShow(AnimationEffect effect) {
		item.animateShow(effect);
	}

	public void animateShow(AnimationEffect effect, AnimationCallback callback) {
		item.animateShow(effect, callback);
	}

	public void animateShow(AnimationEffect effect, AnimationCallback callback,
			int duration) {
		item.animateShow(effect, callback, duration);
	}

	public int getHandlerCount(Type<?> type) {
		return item.getHandlerCount(type);
	}

	public Object getLayoutData() {
		return item.getLayoutData();
	}

	public Alignment getGroupTitleAlign() {
		return item.getGroupTitleAlign();
	}

	public String getInnerHTML() {
		return item.getInnerHTML();
	}

	public VerticalAlignment getGroupTitleOrientation() {
		return item.getGroupTitleOrientation();
	}

	public Element getElement() {
		return item.getElement();
	}

	public Element getElement(boolean allowPreRender) {
		return item.getElement(allowPreRender);
	}

	public Element getDOM() {
		return item.getDOM();
	}

	public String getID() {
		return item.getID();
	}

	public JavaScriptObject getConfig() {
		return item.getConfig();
	}

	public JavaScriptObject getJsObj() {
		return item.getJsObj();
	}

	public LayoutResizeBarPolicy getDefaultResizeBars() {
		return item.getDefaultResizeBars();
	}

	public int getDropLineThickness() {
		return item.getDropLineThickness();
	}

	public Boolean getEnforcePolicy() {
		return item.getEnforcePolicy();
	}

	public LayoutPolicy getHPolicy() {
		return item.getHPolicy();
	}

	public Integer getLayoutBottomMargin() {
		return item.getLayoutBottomMargin();
	}

	public Integer getLayoutLeftMargin() {
		return item.getLayoutLeftMargin();
	}

	public int getDropPosition() {
		return item.getDropPosition();
	}

	public Boolean getCanFocus() {
		return item.getCanFocus();
	}

	public Boolean getCanHover() {
		return item.getCanHover();
	}

	public Boolean getCanSelectText() {
		return item.getCanSelectText();
	}

	public CanvasItem getCanvasItem() {
		return item.getCanvasItem();
	}

	public Boolean getChildrenSnapResizeToGrid() {
		return item.getChildrenSnapResizeToGrid();
	}

	public Boolean getChildrenSnapToGrid() {
		return item.getChildrenSnapToGrid();
	}

	public String getContents() {
		return item.getContents();
	}

	public Menu getContextMenu() {
		return item.getContextMenu();
	}

	public Cursor getCursor() {
		return item.getCursor();
	}

	public String getDataPath() {
		return item.getDataPath();
	}

	public int getDefaultHeight() {
		return item.getDefaultHeight();
	}

	public int getDefaultWidth() {
		return item.getDefaultWidth();
	}

	public Boolean getDestroyed() throws IllegalStateException {
		return item.getDestroyed();
	}

	public Boolean getDestroying() throws IllegalStateException {
		return item.getDestroying();
	}

	public Cursor getDisabledCursor() {
		return item.getDisabledCursor();
	}

	public int getDoubleClickDelay() {
		return item.getDoubleClickDelay();
	}

	public DragAppearance getDragAppearance() {
		return item.getDragAppearance();
	}

	public DragIntersectStyle getDragIntersectStyle() {
		return item.getDragIntersectStyle();
	}

	public Integer getDragOpacity() {
		return item.getDragOpacity();
	}

	public DragAppearance getDragRepositionAppearance() {
		return item.getDragRepositionAppearance();
	}

	public Cursor getDragRepositionCursor() {
		return item.getDragRepositionCursor();
	}

	public DragAppearance getDragResizeAppearance() {
		return item.getDragResizeAppearance();
	}

	public int getDragScrollDelay() {
		return item.getDragScrollDelay();
	}

	public int getDragStartDistance() {
		return item.getDragStartDistance();
	}

	public String getDragType() {
		return item.getDragType();
	}

	public Boolean getDynamicContents() {
		return item.getDynamicContents();
	}

	public String getEdgeBackgroundColor() {
		return item.getEdgeBackgroundColor();
	}

	public String getEdgeCenterBackgroundColor() {
		return item.getEdgeCenterBackgroundColor();
	}

	public String getEdgeImage() {
		return item.getEdgeImage();
	}

	public int getEdgeMarginSize() {
		return item.getEdgeMarginSize();
	}

	public Integer getEdgeOffset() {
		return item.getEdgeOffset();
	}

	public Integer getEdgeOpacity() {
		return item.getEdgeOpacity();
	}

	public Boolean getEdgeShowCenter() {
		return item.getEdgeShowCenter();
	}

	public int getEdgeSize() {
		return item.getEdgeSize();
	}

	public int getExtraSpace() {
		return item.getExtraSpace();
	}

	public Alignment getHoverAlign() {
		return item.getHoverAlign();
	}

	public Boolean getHoverAutoDestroy() {
		return item.getHoverAutoDestroy();
	}

	public int getHoverDelay() {
		return item.getHoverDelay();
	}

	public Integer getHoverHeight() {
		return item.getHoverHeight();
	}

	public Boolean getHoverMoveWithMouse() {
		return item.getHoverMoveWithMouse();
	}

	public Integer getHoverOpacity() {
		return item.getHoverOpacity();
	}

	public String getHoverStyle() {
		return item.getHoverStyle();
	}

	public VerticalAlignment getHoverVAlign() {
		return item.getHoverVAlign();
	}

	public Integer getHoverWidth() {
		return item.getHoverWidth();
	}

	public Boolean getHoverWrap() {
		return item.getHoverWrap();
	}

	public DrawPosition getHtmlPosition() {
		return item.getHtmlPosition();
	}

	public Boolean getKeepInParentRect() {
		return item.getKeepInParentRect();
	}

	public Alignment getLayoutAlign() {
		return item.getLayoutAlign();
	}

	public String getFullDataPath() {
		return item.getFullDataPath();
	}

	public String getHoverHTML() {
		return item.getHoverHTML();
	}

	public int getHSnapOrigin() {
		return item.getHSnapOrigin();
	}

	public int getHSnapOrigin(Canvas snapChild) {
		return item.getHSnapOrigin(snapChild);
	}

	public int getHSnapPosition(int coordinate) {
		return item.getHSnapPosition(coordinate);
	}

	public int getHSnapPosition(int coordinate, String direction) {
		return item.getHSnapPosition(coordinate, direction);
	}

	public int getInnerContentHeight() {
		return item.getInnerContentHeight();
	}

	public int getInnerContentWidth() {
		return item.getInnerContentWidth();
	}

	public int getInnerHeight() {
		return item.getInnerHeight();
	}

	public int getInnerWidth() {
		return item.getInnerWidth();
	}

	public String getClassName() {
		return item.getClassName();
	}

	public Integer getHeight() {
		return item.getHeight();
	}

	public String getHeightAsString() {
		return item.getHeightAsString();
	}

	public String getFacetId() {
		return item.getFacetId();
	}

	public boolean getDisabled() {
		return item.getDisabled();
	}

	public Canvas getDragTarget() {
		return item.getDragTarget();
	}

	public Canvas getHoverComponent() {
		return item.getHoverComponent();
	}

	public String getGroupTitle() {
		return item.getGroupTitle();
	}

	public Boolean getIsGroup() {
		return item.getIsGroup();
	}

	public String[] getDropTypes() {
		return item.getDropTypes();
	}

	public Canvas[] getChildren() {
		return item.getChildren();
	}
	
}

