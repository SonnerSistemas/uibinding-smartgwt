# Introduction #

This is the SmartGWT Yahoo JSON showcase translated to UiBinder.

# Java code-behind #
```
public class Y
implements EntryPoint{

  interface YUiBinder
  extends UiBinder<VLayout, Y> {}

  private static YUiBinder uiBinder =
    GWT.create(YUiBinder.class);

  @UiField UIXJSONDataSource yDataSrc;
  @UiField UIListGrid yGrid;
  @UiField UISearchForm yForm;
  @UiField UIButton queryy;
  
  @UiField UIVLayout yLayout;
  
  @Override
  public void onModuleLoad()(){
    uiBinder.createAndBindUi(this);
    yGrid.setDataSource(yDataSrc.getSmartObject());
  }
  
  @UiHandler ("queryy")
  public void queryyClickHandler(ClickEvent event){
    yGrid.fetchData(yForm.getValuesAsCriteria());
  }
}

```

# ui.xml template #

```
<!DOCTYPE ui:UiBinder SYSTEM "http://dl.google.com/gwt/DTD/xhtml.ent">
<ui:UiBinder
  xmlns:ui="urn:ui:com.google.gwt.uibinder"
  xmlns:zs="urn:import:org.synthful.smartgwt.client.widgets">

  <zs:UIVLayout ui:field="yLayout">

    <zs:UIXJSONDataSource ui:field="yDataSrc"
      recordXPath="/ResultSet/Result"
      dataSrcID="y"
      dataURL="http://api.search.yahoo.com/ImageSearchService/V1/imageSearch?appid=YahooDemo&output=json">
      
      <zs:UIDataSourceIntegerField ui:field="imgWidFld"
        name="imageWidth" valueXPath="Thumbnail/Width" hidden="true"/>
        
      <zs:UIDataSourceIntegerField ui:field="imgHgtFld"
        name="imageHeight" valueXPath="Thumbnail/Height" hidden="true"/>
        
      <zs:UIDataSourceImageField ui:field="thumbnailFld"
        name="Thumbnail" valueXPath="Thumbnail/Url"
        dataSrcWidth="150" imageHeight="imageHeight" imageWidth="imageWidth"/>

      <zs:UIDataSourceTextField ui:field="titleFld" name="Title"/>
      <zs:UIDataSourceTextField ui:field="summaryFld" name="Summary"/>
      <zs:UIDataSourceLinkField ui:field="fullImageFld"
        name="link" title="Full Image" valueXPath="Url" target="_blank"/>            
    </zs:UIXJSONDataSource>
    
    <zs:UIHTMLFlow  height="30">
      <a href='http://developer.yahoo.net/about'>
        <img src='http://l.yimg.com/a/i/us/nt/bdg/websrv_88_1.gif' border='0'/>
      </a>
    </zs:UIHTMLFlow>
    <zs:UIListGrid ui:field="yGrid"
      top="120" height="300"
      wrapCells="true" fixedRecordHeights="false" showAllRecords="true"/>
    <zs:UIHTMLFlow height="30px"><hr/></zs:UIHTMLFlow>
    
    <zs:UISearchForm ui:field="yForm">
      <zs:UITextItem ui:field="query" name="Query" defaultValue="snowboarding"/>
    </zs:UISearchForm>
    <zs:UIButton ui:field="queryy">Query</zs:UIButton>
  </zs:UIVLayout>
</ui:UiBinder>
```