package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPatchManagerLocator;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPatchManagerLocator", propOrder = {"url", "proxy"})
public class HostPatchManagerLocator extends DynamicData {
  @XmlElement(required = true)
  protected String url;
  
  protected String proxy;
  
  public String getUrl() {
    return this.url;
  }
  
  public void setUrl(String paramString) {
    this.url = paramString;
  }
  
  public String getProxy() {
    return this.proxy;
  }
  
  public void setProxy(String paramString) {
    this.proxy = paramString;
  }
}
