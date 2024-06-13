package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDiskChangeExtent;
import com.vmware.vim25.DiskChangeExtent;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDiskChangeExtent", propOrder = {"diskChangeExtent"})
public class ArrayOfDiskChangeExtent {
  @XmlElement(name = "DiskChangeExtent")
  protected List<DiskChangeExtent> diskChangeExtent;
  
  public List<DiskChangeExtent> getDiskChangeExtent() {
    if (this.diskChangeExtent == null)
      this.diskChangeExtent = new ArrayList<>(); 
    return this.diskChangeExtent;
  }
}
