package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryChangedDiskAreasRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryChangedDiskAreasRequestType", propOrder = {"_this", "snapshot", "deviceKey", "startOffset", "changeId"})
public class QueryChangedDiskAreasRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected ManagedObjectReference snapshot;
  
  protected int deviceKey;
  
  protected long startOffset;
  
  @XmlElement(required = true)
  protected String changeId;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getSnapshot() {
    return this.snapshot;
  }
  
  public void setSnapshot(ManagedObjectReference paramManagedObjectReference) {
    this.snapshot = paramManagedObjectReference;
  }
  
  public int getDeviceKey() {
    return this.deviceKey;
  }
  
  public void setDeviceKey(int paramInt) {
    this.deviceKey = paramInt;
  }
  
  public long getStartOffset() {
    return this.startOffset;
  }
  
  public void setStartOffset(long paramLong) {
    this.startOffset = paramLong;
  }
  
  public String getChangeId() {
    return this.changeId;
  }
  
  public void setChangeId(String paramString) {
    this.changeId = paramString;
  }
}
