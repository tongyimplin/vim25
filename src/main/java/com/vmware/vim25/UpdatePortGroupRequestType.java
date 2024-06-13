package com.vmware.vim25;

import com.vmware.vim25.HostPortGroupSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdatePortGroupRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePortGroupRequestType", propOrder = {"_this", "pgName", "portgrp"})
public class UpdatePortGroupRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String pgName;
  
  @XmlElement(required = true)
  protected HostPortGroupSpec portgrp;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getPgName() {
    return this.pgName;
  }
  
  public void setPgName(String paramString) {
    this.pgName = paramString;
  }
  
  public HostPortGroupSpec getPortgrp() {
    return this.portgrp;
  }
  
  public void setPortgrp(HostPortGroupSpec paramHostPortGroupSpec) {
    this.portgrp = paramHostPortGroupSpec;
  }
}
