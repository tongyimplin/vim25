package com.vmware.vim25;

import com.vmware.vim25.ClusterRuleInfo;
import com.vmware.vim25.ClusterVmHostRuleInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterVmHostRuleInfo", propOrder = {"vmGroupName", "affineHostGroupName", "antiAffineHostGroupName"})
public class ClusterVmHostRuleInfo extends ClusterRuleInfo {
  protected String vmGroupName;
  
  protected String affineHostGroupName;
  
  protected String antiAffineHostGroupName;
  
  public String getVmGroupName() {
    return this.vmGroupName;
  }
  
  public void setVmGroupName(String paramString) {
    this.vmGroupName = paramString;
  }
  
  public String getAffineHostGroupName() {
    return this.affineHostGroupName;
  }
  
  public void setAffineHostGroupName(String paramString) {
    this.affineHostGroupName = paramString;
  }
  
  public String getAntiAffineHostGroupName() {
    return this.antiAffineHostGroupName;
  }
  
  public void setAntiAffineHostGroupName(String paramString) {
    this.antiAffineHostGroupName = paramString;
  }
}
