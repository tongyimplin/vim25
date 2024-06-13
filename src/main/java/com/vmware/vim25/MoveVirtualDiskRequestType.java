package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MoveVirtualDiskRequestType;
import com.vmware.vim25.VirtualMachineProfileSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveVirtualDiskRequestType", propOrder = {"_this", "sourceName", "sourceDatacenter", "destName", "destDatacenter", "force", "profile"})
public class MoveVirtualDiskRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String sourceName;
  
  protected ManagedObjectReference sourceDatacenter;
  
  @XmlElement(required = true)
  protected String destName;
  
  protected ManagedObjectReference destDatacenter;
  
  protected Boolean force;
  
  protected List<VirtualMachineProfileSpec> profile;
  
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
  
  public Boolean isForce() {
    return this.force;
  }
  
  public void setForce(Boolean paramBoolean) {
    this.force = paramBoolean;
  }
  
  public List<VirtualMachineProfileSpec> getProfile() {
    if (this.profile == null)
      this.profile = new ArrayList<>(); 
    return this.profile;
  }
}
