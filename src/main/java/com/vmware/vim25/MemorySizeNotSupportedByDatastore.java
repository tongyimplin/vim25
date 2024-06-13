package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MemorySizeNotSupportedByDatastore;
import com.vmware.vim25.VirtualHardwareCompatibilityIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemorySizeNotSupportedByDatastore", propOrder = {"datastore", "memorySizeMB", "maxMemorySizeMB"})
public class MemorySizeNotSupportedByDatastore extends VirtualHardwareCompatibilityIssue {
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  protected int memorySizeMB;
  
  protected int maxMemorySizeMB;
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
  
  public int getMemorySizeMB() {
    return this.memorySizeMB;
  }
  
  public void setMemorySizeMB(int paramInt) {
    this.memorySizeMB = paramInt;
  }
  
  public int getMaxMemorySizeMB() {
    return this.maxMemorySizeMB;
  }
  
  public void setMaxMemorySizeMB(int paramInt) {
    this.maxMemorySizeMB = paramInt;
  }
}
