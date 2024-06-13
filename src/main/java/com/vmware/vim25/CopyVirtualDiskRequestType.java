package com.vmware.vim25;

import com.vmware.vim25.CopyVirtualDiskRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualDiskSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyVirtualDiskRequestType", propOrder = {"_this", "sourceName", "sourceDatacenter", "destName", "destDatacenter", "destSpec", "force"})
public class CopyVirtualDiskRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String sourceName;
  
  protected ManagedObjectReference sourceDatacenter;
  
  @XmlElement(required = true)
  protected String destName;
  
  protected ManagedObjectReference destDatacenter;
  
  protected VirtualDiskSpec destSpec;
  
  protected Boolean force;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getSourceName() {
    return this.sourceName;
  }
  
  public void setSourceName(String paramString) {
    this.sourceName = paramString;
  }
  
  public ManagedObjectReference getSourceDatacenter() {
    return this.sourceDatacenter;
  }
  
  public void setSourceDatacenter(ManagedObjectReference paramManagedObjectReference) {
    this.sourceDatacenter = paramManagedObjectReference;
  }
  
  public String getDestName() {
    return this.destName;
  }
  
  public void setDestName(String paramString) {
    this.destName = paramString;
  }
  
  public ManagedObjectReference getDestDatacenter() {
    return this.destDatacenter;
  }
  
  public void setDestDatacenter(ManagedObjectReference paramManagedObjectReference) {
    this.destDatacenter = paramManagedObjectReference;
  }
  
  public VirtualDiskSpec getDestSpec() {
    return this.destSpec;
  }
  
  public void setDestSpec(VirtualDiskSpec paramVirtualDiskSpec) {
    this.destSpec = paramVirtualDiskSpec;
  }
  
  public Boolean isForce() {
    return this.force;
  }
  
  public void setForce(Boolean paramBoolean) {
    this.force = paramBoolean;
  }
}
