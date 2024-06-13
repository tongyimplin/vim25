package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPerformanceManagerCounterLevelMapping;
import com.vmware.vim25.PerformanceManagerCounterLevelMapping;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPerformanceManagerCounterLevelMapping", propOrder = {"performanceManagerCounterLevelMapping"})
public class ArrayOfPerformanceManagerCounterLevelMapping {
  @XmlElement(name = "PerformanceManagerCounterLevelMapping")
  protected List<PerformanceManagerCounterLevelMapping> performanceManagerCounterLevelMapping;
  
  public List<PerformanceManagerCounterLevelMapping> getPerformanceManagerCounterLevelMapping() {
    if (this.performanceManagerCounterLevelMapping == null)
      this.performanceManagerCounterLevelMapping = new ArrayList<>(); 
    return this.performanceManagerCounterLevelMapping;
  }
}
