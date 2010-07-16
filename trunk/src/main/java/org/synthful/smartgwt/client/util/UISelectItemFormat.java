package org.synthful.smartgwt.client.util;

public abstract class UISelectItemFormat {
	private String comboDescription;

	public String getComboDescription() {
		if(comboDescription == null) {
			return super.toString();
		}
		return comboDescription;
	}

	public void setComboDescription(String comboDescription) {
		this.comboDescription = comboDescription;
	}
}
