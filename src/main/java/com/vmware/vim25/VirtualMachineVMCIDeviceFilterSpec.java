package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineVMCIDeviceFilterSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVMCIDeviceFilterSpec", propOrder = {"rank", "action", "protocol", "direction", "lowerDstPortBoundary", "upperDstPortBoundary"})
public class VirtualMachineVMCIDeviceFilterSpec extends DynamicData {
  protected long rank;
  
  @XmlElement(required = true)
  protected String action;
  
  @XmlElement(required = true)
  protected String protocol;
  
  @XmlElement(required = true)
  protected String direction;
  
  protected Long lowerDstPortBoundary;
  
  protected Long upperDstPortBoundary;
  
  public long getRank() {
    return this.rank;
  }
  
  public void setRank(long paramLong) {
    this.rank = paramLong;
  }
  
  public String getAction() {
    return this.action;
  }
  
  public void setAction(String paramString) {
    this.action = paramString;
  }
  
  public String getProtocol() {
    return this.protocol;
  }
  
  public void setProtocol(String paramString) {
    this.protocol = paramString;
  }
  
  public String getDirection() {
    return this.direction;
  }
  
  public void setDirection(String paramString) {
    this.direction = paramString;
  }
  
  public Long getLowerDstPortBoundary() {
    return this.lowerDstPortBoundary;
  }
  
  public void setLowerDstPortBoundary(Long paramLong) {
    this.lowerDstPortBoundary = paramLong;
  }
  
  public Long getUpperDstPortBoundary() {
    return this.upperDstPortBoundary;
  }
  
  public void setUpperDstPortBoundary(Long paramLong) {
    this.upperDstPortBoundary = paramLong;
  }
}
