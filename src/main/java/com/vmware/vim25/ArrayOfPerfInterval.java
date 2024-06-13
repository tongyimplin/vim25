package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPerfInterval;
import com.vmware.vim25.PerfInterval;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPerfInterval", propOrder = {"perfInterval"})
public class ArrayOfPerfInterval {
  @XmlElement(name = "PerfInterval")
  protected List<PerfInterval> perfInterval;
  
  public List<PerfInterval> getPerfInterval() {
    if (this.perfInterval == null)
      this.perfInterval = new ArrayList<>(); 
    return this.perfInterval;
  }
}
