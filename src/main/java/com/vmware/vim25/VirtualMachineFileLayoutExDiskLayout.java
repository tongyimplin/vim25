package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineFileLayoutExDiskLayout;
import com.vmware.vim25.VirtualMachineFileLayoutExDiskUnit;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineFileLayoutExDiskLayout", propOrder = {"key", "chain"})
public class VirtualMachineFileLayoutExDiskLayout extends DynamicData {
  protected int key;
  
  protected List<VirtualMachineFileLayoutExDiskUnit> chain;
  
  public int getKey() {
    return this.key;
  }
  
  public void setKey(int paramInt) {
    this.key = paramInt;
  }
  
  public List<VirtualMachineFileLayoutExDiskUnit> getChain() {
    if (this.chain == null)
      this.chain = new ArrayList<>(); 
    return this.chain;
  }
}
