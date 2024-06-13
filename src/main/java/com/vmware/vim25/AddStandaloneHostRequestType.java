package com.vmware.vim25;

import com.vmware.vim25.AddStandaloneHostRequestType;
import com.vmware.vim25.ComputeResourceConfigSpec;
import com.vmware.vim25.HostConnectSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddStandaloneHostRequestType", propOrder = {"_this", "spec", "compResSpec", "addConnected", "license"})
public class AddStandaloneHostRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostConnectSpec spec;
  
  protected ComputeResourceConfigSpec compResSpec;
  
  protected boolean addConnected;
  
  protected String license;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostConnectSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostConnectSpec paramHostConnectSpec) {
    this.spec = paramHostConnectSpec;
  }
  
  public ComputeResourceConfigSpec getCompResSpec() {
    return this.compResSpec;
  }
  
  public void setCompResSpec(ComputeResourceConfigSpec paramComputeResourceConfigSpec) {
    this.compResSpec = paramComputeResourceConfigSpec;
  }
  
  public boolean isAddConnected() {
    return this.addConnected;
  }
  
  public void setAddConnected(boolean paramBoolean) {
    this.addConnected = paramBoolean;
  }
  
  public String getLicense() {
    return this.license;
  }
  
  public void setLicense(String paramString) {
    this.license = paramString;
  }
}
