package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.RetrieveOptions;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveOptions", propOrder = {"maxObjects"})
public class RetrieveOptions extends DynamicData {
  protected Integer maxObjects;
  
  public Integer getMaxObjects() {
    return this.maxObjects;
  }
  
  public void setMaxObjects(Integer paramInteger) {
    this.maxObjects = paramInteger;
  }
}
