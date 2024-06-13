package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostMultipathInfoPath;
import com.vmware.vim25.HostMultipathInfoPath;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostMultipathInfoPath", propOrder = {"hostMultipathInfoPath"})
public class ArrayOfHostMultipathInfoPath {
  @XmlElement(name = "HostMultipathInfoPath")
  protected List<HostMultipathInfoPath> hostMultipathInfoPath;
  
  public List<HostMultipathInfoPath> getHostMultipathInfoPath() {
    if (this.hostMultipathInfoPath == null)
      this.hostMultipathInfoPath = new ArrayList<>(); 
    return this.hostMultipathInfoPath;
  }
}
