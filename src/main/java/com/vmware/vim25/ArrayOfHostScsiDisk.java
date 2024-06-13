package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostScsiDisk;
import com.vmware.vim25.HostScsiDisk;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostScsiDisk", propOrder = {"hostScsiDisk"})
public class ArrayOfHostScsiDisk {
  @XmlElement(name = "HostScsiDisk")
  protected List<HostScsiDisk> hostScsiDisk;
  
  public List<HostScsiDisk> getHostScsiDisk() {
    if (this.hostScsiDisk == null)
      this.hostScsiDisk = new ArrayList<>(); 
    return this.hostScsiDisk;
  }
}
