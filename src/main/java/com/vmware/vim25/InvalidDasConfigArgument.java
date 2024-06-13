package com.vmware.vim25;

import com.vmware.vim25.InvalidArgument;
import com.vmware.vim25.InvalidDasConfigArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidDasConfigArgument", propOrder = {"entry", "clusterName"})
public class InvalidDasConfigArgument extends InvalidArgument {
  protected String entry;
  
  protected String clusterName;
  
  public String getEntry() {
    return this.entry;
  }
  
  public void setEntry(String paramString) {
    this.entry = paramString;
  }
  
  public String getClusterName() {
    return this.clusterName;
  }
  
  public void setClusterName(String paramString) {
    this.clusterName = paramString;
  }
}
