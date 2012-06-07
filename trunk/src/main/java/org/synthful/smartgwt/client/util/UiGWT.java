package org.synthful.smartgwt.client.util;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
/**
 * This class is to translate GWT static resources to class instances
 * so that they could be referenced using ui:with tag.
 * 
 * @author blessedgeek
 *
 */
public class UiGWT {
	
	public String gwtModuleName(){
		return GWT.getModuleName();
	}
	
	public String gwtHostPageBaseURL(){
		return GWT.getHostPageBaseURL();
	}
	
	public String gwtModuleBaseURL(){
		return GWT.getModuleBaseURL();
	}
	
	public String gwtPermutationStrongName(){
		return GWT.getPermutationStrongName();
	}
	
	public UncaughtExceptionHandler gwtUncaughtExceptionHandler(){
		return GWT.getUncaughtExceptionHandler();
	}
	
	public String gwtDevModeUniqueThreadId(){
		return GWT.getUniqueThreadId();
	}
	
	public String gwtVersion(){
		return GWT.getVersion();
	}
	public boolean isClient(){
		return GWT.isClient();
	}
	
	public boolean isProdMode(){
		return GWT.isProdMode();
	}
	
	public boolean isScript(){
		return GWT.isScript();
	}
}
