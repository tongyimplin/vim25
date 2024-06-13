package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.TurnDiskLocatorLedOffRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TurnDiskLocatorLedOffRequestType", propOrder = {"_this", "scsiDiskUuids"})
public class TurnDiskLocatorLedOffRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<String> scsiDiskUuids;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<String> getScsiDiskUuids() {
    if (this.scsiDiskUuids == null)
      this.scsiDiskUuids = new ArrayList<>(); 
    return this.scsiDiskUuids;
  }
}
