package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ExtensionTaskTypeInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionTaskTypeInfo", propOrder = {"taskID"})
public class ExtensionTaskTypeInfo extends DynamicData {
  @XmlElement(required = true)
  protected String taskID;
  
  public String getTaskID() {
    return this.taskID;
  }
  
  public void setTaskID(String paramString) {
    this.taskID = paramString;
  }
}
