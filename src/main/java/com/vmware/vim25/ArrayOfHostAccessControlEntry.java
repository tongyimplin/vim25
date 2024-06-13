package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostAccessControlEntry;
import com.vmware.vim25.HostAccessControlEntry;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostAccessControlEntry", propOrder = {"hostAccessControlEntry"})
public class ArrayOfHostAccessControlEntry {
  @XmlElement(name = "HostAccessControlEntry")
  protected List<HostAccessControlEntry> hostAccessControlEntry;
  
  public List<HostAccessControlEntry> getHostAccessControlEntry() {
    if (this.hostAccessControlEntry == null)
      this.hostAccessControlEntry = new ArrayList<>(); 
    return this.hostAccessControlEntry;
  }
}
