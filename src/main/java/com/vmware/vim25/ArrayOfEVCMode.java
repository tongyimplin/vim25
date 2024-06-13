package com.vmware.vim25;

import com.vmware.vim25.ArrayOfEVCMode;
import com.vmware.vim25.EVCMode;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEVCMode", propOrder = {"evcMode"})
public class ArrayOfEVCMode {
  @XmlElement(name = "EVCMode")
  protected List<EVCMode> evcMode;
  
  public List<EVCMode> getEVCMode() {
    if (this.evcMode == null)
      this.evcMode = new ArrayList<>(); 
    return this.evcMode;
  }
}
