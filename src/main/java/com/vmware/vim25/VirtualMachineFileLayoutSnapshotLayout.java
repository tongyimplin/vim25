package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualMachineFileLayoutSnapshotLayout;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineFileLayoutSnapshotLayout", propOrder = {"key", "snapshotFile"})
public class VirtualMachineFileLayoutSnapshotLayout extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference key;
  
  @XmlElement(required = true)
  protected List<String> snapshotFile;
  
  public ManagedObjectReference getKey() {
    return this.key;
  }
  
  public void setKey(ManagedObjectReference paramManagedObjectReference) {
    this.key = paramManagedObjectReference;
  }
  
  public List<String> getSnapshotFile() {
    if (this.snapshotFile == null)
      this.snapshotFile = new ArrayList<>(); 
    return this.snapshotFile;
  }
}
