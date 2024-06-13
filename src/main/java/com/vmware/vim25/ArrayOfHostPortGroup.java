package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostPortGroup;
import com.vmware.vim25.HostPortGroup;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPortGroup", propOrder = {"hostPortGroup"})
public class ArrayOfHostPortGroup {
  @XmlElement(name = "HostPortGroup")
  protected List<HostPortGroup> hostPortGroup;
  
  public List<HostPortGroup> getHostPortGroup() {
    if (this.hostPortGroup == null)
      this.hostPortGroup = new ArrayList<>(); 
    return this.hostPortGroup;
  }
}
