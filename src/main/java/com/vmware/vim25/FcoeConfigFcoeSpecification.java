package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FcoeConfigFcoeSpecification;
import com.vmware.vim25.FcoeConfigVlanRange;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FcoeConfigFcoeSpecification", propOrder = {"underlyingPnic", "priorityClass", "sourceMac", "vlanRange"})
public class FcoeConfigFcoeSpecification extends DynamicData {
  @XmlElement(required = true)
  protected String underlyingPnic;
  
  protected Integer priorityClass;
  
  protected String sourceMac;
  
  protected List<FcoeConfigVlanRange> vlanRange;
  
  public String getUnderlyingPnic() {
    return this.underlyingPnic;
  }
  
  public void setUnderlyingPnic(String paramString) {
    this.underlyingPnic = paramString;
  }
  
  public Integer getPriorityClass() {
    return this.priorityClass;
  }
  
  public void setPriorityClass(Integer paramInteger) {
    this.priorityClass = paramInteger;
  }
  
  public String getSourceMac() {
    return this.sourceMac;
  }
  
  public void setSourceMac(String paramString) {
    this.sourceMac = paramString;
  }
  
  public List<FcoeConfigVlanRange> getVlanRange() {
    if (this.vlanRange == null)
      this.vlanRange = new ArrayList<>(); 
    return this.vlanRange;
  }
}
