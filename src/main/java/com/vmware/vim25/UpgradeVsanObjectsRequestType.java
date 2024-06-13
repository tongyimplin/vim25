package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpgradeVsanObjectsRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpgradeVsanObjectsRequestType", propOrder = {"_this", "uuids", "newVersion"})
public class UpgradeVsanObjectsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<String> uuids;
  
  protected int newVersion;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<String> getUuids() {
    if (this.uuids == null)
      this.uuids = new ArrayList<>(); 
    return this.uuids;
  }
  
  public int getNewVersion() {
    return this.newVersion;
  }
  
  public void setNewVersion(int paramInt) {
    this.newVersion = paramInt;
  }
}
