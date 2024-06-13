package com.vmware.vim25;

import com.vmware.vim25.ArrayOfScsiLunDescriptor;
import com.vmware.vim25.ScsiLunDescriptor;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfScsiLunDescriptor", propOrder = {"scsiLunDescriptor"})
public class ArrayOfScsiLunDescriptor {
  @XmlElement(name = "ScsiLunDescriptor")
  protected List<ScsiLunDescriptor> scsiLunDescriptor;
  
  public List<ScsiLunDescriptor> getScsiLunDescriptor() {
    if (this.scsiLunDescriptor == null)
      this.scsiLunDescriptor = new ArrayList<>(); 
    return this.scsiLunDescriptor;
  }
}
