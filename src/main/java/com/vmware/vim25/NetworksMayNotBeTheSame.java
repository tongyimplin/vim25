package com.vmware.vim25;

import com.vmware.vim25.MigrationFault;
import com.vmware.vim25.NetworksMayNotBeTheSame;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworksMayNotBeTheSame", propOrder = {"name"})
public class NetworksMayNotBeTheSame extends MigrationFault {
  protected String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
}
