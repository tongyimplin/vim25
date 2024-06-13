package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ExtSolutionManagerInfoTabInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtSolutionManagerInfoTabInfo", propOrder = {"label", "url"})
public class ExtSolutionManagerInfoTabInfo extends DynamicData {
  @XmlElement(required = true)
  protected String label;
  
  @XmlElement(required = true)
  protected String url;
  
  public String getLabel() {
    return this.label;
  }
  
  public void setLabel(String paramString) {
    this.label = paramString;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public void setUrl(String paramString) {
    this.url = paramString;
  }
}
