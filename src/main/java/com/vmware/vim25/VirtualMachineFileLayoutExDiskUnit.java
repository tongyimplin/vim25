package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineFileLayoutExDiskUnit;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineFileLayoutExDiskUnit", propOrder = {"fileKey"})
public class VirtualMachineFileLayoutExDiskUnit extends DynamicData {
  @XmlElement(type = Integer.class)
  protected List<Integer> fileKey;
  
  public List<Integer> getFileKey() {
    if (this.fileKey == null)
      this.fileKey = new ArrayList<>(); 
    return this.fileKey;
  }
}
