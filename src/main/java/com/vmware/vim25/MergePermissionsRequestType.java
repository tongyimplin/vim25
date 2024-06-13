package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MergePermissionsRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MergePermissionsRequestType", propOrder = {"_this", "srcRoleId", "dstRoleId"})
public class MergePermissionsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected int srcRoleId;
  
  protected int dstRoleId;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public int getSrcRoleId() {
    return this.srcRoleId;
  }
  
  public void setSrcRoleId(int paramInt) {
    this.srcRoleId = paramInt;
  }
  
  public int getDstRoleId() {
    return this.dstRoleId;
  }
  
  public void setDstRoleId(int paramInt) {
    this.dstRoleId = paramInt;
  }
}
