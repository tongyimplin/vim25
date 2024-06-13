package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostHostBusAdapter;
import com.vmware.vim25.HostHostBusAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostHostBusAdapter", propOrder = {"hostHostBusAdapter"})
public class ArrayOfHostHostBusAdapter {
  @XmlElement(name = "HostHostBusAdapter")
  protected List<HostHostBusAdapter> hostHostBusAdapter;
  
  public List<HostHostBusAdapter> getHostHostBusAdapter() {
    if (this.hostHostBusAdapter == null)
      this.hostHostBusAdapter = new ArrayList<>(); 
    return this.hostHostBusAdapter;
  }
}
