package com.vmware.vim25;

import com.vmware.vim25.EnvironmentBrowserConfigOptionQuerySpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryConfigOptionExRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryConfigOptionExRequestType", propOrder = {"_this", "spec"})
public class QueryConfigOptionExRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected EnvironmentBrowserConfigOptionQuerySpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public EnvironmentBrowserConfigOptionQuerySpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(EnvironmentBrowserConfigOptionQuerySpec paramEnvironmentBrowserConfigOptionQuerySpec) {
    this.spec = paramEnvironmentBrowserConfigOptionQuerySpec;
  }
}
