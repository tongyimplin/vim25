package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ExtensionOvfConsumerInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionOvfConsumerInfo", propOrder = {"callbackUrl", "sectionType"})
public class ExtensionOvfConsumerInfo extends DynamicData {
  @XmlElement(required = true)
  protected String callbackUrl;
  
  @XmlElement(required = true)
  protected List<String> sectionType;
  
  public String getCallbackUrl() {
    return this.callbackUrl;
  }
  
  public void setCallbackUrl(String paramString) {
    this.callbackUrl = paramString;
  }
  
  public List<String> getSectionType() {
    if (this.sectionType == null)
      this.sectionType = new ArrayList<>(); 
    return this.sectionType;
  }
}
