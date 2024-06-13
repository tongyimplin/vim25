package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineSummary;
import com.vmware.vim25.VirtualMachineTargetInfo;
import com.vmware.vim25.VirtualMachineUsbInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineUsbInfo", propOrder = {"description", "vendor", "product", "physicalPath", "family", "speed", "summary"})
public class VirtualMachineUsbInfo extends VirtualMachineTargetInfo {
  @XmlElement(required = true)
  protected String description;
  
  protected int vendor;
  
  protected int product;
  
  @XmlElement(required = true)
  protected String physicalPath;
  
  protected List<String> family;
  
  protected List<String> speed;
  
  protected VirtualMachineSummary summary;
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public int getVendor() {
    return this.vendor;
  }
  
  public void setVendor(int paramInt) {
    this.vendor = paramInt;
  }
  
  public int getProduct() {
    return this.product;
  }
  
  public void setProduct(int paramInt) {
    this.product = paramInt;
  }
  
  public String getPhysicalPath() {
    return this.physicalPath;
  }
  
  public void setPhysicalPath(String paramString) {
    this.physicalPath = paramString;
  }
  
  public List<String> getFamily() {
    if (this.family == null)
      this.family = new ArrayList<>(); 
    return this.family;
  }
  
  public List<String> getSpeed() {
    if (this.speed == null)
      this.speed = new ArrayList<>(); 
    return this.speed;
  }
  
  public VirtualMachineSummary getSummary() {
    return this.summary;
  }
  
  public void setSummary(VirtualMachineSummary paramVirtualMachineSummary) {
    this.summary = paramVirtualMachineSummary;
  }
}
