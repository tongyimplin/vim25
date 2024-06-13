package com.vmware.vim25;

import com.vmware.vim25.FaultToleranceConfigInfo;
import com.vmware.vim25.FaultTolerancePrimaryConfigInfo;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultTolerancePrimaryConfigInfo", propOrder = {"secondaries"})
public class FaultTolerancePrimaryConfigInfo extends FaultToleranceConfigInfo {
  @XmlElement(required = true)
  protected List<ManagedObjectReference> secondaries;
  
  public List<ManagedObjectReference> getSecondaries() {
    if (this.secondaries == null)
      this.secondaries = new ArrayList<>(); 
    return this.secondaries;
  }
}
