package com.vmware.vim25;

import com.vmware.vim25.ArrayOfOvfResourceMap;
import com.vmware.vim25.OvfResourceMap;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOvfResourceMap", propOrder = {"ovfResourceMap"})
public class ArrayOfOvfResourceMap {
  @XmlElement(name = "OvfResourceMap")
  protected List<OvfResourceMap> ovfResourceMap;
  
  public List<OvfResourceMap> getOvfResourceMap() {
    if (this.ovfResourceMap == null)
      this.ovfResourceMap = new ArrayList<>(); 
    return this.ovfResourceMap;
  }
}
