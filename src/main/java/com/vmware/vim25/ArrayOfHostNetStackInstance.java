package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostNetStackInstance;
import com.vmware.vim25.HostNetStackInstance;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostNetStackInstance", propOrder = {"hostNetStackInstance"})
public class ArrayOfHostNetStackInstance {
  @XmlElement(name = "HostNetStackInstance")
  protected List<HostNetStackInstance> hostNetStackInstance;
  
  public List<HostNetStackInstance> getHostNetStackInstance() {
    if (this.hostNetStackInstance == null)
      this.hostNetStackInstance = new ArrayList<>(); 
    return this.hostNetStackInstance;
  }
}
