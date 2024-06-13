package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineFileLayoutDiskLayout;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineFileLayoutDiskLayout", propOrder = {"key", "diskFile"})
public class VirtualMachineFileLayoutDiskLayout extends DynamicData {
  protected int key;
  
  @XmlElement(required = true)
  protected List<String> diskFile;
  
  public int getKey() {
    return this.key;
  }
  
  public void setKey(int paramInt) {
    this.key = paramInt;
  }
  
  public List<String> getDiskFile() {
    if (this.diskFile == null)
      this.diskFile = new ArrayList<>(); 
    return this.diskFile;
  }
}
