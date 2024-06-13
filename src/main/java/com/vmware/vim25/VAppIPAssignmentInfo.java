package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VAppIPAssignmentInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VAppIPAssignmentInfo", propOrder = {"supportedAllocationScheme", "ipAllocationPolicy", "supportedIpProtocol", "ipProtocol"})
public class VAppIPAssignmentInfo extends DynamicData {
  protected List<String> supportedAllocationScheme;
  
  protected String ipAllocationPolicy;
  
  protected List<String> supportedIpProtocol;
  
  protected String ipProtocol;
  
  public List<String> getSupportedAllocationScheme() {
    if (this.supportedAllocationScheme == null)
      this.supportedAllocationScheme = new ArrayList<>(); 
    return this.supportedAllocationScheme;
  }
  
  public String getIpAllocationPolicy() {
    return this.ipAllocationPolicy;
  }
  
  public void setIpAllocationPolicy(String paramString) {
    this.ipAllocationPolicy = paramString;
  }
  
  public List<String> getSupportedIpProtocol() {
    if (this.supportedIpProtocol == null)
      this.supportedIpProtocol = new ArrayList<>(); 
    return this.supportedIpProtocol;
  }
  
  public String getIpProtocol() {
    return this.ipProtocol;
  }
  
  public void setIpProtocol(String paramString) {
    this.ipProtocol = paramString;
  }
}
