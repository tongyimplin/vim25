package com.vmware.vim25;

import com.vmware.vim25.CustomizationAdapterMapping;
import com.vmware.vim25.CustomizationIPSettings;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationAdapterMapping", propOrder = {"macAddress", "adapter"})
public class CustomizationAdapterMapping extends DynamicData {
  protected String macAddress;
  
  @XmlElement(required = true)
  protected CustomizationIPSettings adapter;
  
  public String getMacAddress() {
    return this.macAddress;
  }
  
  public void setMacAddress(String paramString) {
    this.macAddress = paramString;
  }
  
  public CustomizationIPSettings getAdapter() {
    return this.adapter;
  }
  
  public void setAdapter(CustomizationIPSettings paramCustomizationIPSettings) {
    this.adapter = paramCustomizationIPSettings;
  }
}
