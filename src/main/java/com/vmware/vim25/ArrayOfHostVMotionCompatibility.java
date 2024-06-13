package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostVMotionCompatibility;
import com.vmware.vim25.HostVMotionCompatibility;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostVMotionCompatibility", propOrder = {"hostVMotionCompatibility"})
public class ArrayOfHostVMotionCompatibility {
  @XmlElement(name = "HostVMotionCompatibility")
  protected List<HostVMotionCompatibility> hostVMotionCompatibility;
  
  public List<HostVMotionCompatibility> getHostVMotionCompatibility() {
    if (this.hostVMotionCompatibility == null)
      this.hostVMotionCompatibility = new ArrayList<>(); 
    return this.hostVMotionCompatibility;
  }
}
