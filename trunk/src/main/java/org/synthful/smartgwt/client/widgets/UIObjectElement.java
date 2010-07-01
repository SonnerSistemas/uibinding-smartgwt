package org.synthful.smartgwt.client.widgets;

import com.smartgwt.client.widgets.HTMLPane;

/**
 * I had a really hard time to try make the <object> tag to work with smartgwt. I did try create the element
 * with DOM and stuffs like that, but at the end, I always get some weird behavior on drawing.
 * So, I discovered that I could use HTMLPane.setContents() to get the right effect. Not sure if is pretty but works.
 * 
 * Use something like this:
 *		<sc:UIObjectElement width="800" height="300" type="application/pdf"  data="http://www.foobar.com/myServlet" />
 * 
 * to render a html code like this: 
 *		<object width="800px" height="300px" type="application/pdf" data="http://www.foobar.com/myServlet"  />
 *
 */
public class UIObjectElement extends HTMLPane {
	
	private String data;
	private String type;
	
	public UIObjectElement() {
	}
	
	public String getData() {
		return this.data;
	}
	
	public void setData(String data) {
		this.data = data;
		setContent();
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
		setContent();
	}

	private void setContent() {
		if( (data != null && !"".equals(data.trim())) && (type != null && !"".equals(type.trim())) ) {
			super.setContents("<object width=\""+getWidthAsString()+"\" " +
								"height=\""+getHeightAsString()+"\" " +
								"type=\""+getType()+"\" " +
								"data=\""+getData()+"\"/>" );
		}
	}
	
}
