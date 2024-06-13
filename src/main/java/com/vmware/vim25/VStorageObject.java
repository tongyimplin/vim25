package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VStorageObject;
import com.vmware.vim25.VStorageObjectConfigInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VStorageObject", propOrder = {"config"})
public class VStorageObject extends DynamicData {
  @XmlElement(required = true)
  protected VStorageObjectConfigInfo config;
  
  public VStorageObjectConfigInfo getConfig() {
    return this.config;
  }
  
  public void setConfig(VStorageObjectConfigInfo paramVStorageObjectConfigInfo) {
    this.config = paramVStorageObjectConfigInfo;
  }
}
