package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostUnresolvedVmfsVolumeResolveStatus;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostUnresolvedVmfsVolumeResolveStatus", propOrder = {"resolvable", "incompleteExtents", "multipleCopies"})
public class HostUnresolvedVmfsVolumeResolveStatus extends DynamicData {
  protected boolean resolvable;
  
  protected Boolean incompleteExtents;
  
  protected Boolean multipleCopies;
  
  public boolean isResolvable() {
    return this.resolvable;
  }
  
  public void setResolvable(boolean paramBoolean) {
    this.resolvable = paramBoolean;
  }
  
  public Boolean isIncompleteExtents() {
    return this.incompleteExtents;
  }
  
  public void setIncompleteExtents(Boolean paramBoolean) {
    this.incompleteExtents = paramBoolean;
  }
  
  public Boolean isMultipleCopies() {
    return this.multipleCopies;
  }
  
  public void setMultipleCopies(Boolean paramBoolean) {
    this.multipleCopies = paramBoolean;
  }
}
