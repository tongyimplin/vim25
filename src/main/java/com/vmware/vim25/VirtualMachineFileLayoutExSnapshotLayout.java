package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualMachineFileLayoutExDiskLayout;
import com.vmware.vim25.VirtualMachineFileLayoutExSnapshotLayout;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineFileLayoutExSnapshotLayout", propOrder = {"key", "dataKey", "memoryKey", "disk"})
public class VirtualMachineFileLayoutExSnapshotLayout extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference key;
  
  protected int dataKey;
  
  protected Integer memoryKey;
  
  protected List<VirtualMachineFileLayoutExDiskLayout> disk;
  
  public ManagedObjectReference getKey() {
    return this.key;
  }
  
  public void setKey(ManagedObjectReference paramManagedObjectReference) {
    this.key = paramManagedObjectReference;
  }
  
  public int getDataKey() {
    return this.dataKey;
  }
  
  public void setDataKey(int paramInt) {
    this.dataKey = paramInt;
  }
  
  public Integer getMemoryKey() {
    return this.memoryKey;
  }
  
  public void setMemoryKey(Integer paramInteger) {
    this.memoryKey = paramInteger;
  }
  
  public List<VirtualMachineFileLayoutExDiskLayout> getDisk() {
    if (this.disk == null)
      this.disk = new ArrayList<>(); 
    return this.disk;
  }
}
