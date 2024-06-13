package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.WaitForUpdatesExRequestType;
import com.vmware.vim25.WaitOptions;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaitForUpdatesExRequestType", propOrder = {"_this", "version", "options"})
public class WaitForUpdatesExRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected String version;
  
  protected WaitOptions options;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
  
  public WaitOptions getOptions() {
    return this.options;
  }
  
  public void setOptions(WaitOptions paramWaitOptions) {
    this.options = paramWaitOptions;
  }
}
