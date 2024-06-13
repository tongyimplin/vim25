package com.vmware.vim25;

import com.vmware.vim25.GenerateLogBundlesRequestType;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateLogBundlesRequestType", propOrder = {"_this", "includeDefault", "host"})
public class GenerateLogBundlesRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected boolean includeDefault;
  
  protected List<ManagedObjectReference> host;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public boolean isIncludeDefault() {
    return this.includeDefault;
  }
  
  public void setIncludeDefault(boolean paramBoolean) {
    this.includeDefault = paramBoolean;
  }
  
  public List<ManagedObjectReference> getHost() {
    if (this.host == null)
      this.host = new ArrayList<>(); 
    return this.host;
  }
}
