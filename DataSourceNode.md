**HelloPane.java**:
```
package holy.cow;

public class HelloPane
extends LazyCanvas<HLayout>{

  private static HelloPaneUiBinder uiBinder
    = GWT.create(HelloPaneUiBinder.class);

  interface HelloPaneUiBinder extends UiBinder<HLayout, HelloPane> {}

  public HelloPane() {
  }

  @Override
  protected HLayout createCanvas() {
    return uiBinder.createAndBindUi(this);
  }
  
  @UiField HLayout mainLayout;
  
  @UiFactory UITreeGrid mkTreeGrid(){ 
    UITreeGrid treeGrid = new UITreeGrid();
    treeGrid.setAutoFetchData(true);
    return treeGrid;
  }
}
```


**HelloPane.ui.xml**:

Note that Smart data classes require you to setID(String srcID) because srcID is used as the root denominator in referencing the data fields. SmartGWT's setID method has been mapped to setDataSrcID for uibinder to avoid confusion with GWT's own setId.

Note the correspondence of
  * dataSrcID='info' in UIDataSource
  * and foreignKey='info.nid'
in illustrating the employment of a data class ID.

```
<ui:UiBinder xmlns:ui="urn:ui:com.google.gwt.uibinder"
  xmlns:zs="urn:import:org.synthful.smartgwt.client.widgets"
  xmlns:g="urn:import:com.google.gwt.user.client.ui">
  <ui:with field='code' type='holy.cow.HelloPane'/>
  <zs:UIHLayout ui:field="mainLayout">
    <zs:UITreeGrid showResizeBar='true' width='100px' init='{code.listGridInit}'>
      <zs:UITreeGridField name='header'>Information</zs:UITreeGridField>
      <zs:UIDataSource titleField='caption' recordXPath='/nodes/node' dataSrcID='info'
        dataURL='uidata/info.xml' clientOnly='true'>
        <zs:UIDataSourceTextField name="caption">Caption</zs:UIDataSourceTextField>
        <zs:UIDataSourceIntegerField name='nid' required='true' primaryKey='true'>Id</zs:UIDataSourceIntegerField>
        <zs:UIDataSourceIntegerField name='pnid' required='true' foreignKey='info.nid' rootValue='1'>Parent Id</zs:UIDataSourceIntegerField>
        <zs:UIDataSourceLinkField name='action'>Action</zs:UIDataSourceLinkField>
      </zs:UIDataSource>
    </zs:UITreeGrid>
  </zs:UIHLayout>
</ui:UiBinder> 
```