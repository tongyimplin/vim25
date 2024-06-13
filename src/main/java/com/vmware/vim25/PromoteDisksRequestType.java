package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PromoteDisksRequestType;
import com.vmware.vim25.VirtualDisk;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromoteDisksRequestType", propOrder = {"_this", "unlink", "disks"})
public class PromoteDisksRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected boolean unlink;
  
  protected List<VirtualDisk> disks;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public boolean isUnlink() {
    return this.unlink;
  }
  
  public void setUnlink(boolean paramBoolean) {
    this.unlink = paramBoolean;
  }
  
  public List<VirtualDisk> getDisks() {
    if (this.disks == null)
      this.disks = new ArrayList<>(); 
    return this.disks;
  }
}
