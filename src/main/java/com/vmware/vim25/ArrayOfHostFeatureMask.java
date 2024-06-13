package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostFeatureMask;
import com.vmware.vim25.HostFeatureMask;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostFeatureMask", propOrder = {"hostFeatureMask"})
public class ArrayOfHostFeatureMask {
  @XmlElement(name = "HostFeatureMask")
  protected List<HostFeatureMask> hostFeatureMask;
  
  public List<HostFeatureMask> getHostFeatureMask() {
    if (this.hostFeatureMask == null)
      this.hostFeatureMask = new ArrayList<>(); 
    return this.hostFeatureMask;
  }
}
