package com.vmware.vim25;

import com.vmware.vim25.ID;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VstorageObjectVCenterQueryChangedDiskAreasRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VstorageObjectVCenterQueryChangedDiskAreasRequestType", propOrder = {"_this", "id", "datastore", "snapshotId", "startOffset", "changeId"})
public class VstorageObjectVCenterQueryChangedDiskAreasRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ID id;
  
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  @XmlElement(required = true)
  protected ID snapshotId;
  
  protected long startOffset;
  
  @XmlElement(required = true)
  protected String changeId;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ID getId() {
    return this.id;
  }
  
  public void setId(ID paramID) {
    this.id = paramID;
  }
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
  
  public ID getSnapshotId() {
    return this.snapshotId;
  }
  
  public void setSnapshotId(ID paramID) {
    this.snapshotId = paramID;
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
