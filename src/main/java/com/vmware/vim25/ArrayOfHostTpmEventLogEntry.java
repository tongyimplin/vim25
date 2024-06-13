package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostTpmEventLogEntry;
import com.vmware.vim25.HostTpmEventLogEntry;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostTpmEventLogEntry", propOrder = {"hostTpmEventLogEntry"})
public class ArrayOfHostTpmEventLogEntry {
  @XmlElement(name = "HostTpmEventLogEntry")
  protected List<HostTpmEventLogEntry> hostTpmEventLogEntry;
  
  public List<HostTpmEventLogEntry> getHostTpmEventLogEntry() {
    if (this.hostTpmEventLogEntry == null)
      this.hostTpmEventLogEntry = new ArrayList<>(); 
    return this.hostTpmEventLogEntry;
  }
}
