package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVMotionCompatibility;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVMotionCompatibility", propOrder = {"host", "compatibility"})
public class HostVMotionCompatibility extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  protected List<String> compatibility;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public List<String> getCompatibility() {
    if (this.compatibility == null)
      this.compatibility = new ArrayList<>(); 
    return this.compatibility;
  }
}
