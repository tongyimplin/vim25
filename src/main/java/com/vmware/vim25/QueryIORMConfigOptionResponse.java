package com.vmware.vim25;

import com.vmware.vim25.QueryIORMConfigOptionResponse;
import com.vmware.vim25.StorageIORMConfigOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryIORMConfigOptionResponse")
public class QueryIORMConfigOptionResponse {
  @XmlElement(required = true)
  protected StorageIORMConfigOption returnval;
  
  public StorageIORMConfigOption getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(StorageIORMConfigOption paramStorageIORMConfigOption) {
    this.returnval = paramStorageIORMConfigOption;
  }
}
