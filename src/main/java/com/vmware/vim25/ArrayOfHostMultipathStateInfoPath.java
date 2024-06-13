package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostMultipathStateInfoPath;
import com.vmware.vim25.HostMultipathStateInfoPath;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostMultipathStateInfoPath", propOrder = {"hostMultipathStateInfoPath"})
public class ArrayOfHostMultipathStateInfoPath {
  @XmlElement(name = "HostMultipathStateInfoPath")
  protected List<HostMultipathStateInfoPath> hostMultipathStateInfoPath;
  
  public List<HostMultipathStateInfoPath> getHostMultipathStateInfoPath() {
    if (this.hostMultipathStateInfoPath == null)
      this.hostMultipathStateInfoPath = new ArrayList<>(); 
    return this.hostMultipathStateInfoPath;
  }
}
