package org.synthful.smartgwt.client.widgets;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.logical.shared.AttachEvent.Handler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.core.Function;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.AnimationAcceleration;
import com.smartgwt.client.types.AnimationEffect;
import com.smartgwt.client.types.BackgroundRepeat;
import com.smartgwt.client.types.Cursor;
import com.smartgwt.client.types.DragAppearance;
import com.smartgwt.client.types.DragIntersectStyle;
import com.smartgwt.client.types.DrawPosition;
import com.smartgwt.client.types.LayoutPolicy;
import com.smartgwt.client.types.LayoutResizeBarPolicy;
import com.smartgwt.client.types.VerticalAlignment;
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
import com.smartgwt.client.widgets.form.fields.CanvasItem;
import com.smartgwt.client.widgets.form.fields.FormItem;
import com.smartgwt.client.widgets.menu.Menu;
import com.smartgwt.client.widgets.toolbar.RibbonBar;
import com.smartgwt.client.widgets.toolbar.RibbonGroup;
import com.smartgwt.client.widgets.toolbar.ToolStripButton;
import com.smartgwt.client.widgets.toolbar.ToolStripMenuButton;
import com.smartgwt.client.widgets.toolbar.ToolStripSpacer;

public class UIRibbonBar
	extends RibbonBar{
	
	private RibbonBar item;

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
