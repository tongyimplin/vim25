package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ElementDescription;
import com.vmware.vim25.PerformanceDescription;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceDescription", propOrder = {"counterType", "statsType"})
public class PerformanceDescription extends DynamicData {
  @XmlElement(required = true)
  protected List<ElementDescription> counterType;
  
  @XmlElement(required = true)
  protected List<ElementDescription> statsType;
  
  public List<ElementDescription> getCounterType() {
    if (this.counterType == null)
      this.counterType = new ArrayList<>(); 
    return this.counterType;
  }
  
  public List<ElementDescription> getStatsType() {
    if (this.statsType == null)
      this.statsType = new ArrayList<>(); 
    return this.statsType;
  }
}
